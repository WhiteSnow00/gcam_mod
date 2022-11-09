import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grh implements grn
{
    public float a;
    public final krr b;
    public int c;
    public CountDownLatch d;
    public final kkz e;
    private final cxl f;
    private final fvt g;
    private float h;
    private float i;
    private final ofa j;
    private oey k;
    private Float l;
    private Float m;
    private Float n;
    private Float o;
    private Float p;
    private Float q;
    private Float r;
    private lfg s;
    private klj t;
    private boolean u;
    
    public grh(final cxl f, final fvt g, final ofa j, final krq krq) {
        this.a = 12.0f;
        this.e = new kkz(p());
        this.f = f;
        final cxm a = cxk.a;
        f.b();
        this.g = g;
        this.j = j;
        this.b = krq.a("DualEvCtrl");
        this.h = 0.5f;
        this.i = 0.0f;
        this.c = 0;
    }
    
    private static float m(final float n) {
        return och.c(n, 0.03f, 0.97f);
    }
    
    private final float n(float n) {
        synchronized (this) {
            n = (float)Math.pow((och.c(n, 1.0f, this.a) - 1.0f) / (this.a - 1.0f), 0.75);
            return n;
        }
    }
    
    private final float o(float a) {
        monitorenter(this);
        final double n = a;
        try {
            final double pow = Math.pow(n, 1.3333333730697632);
            a = this.a;
            final float n2 = (float)pow;
            monitorexit(this);
            return (a - 1.0f) * n2 + 1.0f;
        }
        finally {
            monitorexit(this);
        }
    }
    
    private static grg p() {
        return grg.a(0.0f, 0.0f, 0.0f, 0);
    }
    
    private final void q(final float n, final float n2, final float n3) {
        synchronized (this) {
            this.o = n;
            this.p = n2;
            this.q = n3;
            this.r = (float)(Math.log(m(this.n(n2 / n))) / Math.log(m(this.i)));
        }
    }
    
    private static boolean r(final float n) {
        return n >= 0.0f && n <= 1.0f;
    }
    
    public final grg a(float floatValue, float n) {
        synchronized (this) {
            if (!this.u) {
                return p();
            }
            if (this.s == null) {
                return p();
            }
            if (!r(floatValue) || !r(n)) {
                return p();
            }
            final float a = this.s.a();
            final float n2 = this.s.e() * a;
            final float n3 = this.s.d() * a - n2;
            if (this.o != null && this.p != null && this.q != null) {
                this.r.getClass();
                if (this.f.k(cxf.a)) {
                    floatValue = n2 + n3 * floatValue;
                    n = (float)Math.pow(2.0, floatValue);
                    return grg.a(this.o * n, this.p * n, this.q * n, Math.round(floatValue / a));
                }
                floatValue = n2 + n3 * floatValue;
                final double pow = Math.pow(2.0, floatValue);
                final int round = Math.round(floatValue / a);
                floatValue = this.r;
                n = this.o((float)Math.pow(n, floatValue));
                floatValue = this.o * (float)pow;
                final float n4 = n * floatValue;
                n = och.c(n4, floatValue, this.a * floatValue);
                int n5;
                if ((n5 = round) == 0) {
                    n5 = -1;
                }
                return grg.a(floatValue, n4, n, n5);
            }
            else {
                final Float l = this.l;
                if (l != null && this.m != null && this.n != null) {
                    this.q(l, this.m, this.n);
                    return p();
                }
                return p();
            }
        }
    }
    
    public final grk b() {
        synchronized (this) {
            final Float l = this.l;
            if (l != null && this.m != null) {
                this.n.getClass();
                final float floatValue = l;
                final float floatValue2 = this.m;
                this.n.floatValue();
                this.h = 0.5f;
                final float n = this.n(floatValue2 / floatValue);
                this.i = n;
                float c = n;
                if (this.c > 0) {
                    c = och.c(n, 0.08f, 0.92f);
                    this.i = c;
                }
                return grk.a(this.h, c);
            }
            return grk.a(0.5f, 0.0f);
        }
    }
    
    public final klj c() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public final nyr d() {
        synchronized (this) {
            final okt m = nyr.h.m();
            if (this.u) {
                final Float o = this.o;
                if (o != null) {
                    if (this.p != null) {
                        this.q.getClass();
                        final float floatValue = o;
                        final float floatValue2 = this.p;
                        final float floatValue3 = this.q;
                        final grg grg = (grg)this.e.d;
                        if (m.c) {
                            m.m();
                            m.c = false;
                        }
                        final nyr nyr = (nyr)m.b;
                        final int a = nyr.a | 0x1;
                        nyr.a = a;
                        nyr.b = floatValue;
                        final int a2 = a | 0x2;
                        nyr.a = a2;
                        nyr.c = floatValue2;
                        final int a3 = a2 | 0x4;
                        nyr.a = a3;
                        nyr.d = floatValue3;
                        final float a4 = grg.a;
                        final int a5 = a3 | 0x8;
                        nyr.a = a5;
                        nyr.e = a4;
                        final float b = grg.b;
                        final int a6 = a5 | 0x10;
                        nyr.a = a6;
                        nyr.f = b;
                        final float c = grg.c;
                        nyr.a = (a6 | 0x20);
                        nyr.g = c;
                        return (nyr)m.h();
                    }
                }
            }
            return (nyr)m.h();
        }
    }
    
    @Override
    public final oey e() {
        final oey k = this.k;
        if (k != null) {
            k.cancel(true);
        }
        return this.k = this.j.b(new grf(this));
    }
    
    public final void f() {
        synchronized (this) {
            if (!this.j()) {
                return;
            }
            final int c = this.c + 1;
            this.c = c;
            final krr b = this.b;
            final StringBuilder sb = new StringBuilder(56);
            sb.append("Tapped to initiate dual ev (touchCounter : ");
            sb.append(c);
            sb.append(").");
            b.b(sb.toString());
            this.h();
            this.u = true;
        }
    }
    
    @Override
    public final void g() {
        synchronized (this) {
            this.c = 0;
            if (!this.j()) {
                return;
            }
            final krr b = this.b;
            final int c = this.c;
            final StringBuilder sb = new StringBuilder(47);
            sb.append("Resetting dual ev (touchCounter : ");
            sb.append(c);
            sb.append(").");
            b.b(sb.toString());
            this.h();
            this.u = false;
        }
    }
    
    public final void h() {
        synchronized (this) {
            this.e.aR(p());
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
        }
    }
    
    public final void i(final lfg s, final float n, final float n2, final float n3) {
        synchronized (this) {
            this.s = s;
            this.l = n;
            this.m = n2;
            this.n = n3;
            final CountDownLatch d = this.d;
            if (d != null) {
                d.countDown();
            }
        }
    }
    
    @Override
    public final boolean j() {
        monitorenter(this);
        try {
            final klj t = this.t;
            final boolean b = t != null && ((grm)t.aQ()).a && ((grm)this.t.aQ()).b;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void k(final bmz bmz, klj b, final klj t) {
        synchronized (this) {
            bmz.h().c(kld.c(b).a(new gre(this, 1), odx.a));
            this.t = t;
            final kjk h = bmz.h();
            final fvt g = this.g;
            b = klq.b(g.c, g.d);
            h.c(b.a(new gre(this), odx.a));
        }
    }
    
    public final void l() {
    }
}
