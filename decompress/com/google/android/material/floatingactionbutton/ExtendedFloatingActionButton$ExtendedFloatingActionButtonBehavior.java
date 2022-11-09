// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import java.util.List;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends zv
{
    private Rect a;
    private boolean b;
    private boolean c;
    
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }
    
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nef.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
    
    private static boolean w(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof zy && ((zy)layoutParams).a instanceof BottomSheetBehavior;
    }
    
    private final boolean x(final View view, final nec nec) {
        final zy zy = (zy)nec.getLayoutParams();
        return (this.b || this.c) && zy.f == view.getId();
    }
    
    private final void y(final CoordinatorLayout coordinatorLayout, final ncm ncm, final nec nec) {
        if (!this.x((View)ncm, nec)) {
            return;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        final Rect a = this.a;
        nei.a(coordinatorLayout, (View)ncm, a);
        final int bottom = a.bottom;
        throw null;
    }
    
    private final void z(final View view, final nec nec) {
        if (!this.x(view, nec)) {
            return;
        }
        if (view.getTop() < nec.getHeight() / 2 + ((zy)nec.getLayoutParams()).topMargin) {
            if (this.c) {
                final nee b = nec.b;
            }
            else {
                final nee e = nec.e;
            }
            throw null;
        }
        if (this.c) {
            final nee c = nec.c;
        }
        else {
            final nee d = nec.d;
        }
        throw null;
    }
    
    @Override
    public final void a(final zy zy) {
        if (zy.h == 0) {
            zy.h = 80;
        }
    }
}
