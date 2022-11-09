// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import android.view.View;

public class Fragment$5 implements j
{
    final /* synthetic */ ei a;
    
    public Fragment$5(final ei a) {
        this.a = a;
    }
    
    @Override
    public final void a(final k k, final g g) {
        if (g == g.e) {
            final View o = this.a.O;
            if (o != null) {
                o.cancelPendingInputEvents();
            }
        }
    }
}
