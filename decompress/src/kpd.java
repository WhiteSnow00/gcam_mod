import android.media.MediaFormat;
import java.util.concurrent.Executor;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpd implements knz
{
    public static final Long a;
    public final koa b;
    public final knc c;
    public final Queue d;
    public niz e;
    private final koz f;
    private final ofa g;
    private final klv h;
    private final double i;
    private final AtomicLong j;
    private krc k;
    private final Deque l;
    private long m;
    private final Object n;
    private int o;
    
    static {
        a = 2000L;
    }
    
    public kpd(final koa b, final koz f, final klv h, final knc c) {
        this.j = new AtomicLong(0L);
        this.d = new ArrayDeque(1000);
        this.l = new ArrayDeque();
        this.e = nii.a;
        this.n = new Object();
        this.b = b;
        this.f = f;
        this.h = h;
        final double n = c.a();
        final double n2 = c.c();
        Double.isNaN(n);
        Double.isNaN(n2);
        this.i = n / n2;
        this.c = c;
        this.g = ofi.b(mcn.h("MEncOutput"));
        this.o = 1;
    }
    
    private final long f(final long n) {
        final double n2 = (double)n;
        final double i = this.i;
        Double.isNaN(n2);
        return (long)(n2 * i);
    }
    
    @Override
    public final void a(final long n) {
        synchronized (this.n) {
            if (this.o == 2) {
                this.o = 5;
                this.l.add(nqe.c(this.f(n)));
                return;
            }
            Log.e("MetaEncoder", "It is not recording now");
        }
    }
    
    @Override
    public final void b() {
        synchronized (this.n) {
            if (this.o == 4) {
                return;
            }
            try (final krc k = this.k) {}
            this.g.shutdown();
            this.o = 4;
        }
    }
    
    @Override
    public final void c(long f) {
        synchronized (this.n) {
            if (this.o == 5) {
                this.o = 2;
                f = this.f(f);
                final nqe nqe = this.l.removeLast();
                this.l.add(nqe.e(nqe.i(), f));
                this.m += f - (long)nqe.i();
                return;
            }
            Log.e("MetaEncoder", "It is not paused now");
        }
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void d() {
        synchronized (this.n) {
            final int o = this.o;
            if (o != 1) {
                String s = null;
                switch (o) {
                    default: {
                        s = "null";
                        break;
                    }
                    case 5: {
                        s = "PAUSED";
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
                final StringBuilder sb = new StringBuilder(s.length() + 17);
                sb.append("illegal state as ");
                sb.append(s);
                Log.e("MetaEncoder", sb.toString());
                return;
            }
            this.m = 0L;
            this.k = this.h.a(new kpb(this), this.g);
            final MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "application/meta");
            this.e = this.b.a(mediaFormat);
            this.b.k();
            this.f.b(kod.c, this.j);
            this.o = 2;
        }
    }
    
    @Override
    public final void e(final cht cht, long f) {
        final Object n = this.n;
        monitorenter(n);
        try {
            this.j.set(f);
            Label_0182: {
                if (this.d.size() < 1000) {
                    f = this.f(f);
                    final Deque l = this.l;
                    while (!l.isEmpty()) {
                        final nqe nqe = (nqe)l.peek();
                        nqe.getClass();
                        if (nqe.k(f)) {
                            break Label_0182;
                        }
                        if (nqe.l() && (long)nqe.i() > f) {
                            break;
                        }
                        String.valueOf(String.valueOf(nqe)).length();
                        l.poll();
                    }
                    this.d.offer(new kpc(cht, f - this.m));
                }
                else {
                    Log.w("MetaEncoder", "Video frame timestamp is very off. Possibly no metadata is written.");
                }
            }
            monitorexit(n);
        }
        finally {
            monitorexit(n);
            while (true) {}
        }
    }
}
