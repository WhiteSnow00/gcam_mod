import android.widget.ImageView;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etz implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ PhotoSphereMessageOverlay b;
    
    public etz(final PhotoSphereMessageOverlay b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final ImageView imageView = (ImageView)this.b.findViewById(2131427903);
        final PhotoSphereMessageOverlay b = this.b;
        final boolean c = b.c;
        final boolean a = this.a;
        if (c != a) {
            int imageResource;
            if (!(b.c = a)) {
                imageResource = 2131231293;
            }
            else {
                imageResource = 2131231294;
            }
            imageView.setImageResource(imageResource);
        }
        final PhotoSphereMessageOverlay b2 = this.b;
        if (!b2.b) {
            b2.b = true;
            imageView.setVisibility(0);
            int n;
            if (!this.a) {
                n = 2131952588;
            }
            else {
                n = 2131952589;
            }
            imageView.announceForAccessibility((CharSequence)this.b.getResources().getString(n));
        }
    }
}
