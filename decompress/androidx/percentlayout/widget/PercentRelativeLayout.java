// 
// Decompiled by Procyon v0.6.0
// 

package androidx.percentlayout.widget;

import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.RelativeLayout;

@Deprecated
public class PercentRelativeLayout extends RelativeLayout
{
    private final aeg a;
    
    public PercentRelativeLayout(final Context context) {
        super(context);
        this.a = new aeg((ViewGroup)this);
    }
    
    public PercentRelativeLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new aeg((ViewGroup)this);
    }
    
    public PercentRelativeLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new aeg((ViewGroup)this);
    }
    
    public final aeh a(final AttributeSet set) {
        return new aeh(this.getContext(), set);
    }
    
    protected final void onLayout(final boolean b, int i, int childCount, final int n, final int n2) {
        super.onLayout(b, i, childCount, n, n2);
        final aeg a = this.a;
        ViewGroup$LayoutParams layoutParams;
        aee a2;
        ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams;
        for (childCount = a.a.getChildCount(), i = 0; i < childCount; ++i) {
            layoutParams = a.a.getChildAt(i).getLayoutParams();
            if (layoutParams instanceof aeh) {
                a2 = ((aeh)layoutParams).a();
                if (a2 != null) {
                    if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                        viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                        a2.b((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                        viewGroup$MarginLayoutParams.leftMargin = a2.j.leftMargin;
                        viewGroup$MarginLayoutParams.topMargin = a2.j.topMargin;
                        viewGroup$MarginLayoutParams.rightMargin = a2.j.rightMargin;
                        viewGroup$MarginLayoutParams.bottomMargin = a2.j.bottomMargin;
                        viewGroup$MarginLayoutParams.setMarginStart(a2.j.getMarginStart());
                        viewGroup$MarginLayoutParams.setMarginEnd(a2.j.getMarginEnd());
                    }
                    else {
                        a2.b(layoutParams);
                    }
                }
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final aeg a = this.a;
        final int n3 = View$MeasureSpec.getSize(n) - a.a.getPaddingLeft() - a.a.getPaddingRight();
        final int n4 = View$MeasureSpec.getSize(n2) - a.a.getPaddingTop() - a.a.getPaddingBottom();
        final int childCount = a.a.getChildCount();
        int i = 0;
        int n5 = 0;
        while (true) {
            boolean b = true;
            if (n5 >= childCount) {
                break;
            }
            final View child = a.a.getChildAt(n5);
            final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
            Label_0430: {
                if (layoutParams instanceof aeh) {
                    final aee a2 = ((aeh)layoutParams).a();
                    if (a2 != null) {
                        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                            a2.a((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams, n3, n4);
                            a2.j.leftMargin = viewGroup$MarginLayoutParams.leftMargin;
                            a2.j.topMargin = viewGroup$MarginLayoutParams.topMargin;
                            a2.j.rightMargin = viewGroup$MarginLayoutParams.rightMargin;
                            a2.j.bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
                            a2.j.setMarginStart(viewGroup$MarginLayoutParams.getMarginStart());
                            a2.j.setMarginEnd(viewGroup$MarginLayoutParams.getMarginEnd());
                            final float c = a2.c;
                            if (c >= 0.0f) {
                                viewGroup$MarginLayoutParams.leftMargin = Math.round(n3 * c);
                            }
                            final float d = a2.d;
                            if (d >= 0.0f) {
                                viewGroup$MarginLayoutParams.topMargin = Math.round(n4 * d);
                            }
                            final float e = a2.e;
                            if (e >= 0.0f) {
                                viewGroup$MarginLayoutParams.rightMargin = Math.round(n3 * e);
                            }
                            final float f = a2.f;
                            if (f >= 0.0f) {
                                viewGroup$MarginLayoutParams.bottomMargin = Math.round(n4 * f);
                            }
                            final float g = a2.g;
                            if (g >= 0.0f) {
                                viewGroup$MarginLayoutParams.setMarginStart(Math.round(n3 * g));
                            }
                            else {
                                b = false;
                            }
                            final float h = a2.h;
                            if (h >= 0.0f) {
                                viewGroup$MarginLayoutParams.setMarginEnd(Math.round(n3 * h));
                            }
                            else if (!b) {
                                break Label_0430;
                            }
                            if (child != null) {
                                viewGroup$MarginLayoutParams.resolveLayoutDirection(ik.f(child));
                            }
                        }
                        else {
                            a2.a(layoutParams, n3, n4);
                        }
                    }
                }
            }
            ++n5;
        }
        super.onMeasure(n, n2);
        final aeg a3 = this.a;
        final int childCount2 = a3.a.getChildCount();
        int n6 = 0;
        while (i < childCount2) {
            final View child2 = a3.a.getChildAt(i);
            final ViewGroup$LayoutParams layoutParams2 = child2.getLayoutParams();
            int n7 = n6;
            if (layoutParams2 instanceof aeh) {
                final aee a4 = ((aeh)layoutParams2).a();
                n7 = n6;
                if (a4 != null) {
                    int n8 = n6;
                    if ((child2.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000) {
                        n8 = n6;
                        if (a4.a >= 0.0f) {
                            n8 = n6;
                            if (a4.j.width == -2) {
                                layoutParams2.width = -2;
                                n8 = 1;
                            }
                        }
                    }
                    n7 = n8;
                    if ((child2.getMeasuredHeightAndState() & 0xFF000000) == 0x1000000) {
                        n7 = n8;
                        if (a4.b >= 0.0f) {
                            n7 = n8;
                            if (a4.j.height == -2) {
                                layoutParams2.height = -2;
                                n7 = 1;
                            }
                        }
                    }
                }
            }
            ++i;
            n6 = n7;
        }
        if (n6 != 0) {
            super.onMeasure(n, n2);
        }
    }
}
