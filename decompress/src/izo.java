import com.google.android.apps.camera.ui.views.MainActivityLayout;
import android.view.ViewStub;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.view.View;
import com.google.android.apps.camera.uiutils.ReplaceableView;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class izo implements jap
{
    public final pii a;
    private final niz b;
    private final niz c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    private final pii i;
    private final pii j;
    private final klj k;
    private final ewy l;
    private final kse m;
    private final hkc n;
    private final bmz o;
    
    public izo(final niz b, final niz c, final pii d, final pii e, final pii a, final pii f, final pii g, final pii h, final pii i, final pii j, final bmz o, final klj k, final ewy l, final kse m, final hkc n) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.i = i;
        this.j = j;
        this.g = g;
        this.e = e;
        this.a = a;
        this.h = h;
        this.k = k;
        this.l = l;
        this.o = o;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final void a() {
        final jea c = ((ixw)this.e.get()).c;
        ((het)this.f.get()).d((hej)this.j.get(), this.o.i(), (ReplaceableView)c.c(2131427620), (heu)this.i.get(), (jcd)this.h.get(), this.n.a(hjq.m), this.n.a(hjq.j), this.n.a(hjq.n), this.k);
        this.m.h("WireMicro");
        if (this.b.g()) {
            this.l.c((exn)this.b.c());
        }
        final View view = (View)c.c(2131427471);
        view.post((Runnable)new izn(this, view, c));
        this.m.h("WireBottomBar");
        ((BottomBarController)this.g.get()).wireListeners();
        this.m.g();
        if (this.c.g()) {
            ((hrj)this.c.c()).f((ViewStub)c.c(2131427985));
            final MainActivityLayout c2 = ((iyc)this.d).a().c;
            c2.k = this.c;
            c2.o();
        }
    }
}
