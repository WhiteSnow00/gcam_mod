import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public class pt extends TextView
{
    private final oo a;
    private final ps b;
    private boolean c;
    
    public pt(final Context context) {
        this(context, null);
    }
    
    public pt(final Context context, final AttributeSet set) {
        this(context, set, 16842884);
    }
    
    public pt(final Context context, final AttributeSet set, final int n) {
        tl.a(context);
        super(context, set, n);
        this.c = false;
        tj.d((View)this, this.getContext());
        (this.a = new oo((View)this)).d(set, n);
        final ps b = new ps(this);
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
    
    public final int getFirstBaselineToTopHeight() {
        return this.getPaddingTop() - this.getPaint().getFontMetricsInt().top;
    }
    
    public final int getLastBaselineToBottomHeight() {
        return this.getPaddingBottom() + this.getPaint().getFontMetricsInt().bottom;
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jp.f(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
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
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final ps b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final ps b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = this.getContext();
        Drawable b = null;
        Drawable b2;
        if (n != 0) {
            b2 = lp.b(context, n);
        }
        else {
            b2 = null;
        }
        Drawable b3;
        if (n2 != 0) {
            b3 = lp.b(context, n2);
        }
        else {
            b3 = null;
        }
        Drawable b4;
        if (n3 != 0) {
            b4 = lp.b(context, n3);
        }
        else {
            b4 = null;
        }
        if (n4 != 0) {
            b = lp.b(context, n4);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, b);
        final ps b5 = this.b;
        if (b5 != null) {
            b5.a();
        }
    }
    
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final ps b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void setCompoundDrawablesWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = this.getContext();
        Drawable b = null;
        Drawable b2;
        if (n != 0) {
            b2 = lp.b(context, n);
        }
        else {
            b2 = null;
        }
        Drawable b3;
        if (n2 != 0) {
            b3 = lp.b(context, n2);
        }
        else {
            b3 = null;
        }
        Drawable b4;
        if (n3 != 0) {
            b4 = lp.b(context, n3);
        }
        else {
            b4 = null;
        }
        if (n4 != 0) {
            b = lp.b(context, n4);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, b);
        final ps b5 = this.b;
        if (b5 != null) {
            b5.a();
        }
    }
    
    public final void setCompoundDrawablesWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final ps b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void setLineHeight(final int n) {
        jp.d(this, n);
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final ps b = this.b;
        if (b != null) {
            b.c(context, n);
        }
    }
    
    public final void setTypeface(Typeface typeface, final int n) {
        if (this.c) {
            return;
        }
        Typeface a = null;
        if (typeface != null) {
            if (n > 0) {
                a = ha.a(this.getContext(), typeface, n);
            }
        }
        this.c = true;
        if (a != null) {
            typeface = a;
        }
        try {
            super.setTypeface(typeface, n);
        }
        finally {
            this.c = false;
        }
    }
}
