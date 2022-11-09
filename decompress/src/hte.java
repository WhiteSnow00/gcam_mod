import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hte extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ htf a;
    
    public hte(final htf a) {
        this.a = a;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, float n, float n2) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        final jcb a = jcb.a;
        switch (this.a.e.ordinal()) {
            default: {
                n = motionEvent2.getY() - motionEvent.getY();
                n2 = Math.abs(n2);
                break;
            }
            case 2: {
                final float n3 = motionEvent.getX() - motionEvent2.getX();
                n2 = Math.abs(n);
                n = n3;
                break;
            }
            case 1: {
                final float n4 = motionEvent2.getX() - motionEvent.getX();
                n2 = Math.abs(n);
                n = n4;
                break;
            }
        }
        if (n < -80.0f && n2 > 200.0f) {
            final hqi g = this.a.g;
            if (g != null) {
                g.b();
            }
            return true;
        }
        if (n > 80.0f && n2 > 200.0f) {
            final hqi g2 = this.a.g;
            if (g2 != null) {
                g2.a();
            }
            return true;
        }
        return false;
    }
}
