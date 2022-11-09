import com.google.android.apps.camera.evcomp.EvCompView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhn extends dhf implements huk
{
    public final huj o;
    public final hul p;
    public final hul q;
    public final hul r;
    
    public dhn(final pii pii, final EvCompView evCompView, final int n, final klv klv, final klv klv2, final klv klv3, final klv klv4, final dgm dgm, final niz niz) {
        super(pii, evCompView, n, klv, klv2, klv3, klv4, dgm, niz);
        final hul p9 = new hul(new dhk(this), new huh[0]);
        this.p = p9;
        this.q = new hul(new dhl(this), new huh[0]);
        this.r = new hul(new dhm(this), new huh[0]);
        (this.o = new huj(p9, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.o.a() == null) {
            return;
        }
        ((dgz)this.o.a().a).a();
    }
    
    @Override
    public final void b(final dgl dgl) {
        if (this.o.a() == null) {
            return;
        }
        ((dgz)this.o.a().a).b(dgl);
    }
    
    @Override
    public final void c() {
        if (this.o.a() == null) {
            return;
        }
        ((dgz)this.o.a().a).c();
    }
    
    @Override
    public final void d(final float n, final dgl dgl) {
        if (this.o.a() == null) {
            return;
        }
        ((dgz)this.o.a().a).d(n, dgl);
    }
    
    @Override
    public final void e() {
        this.o.b();
        this.p.e();
        this.q.e();
        this.r.e();
    }
    
    @Override
    public final void f() {
        this.o.c();
    }
    
    @Override
    public final void g() {
        this.o.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}
