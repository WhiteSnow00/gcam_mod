import android.view.MotionEvent;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkm extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ OptionsMenuView a;
    private boolean b;
    
    public gkm(final OptionsMenuView a) {
        this.a = a;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        final OptionsMenuView a = this.a;
        this.b = (a.getChildAt(a.getChildCount() - 1).getBottom() - (a.getHeight() + a.getScrollY()) == 0);
        return false;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, float n, float n2) {
        if (motionEvent != null && motionEvent2 != null) {
            final jcb a = jcb.a;
            switch (this.a.l.ordinal()) {
                default: {
                    final float n3 = motionEvent.getY() - motionEvent2.getY();
                    n = Math.abs(n2);
                    n2 = n3;
                    break;
                }
                case 2: {
                    n2 = motionEvent2.getX() - motionEvent.getX();
                    n = Math.abs(n);
                    break;
                }
                case 1: {
                    n2 = motionEvent.getX() - motionEvent2.getX();
                    n = Math.abs(n);
                    break;
                }
            }
            if (n2 > 80.0f && n > 300.0f) {
                if (jcb.a.equals(this.a.l) && !this.b) {
                    final OptionsMenuView a2 = this.a;
                    if (a2.getHeight() < a2.findViewById(2131427824).getHeight() + a2.getPaddingTop() + a2.getPaddingBottom()) {
                        return false;
                    }
                }
                this.b = false;
                this.a.m.a.r();
                return true;
            }
            return false;
        }
        return false;
    }
}
