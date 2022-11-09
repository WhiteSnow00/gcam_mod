import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class neg extends ht
{
    final /* synthetic */ CheckableImageButton b;
    
    public neg(final CheckableImageButton b) {
        this.b = b;
    }
    
    @Override
    public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.a);
    }
    
    @Override
    public final void d(final View view, final jc jc) {
        super.d(view, jc);
        jc.d(this.b.b);
        jc.a.setChecked(this.b.a);
    }
}
