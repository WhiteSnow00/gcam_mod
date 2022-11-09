import android.view.Menu;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class la implements Runnable
{
    final /* synthetic */ lf a;
    
    public la(final lf a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final lf a = this.a;
        final Menu v = a.v();
        Object o;
        if (!(v instanceof mv)) {
            o = null;
        }
        else {
            o = v;
        }
        if (o != null) {
            ((mv)o).s();
        }
        try {
            v.clear();
            if (!a.c.onCreatePanelMenu(0, v) || !a.c.onPreparePanel(0, (View)null, v)) {
                v.clear();
            }
            if (o != null) {
                ((mv)o).r();
            }
        }
        finally {
            if (o != null) {
                ((mv)o).r();
            }
        }
    }
}
