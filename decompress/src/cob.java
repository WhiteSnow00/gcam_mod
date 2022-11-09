import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.camcorder.ui.modeslider.ModeSlider;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class cob implements View$OnTouchListener
{
    final /* synthetic */ ModeSlider a;
    
    public cob(final ModeSlider a) {
        this.a = a;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final ModeSlider modeSlider = (ModeSlider)view;
        if (!modeSlider.h()) {
            return false;
        }
        int i;
        if (this.a.f != null && motionEvent.getAction() == 0) {
            if (view.getParent() != null) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.a.f.b(true);
            i = 0;
        }
        else {
            i = 0;
        }
        while (i < modeSlider.getChildCount()) {
            final View child = modeSlider.getChildAt(i);
            if (child.getVisibility() == 0) {
                final Rect rect = new Rect();
                child.getHitRect(rect);
                rect.top = Integer.MIN_VALUE;
                rect.bottom = Integer.MAX_VALUE;
                if (rect.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                    this.a.e(i, true);
                    break;
                }
            }
            ++i;
        }
        if (this.a.f != null && motionEvent.getAction() == 1) {
            this.a.f.a(view, true);
            if (view.getParent() != null) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return true;
    }
}
