import android.view.MotionEvent;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkh extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ OptionsMenuContainer a;
    
    public gkh(final OptionsMenuContainer a) {
        this.a = a;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        return this.a.t;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        if (this.a.t && motionEvent2.getY() - motionEvent.getY() > 80.0f && n2 > 300.0f) {
            this.a.v();
            return true;
        }
        return false;
    }
}
