import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hnl implements View$OnLayoutChangeListener
{
    final /* synthetic */ hnr a;
    
    public hnl(final hnr a) {
        this.a = a;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (n == n5 && n2 == n6 && n3 == n7 && n4 == n8) {
            return;
        }
        this.a.j();
    }
}
