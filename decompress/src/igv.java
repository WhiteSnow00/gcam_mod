import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityEvent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public class igv extends View$AccessibilityDelegate
{
    private final View$AccessibilityDelegate a;
    
    public igv(final View$AccessibilityDelegate a) {
        this.a = a;
    }
    
    public final void addExtraDataToAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo, final String s, final Bundle bundle) {
        this.a.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, s, bundle);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
        return this.a.getAccessibilityNodeProvider(view);
    }
    
    public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }
    
    public final void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        return this.a.performAccessibilityAction(view, n, bundle);
    }
    
    public final void sendAccessibilityEvent(final View view, final int n) {
        this.a.sendAccessibilityEvent(view, n);
    }
    
    public final void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
