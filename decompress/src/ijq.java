import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

// 
// Decompiled by Procyon v0.6.0
// 

class ijq extends ijk
{
    final /* synthetic */ ijx a;
    
    public ijq(final ijx a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.n = true;
    }
    
    @Override
    public final void f() {
        this.a.u();
        this.a.b.j(jbm.e, true);
        this.a.B(jbm.e);
        this.a.s().c = false;
        this.a.b.l(false);
        ((iye)this.a.h).a().setVisibility(4);
        this.a.t();
        this.a.b.c();
        this.a.a.v(false);
        if (this.a.l.k(cxr.T)) {
            this.a.a.g();
        }
        final ijx a = this.a;
        final OptionsMenuContainer au = a.d.aU;
        if (au != null) {
            au.t = true;
        }
        a.p.c(jbk.b(jbm.e).d(this.a.q()), jbk.b(jbm.e).c(this.a.q()));
        this.a.p.a();
        this.a.A(1);
    }
    
    @Override
    public final void g() {
        this.a.s().c = true;
        final ijx a = this.a;
        a.A(a.m);
        final ijx a2 = this.a;
        final OptionsMenuContainer au = a2.d.aU;
        if (au != null) {
            au.t = false;
        }
        ((iye)a2.h).a().setVisibility(0);
        this.a.p.b();
        this.a.x();
    }
}
