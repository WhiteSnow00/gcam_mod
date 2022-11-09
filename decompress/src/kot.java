import android.media.MediaCodec$BufferInfo;
import java.util.concurrent.Executor;
import java.nio.ByteBuffer;
import android.util.Log;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.media.MediaCrypto;
import android.view.Surface;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Deque;
import java.util.Queue;
import android.media.MediaCodec;
import android.media.MediaCodec$Callback;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.HandlerThread;
import java.util.concurrent.Future;
import java.util.List;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kot implements koi
{
    public volatile boolean A;
    public krc B;
    public krc C;
    public boolean D;
    public MediaFormat E;
    public final List F;
    public final List G;
    public Future H;
    public long I;
    public int J;
    public byte[] K;
    public final HandlerThread L;
    public final ofn M;
    public int N;
    public final kpl O;
    private final kse P;
    private final kou Q;
    private long R;
    private final AtomicBoolean S;
    private final Handler T;
    private final MediaCodec$Callback U;
    public final ofa a;
    public final ofa b;
    public final ofa c;
    public final ofa d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final MediaCodec h;
    public final koa i;
    public final klv j;
    public final double k;
    public final koz l;
    public final boolean m;
    public final Queue n;
    public final boolean o;
    public final Deque p;
    public long q;
    public volatile long r;
    public long s;
    public final klv t;
    public final AtomicLong u;
    public final AtomicLong v;
    public volatile boolean w;
    public volatile boolean x;
    public volatile boolean y;
    public volatile boolean z;
    
    public kot(final kmz kmz, final kpl o, final koa i, final koz l, final kse p9, final klv j, final klv t, final boolean m, final kou q) {
        this.e = new Object();
        this.f = new Object();
        this.g = new Object();
        this.n = new ArrayDeque(1000);
        this.p = new ArrayDeque();
        this.q = -1L;
        this.r = Long.MAX_VALUE;
        this.R = 0L;
        this.u = new AtomicLong(0L);
        this.v = new AtomicLong(0L);
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.S = new AtomicBoolean(false);
        this.D = false;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = null;
        this.I = -1L;
        this.J = -1;
        this.K = null;
        this.M = ofn.f();
        final koq u = new koq(this);
        this.U = u;
        this.O = o;
        this.l = l;
        this.j = j;
        this.t = t;
        this.m = m;
        this.Q = q;
        final double n = kmz.d;
        final double n2 = kmz.c;
        Double.isNaN(n);
        Double.isNaN(n2);
        this.k = n / n2;
        this.o = false;
        final knd a = knd.a(kmz.a.g);
        final String f = a.f;
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", f);
        if (a.f.equals("audio/mp4a-latm")) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        mediaFormat.setInteger("sample-rate", kmz.c);
        mediaFormat.setInteger("channel-count", kmz.e);
        mediaFormat.setInteger("bitrate", kmz.b);
        final MediaCodec a2 = knf.a(a);
        (this.h = a2).getClass();
        this.a = ofi.b(mcn.h("AEncFormat"));
        this.b = ofi.b(mcn.h("AEncInput"));
        this.c = ofi.b(mcn.h("AEncOutput"));
        this.d = ofi.b(mcn.h("AEncReadAudio"));
        final HandlerThread k = new HandlerThread("AudioEncoder");
        (this.L = k).start();
        a2.setCallback((MediaCodec$Callback)u, this.T = kpo.d(k.getLooper()));
        a2.configure(mediaFormat, (Surface)null, (MediaCrypto)null, 1);
        this.i = i;
        this.P = p9;
        this.N = 1;
        if (m) {
            a2.start();
        }
    }
    
    public static long c() {
        return TimeUnit.MICROSECONDS.convert(SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }
    
    private final void j() {
        this.T.post((Runnable)new kok(this, 1));
        try {
            this.L.join();
        }
        catch (final InterruptedException ex) {}
    }
    
    @Override
    public final void a() {
        synchronized (this.e) {
            if (this.N != 4) {
                if (this.L.isAlive()) {
                    this.j();
                }
                this.a.shutdown();
                this.c.shutdown();
                this.b.shutdown();
                this.d.shutdown();
                this.h.release();
                this.O.close();
                try (final krc b = this.B) {}
                try (final krc c = this.C) {}
                this.N = 4;
                SystemClock.uptimeMillis();
            }
        }
    }
    
    @Override
    public final void b(long d) {
        synchronized (this.e) {
            final int n = this.N;
            if (n == 2 || n == 5) {
                d = this.d(d);
                if (this.N == 5) {
                    this.i(d);
                }
                this.r = d - this.s;
                this.P.f("AudioEncoder#stop");
                this.Q.a(1, this.r, this.u, this.M);
                this.O.a.d();
                this.T.post((Runnable)new kok(this));
                this.j();
                this.P.g();
                this.N = 3;
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.e) {
            this.b(c());
            this.a();
        }
    }
    
    public final long d(final long n) {
        final double n2 = (double)n;
        final double k = this.k;
        Double.isNaN(n2);
        return (long)(n2 * k);
    }
    
    public final void e(final MediaCodec mediaCodec, final int n) {
        if (this.O.a() != 3) {
            return;
        }
        if (n >= 0) {
            final ByteBuffer inputBuffer = mediaCodec.getInputBuffer(n);
            final kpk b = this.O.b(inputBuffer, inputBuffer.limit());
            if (b == null) {
                int n2;
                if (this.O.a() == 3) {
                    Log.w("AudioEncoder", "Read buffer from AudioRecord, but buffer size is 0.");
                    n2 = 0;
                }
                else {
                    n2 = 4;
                }
                mediaCodec.queueInputBuffer(n, 0, 0, this.q, n2);
                return;
            }
            final long d = this.d(TimeUnit.MICROSECONDS.convert(b.b(), TimeUnit.NANOSECONDS));
            mediaCodec.queueInputBuffer(n, 0, b.a(), d, 0);
            this.q = d;
        }
    }
    
    public final void f(final MediaFormat mediaFormat) {
        if (!this.S.getAndSet(true)) {
            if (!this.M.isDone()) {
                this.g(new kol(this, mediaFormat), this.a);
            }
            return;
        }
        throw new IllegalStateException("format changed twice");
    }
    
    public final void g(final Runnable runnable, final ofa ofa) {
        ofi.w(ofa.a(runnable), new kor(this), odx.a);
    }
    
    public final void h() {
        while (!this.n.isEmpty() && this.n.peek().a.presentationTimeUs <= (long)((kkz)this.t).d) {
            final kos kos = this.n.poll();
            if (kos.a.presentationTimeUs >= (long)((kkz)this.j).d) {
                final MediaCodec$BufferInfo a = kos.a;
                final ByteBuffer b = kos.b;
                Label_0193: {
                    if (!this.i.o()) {
                        try {
                            this.i.j(2000L);
                        }
                        catch (final RuntimeException ex) {
                            Log.e("AudioEncoder", "Could not start all required tracks.", (Throwable)ex);
                            this.z = true;
                            this.l.a(kov.c);
                            break Label_0193;
                        }
                    }
                    if (this.R < a.presentationTimeUs) {
                        this.R = a.presentationTimeUs;
                        this.i.l(b, a);
                        this.y = true;
                    }
                }
                this.x = true;
            }
        }
    }
    
    public final void i(final long n) {
        final nqe nqe = this.p.removeLast();
        this.p.add(nqe.e(nqe.i(), n));
        this.s += n - (long)nqe.i();
    }
}
