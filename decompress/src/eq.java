import android.view.ViewGroup;
import android.animation.LayoutTransition;
import android.graphics.Canvas;
import android.view.WindowInsets;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnApplyWindowInsetsListener;
import java.util.ArrayList;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eq extends FrameLayout
{
    public boolean a;
    private ArrayList b;
    private ArrayList c;
    private View$OnApplyWindowInsetsListener d;
    
    public eq(final Context context, final AttributeSet set, final fi fi) {
        super(context, set);
        this.a = true;
        final String classAttribute = set.getClassAttribute();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, dj.b);
        String string;
        if (classAttribute == null) {
            string = obtainStyledAttributes.getString(0);
        }
        else {
            string = classAttribute;
        }
        final String string2 = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        final int id = this.getId();
        final ei c = fi.c(id);
        if (string != null && c == null) {
            if (id <= 0) {
                String string3;
                if (string2 != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string2);
                    string3 = sb.toString();
                }
                else {
                    string3 = "";
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(string);
                sb2.append(string3);
                throw new IllegalStateException(sb2.toString());
            }
            final es f = fi.f();
            context.getClassLoader();
            final ei c2 = f.c(string);
            c2.X();
            final fr i = fi.i();
            i.r = true;
            c2.N = (ViewGroup)this;
            i.h(((ViewGroup)this).getId(), c2, string2);
            i.n();
            ((dk)i).a.D((fg)i, true);
        }
        for (final fo fo : fi.a.e()) {
            final ei c3 = fo.c;
            if (c3.F == this.getId()) {
                final View o = c3.O;
                if (o == null || o.getParent() != null) {
                    continue;
                }
                c3.N = (ViewGroup)this;
                fo.a();
            }
        }
    }
    
    private final void a(final View view) {
        final ArrayList c = this.c;
        if (c != null && c.contains(view)) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(view);
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (fi.e(view) != null) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }
    
    protected final boolean addViewInLayout(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (fi.e(view) != null) {
            return super.addViewInLayout(view, n, viewGroup$LayoutParams, b);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final WindowInsets dispatchApplyWindowInsets(final WindowInsets windowInsets) {
        final ix l = ix.l(windowInsets);
        final View$OnApplyWindowInsetsListener d = this.d;
        ix ix;
        if (d != null) {
            ix = ix.l(d.onApplyWindowInsets((View)this, windowInsets));
        }
        else {
            ix = ik.s((View)this, l);
        }
        if (!ix.r()) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                ik.q(this.getChildAt(i), ix);
            }
        }
        return windowInsets;
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        if (this.a && this.b != null) {
            for (int i = 0; i < this.b.size(); ++i) {
                super.drawChild(canvas, (View)this.b.get(i), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        if (this.a) {
            final ArrayList b = this.b;
            if (b != null && b.size() > 0 && this.b.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, n);
    }
    
    public final void endViewTransition(final View view) {
        final ArrayList c = this.c;
        if (c != null) {
            c.remove(view);
            final ArrayList b = this.b;
            if (b != null && b.remove(view)) {
                this.a = true;
            }
        }
        super.endViewTransition(view);
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        return windowInsets;
    }
    
    public final void removeAllViewsInLayout() {
        for (int i = this.getChildCount() - 1; i >= 0; --i) {
            this.a(this.getChildAt(i));
        }
        super.removeAllViewsInLayout();
    }
    
    protected final void removeDetachedView(final View view, final boolean b) {
        if (b) {
            this.a(view);
        }
        super.removeDetachedView(view, b);
    }
    
    public final void removeView(final View view) {
        this.a(view);
        super.removeView(view);
    }
    
    public final void removeViewAt(final int n) {
        this.a(this.getChildAt(n));
        super.removeViewAt(n);
    }
    
    public final void removeViewInLayout(final View view) {
        this.a(view);
        super.removeViewInLayout(view);
    }
    
    public final void removeViews(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            this.a(this.getChildAt(i));
        }
        super.removeViews(n, n2);
    }
    
    public final void removeViewsInLayout(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            this.a(this.getChildAt(i));
        }
        super.removeViewsInLayout(n, n2);
    }
    
    public final void setLayoutTransition(final LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }
    
    public final void setOnApplyWindowInsetsListener(final View$OnApplyWindowInsetsListener d) {
        this.d = d;
    }
    
    public final void startViewTransition(final View view) {
        if (view.getParent() == this) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(view);
        }
        super.startViewTransition(view);
    }
}
