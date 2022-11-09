import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class cpo extends View$AccessibilityDelegate
{
    final /* synthetic */ cpr a;
    
    public cpo(final cpr a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)null);
        if (!this.a.a.c()) {
            accessibilityNodeInfo.setContentDescription((CharSequence)this.a.f.getString(2131952651));
            return;
        }
        accessibilityNodeInfo.setContentDescription((CharSequence)this.a.f.getString(2131952650));
    }
}
