import android.graphics.Rect;
import android.graphics.Outline;
import android.view.View;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import android.view.ViewOutlineProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iul extends ViewOutlineProvider
{
    final /* synthetic */ ShutterButton a;
    
    public iul(final ShutterButton a) {
        this.a = a;
    }
    
    public final void getOutline(final View view, final Outline outline) {
        final Rect rect = new Rect();
        ShutterButton.access$200(this.a).round(rect);
        outline.setRoundRect(rect, (float)this.a.getCurrentSpec().u);
    }
}
