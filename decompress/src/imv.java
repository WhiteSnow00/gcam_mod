import android.text.format.DateUtils;
import j$.time.Duration;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class imv extends View$AccessibilityDelegate
{
    final /* synthetic */ imy a;
    
    public imv(final imy a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.c.setContentDescription((CharSequence)view.getResources().getString(2131951664, new Object[] { DateUtils.formatElapsedTime(Duration.ofMillis(this.a.e).getSeconds()) }));
        if (this.a.a.k(cwv.H)) {
            this.a.d.setContentDescription((CharSequence)view.getResources().getString(2131951696, new Object[] { DateUtils.formatElapsedTime(Duration.ofMillis(this.a.f).getSeconds()) }));
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
