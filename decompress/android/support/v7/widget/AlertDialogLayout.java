// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class AlertDialogLayout extends LinearLayoutCompat
{
    public AlertDialogLayout(final Context context) {
        super(context);
    }
    
    public AlertDialogLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private static int a(final View view) {
        final int g = ik.g(view);
        if (g > 0) {
            return g;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }
    
    @Override
    protected final void onLayout(final boolean b, int n, int gravity, int intrinsicHeight, int i) {
        final int paddingLeft = this.getPaddingLeft();
        final int n2 = intrinsicHeight - n;
        final int paddingRight = this.getPaddingRight();
        final int paddingRight2 = this.getPaddingRight();
        n = this.getMeasuredHeight();
        final int childCount = this.getChildCount();
        final int f = super.f;
        switch (f & 0x70) {
            default: {
                n = this.getPaddingTop();
                break;
            }
            case 80: {
                n = this.getPaddingTop() + i - gravity - n;
                break;
            }
            case 16: {
                n = this.getPaddingTop() + (i - gravity - n) / 2;
                break;
            }
        }
        final Drawable g = super.g;
        i = 0;
        if (g == null) {
            intrinsicHeight = 0;
        }
        else {
            intrinsicHeight = g.getIntrinsicHeight();
        }
        while (i < childCount) {
            final View child = this.getChildAt(i);
            gravity = n;
            if (child != null) {
                gravity = n;
                if (child.getVisibility() != 8) {
                    final int measuredWidth = child.getMeasuredWidth();
                    final int measuredHeight = child.getMeasuredHeight();
                    final qz qz = (qz)child.getLayoutParams();
                    if ((gravity = qz.gravity) < 0) {
                        gravity = (0x800007 & f);
                    }
                    switch (Gravity.getAbsoluteGravity(gravity, ik.f((View)this)) & 0x7) {
                        default: {
                            gravity = qz.leftMargin + paddingLeft;
                            break;
                        }
                        case 5: {
                            gravity = n2 - paddingRight - measuredWidth - qz.rightMargin;
                            break;
                        }
                        case 1: {
                            gravity = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + qz.leftMargin - qz.rightMargin;
                            break;
                        }
                    }
                    int n3 = n;
                    if (this.r(i)) {
                        n3 = n + intrinsicHeight;
                    }
                    n = n3 + qz.topMargin;
                    child.layout(gravity, n, measuredWidth + gravity, n + measuredHeight);
                    gravity = n + (measuredHeight + qz.bottomMargin);
                }
            }
            ++i;
            n = gravity;
        }
    }
    
    @Override
    protected final void onMeasure(int i, final int n) {
        final int childCount = this.getChildCount();
        View view = null;
        View view3;
        View view2 = view3 = null;
        for (int j = 0; j < childCount; ++j) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() != 8) {
                final int id = child.getId();
                if (id == 2131428086) {
                    view = child;
                }
                else if (id == 2131427467) {
                    view2 = child;
                }
                else {
                    if ((id != 2131427515 && id != 2131427527) || view3 != null) {
                        super.onMeasure(i, n);
                        return;
                    }
                    view3 = child;
                }
            }
        }
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(i);
        int n2 = this.getPaddingTop() + this.getPaddingBottom();
        int n3;
        if (view != null) {
            view.measure(i, 0);
            n2 += view.getMeasuredHeight();
            n3 = View.combineMeasuredStates(0, view.getMeasuredState());
        }
        else {
            n3 = 0;
        }
        int a;
        int n4;
        if (view2 != null) {
            view2.measure(i, 0);
            a = a(view2);
            n4 = view2.getMeasuredHeight() - a;
            n2 += a;
            n3 = View.combineMeasuredStates(n3, view2.getMeasuredState());
        }
        else {
            a = 0;
            n4 = 0;
        }
        int measuredHeight;
        if (view3 != null) {
            int measureSpec;
            if (mode == 0) {
                measureSpec = 0;
            }
            else {
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max(0, size - n2), mode);
            }
            view3.measure(i, measureSpec);
            measuredHeight = view3.getMeasuredHeight();
            n2 += measuredHeight;
            n3 = View.combineMeasuredStates(n3, view3.getMeasuredState());
        }
        else {
            measuredHeight = 0;
        }
        final int n5 = size - n2;
        int n6;
        if (view2 != null) {
            final int min = Math.min(n5, n4);
            int n7;
            if (min > 0) {
                n6 = n5 - min;
                n7 = a + min;
            }
            else {
                n7 = a;
                n6 = n5;
            }
            view2.measure(i, View$MeasureSpec.makeMeasureSpec(n7, 1073741824));
            n2 = n2 - a + view2.getMeasuredHeight();
            n3 = View.combineMeasuredStates(n3, view2.getMeasuredState());
        }
        else {
            n6 = n5;
        }
        if (view3 != null && n6 > 0) {
            view3.measure(i, View$MeasureSpec.makeMeasureSpec(n6 + measuredHeight, mode));
            n2 = n2 - measuredHeight + view3.getMeasuredHeight();
            n3 = View.combineMeasuredStates(n3, view3.getMeasuredState());
        }
        int k = 0;
        int n8 = 0;
        while (k < childCount) {
            final View child2 = this.getChildAt(k);
            int max = n8;
            if (child2.getVisibility() != 8) {
                max = Math.max(n8, child2.getMeasuredWidth());
            }
            ++k;
            n8 = max;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(n8 + (this.getPaddingLeft() + this.getPaddingRight()), i, n3), View.resolveSizeAndState(n2, n, 0));
        if (mode2 != 1073741824) {
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
            View child3;
            qz qz;
            int height;
            for (i = 0; i < childCount; ++i) {
                child3 = this.getChildAt(i);
                if (child3.getVisibility() != 8) {
                    qz = (qz)child3.getLayoutParams();
                    if (qz.width == -1) {
                        height = qz.height;
                        qz.height = child3.getMeasuredHeight();
                        this.measureChildWithMargins(child3, measureSpec2, 0, n, 0);
                        qz.height = height;
                    }
                }
            }
        }
    }
}
