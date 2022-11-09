import android.view.ViewParent;
import android.view.MenuItem;
import java.util.ArrayList;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.util.SparseBooleanArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class og extends mi
{
    od g;
    public int h;
    oe i;
    public oa j;
    ob k;
    final of l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final SparseBooleanArray r;
    private mh s;
    
    public og(final Context context) {
        super(context);
        this.r = new SparseBooleanArray();
        this.l = new of(this);
    }
    
    @Override
    public final View a(final my my, View view, final ViewGroup viewGroup) {
        final View actionView = my.getActionView();
        int visibility = 0;
        if (actionView != null && !my.m()) {
            view = actionView;
        }
        else {
            nk nk;
            if (view instanceof nk) {
                nk = (nk)view;
            }
            else {
                nk = (nk)super.d.inflate(2131623938, viewGroup, false);
            }
            nk.f(my);
            final ActionMenuView b = (ActionMenuView)this.f;
            final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)nk;
            actionMenuItemView.b = b;
            if (this.s == null) {
                this.s = new mh(this);
            }
            actionMenuItemView.c = this.s;
            view = (View)nk;
        }
        if (my.p) {
            visibility = 8;
        }
        view.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof oj)) {
            view.setLayoutParams((ViewGroup$LayoutParams)ActionMenuView.n(layoutParams));
        }
        return view;
    }
    
    @Override
    public final void b(final Context b, final mv c) {
        LayoutInflater.from(super.b = b);
        super.c = c;
        final Resources resources = b.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = b.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = jp.g(b);
        int o = this.o;
        if (this.m) {
            if (this.g == null) {
                this.g = new od(this, this.a);
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(measureSpec, measureSpec);
            }
            o -= this.g.getMeasuredWidth();
        }
        else {
            this.g = null;
        }
        this.p = o;
        final float density = resources.getDisplayMetrics().density;
    }
    
    @Override
    public final void c(final mv mv, final boolean b) {
        this.n();
        final ni e = super.e;
        if (e != null) {
            e.a(mv, b);
        }
    }
    
    @Override
    public final boolean e() {
        final mv c = this.c;
        ArrayList f;
        int size;
        if (c != null) {
            f = c.f();
            size = f.size();
        }
        else {
            f = null;
            size = 0;
        }
        int h = this.h;
        final int p = this.p;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)this.f;
        int i = 0;
        boolean b = false;
        int n = 0;
        int n2 = 0;
        while (i < size) {
            final my my = f.get(i);
            if (my.r()) {
                ++n;
            }
            else if (my.q()) {
                ++n2;
            }
            else {
                b = true;
            }
            int n3 = h;
            if (this.q) {
                n3 = h;
                if (my.p) {
                    n3 = 0;
                }
            }
            ++i;
            h = n3;
        }
        int n4 = h;
        if (this.m && (b || n2 + n > (n4 = h))) {
            n4 = h - 1;
        }
        int n5 = n4 - n;
        final SparseBooleanArray r = this.r;
        r.clear();
        int j = 0;
        int n6 = 0;
        int n7 = p;
        while (j < size) {
            final my my2 = f.get(j);
            if (my2.r()) {
                final View a = this.a(my2, null, viewGroup);
                a.measure(measureSpec, measureSpec);
                final int measuredWidth = a.getMeasuredWidth();
                n7 -= measuredWidth;
                if (n6 == 0) {
                    n6 = measuredWidth;
                }
                final int b2 = my2.b;
                if (b2 != 0) {
                    r.put(b2, true);
                }
                my2.k(true);
            }
            else if (my2.q()) {
                final int b3 = my2.b;
                final boolean value = r.get(b3);
                boolean b4 = (n5 > 0 || value) && n7 > 0;
                if (b4) {
                    final View a2 = this.a(my2, null, viewGroup);
                    a2.measure(measureSpec, measureSpec);
                    final int measuredWidth2 = a2.getMeasuredWidth();
                    n7 -= measuredWidth2;
                    if (n6 == 0) {
                        n6 = measuredWidth2;
                    }
                    b4 = (n7 + n6 > 0);
                }
                int n8;
                if (b4 && b3 != 0) {
                    r.put(b3, true);
                    n8 = n5;
                }
                else {
                    n8 = n5;
                    if (value) {
                        r.put(b3, false);
                        int n9 = 0;
                        while (true) {
                            n8 = n5;
                            if (n9 >= j) {
                                break;
                            }
                            final my my3 = f.get(n9);
                            int n10 = n5;
                            if (my3.b == b3) {
                                n10 = n5;
                                if (my3.o()) {
                                    n10 = n5 + 1;
                                }
                                my3.k(false);
                            }
                            ++n9;
                            n5 = n10;
                        }
                    }
                }
                n5 = n8;
                if (b4) {
                    n5 = n8 - 1;
                }
                my2.k(b4);
            }
            else {
                my2.k(false);
            }
            ++j;
        }
        return true;
    }
    
    @Override
    public final boolean f(nr c) {
        final boolean hasVisibleItems = c.hasVisibleItems();
        boolean b = false;
        if (!hasVisibleItems) {
            return false;
        }
        nr nr = c;
        while (true) {
            final mv j = nr.j;
            if (j == this.c) {
                break;
            }
            nr = (nr)j;
        }
        final my k = nr.k;
        final ViewGroup viewGroup = (ViewGroup)this.f;
        final View view = null;
        View child = null;
        Label_0133: {
            if (viewGroup == null) {
                child = view;
            }
            else {
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    child = viewGroup.getChildAt(i);
                    if (child instanceof nk && ((nk)child).a() == k) {
                        break Label_0133;
                    }
                }
                child = view;
            }
        }
        if (child == null) {
            return false;
        }
        final my l = c.k;
        for (int size = c.size(), n = 0; n < size; ++n) {
            final MenuItem item = c.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b = true;
                break;
            }
        }
        (this.j = new oa(this, this.b, c, child)).d(b);
        if (this.j.h()) {
            final ni e = super.e;
            if (e != null) {
                if (c == null) {
                    c = (nr)super.c;
                }
                e.b(c);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    
    @Override
    public final void i() {
        final ViewGroup viewGroup = (ViewGroup)super.f;
        final ArrayList list = null;
        final int n = 0;
        if (viewGroup != null) {
            final mv c = super.c;
            int i;
            if (c != null) {
                c.k();
                final ArrayList f = super.c.f();
                final int size = f.size();
                int n2 = 0;
                int n3 = 0;
                while (true) {
                    i = n3;
                    if (n2 >= size) {
                        break;
                    }
                    final my my = f.get(n2);
                    int n4 = n3;
                    if (my.o()) {
                        final View child = viewGroup.getChildAt(n3);
                        my a;
                        if (child instanceof nk) {
                            a = ((nk)child).a();
                        }
                        else {
                            a = null;
                        }
                        final View a2 = this.a(my, child, viewGroup);
                        if (my != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != child) {
                            final ViewGroup viewGroup2 = (ViewGroup)a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup)super.f).addView(a2, n3);
                        }
                        n4 = n3 + 1;
                    }
                    ++n2;
                    n3 = n4;
                }
            }
            else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    ++i;
                }
                else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View)this.f).requestLayout();
        final mv c2 = this.c;
        if (c2 != null) {
            c2.k();
            final ArrayList d = c2.d;
            for (int size2 = d.size(), j = 0; j < size2; ++j) {
                final hu o = d.get(j).o;
            }
        }
        final mv c3 = this.c;
        ArrayList e;
        if (c3 != null) {
            e = c3.e();
        }
        else {
            e = list;
        }
        Label_0538: {
            if (this.m && e != null) {
                final int size3 = e.size();
                int n5;
                if (size3 == 1) {
                    n5 = ((e.get(0).p ^ true) ? 1 : 0);
                }
                else {
                    n5 = n;
                    if (size3 > 0) {
                        n5 = 1;
                    }
                }
                if (n5 != 0) {
                    if (this.g == null) {
                        this.g = new od(this, this.a);
                    }
                    final ViewGroup viewGroup3 = (ViewGroup)this.g.getParent();
                    if (viewGroup3 != this.f) {
                        if (viewGroup3 != null) {
                            viewGroup3.removeView((View)this.g);
                        }
                        final ActionMenuView actionMenuView = (ActionMenuView)this.f;
                        final od g = this.g;
                        final oj m = ActionMenuView.m();
                        m.a = true;
                        actionMenuView.addView((View)g, (ViewGroup$LayoutParams)m);
                    }
                    break Label_0538;
                }
            }
            final od g2 = this.g;
            if (g2 != null) {
                final ViewParent parent = g2.getParent();
                final nl f2 = this.f;
                if (parent == f2) {
                    ((ViewGroup)f2).removeView((View)this.g);
                }
            }
        }
        ((ActionMenuView)this.f).b = this.m;
    }
    
    public final void j(final ActionMenuView f) {
        this.f = f;
        f.a = this.c;
    }
    
    public final boolean k() {
        final ob k = this.k;
        if (k != null) {
            final nl f = this.f;
            if (f != null) {
                ((View)f).removeCallbacks((Runnable)k);
                this.k = null;
                return true;
            }
        }
        final oe i = this.i;
        if (i != null) {
            i.b();
            return true;
        }
        return false;
    }
    
    public final boolean l() {
        final oe i = this.i;
        return i != null && i.g();
    }
    
    public final boolean m() {
        if (this.m && !this.l()) {
            final mv c = this.c;
            if (c != null && this.f != null && this.k == null && !c.e().isEmpty()) {
                this.k = new ob(this, new oe(this, this.b, this.c, (View)this.g));
                ((View)this.f).post((Runnable)this.k);
                return true;
            }
        }
        return false;
    }
    
    public final void n() {
        this.k();
        this.q();
    }
    
    public final void o() {
        this.q = true;
    }
    
    public final void p() {
        this.m = true;
        this.n = true;
    }
    
    public final void q() {
        final oa j = this.j;
        if (j != null) {
            j.b();
        }
    }
}
