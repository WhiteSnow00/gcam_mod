import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class cpd implements View$OnTouchListener
{
    final /* synthetic */ RecordSpeedSlider a;
    
    public cpd(final RecordSpeedSlider a) {
        this.a = a;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider)view;
        final boolean h = recordSpeedSlider.h();
        int i = 0;
        if (!h) {
            return false;
        }
        if (this.a.d != null && motionEvent.getAction() == 0) {
            this.a.d.b(true);
        }
        while (i < recordSpeedSlider.getChildCount()) {
            final Rect rect = new Rect();
            if (recordSpeedSlider.getChildAt(i).getVisibility() == 0) {
                recordSpeedSlider.getChildAt(i).getHitRect(rect);
                rect.top = Integer.MIN_VALUE;
                rect.bottom = Integer.MAX_VALUE;
                if (rect.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                    this.a.i(i, true);
                    break;
                }
            }
            ++i;
        }
        if (this.a.d != null && motionEvent.getAction() == 1) {
            this.a.d.a(view, true);
        }
        return true;
    }
}
