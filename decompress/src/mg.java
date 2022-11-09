import android.view.View;
import android.support.v7.view.menu.ActionMenuItemView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mg extends qs
{
    final /* synthetic */ ActionMenuItemView a;
    
    public mg(final ActionMenuItemView a) {
        this.a = a;
        super((View)a);
    }
    
    @Override
    public final nn a() {
        final mh c = this.a.c;
        if (c != null) {
            final oa j = c.a.j;
            if (j != null) {
                return j.a();
            }
        }
        return null;
    }
    
    @Override
    protected final boolean b() {
        final ActionMenuItemView a = this.a;
        final mu b = a.b;
        if (b != null && b.b(a.a)) {
            final nn a2 = this.a();
            if (a2 != null && a2.u()) {
                return true;
            }
        }
        return false;
    }
}
