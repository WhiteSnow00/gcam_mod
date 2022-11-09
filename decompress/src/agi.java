import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agi extends ht
{
    @Override
    public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(false);
        accessibilityEvent.getEventType();
    }
    
    @Override
    public final void d(final View view, final jc jc) {
        super.d(view, jc);
        jc.e("androidx.viewpager.widget.ViewPager");
        jc.i(false);
    }
    
    @Override
    public final boolean j(final View view, final int n, final Bundle bundle) {
        return super.j(view, n, bundle);
    }
}
