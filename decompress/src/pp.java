import android.content.res.TypedArray;
import android.widget.ListAdapter;
import android.widget.Adapter;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.widget.ArrayAdapter;
import android.view.View;
import android.util.AttributeSet;
import android.widget.SpinnerAdapter;
import android.graphics.Rect;
import android.content.Context;
import android.widget.Spinner;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pp extends Spinner
{
    private static final int[] e;
    public final Context a;
    public po b;
    int c;
    final Rect d;
    private final oo f;
    private qs g;
    private SpinnerAdapter h;
    private final boolean i;
    
    static {
        e = new int[] { 16843505 };
    }
    
    public pp(final Context a, AttributeSet set) {
        super(a, set, 2130969664);
        this.d = new Rect();
        tj.d((View)this, this.getContext());
        final to q = to.q(a, set, lo.t, 2130969664);
        this.f = new oo((View)this);
        final int f = q.f(4, 0);
        if (f != 0) {
            this.a = (Context)new lv(a, f);
        }
        else {
            this.a = a;
        }
        to q2 = null;
        Label_0327: {
            Object obtainStyledAttributes;
            try {
                obtainStyledAttributes = a.obtainStyledAttributes(set, pp.e, 2130969664, 0);
                try {
                    int int1;
                    if (((TypedArray)obtainStyledAttributes).hasValue(0)) {
                        int1 = ((TypedArray)obtainStyledAttributes).getInt(0, 0);
                    }
                    else {
                        int1 = -1;
                    }
                    if (obtainStyledAttributes != null) {
                        ((TypedArray)obtainStyledAttributes).recycle();
                    }
                    switch (int1) {
                        default: {
                            break Label_0327;
                        }
                        case 1: {
                            obtainStyledAttributes = new pm(this, this.a, set);
                            q2 = to.q(this.a, set, lo.t, 2130969664);
                            this.c = q2.e(3, -2);
                            ((rj)obtainStyledAttributes).f(q2.h(1));
                            ((pm)obtainStyledAttributes).a = q.m(2);
                            q2.n();
                            this.b = (po)obtainStyledAttributes;
                            this.g = new pf(this, (View)this, (pm)obtainStyledAttributes);
                            break Label_0327;
                        }
                        case 0: {
                            obtainStyledAttributes = new ph(this);
                            (this.b = (po)obtainStyledAttributes).i(q.m(2));
                            break Label_0327;
                        }
                    }
                }
                catch (final Exception q2) {}
            }
            catch (Exception obtainStyledAttributes) {
                obtainStyledAttributes = null;
            }
            finally {
                set = (AttributeSet)q2;
            }
            if (obtainStyledAttributes != null) {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        final CharSequence[] textArray = q.b.getTextArray(0);
        if (textArray != null) {
            final ArrayAdapter adapter = new ArrayAdapter(a, 17367048, (Object[])textArray);
            adapter.setDropDownViewResource(2131624160);
            this.setAdapter((SpinnerAdapter)adapter);
        }
        q.n();
        this.i = true;
        final SpinnerAdapter h = this.h;
        if (h != null) {
            this.setAdapter(h);
            this.h = null;
        }
        this.f.d(set, 2130969664);
    }
    
    final int a(final SpinnerAdapter spinnerAdapter, final Drawable drawable) {
        int n = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        final int max = Math.max(0, this.getSelectedItemPosition());
        final int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int max2 = 0;
        while (i < min) {
            final int itemViewType = spinnerAdapter.getItemViewType(i);
            int n2;
            if (itemViewType != n) {
                n2 = itemViewType;
            }
            else {
                n2 = n;
            }
            if (itemViewType != n) {
                view = null;
            }
            view = spinnerAdapter.getView(i, view, (ViewGroup)this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
            }
            view.measure(measureSpec, measureSpec2);
            max2 = Math.max(max2, view.getMeasuredWidth());
            ++i;
            n = n2;
        }
        int n3 = max2;
        if (drawable != null) {
            drawable.getPadding(this.d);
            n3 = max2 + (this.d.left + this.d.right);
        }
        return n3;
    }
    
    final void b() {
        this.b.l(this.getTextDirection(), this.getTextAlignment());
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final oo f = this.f;
        if (f != null) {
            f.c();
        }
    }
    
    public final int getDropDownHorizontalOffset() {
        final po b = this.b;
        if (b != null) {
            return b.a();
        }
        return super.getDropDownHorizontalOffset();
    }
    
    public final int getDropDownVerticalOffset() {
        final po b = this.b;
        if (b != null) {
            return b.b();
        }
        return super.getDropDownVerticalOffset();
    }
    
    public final int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        return super.getDropDownWidth();
    }
    
    public final Drawable getPopupBackground() {
        final po b = this.b;
        if (b != null) {
            return b.c();
        }
        return super.getPopupBackground();
    }
    
    public final Context getPopupContext() {
        return this.a;
    }
    
    public final CharSequence getPrompt() {
        final po b = this.b;
        CharSequence charSequence;
        if (b != null) {
            charSequence = b.d();
        }
        else {
            charSequence = super.getPrompt();
        }
        return charSequence;
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final po b = this.b;
        if (b != null && b.u()) {
            this.b.k();
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.b != null && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        final pn pn = (pn)parcelable;
        super.onRestoreInstanceState(pn.getSuperState());
        if (pn.a) {
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new pg(this));
            }
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final pn pn = new pn(super.onSaveInstanceState());
        final po b = this.b;
        boolean a = false;
        if (b != null && b.u()) {
            a = true;
        }
        pn.a = a;
        return (Parcelable)pn;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final qs g = this.g;
        return (g != null && g.onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public final boolean performClick() {
        final po b = this.b;
        if (b != null) {
            if (!b.u()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }
    
    public final void setAdapter(final SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context;
            if ((context = this.a) == null) {
                context = this.getContext();
            }
            this.b.e((ListAdapter)new pi(spinnerAdapter, context.getTheme()));
        }
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final oo f = this.f;
        if (f != null) {
            f.i();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final oo f = this.f;
        if (f != null) {
            f.e(backgroundResource);
        }
    }
    
    public final void setDropDownHorizontalOffset(final int dropDownHorizontalOffset) {
        final po b = this.b;
        if (b != null) {
            b.h(dropDownHorizontalOffset);
            this.b.g(dropDownHorizontalOffset);
            return;
        }
        super.setDropDownHorizontalOffset(dropDownHorizontalOffset);
    }
    
    public final void setDropDownVerticalOffset(final int dropDownVerticalOffset) {
        final po b = this.b;
        if (b != null) {
            b.j(dropDownVerticalOffset);
            return;
        }
        super.setDropDownVerticalOffset(dropDownVerticalOffset);
    }
    
    public final void setDropDownWidth(final int n) {
        if (this.b != null) {
            this.c = n;
            return;
        }
        super.setDropDownWidth(n);
    }
    
    public final void setPopupBackgroundDrawable(final Drawable popupBackgroundDrawable) {
        final po b = this.b;
        if (b != null) {
            b.f(popupBackgroundDrawable);
            return;
        }
        super.setPopupBackgroundDrawable(popupBackgroundDrawable);
    }
    
    public final void setPopupBackgroundResource(final int n) {
        this.setPopupBackgroundDrawable(lp.b(this.a, n));
    }
    
    public final void setPrompt(final CharSequence prompt) {
        final po b = this.b;
        if (b != null) {
            b.i(prompt);
            return;
        }
        super.setPrompt(prompt);
    }
}
