import android.widget.TextView;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eua implements Runnable
{
    final /* synthetic */ PhotoSphereMessageOverlay a;
    private final /* synthetic */ int b;
    
    public eua(final PhotoSphereMessageOverlay a) {
        this.a = a;
    }
    
    public eua(final PhotoSphereMessageOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((TextView)this.a.findViewById(2131427943)).setVisibility(4);
                return;
            }
            case 0: {
                final PhotoSphereMessageOverlay a = this.a;
                if (a.b) {
                    a.b = false;
                    a.findViewById(2131427903).setVisibility(4);
                }
            }
        }
    }
}
