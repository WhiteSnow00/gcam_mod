import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class hsh extends View$AccessibilityDelegate
{
    final /* synthetic */ hsi a;
    
    public hsh(final hsi a) {
        this.a = a;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 128 || accessibilityEvent.getEventType() == 32768) {
            final hqi d = this.a.d;
            if (d != null) {
                ((hrc)d.a.c.get()).p(d.a.a.getInteger(2131492866));
            }
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
