import com.google.android.apps.camera.ui.views.MainActivityLayout;
import android.view.ViewGroup;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuViewContainer;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izx implements jap
{
    private final niz a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public izx(final niz a, final pii b) {
        this.b = b;
        this.a = a;
    }
    
    public izx(final niz a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        switch (this.c) {
            default: {
                if (!this.a.g()) {
                    return;
                }
                final ixx a = ((iyc)this.b).a();
                final jea k = a.k;
                final cqk a2 = ((cpu)this.a.c()).a();
                final ViewStub viewStub = (ViewStub)k.c(2131428144);
                final cqi cqi = (cqi)a2;
                if (cqi.d == null) {
                    cqi.d = (PopupMenuViewContainer)viewStub.inflate();
                    cqi.c = (PopupMenuView)cqi.d.findViewById(2131428145);
                }
                cqi.c.c(2131952652, cqi.g, 80, cqi.b.k(cxr.at));
                cqi.g.e(cql.a);
                cqi.f.c(cqi.a(new cqh(cqi)));
                if (cqi.b.k(cwv.K)) {
                    cqi.c.b.setVisibility(0);
                }
                a.c.r(new jao(a2));
                ((cpu)this.a.c()).e((ViewStub)k.c(2131428146));
                final MainActivityLayout c = a.c;
                c.n = this.a;
                c.p(c.d().f);
                return;
            }
            case 3: {
                if (this.a.g()) {
                    final jea i = ((iyc)this.b).a().k;
                    ((hda)this.a.c()).x((ViewGroup)i.c(2131427736), (ViewGroup)i.c(2131427731));
                    final MainActivityLayout mainActivityLayout = (MainActivityLayout)i.c(2131427411);
                    mainActivityLayout.i = this.a;
                    mainActivityLayout.n();
                }
                return;
            }
            case 2: {
                if (this.a.g()) {
                    final ixx a3 = ((iyc)this.b).a();
                    ((cor)this.a.c()).c((ViewStub)a3.k.c(2131427773));
                    final MainActivityLayout c2 = a3.c;
                    c2.m = this.a;
                    c2.l(c2.d().f);
                }
                return;
            }
            case 1: {
                if (!this.a.g()) {
                    return;
                }
                final ixx a4 = ((iyc)this.b).a();
                final jea j = a4.k;
                final ViewStub viewStub2 = (ViewStub)j.c(2131427685);
                final ViewStub viewStub3 = (ViewStub)j.c(2131427687);
                ((ejj)this.a.c()).d();
                final MainActivityLayout c3 = a4.c;
                c3.p = this.a;
                c3.m(c3.d().f);
                return;
            }
            case 0: {
                if (!this.a.g()) {
                    return;
                }
                final ixx a5 = ((iyc)this.b).a();
                ((ViewStub)a5.k.c(2131427496)).inflate();
                ((jib)this.a.c()).a();
                final MainActivityLayout c4 = a5.c;
                c4.o = this.a;
                c4.j(c4.d().f);
            }
        }
    }
}
