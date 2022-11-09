import java.nio.ByteBuffer;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCrypto;
import android.util.Log;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec$Callback;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.HashSet;
import android.os.Handler;
import android.media.MediaFormat;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Deque;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbf implements mbi
{
    public final MediaCodec a;
    public final AtomicInteger b;
    public final Surface c;
    public final Deque d;
    public final ofn e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final mbe j;
    public final Set k;
    public final Set l;
    public volatile mcr m;
    public volatile mbv n;
    private final boolean o;
    
    public mbf(final MediaCodec a, final MediaFormat mediaFormat, final nir nir, final boolean o, final Handler handler) {
        this.k = new HashSet();
        this.l = new HashSet();
        this.a = a;
        this.m = mcr.a;
        this.n = mbv.c;
        this.d = new ConcurrentLinkedDeque();
        this.b = new AtomicInteger(3);
        this.h = new AtomicBoolean(false);
        this.o = o;
        this.e = ofn.f();
        this.g = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        final mbe mbe = new mbe(this);
        this.j = mbe;
        if (handler == null) {
            a.setCallback((MediaCodec$Callback)mbe);
        }
        else {
            a.setCallback((MediaCodec$Callback)mbe, handler);
        }
        k(a, mediaFormat);
        Surface c;
        if (nir == null) {
            c = null;
        }
        else {
            c = (Surface)nir.a(a);
        }
        this.c = c;
    }
    
    private final int h() {
        synchronized (this) {
            if (this.d.isEmpty()) {
                return -1;
            }
            return this.d.removeFirst();
        }
    }
    
    private final void i() {
        this.d.clear();
        this.k.clear();
        this.l.clear();
    }
    
    private final void j(final boolean b) {
        synchronized (this) {
            if (this.i.getAndSet(false)) {
                try {
                    this.a.stop();
                }
                catch (final MediaCodec$CodecException ex) {
                    if (b) {
                        this.j.onError(this.a, ex);
                    }
                }
                finally {
                    final Throwable t;
                    Log.e("AsynchMediaCodec", "Exception while trying to stop codec", t);
                }
                this.i();
            }
            if (!this.e.isDone()) {
                final MediaCodec a = this.a;
                lya.d();
                a.release();
                final Surface c = this.c;
                if (c != null && this.o) {
                    c.release();
                }
                this.e.o(true);
            }
        }
    }
    
    private static void k(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        final int encoder = mediaCodec.getCodecInfo().isEncoder() ? 1 : 0;
        try {
            mediaCodec.configure(mediaFormat, (Surface)null, (MediaCrypto)null, encoder);
        }
        catch (final MediaCodec$CodecException ex) {
            final String value = String.valueOf(ex.getDiagnosticInfo());
            String concat;
            if (value.length() != 0) {
                concat = "Error while configuring codec: ".concat(value);
            }
            else {
                concat = new String("Error while configuring codec: ");
            }
            Log.w("AsynchMediaCodec", concat, (Throwable)ex);
            throw ex;
        }
    }
    
    public final void a(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        if ((mediaCodec$BufferInfo.flags & 0x4) != 0x0) {
            this.i();
            this.b.set(3);
            if (this.g.get()) {
                this.n.e(2);
            }
            else {
                this.n.e(1);
            }
            if (this.g.getAndSet(false)) {
                this.b();
            }
        }
    }
    
    public final void b() {
        this.j(true);
    }
    
    public final void c() {
        this.j(false);
    }
    
    public final void d() {
        synchronized (this) {
            if (this.c != null) {
                this.e(0);
                return;
            }
            final int h = this.h();
            if (h < 0) {
                if (this.b.get() == 1) {
                    this.f.set(true);
                }
                return;
            }
            this.e(h);
        }
    }
    
    public final void e(final int n) {
        this.b.set(2);
        if (this.c == null) {
            try {
                this.a.queueInputBuffer(n, 0, 0, 0L, 4);
            }
            catch (final MediaCodec$CodecException ex) {
                this.j.onError(this.a, ex);
            }
            finally {
                final Throwable t;
                Log.e("AsynchMediaCodec", "Exception occurred while trying to signal an EOS", t);
            }
            this.k.clear();
            return;
        }
        try {
            this.a.signalEndOfInputStream();
        }
        catch (final MediaCodec$CodecException ex2) {
            this.j.onError(this.a, ex2);
        }
        finally {
            final Throwable t2;
            Log.e("AsynchMediaCodec", "Exception occurred while trying to signal an EOS", t2);
        }
    }
    
    @Override
    public final void f() {
        try {
            this.a.start();
            this.i.set(true);
            this.b.set(1);
            this.n.d();
        }
        catch (final MediaCodec$CodecException ex) {
            this.j.onError(this.a, ex);
        }
        finally {
            final Throwable t;
            Log.e("AsynchMediaCodec", "Exception occurred while trying to start codec", t);
        }
    }
    
    @Override
    public final mbc g() {
        njo.p(true, "nextByteBuffer() called on codec in block mode");
        if (this.c == null) {
            final int h = this.h();
            if (h < 0) {
                return null;
            }
            try {
                final ByteBuffer inputBuffer = this.a.getInputBuffer(h);
                if (inputBuffer == null) {
                    return null;
                }
                final mbc mbc = new mbc(this, inputBuffer, h);
                synchronized (this) {
                    this.k.add(mbc);
                    return mbc;
                }
            }
            catch (final MediaCodec$CodecException ex) {
                this.j.onError(this.a, ex);
                return null;
            }
            finally {
                final Throwable t;
                Log.e("AsynchMediaCodec", "Error occurred while trying to fetch input buffer", t);
                return null;
            }
        }
        throw new AssertionError((Object)"MediaCodec configured to use input surface. Should not be requesting for a byte buffer");
    }
}
