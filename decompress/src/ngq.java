import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngq extends on
{
    public final rj a;
    private final AccessibilityManager b;
    private final Rect c;
    
    public ngq(final Context context, final AttributeSet set) {
        super(ngv.a(context, set, 2130968644, 0), set, 2130968644);
        this.c = new Rect();
        final Context context2 = this.getContext();
        final TypedArray a = nem.a(context2, set, ngr.a, 2130968644, 2132018137, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            this.setKeyListener((KeyListener)null);
        }
        this.b = (AccessibilityManager)context2.getSystemService("accessibility");
        final rj a2 = new rj(context2, null, 2130969361);
        (this.a = a2).y();
        a2.l = (View)this;
        a2.x();
        a2.e(this.getAdapter());
        a2.m = (AdapterView$OnItemClickListener)new ngp(this);
        a.recycle();
    }
    
    private final ngs b() {
        for (ViewParent viewParent = this.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent instanceof ngs) {
                return (ngs)viewParent;
            }
        }
        return null;
    }
    
    public final void a(final Object o) {
        this.setText(this.convertSelectionToString(o), false);
    }
    
    public final CharSequence getHint() {
        if (this.b() == null) {
            return super.getHint();
        }
        throw null;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b() == null) {
            return;
        }
        throw null;
    }
    
    protected final void onMeasure(int n, int n2) {
        super.onMeasure(n, n2);
        if (View$MeasureSpec.getMode(n) != Integer.MIN_VALUE) {
            return;
        }
        final int measuredWidth = this.getMeasuredWidth();
        final ListAdapter adapter = this.getAdapter();
        final ngs b = this.b();
        n2 = 0;
        if (adapter != null && b != null) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
            n = Math.max(0, this.a.o());
            final int min = Math.min(adapter.getCount(), n + 15);
            int i = Math.max(0, min - 15);
            View view = null;
            int max = 0;
            n = n2;
            while (i < min) {
                final int itemViewType = adapter.getItemViewType(i);
                if (itemViewType != n) {
                    n2 = itemViewType;
                }
                else {
                    n2 = n;
                }
                if (itemViewType != n) {
                    view = null;
                }
                view = adapter.getView(i, view, (ViewGroup)b);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                }
                view.measure(measureSpec, measureSpec2);
                max = Math.max(max, view.getMeasuredWidth());
                ++i;
                n = n2;
            }
            final Drawable c = this.a.c();
            if (c != null) {
                c.getPadding(this.c);
                n = this.c.left;
                n = this.c.right;
            }
            throw null;
        }
        this.setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
    }
    
    public final void setAdapter(final ListAdapter adapter) {
        super.setAdapter(adapter);
        this.a.e(this.getAdapter());
    }
    
    public final void showDropDown() {
        final AccessibilityManager b = this.b;
        if (b != null && b.isTouchExplorationEnabled()) {
            this.a.s();
            return;
        }
        super.showDropDown();
    }
}
