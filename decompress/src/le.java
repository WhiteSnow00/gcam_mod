import android.view.Menu;
import android.view.View;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class le extends me
{
    final /* synthetic */ lf a;
    
    public le(final lf a, final Window$Callback window$Callback) {
        this.a = a;
        super(window$Callback);
    }
    
    @Override
    public final View onCreatePanelView(final int n) {
        if (n == 0) {
            return new View(this.a.a.b());
        }
        return super.onCreatePanelView(n);
    }
    
    @Override
    public final boolean onPreparePanel(final int n, final View view, final Menu menu) {
        final boolean onPreparePanel = super.onPreparePanel(n, view, menu);
        if (onPreparePanel) {
            final lf a = this.a;
            if (!a.b) {
                a.a.l();
                return this.a.b = true;
            }
        }
        return onPreparePanel;
    }
}
