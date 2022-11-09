// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public ki i;
    
    public ContentFrameLayout(final Context context) {
        this(context, null);
    }
    
    public ContentFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ContentFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h = new Rect();
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final ki i = this.i;
        if (i != null) {
            final kw a = i.a;
            final py k = a.k;
            if (k != null) {
                k.g();
            }
            if (a.n != null) {
                a.g.getDecorView().removeCallbacks(a.o);
                if (a.n.isShowing()) {
                    try {
                        a.n.dismiss();
                    }
                    catch (final IllegalArgumentException ex) {}
                }
                a.n = null;
            }
            a.B();
            try (final mv h = a.L(0).h) {}
        }
    }
    
    protected final void onMeasure(int n, int measureSpec) {
        final DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
        final int widthPixels = displayMetrics.widthPixels;
        final int heightPixels = displayMetrics.heightPixels;
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(measureSpec);
        final int n2 = 1;
        int measureSpec2 = 0;
        Label_0194: {
            if (mode == Integer.MIN_VALUE) {
                TypedValue typedValue;
                if (widthPixels < heightPixels) {
                    typedValue = this.e;
                }
                else {
                    typedValue = this.d;
                }
                if (typedValue != null && typedValue.type != 0) {
                    int n3;
                    if (typedValue.type == 5) {
                        n3 = (int)typedValue.getDimension(displayMetrics);
                    }
                    else if (typedValue.type == 6) {
                        n3 = (int)typedValue.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
                    }
                    else {
                        n3 = 0;
                    }
                    if (n3 > 0) {
                        measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.min(n3 - (this.h.left + this.h.right), View$MeasureSpec.getSize(n)), 1073741824);
                        n = 1;
                        break Label_0194;
                    }
                    final int n4 = 0;
                    measureSpec2 = n;
                    n = n4;
                    break Label_0194;
                }
            }
            measureSpec2 = n;
            n = 0;
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2;
            if (widthPixels < heightPixels) {
                typedValue2 = this.f;
            }
            else {
                typedValue2 = this.g;
            }
            if (typedValue2 != null && typedValue2.type != 0) {
                int n5;
                if (typedValue2.type == 5) {
                    n5 = (int)typedValue2.getDimension(displayMetrics);
                }
                else if (typedValue2.type == 6) {
                    n5 = (int)typedValue2.getFraction((float)displayMetrics.heightPixels, (float)displayMetrics.heightPixels);
                }
                else {
                    n5 = 0;
                }
                if (n5 > 0) {
                    measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(n5 - (this.h.top + this.h.bottom), View$MeasureSpec.getSize(measureSpec)), 1073741824);
                }
            }
        }
        super.onMeasure(measureSpec2, measureSpec);
        final int measuredWidth = this.getMeasuredWidth();
        final int measureSpec3 = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int measureSpec4 = 0;
        Label_0513: {
            if (n == 0 && mode == Integer.MIN_VALUE) {
                TypedValue typedValue3;
                if (widthPixels < heightPixels) {
                    typedValue3 = this.c;
                }
                else {
                    typedValue3 = this.b;
                }
                if (typedValue3 != null && typedValue3.type != 0) {
                    if (typedValue3.type == 5) {
                        n = (int)typedValue3.getDimension(displayMetrics);
                    }
                    else if (typedValue3.type == 6) {
                        n = (int)typedValue3.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
                    }
                    else {
                        n = 0;
                    }
                    int n6 = n;
                    if (n > 0) {
                        n6 = n - (this.h.left + this.h.right);
                    }
                    if (measuredWidth < n6) {
                        measureSpec4 = View$MeasureSpec.makeMeasureSpec(n6, 1073741824);
                        n = n2;
                        break Label_0513;
                    }
                    n = 0;
                    measureSpec4 = measureSpec3;
                    break Label_0513;
                }
            }
            n = 0;
            measureSpec4 = measureSpec3;
        }
        if (n != 0) {
            super.onMeasure(measureSpec4, measureSpec);
        }
    }
}
