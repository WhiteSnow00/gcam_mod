import android.widget.TextView;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eub implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ PhotoSphereMessageOverlay c;
    
    public eub(final PhotoSphereMessageOverlay c, final boolean a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final TextView textView = (TextView)this.c.findViewById(2131427713);
        if (!this.a) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        switch (this.b) {
            default: {
                return;
            }
            case 3: {
                textView.setText(2131952411);
                return;
            }
            case 2: {
                textView.setText(2131952413);
                return;
            }
            case 1: {
                textView.setText(2131952414);
                return;
            }
            case 0: {
                textView.setText(2131952412);
            }
        }
    }
}
