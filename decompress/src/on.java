import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AutoCompleteTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public class on extends AutoCompleteTextView
{
    private static final int[] a;
    private final oo b;
    private final ps c;
    
    static {
        a = new int[] { 16843126 };
    }
    
    public on(final Context context) {
        this(context, null);
    }
    
    public on(final Context context, final AttributeSet set) {
        this(context, set, 2130968644);
    }
    
    public on(final Context context, final AttributeSet set, final int n) {
        tl.a(context);
        super(context, set, n);
        tj.d((View)this, this.getContext());
        final to q = to.q(this.getContext(), set, on.a, n);
        if (q.p(0)) {
            this.setDropDownBackgroundDrawable(q.h(0));
        }
        q.n();
        (this.b = new oo((View)this)).d(set, n);
        final ps c = new ps((TextView)this);
        (this.c = c).b(set, n);
        c.a();
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
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jp.f(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
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
    
    public final void setDropDownBackgroundResource(final int n) {
        this.setDropDownBackgroundDrawable(lp.b(this.getContext(), n));
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final ps c = this.c;
        if (c != null) {
            c.c(context, n);
        }
    }
}
