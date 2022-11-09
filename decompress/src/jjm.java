import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjm extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ jjq a;
    
    public jjm(final jjq a) {
        this.a = a;
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        if (motionEvent2.getX() > this.a.G.getWidth() || motionEvent2.getX() < 0.0f) {
            final jjq a = this.a;
            if (!a.M) {
                a.M();
                this.a.J = new PointF(motionEvent2.getRawX(), motionEvent2.getRawY());
            }
        }
        return false;
    }
}
