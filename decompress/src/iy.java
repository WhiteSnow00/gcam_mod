import android.os.Bundle;
import android.view.View;
import android.text.style.ClickableSpan;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iy extends ClickableSpan
{
    private final int a;
    private final jc b;
    private final int c;
    
    public iy(final int a, final jc b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onClick(final View view) {
        final Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
