// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.graphics.Rect;
import android.view.View$MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import java.util.List;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class AppBarLayout$ScrollingViewBehavior extends ncp
{
    public AppBarLayout$ScrollingViewBehavior() {
    }
    
    public AppBarLayout$ScrollingViewBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ncq.a);
        super.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
    
    static final ncm x(final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final View view = list.get(i);
            if (view instanceof ncm) {
                return (ncm)view;
            }
        }
        return null;
    }
    
    @Override
    public final boolean f(final View view) {
        return view instanceof ncm;
    }
    
    @Override
    public final void g(final CoordinatorLayout coordinatorLayout, final View view) {
        if (view instanceof ncm) {
            ik.C((View)coordinatorLayout, iz.b.a());
            ik.C((View)coordinatorLayout, iz.c.a());
        }
    }
    
    @Override
    public final void j(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        final zv a = ((zy)view2.getLayoutParams()).a;
        if (a instanceof AppBarLayout$BaseBehavior) {
            final AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = (AppBarLayout$BaseBehavior)a;
            final int bottom = view2.getBottom();
            final int top = view.getTop();
            final int a2 = appBarLayout$BaseBehavior.a;
            ik.y(view, bottom - top + super.c - this.A(view2));
        }
        if (!(view2 instanceof ncm)) {
            return;
        }
        final ncm ncm = (ncm)view2;
        throw null;
    }
    
    @Override
    public final void m(final CoordinatorLayout coordinatorLayout, final View view, final Rect rect) {
        if (x(coordinatorLayout.h(view)) != null) {
            rect.offset(view.getLeft(), view.getTop());
            final Rect a = this.a;
            a.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!a.contains(rect)) {
                throw null;
            }
        }
    }
    
    @Override
    public final int y() {
        throw null;
    }
    
    @Override
    public final void z(final View view) {
        if (!(view instanceof ncm)) {
            return;
        }
        final ncm ncm = (ncm)view;
        throw null;
    }
}
