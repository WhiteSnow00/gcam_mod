import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import android.widget.SpinnerAdapter;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow$OnDismissListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.widget.ListAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class pm extends rj implements po
{
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final /* synthetic */ pp d;
    private int r;
    
    public pm(final pp pp, final Context context, final AttributeSet set) {
        this.d = pp;
        super(context, set, 2130969664);
        this.c = new Rect();
        super.l = (View)pp;
        this.y();
        super.m = (AdapterView$OnItemClickListener)new pj(this);
    }
    
    @Override
    public final CharSequence d() {
        return this.a;
    }
    
    @Override
    public final void e(final ListAdapter b) {
        super.e(b);
        this.b = b;
    }
    
    @Override
    public final void h(final int r) {
        this.r = r;
    }
    
    @Override
    public final void i(final CharSequence a) {
        this.a = a;
    }
    
    @Override
    public final void l(int selectedItemPosition, final int textAlignment) {
        final boolean u = this.u();
        this.n();
        this.x();
        super.s();
        final ql e = super.e;
        e.setChoiceMode(1);
        e.setTextDirection(selectedItemPosition);
        e.setTextAlignment(textAlignment);
        selectedItemPosition = this.d.getSelectedItemPosition();
        final ql e2 = super.e;
        if (this.u() && e2 != null) {
            e2.a = false;
            e2.setSelection(selectedItemPosition);
            if (e2.getChoiceMode() != 0) {
                e2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (u) {
            return;
        }
        final ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            final pk pk = new pk(this);
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)pk);
            this.v((PopupWindow$OnDismissListener)new pl(this, (ViewTreeObserver$OnGlobalLayoutListener)pk));
        }
    }
    
    final void n() {
        final Drawable c = this.c();
        int right = 0;
        if (c != null) {
            c.getPadding(this.d.d);
            if (ue.b((View)this.d)) {
                right = this.d.d.right;
            }
            else {
                right = -this.d.d.left;
            }
        }
        else {
            final Rect d = this.d.d;
            d.right = 0;
            d.left = 0;
        }
        final int paddingLeft = this.d.getPaddingLeft();
        final int paddingRight = this.d.getPaddingRight();
        final int width = this.d.getWidth();
        final pp d2 = this.d;
        final int c2 = d2.c;
        if (c2 == -2) {
            final int a = d2.a((SpinnerAdapter)this.b, this.c());
            final int n = this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left - this.d.d.right;
            int n2;
            if ((n2 = a) > n) {
                n2 = n;
            }
            this.r(Math.max(n2, width - paddingLeft - paddingRight));
        }
        else if (c2 == -1) {
            this.r(width - paddingLeft - paddingRight);
        }
        else {
            this.r(c2);
        }
        int g;
        if (ue.b((View)this.d)) {
            g = right + (width - paddingRight - super.f - this.r);
        }
        else {
            g = right + (paddingLeft + this.r);
        }
        super.g = g;
    }
}
