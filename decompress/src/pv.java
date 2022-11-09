import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ToggleButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pv extends ToggleButton
{
    private final oo a;
    private final ps b;
    
    public pv(final Context context, final AttributeSet set) {
        super(context, set, 16842827);
        tj.d((View)this, this.getContext());
        (this.a = new oo((View)this)).d(set, 16842827);
        (this.b = new ps((TextView)this)).b(set, 16842827);
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
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final oo a = this.a;
        if (a != null) {
            a.i();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final oo a = this.a;
        if (a != null) {
            a.e(backgroundResource);
        }
    }
}
