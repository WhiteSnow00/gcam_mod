import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ief extends View$AccessibilityDelegate
{
    final /* synthetic */ ieg a;
    
    public ief(final ieg a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        final ieg a = this.a;
        accessibilityNodeInfo.setContentDescription((CharSequence)a.d(a.getProgress()));
    }
}
