// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public class AppCompatButton extends Button
{
    public final oo a;
    private final ps b;
    
    public AppCompatButton(final Context context) {
        this(context, null);
    }
    
    public AppCompatButton(final Context context, final AttributeSet set) {
        this(context, set, 2130968734);
    }
    
    public AppCompatButton(final Context context, final AttributeSet set, final int n) {
        tl.a(context);
        super(context, set, n);
        tj.d((View)this, this.getContext());
        (this.a = new oo((View)this)).d(set, n);
        final ps b = new ps((TextView)this);
        (this.b = b).b(set, n);
        b.a();
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final oo a = this.a;
        if (a != null) {
            a.c();
        }
        final ps b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final int getAutoSizeTextType() {
        if (super.getAutoSizeTextType() == 1) {
            return 1;
        }
        return 0;
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)Button.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final oo a = this.a;
        if (a != null) {
            a.i();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final oo a = this.a;
        if (a != null) {
            a.e(backgroundResource);
        }
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final ps b = this.b;
        if (b != null) {
            b.c(context, n);
        }
    }
}
