import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjh implements gjq
{
    final /* synthetic */ OptionsMenuContainer a;
    final /* synthetic */ gjj b;
    
    public gjh(final gjj b, final OptionsMenuContainer a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (!(boolean)((kkz)this.b.f.a()).d || this.b.f.p()) {
            this.b.f.o(true, false);
        }
        Label_0112: {
            if (!this.b.g.E()) {
                final gjj b = this.b;
                if (b.g.D((jbm)b.b.aQ())) {
                    break Label_0112;
                }
            }
            this.b.g.h();
        }
        this.b.h.b();
        this.b.aZ.aR(false);
    }
    
    @Override
    public final void b() {
        this.a.u(this.b.aY);
    }
    
    @Override
    public final void c() {
        this.b.f.i(true);
        this.b.h.d();
        if (!this.b.e.k(cxr.T)) {
            this.b.g.g();
        }
        if (!this.b.i.m("perf_has_shown_options_bar")) {
            this.b.i.l("perf_has_shown_options_bar", true);
        }
        this.b.aZ.aR(true);
        this.a.u(this.b.aY);
    }
}
