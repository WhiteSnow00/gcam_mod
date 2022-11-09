import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idx extends View$AccessibilityDelegate
{
    final /* synthetic */ idy a;
    
    public idx(final idy a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        final String string = this.a.b.getString(2131951676);
        final String value = String.valueOf(this.a.d.getText());
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + String.valueOf(value).length());
        sb.append(string);
        sb.append(value);
        accessibilityNodeInfo.setContentDescription((CharSequence)sb.toString());
    }
}
