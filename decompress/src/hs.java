import android.os.Bundle;
import android.view.ViewGroup;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class hs extends View$AccessibilityDelegate
{
    final ht a;
    
    public hs(final ht a) {
        this.a = a;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.h(view, accessibilityEvent);
    }
    
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
        final jd a = this.a.a(view);
        if (a != null) {
            return (AccessibilityNodeProvider)a.a;
        }
        return null;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        final jc a = jc.a(accessibilityNodeInfo);
        a.a.setScreenReaderFocusable(ik.X(view));
        a.a.setHeading((boolean)view.isAccessibilityHeading());
        a.a.setPaneTitle(ik.u(view));
        a.a.setStateDescription(view.getStateDescription());
        this.a.d(view, a);
        accessibilityNodeInfo.getText();
        final List b = ht.b(view);
        for (int i = 0; i < b.size(); ++i) {
            a.c((iz)b.get(i));
        }
    }
    
    public final void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }
    
    public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.i(viewGroup, view, accessibilityEvent);
    }
    
    public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        return this.a.j(view, n, bundle);
    }
    
    public final void sendAccessibilityEvent(final View view, final int n) {
        this.a.f(view, n);
    }
    
    public final void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.g(view, accessibilityEvent);
    }
}
