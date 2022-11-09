import android.graphics.Point;
import android.app.Activity;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evk implements hpa
{
    public final kjm A;
    public final evp B;
    public final eum C;
    private final evn D;
    public final Context a;
    public final klv b;
    public final cxl c;
    public final Executor d;
    public final kjk e;
    public final Activity f;
    public final boolean g;
    public final boolean h;
    public final cvd i;
    public final cvq j;
    public final hdo k;
    public final eyt l;
    public final flo m;
    public lqd n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public String v;
    public niz w;
    public niz x;
    public final iov y;
    public final pii z;
    
    public evk(final Context a, final bmz bmz, final klv b, final cxl c, final Context context, final boolean g, final boolean h, final cvd i, final cvq j, final iov y, final evn d, final hdo k, final eyt l, final flo m, final Executor executor, final pii z, final kjm a2, final evp b2, final eum c2) {
        this.t = 0;
        this.u = 0;
        this.v = "-1";
        this.w = nii.a;
        this.x = nii.a;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = ofi.e(executor);
        this.p = true;
        this.q = (boolean)b.aQ();
        this.e = new kjk();
        this.f = (Activity)context;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.y = y;
        this.m = m;
        this.D = d;
        this.k = k;
        this.l = l;
        this.z = z;
        this.A = a2;
        this.B = b2;
        this.C = c2;
        bmz.i().c(new euw(this));
    }
    
    @Override
    public final void a() {
        this.d.execute(new eur(this, 1));
    }
    
    @Override
    public final void b(final hph hph) {
        this.D.d = new euq(this, hph);
        this.e.c(new evb(this.D));
        final evn d = this.D;
        final cxl b = d.b;
        final cxo a = cxu.a;
        b.e();
        final iov c = d.c;
        c.f();
        ofi.w(c.e, new evm(d), odx.a);
    }
    
    public final lri c() {
        if (this.c.k(cxu.k) && !this.B.b().startsWith("2.6")) {
            lri lri;
            if (this.c.k(cxu.l)) {
                lri = lri.e;
            }
            else {
                lri = lri.d;
            }
            return lri;
        }
        return lri.c;
    }
    
    public final void d() {
        if (this.r) {
            final lqd n = this.n;
            n.getClass();
            n.a.stop();
            this.r = false;
        }
    }
    
    public final void e() {
        if (this.o && this.q && !this.p && !this.r) {
            final lqd n = this.n;
            n.getClass();
            n.a.start();
            this.r = true;
        }
    }
    
    @Override
    public final void f(Point point) {
        point = new Point(point);
        this.d.execute(new eut(this, point));
    }
    
    @Override
    public final void g(final lju lju, final int n) {
        this.d.execute(new euv(this, lju, n));
    }
    
    @Override
    public final void t() {
        this.d.execute(new eur(this, 3));
    }
    
    @Override
    public final void u() {
        this.d.execute(new eur(this, 4));
    }
}
