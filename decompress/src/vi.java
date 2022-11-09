import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class vi extends ViewOutlineProvider
{
    final /* synthetic */ vj a;
    
    public vi(final vj a) {
        this.a = a;
    }
    
    public final void getOutline(final View view, final Outline outline) {
        final int d = this.a.d;
        outline.setOval(0, 0, d, d);
    }
}
