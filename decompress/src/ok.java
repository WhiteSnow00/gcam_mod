import android.view.MenuItem;
import android.support.v7.widget.ActionMenuView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ok implements mt
{
    final /* synthetic */ ActionMenuView a;
    
    public ok(final ActionMenuView a) {
        this.a = a;
    }
    
    @Override
    public final void E(final mv mv) {
        final mt d = this.a.d;
        if (d != null) {
            d.E(mv);
        }
    }
    
    @Override
    public final boolean G(final mv mv, final MenuItem menuItem) {
        final tp e = this.a.e;
        if (e != null) {
            final lb v = e.a.v;
            if (v != null && v.a.c.onMenuItemSelected(0, menuItem)) {
                return true;
            }
        }
        return false;
    }
}
