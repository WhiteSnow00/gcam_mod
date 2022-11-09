import java.nio.ByteBuffer;
import android.util.Log;
import android.media.MediaCodec$BufferInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.media.MediaCrypto;
import java.util.ArrayList;
import android.media.MediaFormat;
import java.util.List;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.view.Surface;
import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import android.media.MediaCodec$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpp implements koe
{
    private final kse A;
    private final double B;
    private final klv C;
    private final klv D;
    private final knc E;
    private final kou F;
    private MediaCodec$Callback G;
    private long H;
    private volatile long I;
    private final AtomicLong J;
    private volatile boolean K;
    private final AtomicBoolean L;
    public final Object a;
    public final Object b;
    public final MediaCodec c;
    public final Surface d;
    public final koz e;
    public final int f;
    public final Range g;
    public final ofn h;
    public final HandlerThread i;
    public final Handler j;
    public final boolean k;
    public final boolean l;
    public long m;
    public long n;
    public final AtomicLong o;
    public final AtomicLong p;
    public final AtomicLong q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public final List u;
    public boolean v;
    public MediaFormat w;
    public int x;
    private final boolean y;
    private final koa z;
    
    public kpp(final knc e, final knu knu, final koa z, final niz niz, final niz niz2, final boolean b, final koz e2, final kse a, final klv c, final klv d, final boolean l, final kou f) {
        this.a = new Object();
        this.b = new Object();
        this.h = ofn.f();
        this.G = new kpn(this);
        this.I = Long.MAX_VALUE;
        this.o = new AtomicLong(0L);
        this.p = new AtomicLong(0L);
        this.J = new AtomicLong(0L);
        this.q = new AtomicLong(0L);
        this.r = false;
        this.s = false;
        this.K = false;
        this.t = false;
        this.L = new AtomicBoolean(false);
        this.u = new ArrayList();
        this.v = false;
        this.E = e;
        this.e = e2;
        this.C = c;
        this.D = d;
        this.F = f;
        this.l = l;
        final double n = e.a();
        final double n2 = e.c();
        Double.isNaN(n);
        Double.isNaN(n2);
        this.B = n / n2;
        final knh a2 = knh.a(e.d);
        final String e3 = a2.e;
        final MediaFormat videoFormat = MediaFormat.createVideoFormat(e3, e.b.c().a, e.b.c().b);
        videoFormat.setInteger("color-format", knu.d);
        videoFormat.setInteger("bitrate", e.b());
        videoFormat.setInteger("frame-rate", e.c());
        videoFormat.setInteger("capture-rate", e.a());
        videoFormat.setInteger("i-frame-interval", e.g);
        videoFormat.setInteger("color-standard", 2);
        videoFormat.setInteger("color-range", 1);
        videoFormat.setInteger("color-transfer", 3);
        videoFormat.setInteger("create-input-buffers-suspended", 1);
        final int e4 = e.e;
        if (e4 != -1) {
            videoFormat.setInteger("profile", e4);
        }
        final int f2 = e.f;
        if (f2 != -1) {
            videoFormat.setInteger("level", f2);
        }
        if (e.c.f()) {
            videoFormat.setInteger("operating-rate", e.c.i);
            videoFormat.setInteger("priority", 0);
        }
        String.valueOf(String.valueOf(videoFormat)).length();
        final MediaCodec a3 = knf.a(a2);
        (this.c = a3).getClass();
        final HandlerThread i = new HandlerThread("VideoEncoder");
        (this.i = i).start();
        final Handler d2 = kpo.d(i.getLooper());
        this.j = d2;
        if (b) {
            this.k = true;
        }
        else {
            if (niz2.g()) {
                this.G = (MediaCodec$Callback)niz2.c();
                this.k = true;
            }
            else {
                this.k = false;
            }
            a3.setCallback(this.G, d2);
        }
        a3.configure(videoFormat, (Surface)null, (MediaCrypto)null, 1);
        this.y = niz.g();
        if (niz.g()) {
            a3.setInputSurface(this.d = (Surface)niz.c());
        }
        else if (knu == knu.a) {
            this.d = a3.createInputSurface();
        }
        else {
            this.d = null;
        }
        this.z = z;
        this.A = a;
        this.f = e.b();
        this.g = a3.getCodecInfo().getCapabilitiesForType(e3).getVideoCapabilities().getBitrateRange();
        this.x = 1;
        if (l) {
            a3.start();
            this.d(false);
        }
    }
    
    private final void g() {
        this.j.post((Runnable)new kpm(this, 1));
        try {
            this.i.join();
        }
        catch (final InterruptedException ex) {}
    }
    
    @Override
    public final void a(final long n) {
        synchronized (this.a) {
            final int x = this.x;
            Label_0391: {
                if (x != 2) {
                    if (x != 5) {
                        break Label_0391;
                    }
                    this.e(n);
                }
                final double n2 = (double)(n - this.m);
                final double b = this.B;
                Double.isNaN(n2);
                this.I = (long)(n2 * b);
                this.A.f("VideoEncoder#stop");
                if (this.d != null && this.x == 5) {
                    this.c.signalEndOfInputStream();
                }
                if (this.d == null) {
                    Object a = this.a;
                    synchronized (a) {
                        final int x2 = this.x;
                        if (x2 != 5) {
                            if (x2 != 2) {
                                throw new IllegalStateException("encoding is not yet started.");
                            }
                        }
                        monitorexit(a);
                        if (this.d != null) {
                            final String value = String.valueOf(knu.a);
                            a = new StringBuilder(String.valueOf(value).length() + 64);
                            ((StringBuilder)a).append("As ");
                            ((StringBuilder)a).append(value);
                            ((StringBuilder)a).append("is used as color format, you are not allowed to add data here");
                            throw new IllegalStateException(((StringBuilder)a).toString());
                        }
                        final int dequeueInputBuffer = this.c.dequeueInputBuffer(10000L);
                        if (dequeueInputBuffer >= 0) {
                            this.c.getInputBuffer(dequeueInputBuffer).clear();
                            this.c.queueInputBuffer(dequeueInputBuffer, 0, 0, n, 4);
                        }
                    }
                }
                final Surface d = this.d;
                if (d != null && !d.isValid()) {
                    this.h.o(null);
                }
                if (!this.k) {
                    this.F.a(2, this.I, this.p, this.h);
                }
                this.j.post((Runnable)new kpm(this));
                this.g();
                this.x = 3;
                this.A.g();
            }
            if (this.x != 4) {
                this.c.release();
                if (this.i.isAlive()) {
                    this.g();
                }
                final Surface d2 = this.d;
                if (d2 != null && !this.y) {
                    d2.release();
                }
                this.x = 4;
                SystemClock.uptimeMillis();
            }
        }
    }
    
    public final long b(final long n) {
        final double n2 = (double)n;
        final double b = this.B;
        Double.isNaN(n2);
        return (long)(n2 / b);
    }
    
    public final void c(final MediaFormat mediaFormat) {
        mediaFormat.setInteger("time-lapse-enable", 1);
        mediaFormat.setInteger("time-lapse-fps", this.E.a());
        String.valueOf(String.valueOf(mediaFormat)).length();
        if (!this.L.getAndSet(true)) {
            this.z.e(mediaFormat);
            this.z.k();
            if (!this.k) {
                this.e.b(kod.b, this.J);
            }
            return;
        }
        throw new IllegalStateException("format changed twice");
    }
    
    @Override
    public final void close() {
        this.a(SystemClock.uptimeMillis() * 1000L);
    }
    
    public final void d(final boolean b) {
        final Bundle parameters = new Bundle();
        parameters.putInt("drop-input-frames", (int)(b ? 1 : 0));
        final MediaCodec c = this.c;
        c.getClass();
        c.setParameters(parameters);
    }
    
    public final void e(final long n) {
        this.m += n - this.n;
    }
    
    public final void f(final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        if (n < 0) {
            final StringBuilder sb = new StringBuilder(63);
            sb.append("unexpected result from encoder.dequeueOutputBuffer: ");
            sb.append(n);
            Log.w("VideoEncoder", sb.toString());
        }
        else {
            final ByteBuffer outputBuffer = this.c.getOutputBuffer(n);
            if (outputBuffer == null) {
                final StringBuilder sb2 = new StringBuilder(40);
                sb2.append("encoderOutputBuffer ");
                sb2.append(n);
                sb2.append(" was null");
                throw new RuntimeException(sb2.toString());
            }
            if ((mediaCodec$BufferInfo.flags & 0x2) != 0x0) {
                mediaCodec$BufferInfo.size = 0;
            }
            if (this.B == 2.0) {
                final double n2 = (double)mediaCodec$BufferInfo.presentationTimeUs;
                final double b = this.B;
                Double.isNaN(n2);
                mediaCodec$BufferInfo.presentationTimeUs = (long)(n2 * b);
            }
            Label_0361: {
                if (mediaCodec$BufferInfo.size != 0 && !this.h.isDone()) {
                    if (!this.z.o()) {
                        try {
                            this.z.j(1000L);
                        }
                        catch (final RuntimeException ex) {
                            Log.e("VideoEncoder", "Could not start all required tracks.", (Throwable)ex);
                            this.K = true;
                            this.e.a(kov.j);
                            break Label_0361;
                        }
                    }
                    final long presentationTimeUs = mediaCodec$BufferInfo.presentationTimeUs;
                    if ((long)((kkz)this.C).d == 0L) {
                        this.C.aR(presentationTimeUs);
                        this.q.set(presentationTimeUs);
                    }
                    this.D.aR(presentationTimeUs);
                    this.p.set(presentationTimeUs);
                    this.J.set(this.b(presentationTimeUs));
                    outputBuffer.position(mediaCodec$BufferInfo.offset);
                    outputBuffer.limit(mediaCodec$BufferInfo.offset + mediaCodec$BufferInfo.size);
                    this.z.n(outputBuffer, mediaCodec$BufferInfo);
                    this.s = true;
                    final long h = this.H;
                    if (h > 0L && presentationTimeUs > h) {
                        this.z.d((presentationTimeUs - h) / 1000L);
                    }
                    this.H = presentationTimeUs;
                    this.o.incrementAndGet();
                }
            }
            this.c.releaseOutputBuffer(n, false);
            if ((mediaCodec$BufferInfo.presentationTimeUs >= this.I && (mediaCodec$BufferInfo.flags & 0x2) == 0x0) || (mediaCodec$BufferInfo.flags & 0x4) != 0x0 || (this.r && this.s) || this.K || this.t) {
                this.h.o(null);
            }
        }
        this.h.isDone();
    }
}
