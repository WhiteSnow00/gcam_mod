import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vw extends GestureDetector$SimpleOnGestureListener
{
    public final boolean onDown(final MotionEvent motionEvent) {
        return true;
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        return false;
    }
}
