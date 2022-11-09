import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.widget.SeekBar;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjo extends View$AccessibilityDelegate
{
    final /* synthetic */ jjq a;
    
    public jjo(final jjq a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)SeekBar.class.getName());
        accessibilityNodeInfo.setContentDescription(this.a.F.getText());
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }
    
    public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        switch (n) {
            default: {
                return super.performAccessibilityAction(view, n, bundle);
            }
            case 8192: {
                this.a.z();
                break;
            }
            case 4096: {
                this.a.A();
                break;
            }
        }
        return true;
    }
}
