import android.view.accessibility.AccessibilityRecord;
import android.os.Bundle;
import android.widget.ScrollView;
import android.support.v4.widget.NestedScrollView;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jq extends ht
{
    @Override
    public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        final NestedScrollView nestedScrollView = (NestedScrollView)view;
        accessibilityEvent.setClassName((CharSequence)ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.h() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        ((AccessibilityRecord)accessibilityEvent).setMaxScrollX(nestedScrollView.getScrollX());
        ((AccessibilityRecord)accessibilityEvent).setMaxScrollY(nestedScrollView.h());
    }
    
    @Override
    public final void d(final View view, final jc jc) {
        super.d(view, jc);
        final NestedScrollView nestedScrollView = (NestedScrollView)view;
        jc.e(ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            final int h = nestedScrollView.h();
            if (h > 0) {
                jc.i(true);
                if (nestedScrollView.getScrollY() > 0) {
                    jc.c(iz.c);
                    jc.c(iz.g);
                }
                if (nestedScrollView.getScrollY() < h) {
                    jc.c(iz.b);
                    jc.c(iz.h);
                }
            }
        }
    }
    
    @Override
    public final boolean j(final View view, int n, final Bundle bundle) {
        if (super.j(view, n, bundle)) {
            return true;
        }
        final NestedScrollView nestedScrollView = (NestedScrollView)view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        switch (n) {
            default: {
                return false;
            }
            case 8192:
            case 16908344: {
                n = nestedScrollView.getHeight();
                n = Math.max(nestedScrollView.getScrollY() - (n - nestedScrollView.getPaddingBottom() - nestedScrollView.getPaddingTop()), 0);
                if (n != nestedScrollView.getScrollY()) {
                    nestedScrollView.t(n);
                    return true;
                }
                return false;
            }
            case 4096:
            case 16908346: {
                final int height = nestedScrollView.getHeight();
                n = nestedScrollView.getPaddingBottom();
                n = Math.min(nestedScrollView.getScrollY() + (height - n - nestedScrollView.getPaddingTop()), nestedScrollView.h());
                if (n != nestedScrollView.getScrollY()) {
                    nestedScrollView.t(n);
                    return true;
                }
                return false;
            }
        }
    }
}
