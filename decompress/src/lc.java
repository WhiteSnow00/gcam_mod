import android.view.Window$Callback;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

final class lc implements ni
{
    final /* synthetic */ lf a;
    private boolean b;
    
    public lc(final lf a) {
        this.a = a;
    }
    
    @Override
    public final void a(final mv mv, final boolean b) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a.f();
        final Window$Callback c = this.a.c;
        if (c != null) {
            c.onPanelClosed(108, (Menu)mv);
        }
        this.b = false;
    }
    
    @Override
    public final boolean b(final mv mv) {
        final Window$Callback c = this.a.c;
        if (c != null) {
            c.onMenuOpened(108, (Menu)mv);
            return true;
        }
        return false;
    }
}
