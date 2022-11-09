import android.view.MotionEvent;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iuh extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ ShutterButton a;
    
    public iuh(final ShutterButton a) {
        this.a = a;
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
        if (ShutterButton.access$200(this.a).contains(motionEvent.getX(), motionEvent.getY()) && this.a.isClickEnabledAndNotBlocked() && this.a.getMode() != iuk.H) {
            final ivq access$300 = ShutterButton.access$300(this.a);
            if (ShutterButton.access$400(this.a).compareAndSet(false, true)) {
                ShutterButton.access$502(this.a, motionEvent);
                if (access$300 != null) {
                    access$300.onShutterButtonLongPressed();
                }
            }
        }
    }
}
