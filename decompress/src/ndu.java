import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.app.Dialog;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndu implements View$OnTouchListener
{
    private final Dialog a;
    private final int b;
    private final int c;
    
    public ndu(final Dialog a, final Rect rect) {
        this.a = a;
        this.b = rect.left;
        this.c = rect.top;
        ViewConfiguration.get(a.getContext()).getScaledWindowTouchSlop();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final View viewById = view.findViewById(16908290);
        final int n = this.b + viewById.getLeft();
        final int width = viewById.getWidth();
        final int n2 = this.c + viewById.getTop();
        if (new RectF((float)n, (float)n2, (float)(n + width), (float)(n2 + viewById.getHeight())).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.a.onTouchEvent(obtain);
    }
}
