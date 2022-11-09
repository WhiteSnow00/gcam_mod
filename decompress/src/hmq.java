import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;
import com.google.android.apps.camera.smarts.SmartsChipView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmq extends igv
{
    final /* synthetic */ SmartsChipView a;
    
    public hmq(final SmartsChipView a, final View$AccessibilityDelegate view$AccessibilityDelegate) {
        this.a = a;
        super(view$AccessibilityDelegate);
    }
    
    @Override
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 2048) {
            final CharSequence contentDescription = view.getContentDescription();
            final boolean equals = TextUtils.equals(this.a.h, contentDescription);
            this.a.h = contentDescription;
            if (equals) {
                return;
            }
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
