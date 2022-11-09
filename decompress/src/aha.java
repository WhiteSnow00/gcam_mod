import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aha extends RecyclerView
{
    final /* synthetic */ ViewPager2 Q;
    
    public aha(final ViewPager2 q, final Context context) {
        this.Q = q;
        super(context);
    }
    
    @Override
    public final CharSequence getAccessibilityClassName() {
        if (this.Q.k.p()) {
            return this.Q.k.b();
        }
        return "android.support.v7.widget.RecyclerView";
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setFromIndex(this.Q.c);
        accessibilityEvent.setToIndex(this.Q.c);
        this.Q.k.j(accessibilityEvent);
    }
    
    @Override
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.Q.i && super.onInterceptTouchEvent(motionEvent);
    }
    
    @Override
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.Q.i && super.onTouchEvent(motionEvent);
    }
}
