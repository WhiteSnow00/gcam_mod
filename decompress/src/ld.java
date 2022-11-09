import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

final class ld implements mt
{
    final /* synthetic */ lf a;
    
    public ld(final lf a) {
        this.a = a;
    }
    
    @Override
    public final void E(final mv mv) {
        final lf a = this.a;
        if (a.c != null) {
            if (a.a.u()) {
                this.a.c.onPanelClosed(108, (Menu)mv);
                return;
            }
            if (this.a.c.onPreparePanel(0, (View)null, (Menu)mv)) {
                this.a.c.onMenuOpened(108, (Menu)mv);
            }
        }
    }
    
    @Override
    public final boolean G(final mv mv, final MenuItem menuItem) {
        return false;
    }
}
