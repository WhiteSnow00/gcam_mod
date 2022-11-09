// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout
{
    private boolean a;
    private int b;
    
    public ButtonBarLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lo.k);
        ik.E((View)this, context, lo.k, set, obtainStyledAttributes, 0, 0);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
    
    private final int a(int i) {
        while (i < this.getChildCount()) {
            if (this.getChildAt(i).getVisibility() == 0) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    private final void b(final boolean orientation) {
        this.setOrientation((int)(orientation ? 1 : 0));
        int gravity;
        if (1 != (orientation ? 1 : 0)) {
            gravity = 80;
        }
        else {
            gravity = 8388613;
        }
        this.setGravity(gravity);
        final View viewById = this.findViewById(2131427995);
        if (viewById != null) {
            int visibility;
            if (1 != (orientation ? 1 : 0)) {
                visibility = 4;
            }
            else {
                visibility = 8;
            }
            viewById.setVisibility(visibility);
        }
        for (int i = this.getChildCount() - 2; i >= 0; --i) {
            this.bringChildToFront(this.getChildAt(i));
        }
    }
    
    private final boolean c() {
        return this.getOrientation() == 1;
    }
    
    public final int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }
    
    protected final void onMeasure(int minimumHeight, int n) {
        final int size = View$MeasureSpec.getSize(minimumHeight);
        final boolean a = this.a;
        final int n2 = 0;
        if (a) {
            if (size > this.b && this.c()) {
                this.b(false);
            }
            this.b = size;
        }
        int measureSpec;
        boolean b;
        if (!this.c() && View$MeasureSpec.getMode(minimumHeight) == 1073741824) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            b = true;
        }
        else {
            measureSpec = minimumHeight;
            b = false;
        }
        super.onMeasure(measureSpec, n);
        Label_0129: {
            if (this.a && !this.c() && (this.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000) {
                this.b(true);
            }
            else if (!b) {
                break Label_0129;
            }
            super.onMeasure(minimumHeight, n);
        }
        n = this.a(0);
        if (n >= 0) {
            final View child = this.getChildAt(n);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
            minimumHeight = this.getPaddingTop() + child.getMeasuredHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
            if (this.c()) {
                n = this.a(n + 1);
                if (n >= 0) {
                    minimumHeight += this.getChildAt(n).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0f);
                }
            }
            else {
                minimumHeight += this.getPaddingBottom();
            }
        }
        else {
            minimumHeight = n2;
        }
        if (ik.g((View)this) != minimumHeight) {
            this.setMinimumHeight(minimumHeight);
        }
    }
}
