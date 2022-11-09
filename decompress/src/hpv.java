import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpv extends hrc implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    public final hul d;
    public final hul e;
    public final hul f;
    public final hul g;
    
    public hpv(final Context context, final hrh hrh, final hpw hpw, final bqv bqv, final hqo hqo, final Handler handler, final PackageManager packageManager, final Resources resources, final hrk hrk, final hqs hqs, final hsw hsw) {
        super(context, hrh, hpw, bqv, hqo, handler, packageManager, resources, hrk, hqs, hsw);
        final hul b = new hul(new hpp(this), new huh[0]);
        this.b = b;
        this.c = new hul(new hpq(this), new huh[0]);
        this.d = new hul(new hpr(this), new huh[0]);
        this.e = new hul(new hps(this), new huh[0]);
        this.f = new hul(new hpt(this), new huh[0]);
        this.g = new hul(new hpu(this), new huh[0]);
        (this.a = new huj(b, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).a();
    }
    
    @Override
    public final void b(final bqr bqr, final boolean b) {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).b(bqr, b);
    }
    
    @Override
    public final void bj() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).bj();
    }
    
    @Override
    public final boolean bl() {
        return this.a.a() != null && ((hqt)this.a.a().a).bl();
    }
    
    @Override
    public final void bw() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).bw();
    }
    
    @Override
    public final void d(final bqr bqr, final boolean b) {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).d(bqr, b);
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
        this.f.e();
        this.g.e();
    }
    
    @Override
    public final void f() {
        this.a.c();
    }
    
    @Override
    public final void g() {
        this.a.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
    
    @Override
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).i();
    }
    
    @Override
    public final void j() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).j();
    }
    
    @Override
    public final void k() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).k();
    }
    
    @Override
    public final void l(final ResolveInfo resolveInfo) {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).l(resolveInfo);
    }
    
    @Override
    public final void m() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).m();
    }
    
    @Override
    public final void n() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).n();
    }
    
    @Override
    public final void o() {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).o();
    }
    
    @Override
    public final void p(final long n) {
        if (this.a.a() == null) {
            return;
        }
        ((hqt)this.a.a().a).p(n);
    }
}
