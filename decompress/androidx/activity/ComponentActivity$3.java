// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import android.view.View;
import android.view.Window;

public class ComponentActivity$3 implements j
{
    final /* synthetic */ we a;
    
    public ComponentActivity$3(final we a) {
        this.a = a;
    }
    
    @Override
    public final void a(final k k, final g g) {
        if (g == g.e) {
            final Window window = this.a.getWindow();
            View peekDecorView;
            if (window != null) {
                peekDecorView = window.peekDecorView();
            }
            else {
                peekDecorView = null;
            }
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
