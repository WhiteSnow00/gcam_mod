// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.view.AbsSavedState;
import android.view.View$BaseSavedState;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.widget.ScrollView;
import android.widget.ListView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.ref.WeakReference;

public class AppBarLayout$BaseBehavior extends nco
{
    public int a;
    private int c;
    private WeakReference d;
    
    public AppBarLayout$BaseBehavior() {
    }
    
    public AppBarLayout$BaseBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private static final void C(final ncm ncm) {
        if (ncm.getChildCount() <= 0) {
            return;
        }
        final View child = ncm.getChildAt(0);
        child.getTop();
        child.getBottom();
        final ncl ncl = (ncl)child.getLayoutParams();
        throw null;
    }
    
    private static final void D(final CoordinatorLayout coordinatorLayout) {
        ik.C((View)coordinatorLayout, iz.b.a());
        ik.C((View)coordinatorLayout, iz.c.a());
        final int childCount = coordinatorLayout.getChildCount();
        int i = 0;
        while (true) {
            while (i < childCount) {
                final View child = coordinatorLayout.getChildAt(i);
                View view;
                if (!(child instanceof hz) && !(child instanceof ListView)) {
                    if (!(child instanceof ScrollView)) {
                        ++i;
                        continue;
                    }
                    view = child;
                }
                else {
                    view = child;
                }
                if (view == null) {
                    return;
                }
                throw null;
            }
            View view = null;
            continue;
        }
    }
    
    @Override
    public final void B() {
    }
}
