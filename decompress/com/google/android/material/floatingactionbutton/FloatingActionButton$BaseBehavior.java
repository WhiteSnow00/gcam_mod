// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.graphics.Rect;
import java.util.List;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class FloatingActionButton$BaseBehavior extends zv
{
    private boolean a;
    
    public FloatingActionButton$BaseBehavior() {
        this.a = true;
    }
    
    public FloatingActionButton$BaseBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nef.b);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
    
    private static boolean w(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof zy && ((zy)layoutParams).a instanceof BottomSheetBehavior;
    }
    
    private final void x(final View view, final ned ned) {
        final zy zy = (zy)ned.getLayoutParams();
        if (!this.a) {
            return;
        }
        if (zy.f != view.getId()) {
            return;
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
