import android.widget.PopupWindow;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ri implements View$OnTouchListener
{
    final /* synthetic */ rj a;
    
    public ri(final rj a) {
        this.a = a;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final int n = (int)motionEvent.getX();
        final int n2 = (int)motionEvent.getY();
        if (action == 0) {
            final PopupWindow p2 = this.a.p;
            if (p2 != null && p2.isShowing() && n >= 0 && n < this.a.p.getWidth() && n2 >= 0 && n2 < this.a.p.getHeight()) {
                final rj a = this.a;
                a.n.postDelayed((Runnable)a.q, 250L);
            }
        }
        else if (action == 1) {
            final rj a2 = this.a;
            a2.n.removeCallbacks((Runnable)a2.q);
        }
        return false;
    }
}
