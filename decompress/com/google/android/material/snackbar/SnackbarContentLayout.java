// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View$MeasureSpec;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;

public class SnackbarContentLayout extends LinearLayout
{
    private TextView a;
    private Button b;
    private int c;
    private int d;
    
    public SnackbarContentLayout(final Context context) {
        this(context, null);
    }
    
    public SnackbarContentLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nfu.a);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }
    
    private final boolean a(final int orientation, final int n, final int n2) {
        boolean b;
        if (orientation != this.getOrientation()) {
            this.setOrientation(orientation);
            b = true;
        }
        else {
            b = false;
        }
        if (this.a.getPaddingTop() == n && this.a.getPaddingBottom() == n2) {
            return b;
        }
        final TextView a = this.a;
        if (ik.W((View)a)) {
            ik.M((View)a, ik.j((View)a), n, ik.i((View)a), n2);
        }
        else {
            ((View)a).setPadding(((View)a).getPaddingLeft(), n, ((View)a).getPaddingRight(), n2);
        }
        return true;
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131427971);
        this.b = (Button)this.findViewById(2131427970);
    }
    
    protected final void onMeasure(int dimensionPixelSize, final int n) {
        super.onMeasure(dimensionPixelSize, n);
        int measureSpec = dimensionPixelSize;
        if (this.c > 0) {
            final int measuredWidth = this.getMeasuredWidth();
            final int c = this.c;
            measureSpec = dimensionPixelSize;
            if (measuredWidth > c) {
                measureSpec = View$MeasureSpec.makeMeasureSpec(c, 1073741824);
                super.onMeasure(measureSpec, n);
            }
        }
        dimensionPixelSize = this.getResources().getDimensionPixelSize(2131165407);
        final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131165406);
        final int lineCount = this.a.getLayout().getLineCount();
        if (lineCount > 1 && this.d > 0 && this.b.getMeasuredWidth() > this.d) {
            if (!this.a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        }
        else {
            if (lineCount <= 1) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!this.a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(measureSpec, n);
    }
}
