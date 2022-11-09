import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hrg extends GestureDetector$SimpleOnGestureListener
{
    private final hrh a;
    private final hqi b;
    
    public hrg(final hrh a, final hqi b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        final jcb h = this.a.h;
        final float n3 = motionEvent2.getY() - motionEvent.getY();
        final float abs = Math.abs(n2);
        if (n3 < -80.0f && abs > 200.0f) {
            this.b.b();
            return true;
        }
        if (n3 > 80.0f && abs > 200.0f) {
            this.b.a();
            return true;
        }
        return super.onFling(motionEvent, motionEvent2, n, n2);
    }
}
