import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import android.content.Context;
import android.support.v7.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ts implements nj
{
    mv a;
    public my b;
    final /* synthetic */ Toolbar c;
    
    public ts(final Toolbar c) {
        this.c = c;
    }
    
    @Override
    public final void b(final Context context, final mv a) {
        final mv a2 = this.a;
        if (a2 != null) {
            final my b = this.b;
            if (b != null) {
                a2.t(b);
            }
        }
        this.a = a;
    }
    
    @Override
    public final void c(final mv mv, final boolean b) {
    }
    
    @Override
    public final void d(final ni ni) {
        throw null;
    }
    
    @Override
    public final boolean e() {
        return false;
    }
    
    @Override
    public final boolean f(final nr nr) {
        return false;
    }
    
    @Override
    public final boolean g(final my my) {
        final View h = this.c.h;
        if (h instanceof nb) {
            ((nb)h).a.onActionViewCollapsed();
        }
        final Toolbar c = this.c;
        c.removeView(c.h);
        final Toolbar c2 = this.c;
        c2.removeView((View)c2.g);
        final Toolbar c3 = this.c;
        c3.h = null;
        for (int i = c3.q.size() - 1; i >= 0; --i) {
            c3.addView((View)c3.q.get(i));
        }
        c3.q.clear();
        this.b = null;
        this.c.requestLayout();
        my.h(false);
        return true;
    }
    
    @Override
    public final boolean h(final my b) {
        final Toolbar c = this.c;
        if (c.g == null) {
            (c.g = new ov(c.getContext(), null, 2130969849)).setImageDrawable(c.e);
            c.g.setContentDescription(c.f);
            final tt u = Toolbar.u();
            u.a = ((c.m & 0x70) | 0x800003);
            u.b = 2;
            c.g.setLayoutParams((ViewGroup$LayoutParams)u);
            c.g.setOnClickListener((View$OnClickListener)new tr(c));
        }
        final ViewParent parent = this.c.g.getParent();
        final Toolbar c2 = this.c;
        if (parent != c2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView((View)c2.g);
            }
            final Toolbar c3 = this.c;
            c3.addView((View)c3.g);
        }
        this.c.h = b.getActionView();
        this.b = b;
        final ViewParent parent2 = this.c.h.getParent();
        final Toolbar c4 = this.c;
        if (parent2 != c4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup)parent2).removeView(c4.h);
            }
            final tt u2 = Toolbar.u();
            final Toolbar c5 = this.c;
            u2.a = (0x800003 | (c5.m & 0x70));
            u2.b = 2;
            c5.h.setLayoutParams((ViewGroup$LayoutParams)u2);
            final Toolbar c6 = this.c;
            c6.addView(c6.h);
        }
        final Toolbar c7 = this.c;
        for (int i = c7.getChildCount() - 1; i >= 0; --i) {
            final View child = c7.getChildAt(i);
            if (((tt)child.getLayoutParams()).b != 2 && child != c7.a) {
                c7.removeViewAt(i);
                c7.q.add(child);
            }
        }
        this.c.requestLayout();
        b.h(true);
        final View h = this.c.h;
        if (h instanceof nb) {
            ((nb)h).a.onActionViewExpanded();
        }
        return true;
    }
    
    @Override
    public final void i() {
        if (this.b != null) {
            final mv a = this.a;
            if (a != null) {
                for (int size = a.size(), i = 0; i < size; ++i) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            this.g(this.b);
        }
    }
}
