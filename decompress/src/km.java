import android.widget.PopupWindow;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class km extends ip
{
    final /* synthetic */ kn a;
    
    public km(final kn a) {
        this.a = a;
    }
    
    @Override
    public final void b() {
        this.a.a.m.setVisibility(8);
        final kw a = this.a.a;
        final PopupWindow n = a.n;
        if (n != null) {
            n.dismiss();
        }
        else if (a.m.getParent() instanceof View) {
            ik.D((View)this.a.a.m.getParent());
        }
        this.a.a.m.i();
        this.a.a.p.d(null);
        final kw a2 = this.a.a;
        a2.p = null;
        ik.D((View)a2.s);
    }
}
