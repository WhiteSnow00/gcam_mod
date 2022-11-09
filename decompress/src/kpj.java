import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import android.media.MediaFormat;
import android.location.Location;
import java.util.Iterator;
import android.util.Log;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutorService;
import java.util.List;
import android.os.Handler;
import java.util.concurrent.ConcurrentLinkedQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpj implements koa
{
    public final ConcurrentLinkedQueue a;
    public boolean b;
    public boolean c;
    public final koz d;
    private ljy e;
    private ljy f;
    private final Object g;
    private final Handler h;
    private volatile long i;
    private final koc j;
    private final koc k;
    private final List l;
    private final ofn m;
    private final kpa n;
    private knw o;
    private final int p;
    private final kny q;
    private final niz r;
    private final int s;
    private long t;
    private boolean u;
    private final ExecutorService v;
    private final long w;
    private int x;
    private final int y;
    
    public kpj(final FileDescriptor fileDescriptor, final int p14, final int s, final niz r, final oey oey, final long n, final long n2, final int n3, final int n4, final int y, final kny q, final Handler h, final ExecutorService v, final koz d) {
        this.f = null;
        this.i = 0L;
        final ArrayList l = new ArrayList();
        this.l = l;
        this.n = new kpa();
        this.o = new knw(Long.MAX_VALUE, Long.MAX_VALUE);
        this.t = 0L;
        this.u = false;
        this.s = s;
        this.p = p14;
        this.r = r;
        this.q = q;
        this.d = d;
        this.e = u(fileDescriptor, q, p14, s, r);
        this.g = new Object();
        this.x = 1;
        if (n4 == 1) {
            this.j = new koc(n3);
            this.k = new koc(1);
            l.add(new koc(y));
            this.y = y;
            this.h = h;
            this.m = ofn.f();
            this.a = new ConcurrentLinkedQueue();
            this.b = false;
            this.c = false;
            this.v = v;
            this.w = n2 - 30000000L;
            ofi.w(odg.h(oey, new kpe(n), odx.a), new kpi(this), odx.a);
            return;
        }
        throw new IllegalArgumentException("add least audio or video is required.");
    }
    
    private final knw q() {
        synchronized (this) {
            return this.o;
        }
    }
    
    private final void r() {
        synchronized (this.g) {
            njo.d(this.u);
            final ljy e = this.e;
            final ljy f = this.f;
            f.getClass();
            this.e = f;
            this.f = null;
            f.e();
            this.u = false;
            ((odd)this.v).a(new kph(this, e));
            this.h.post((Runnable)new kpf(this));
        }
    }
    
    private final void s(ByteBuffer n, final MediaCodec$BufferInfo mediaCodec$BufferInfo, int length) {
        final knw q = this.q();
        synchronized (this.g) {
            final int x = this.x;
            if (x != 2) {
                String s = null;
                switch (x) {
                    default: {
                        s = "null";
                        break;
                    }
                    case 4: {
                        s = "CLOSED";
                        break;
                    }
                    case 3: {
                        s = "STOPPED";
                        break;
                    }
                    case 2: {
                        s = "STARTED";
                        break;
                    }
                    case 1: {
                        s = "READY";
                        break;
                    }
                }
                length = s.length();
                final StringBuilder sb = new StringBuilder(length + 32);
                sb.append("STARTED");
                sb.append(" is expected, but we get ");
                sb.append(s);
                Log.e("MediaMuxerMul", sb.toString());
                return;
            }
            synchronized (this.g) {
                if (this.t >= this.w) {
                    this.h.post((Runnable)new kpf(this, 1));
                    this.t = 0L;
                }
                if (!this.u) {
                    monitorexit(this.g);
                }
                else if (this.k.d()) {
                    this.r();
                    monitorexit(this.g);
                }
                else {
                    if (length == this.k.a() && (mediaCodec$BufferInfo.flags & 0x1) != 0x0) {
                        final long presentationTimeUs = mediaCodec$BufferInfo.presentationTimeUs;
                        this.r();
                    }
                    monitorexit(this.g);
                }
                if (mediaCodec$BufferInfo.presentationTimeUs < 0L) {
                    final long presentationTimeUs2 = mediaCodec$BufferInfo.presentationTimeUs;
                    final StringBuilder sb2 = new StringBuilder(63);
                    sb2.append("Tried to write negative presentationTimeUs ");
                    sb2.append(presentationTimeUs2);
                    Log.e("MediaMuxerMul", sb2.toString());
                    return;
                }
                Label_0417: {
                    try {
                        if (this.u) {
                            final int size = mediaCodec$BufferInfo.size;
                            final long presentationTimeUs3 = mediaCodec$BufferInfo.presentationTimeUs;
                        }
                        this.e.h(length, (ByteBuffer)n, mediaCodec$BufferInfo);
                        n = (IllegalStateException)this.n;
                        ((kpa)n).a += mediaCodec$BufferInfo.size;
                        this.t += mediaCodec$BufferInfo.size;
                        break Label_0417;
                    }
                    catch (final IllegalStateException n) {}
                    catch (final IllegalArgumentException ex) {}
                    Log.e("MediaMuxerMul", "Fail to write data to muxer", (Throwable)n);
                    this.h.post((Runnable)new kpf(this, 2));
                }
                monitorexit(this.g);
                if (this.n.a >= q.a) {
                    this.h.post((Runnable)new kpf(this, 3));
                }
                if (this.n.b >= q.b) {
                    this.h.post((Runnable)new kpf(this, 4));
                }
            }
        }
    }
    
    private final boolean t() {
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            if (!((koc)iterator.next()).e()) {
                return false;
            }
        }
        return true;
    }
    
    private static ljy u(final FileDescriptor fileDescriptor, final kny kny, final int n, final int n2, final niz niz) {
        if (fileDescriptor != null) {
            final ljy a = kny.a(fileDescriptor, n);
            a.d(n2);
            if (n == 0 && niz.g()) {
                a.c((float)((Location)niz.c()).getLatitude(), (float)((Location)niz.c()).getLongitude());
            }
            return a;
        }
        throw new IllegalArgumentException("Either outputFilePath or outputFilePath should be provided.");
    }
    
    @Override
    public final niz a(final MediaFormat d) {
        final Object g = this.g;
        monitorenter(g);
        try {
            final int x = this.x;
            if (x == 3 || x == 4) {
                Log.e("MediaMuxerMul", "Already stopped or closed, cannot add metadata track.");
                final nii a = nii.a;
                monitorexit(g);
                return a;
            }
            if (x == 2 && !this.e.i()) {
                Log.e("MediaMuxerMul", "Already started, cannot add metadata track.");
                final nii a2 = nii.a;
                monitorexit(g);
                return a2;
            }
            if (this.y == 3) {
                Log.e("MediaMuxerMul", "Metadata track is forbidden and can't be added");
                final nii a3 = nii.a;
                monitorexit(g);
                return a3;
            }
            final String string = d.getString("mime");
            string.getClass();
            final Iterator iterator = this.l.iterator();
            while (iterator.hasNext()) {
                if (((koc)iterator.next()).d != null) {
                    if (!string.equals(d.getString("mime"))) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder(string.length() + 37);
                    sb.append("Metadata track format ");
                    sb.append(string);
                    sb.append(" already added.");
                    Log.e("MediaMuxerMul", sb.toString());
                    throw new IllegalStateException("Metadata track format added twice.");
                }
            }
            koc koc;
            if (!((koc)nov.d(this.l)).a) {
                final List l = this.l;
                koc = l.remove(l.size() - 1);
            }
            else {
                koc = new koc(this.y);
            }
            koc.c(this.e.a(d));
            koc.d = d;
            this.l.add(koc);
            koc.a();
            final niz i = niz.i(koc.a());
            monitorexit(g);
            return i;
        }
        finally {
            monitorexit(g);
            while (true) {}
        }
    }
    
    @Override
    public final void b(final MediaFormat d) {
        synchronized (this.g) {
            final int x = this.x;
            if (x == 3 || x == 4) {
                Log.e("MediaMuxerMul", "Already stopped or closed, cannot add audio track.");
                return;
            }
            if (x == 2 && !this.e.i()) {
                Log.e("MediaMuxerMul", "Already started, cannot add audio track.");
                return;
            }
            if (this.j.d()) {
                Log.e("MediaMuxerMul", "Audio track is forbidden and can't be added");
                return;
            }
            this.j.c(this.e.a(d));
            final koc j = this.j;
            j.d = d;
            j.a();
        }
    }
    
    @Override
    public final void c(final kob kob) {
        this.a.add(kob);
    }
    
    @Override
    public final void close() {
        this.i();
        this.v.shutdown();
    }
    
    @Override
    public final void d(final long n) {
        if (n < 0L) {
            Log.e("MediaMuxerMul", "The duration of record cannot be shorter than existing one.");
            return;
        }
        final kpa n2 = this.n;
        n2.b += n;
    }
    
    @Override
    public final void e(final MediaFormat d) {
        synchronized (this.g) {
            final int x = this.x;
            if (x == 3 || x == 4) {
                Log.e("MediaMuxerMul", "Already stopped or closed, cannot add video track.");
                return;
            }
            if (x == 2 && !this.e.i()) {
                Log.e("MediaMuxerMul", "Already started, cannot add video track.");
                return;
            }
            this.k.c(this.e.a(d));
            final koc k = this.k;
            k.d = d;
            k.a();
        }
    }
    
    @Override
    public final void f() {
        synchronized (this.g) {
            if (this.x != 1) {
                Log.e("MediaMuxerMul", "Already started, cannot discard track.");
                return;
            }
            final koc j = this.j;
            if (j.a) {
                Log.w("TrackInf", "Track is already added");
            }
            else {
                j.b = true;
            }
        }
    }
    
    @Override
    public final void g(final kob kob) {
        this.a.remove(kob);
    }
    
    @Override
    public final void h(final FileDescriptor fileDescriptor) {
        try {
            this.f = u(fileDescriptor, this.q, this.p, this.s, this.r);
            final ArrayList list = new ArrayList();
            final koc k = this.k;
            if (k.a) {
                list.add(k);
            }
            final koc j = this.j;
            if (j.a) {
                list.add(j);
            }
            for (final koc koc : this.l) {
                if (koc.a) {
                    list.add(koc);
                }
            }
            Collections.sort((List<Comparable>)list);
            final int size = list.size();
            int n = 0;
            while (true) {
                boolean b = true;
                if (n >= size) {
                    break;
                }
                final koc koc2 = (koc)list.get(n);
                final ljy f = this.f;
                f.getClass();
                final MediaFormat d = koc2.d;
                d.getClass();
                if (f.a(d) != koc2.a()) {
                    b = false;
                }
                njo.d(b);
                ++n;
            }
            this.u = true;
        }
        catch (final knx knx) {
            Log.e("MediaMuxerMul", "Fail to create next video file", (Throwable)knx);
            throw new IllegalStateException("Fail to create next video file", knx);
        }
    }
    
    @Override
    public final void i() {
        synchronized (this.g) {
            final int x = this.x;
            Label_0255: {
                if (x == 2) {
                    if (this.k.c) {
                        final koc j = this.j;
                        if (!j.a || j.c) {
                            Log.e("MediaMuxerMul", "All tracks empty; writing empty packet to avoid muxer hang");
                            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1);
                            allocateDirect.put((byte)0);
                            final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
                            mediaCodec$BufferInfo.set(0, 1, this.i, 5);
                            if (this.k.a) {
                                this.n(allocateDirect, mediaCodec$BufferInfo);
                            }
                            else if (this.j.a) {
                                this.l(allocateDirect, mediaCodec$BufferInfo);
                            }
                            else {
                                Log.e("MediaMuxerMul", "Couldn't write out any empty packets.");
                            }
                        }
                    }
                    try {
                        this.e.f();
                    }
                    catch (final IllegalStateException ex) {
                        Log.e("MediaMuxerMul", "Failed to stop mediamuxer ", (Throwable)ex);
                        this.d.a(kov.f);
                    }
                    this.x = 3;
                }
                else if (x == 4) {
                    break Label_0255;
                }
                try {
                    this.e.b();
                }
                catch (final IllegalStateException ex2) {
                    final String value = String.valueOf(ex2);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 29);
                    sb.append("Failed to release mediamuxer ");
                    sb.append(value);
                    Log.e("MediaMuxerMul", sb.toString());
                }
                this.x = 4;
            }
            final ljy f = this.f;
            if (f != null) {
                f.b();
                this.f = null;
            }
        }
    }
    
    @Override
    public final void j(final long n) {
        try {
            this.m.get(n, TimeUnit.MILLISECONDS);
            return;
        }
        catch (final TimeoutException ex) {
            throw new RuntimeException(String.format("Wait for muxer to start timed out after %s milliseconds.audio-ready: %s, video-ready: %s, meta-ready: %s", n, this.j.e(), this.k.e(), this.t()));
        }
        catch (final ExecutionException ex2) {}
        catch (final InterruptedException ex3) {}
        final ExecutionException ex2;
        throw new RuntimeException("Wait for Muxer start is interrupted", ex2);
    }
    
    @Override
    public final void k() {
        synchronized (this.g) {
            final int x = this.x;
            if (x == 1) {
                if (!this.j.e() || !this.k.e() || !this.t()) {
                    if (!this.e.i()) {
                        return;
                    }
                }
                this.e.e();
                this.x = 2;
                this.m.o(null);
                this.i = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
            }
            else if (x == 3) {
                Log.e("MediaMuxerMul", "Muxer is already stopped and it cannot be reused");
            }
        }
    }
    
    @Override
    public final void l(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final koc j = this.j;
        if (j.a) {
            this.s(byteBuffer, mediaCodec$BufferInfo, j.a());
            if (mediaCodec$BufferInfo.size > 0) {
                this.j.b();
            }
            return;
        }
        Log.e("MediaMuxerMul", "Audio track is not supported");
    }
    
    @Override
    public final void m(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo, final int n) {
        while (true) {
            for (final koc koc : this.l) {
                if (koc.a && koc.a() == n) {
                    if (koc == null) {
                        final StringBuilder sb = new StringBuilder(41);
                        sb.append("Couldn't find metadata track: ");
                        sb.append(n);
                        Log.e("MediaMuxerMul", sb.toString());
                        return;
                    }
                    if (koc.a) {
                        this.s(byteBuffer, mediaCodec$BufferInfo, koc.a());
                        if (mediaCodec$BufferInfo.size > 0) {
                            koc.b();
                        }
                        return;
                    }
                    Log.e("MediaMuxerMul", "Metadata track is not supported");
                    return;
                }
            }
            koc koc = null;
            continue;
        }
    }
    
    @Override
    public final void n(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final koc k = this.k;
        if (k.a) {
            this.s(byteBuffer, mediaCodec$BufferInfo, k.a());
            if (mediaCodec$BufferInfo.size > 0) {
                this.k.b();
                this.h.post((Runnable)new kpg(this, mediaCodec$BufferInfo));
            }
            return;
        }
        Log.e("MediaMuxerMul", "Video track is not supported");
    }
    
    @Override
    public final boolean o() {
        synchronized (this.g) {
            return this.x == 2;
        }
    }
    
    public final void p(final knw o) {
        synchronized (this) {
            this.o = o;
        }
    }
}
