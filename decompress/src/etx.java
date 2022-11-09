import android.widget.TextView;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etx implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ PhotoSphereMessageOverlay b;
    
    public etx(final PhotoSphereMessageOverlay b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final TextView textView = (TextView)this.b.findViewById(2131427943);
        textView.setText(this.a);
        textView.setVisibility(0);
        textView.announceForAccessibility((CharSequence)this.b.getResources().getString(this.a));
    }
}
