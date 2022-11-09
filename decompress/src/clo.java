// 
// Decompiled by Procyon v0.6.0
// 

public final class clo extends cma implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    public final hul d;
    public final hul e;
    
    public clo(final jjb jjb, final ckv ckv, final klv klv, final cxl cxl, final ihl ihl, final niz niz, final crg crg) {
        super(jjb, ckv, klv, cxl, ihl, niz, crg);
        this.b = new hul(new clk(this), new huh[0]);
        this.c = new hul(new cll(this), new huh[0]);
        final hul d = new hul(new clm(this), new huh[0]);
        this.d = d;
        this.e = new hul(new cln(this), new huh[0]);
        (this.a = new huj(d, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((clv)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((clv)this.a.a().a).b();
    }
    
    @Override
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((clv)this.a.a().a).c();
    }
    
    @Override
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((clv)this.a.a().a).d();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
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
}
