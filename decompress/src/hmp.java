import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import com.google.android.apps.camera.smarts.SmartsChipView;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmp extends View$AccessibilityDelegate
{
    final /* synthetic */ SmartsChipView a;
    
    public hmp(final SmartsChipView a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            final SmartsChipView a = this.a;
            if (!a.d) {
                a.d = true;
            }
        }
        else if (accessibilityEvent.getEventType() == 65536) {
            if (!this.a.a.isAccessibilityFocused() && !this.a.c.isAccessibilityFocused()) {
                final SmartsChipView a2 = this.a;
                a2.d = false;
                if (a2.e) {
                    a2.b();
                }
            }
        }
        else if (accessibilityEvent.getEventType() == 1) {
            view.performAccessibilityAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS.getId(), (Bundle)null);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
