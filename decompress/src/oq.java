import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckedTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oq extends CheckedTextView
{
    private static final int[] a;
    private final ps b;
    
    static {
        a = new int[] { 16843016 };
    }
    
    public oq(final Context context, final AttributeSet set) {
        tl.a(context);
        super(context, set, 16843720);
        tj.d((View)this, this.getContext());
        final ps b = new ps((TextView)this);
        (this.b = b).b(set, 16843720);
        b.a();
        final to q = to.q(this.getContext(), set, oq.a, 16843720);
        this.setCheckMarkDrawable(q.h(0));
        q.n();
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final ps b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jp.f(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
    }
    
    public final void setCheckMarkDrawable(final int n) {
        this.setCheckMarkDrawable(lp.b(this.getContext(), n));
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final ps b = this.b;
        if (b != null) {
            b.c(context, n);
        }
    }
}
