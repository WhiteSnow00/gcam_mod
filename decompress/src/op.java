import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;

// 
// Decompiled by Procyon v0.6.0
// 

public class op extends CheckBox
{
    private final or a;
    private final oo b;
    private final ps c;
    
    public op(final Context context, final AttributeSet set) {
        tl.a(context);
        super(context, set, 2130968763);
        tj.d((View)this, this.getContext());
        (this.a = new or((CompoundButton)this)).a(set, 2130968763);
        (this.b = new oo((View)this)).d(set, 2130968763);
        (this.c = new ps((TextView)this)).b(set, 2130968763);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final oo b = this.b;
        if (b != null) {
            b.c();
        }
        final ps c = this.c;
        if (c != null) {
            c.a();
        }
    }
    
    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final oo b = this.b;
        if (b != null) {
            b.i();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final oo b = this.b;
        if (b != null) {
            b.e(backgroundResource);
        }
    }
    
    public final void setButtonDrawable(final int n) {
        this.setButtonDrawable(lp.b(this.getContext(), n));
    }
    
    public final void setButtonDrawable(final Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        final or a = this.a;
        if (a != null) {
            a.b();
        }
    }
}
