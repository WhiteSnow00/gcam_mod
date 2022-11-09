// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.view.View$MeasureSpec;
import android.view.Gravity;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class LinearLayoutCompat extends ViewGroup
{
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;
    
    public LinearLayoutCompat(final Context context) {
        this(context, null);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set, int c) {
        super(context, set, c);
        boolean willNotDraw = true;
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        final to q = to.q(context, set, lo.m, c);
        ik.E((View)this, context, lo.m, set, q.b, c, 0);
        c = q.c(1, -1);
        if (c >= 0) {
            this.q(c);
        }
        final int c2 = q.c(0, -1);
        if (c2 >= 0 && this.f != c2) {
            c = c2;
            if ((0x800007 & c2) == 0x0) {
                c = (c2 | 0x800003);
            }
            int f = c;
            if ((c & 0x70) == 0x0) {
                f = (c | 0x30);
            }
            this.f = f;
            this.requestLayout();
        }
        if (!q.o(2, true)) {
            this.s();
        }
        this.i = q.b.getFloat(4, -1.0f);
        this.b = q.c(3, -1);
        this.j = q.o(7, false);
        final Drawable h = q.h(5);
        if (h != this.g) {
            if ((this.g = h) != null) {
                this.h = h.getIntrinsicWidth();
                this.m = h.getIntrinsicHeight();
            }
            else {
                this.h = 0;
                this.m = 0;
            }
            if (h != null) {
                willNotDraw = false;
            }
            this.setWillNotDraw(willNotDraw);
            this.requestLayout();
        }
        this.n = q.c(8, 0);
        this.o = q.b(6, 0);
        q.n();
    }
    
    private static void a(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(n, n2, n3 + n, n4 + n2);
    }
    
    public qz bI(final AttributeSet set) {
        return new qz(this.getContext(), set);
    }
    
    protected qz bJ(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new qz(viewGroup$LayoutParams);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof qz;
    }
    
    protected qz d() {
        final int d = this.d;
        if (d == 0) {
            return new qz(-2);
        }
        if (d == 1) {
            return new qz(-1);
        }
        return null;
    }
    
    public final int getBaseline() {
        if (this.b < 0) {
            return super.getBaseline();
        }
        final int childCount = this.getChildCount();
        final int b = this.b;
        if (childCount <= b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        final View child = this.getChildAt(b);
        final int baseline = child.getBaseline();
        if (baseline != -1) {
            int c = this.c;
            if (this.d == 1) {
                final int n = this.f & 0x70;
                if (n != 48) {
                    switch (n) {
                        case 80: {
                            c = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.e;
                            break;
                        }
                        case 16: {
                            c += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.e) / 2;
                            break;
                        }
                    }
                }
            }
            return c + ((qz)child.getLayoutParams()).topMargin + baseline;
        }
        if (this.b == 0) {
            return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    }
    
    final void o(final Canvas canvas, final int n) {
        this.g.setBounds(this.getPaddingLeft() + this.o, n, this.getWidth() - this.getPaddingRight() - this.o, this.m + n);
        this.g.draw(canvas);
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.g == null) {
            return;
        }
        final int d = this.d;
        final int n = 0;
        int i = 0;
        if (d == 1) {
            int childCount;
            for (childCount = this.getChildCount(); i < childCount; ++i) {
                final View child = this.getChildAt(i);
                if (child != null && child.getVisibility() != 8 && this.r(i)) {
                    this.o(canvas, child.getTop() - ((qz)child.getLayoutParams()).topMargin - this.m);
                }
            }
            if (this.r(childCount)) {
                final View child2 = this.getChildAt(childCount - 1);
                int n2;
                if (child2 == null) {
                    n2 = this.getHeight() - this.getPaddingBottom() - this.m;
                }
                else {
                    n2 = child2.getBottom() + ((qz)child2.getLayoutParams()).bottomMargin;
                }
                this.o(canvas, n2);
            }
        }
        else {
            final int childCount2 = this.getChildCount();
            final boolean b = ue.b((View)this);
            for (int j = n; j < childCount2; ++j) {
                final View child3 = this.getChildAt(j);
                if (child3 != null && child3.getVisibility() != 8 && this.r(j)) {
                    final qz qz = (qz)child3.getLayoutParams();
                    int n3;
                    if (b) {
                        n3 = child3.getRight() + qz.rightMargin;
                    }
                    else {
                        n3 = child3.getLeft() - qz.leftMargin - this.h;
                    }
                    this.p(canvas, n3);
                }
            }
            if (this.r(childCount2)) {
                final View child4 = this.getChildAt(childCount2 - 1);
                int paddingLeft;
                if (child4 == null) {
                    if (b) {
                        paddingLeft = this.getPaddingLeft();
                    }
                    else {
                        paddingLeft = this.getWidth() - this.getPaddingRight() - this.h;
                    }
                }
                else {
                    final qz qz2 = (qz)child4.getLayoutParams();
                    if (b) {
                        paddingLeft = child4.getLeft() - qz2.leftMargin - this.h;
                    }
                    else {
                        paddingLeft = child4.getRight() + qz2.rightMargin;
                    }
                }
                this.p(canvas, paddingLeft);
            }
        }
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"android.support.v7.widget.LinearLayoutCompat");
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.support.v7.widget.LinearLayoutCompat");
    }
    
    protected void onLayout(final boolean b, int n, int n2, int i, int n3) {
        if (this.d == 1) {
            final int paddingLeft = this.getPaddingLeft();
            final int n4 = i - n;
            final int paddingRight = this.getPaddingRight();
            final int paddingRight2 = this.getPaddingRight();
            final int childCount = this.getChildCount();
            final int f = this.f;
            switch (f & 0x70) {
                default: {
                    n = this.getPaddingTop();
                    break;
                }
                case 80: {
                    n = this.getPaddingTop() + n3 - n2 - this.e;
                    break;
                }
                case 16: {
                    n = this.getPaddingTop() + (n3 - n2 - this.e) / 2;
                    break;
                }
            }
            View child;
            int measuredWidth;
            int measuredHeight;
            qz qz;
            for (i = 0; i < childCount; ++i, n = n2) {
                child = this.getChildAt(i);
                if (child == null) {
                    n2 = n;
                }
                else {
                    n2 = n;
                    if (child.getVisibility() != 8) {
                        measuredWidth = child.getMeasuredWidth();
                        measuredHeight = child.getMeasuredHeight();
                        qz = (qz)child.getLayoutParams();
                        n3 = qz.gravity;
                        if ((n2 = n3) < 0) {
                            n2 = (0x800007 & f);
                        }
                        switch (Gravity.getAbsoluteGravity(n2, ik.f((View)this)) & 0x7) {
                            default: {
                                n2 = qz.leftMargin + paddingLeft;
                                break;
                            }
                            case 5: {
                                n2 = n4 - paddingRight - measuredWidth - qz.rightMargin;
                                break;
                            }
                            case 1: {
                                n2 = (n4 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + qz.leftMargin - qz.rightMargin;
                                break;
                            }
                        }
                        n3 = n;
                        if (this.r(i)) {
                            n3 = n + this.m;
                        }
                        n = n3 + qz.topMargin;
                        a(child, n2, n, measuredWidth, measuredHeight);
                        n2 = n + (measuredHeight + qz.bottomMargin);
                    }
                }
            }
        }
        else {
            final boolean b2 = ue.b((View)this);
            final int paddingTop = this.getPaddingTop();
            final int n5 = n3 - n2;
            final int n6 = n5 - this.getPaddingBottom();
            final int paddingBottom = this.getPaddingBottom();
            final int childCount2 = this.getChildCount();
            n3 = this.f;
            n2 = (n3 & 0x70);
            final boolean a = this.a;
            final int[] k = this.k;
            final int[] l = this.l;
            switch (Gravity.getAbsoluteGravity(0x800007 & n3, ik.f((View)this))) {
                default: {
                    n = this.getPaddingLeft();
                    break;
                }
                case 5: {
                    n = this.getPaddingLeft() + i - n - this.e;
                    break;
                }
                case 1: {
                    n = this.getPaddingLeft() + (i - n - this.e) / 2;
                    break;
                }
            }
            if (b2) {
                n3 = childCount2 - 1;
                i = -1;
            }
            else {
                n3 = 0;
                i = 1;
            }
            int j = 0;
            final int n7 = i;
            i = n;
            while (j < childCount2) {
                final int n8 = n3 + n7 * j;
                final View child2 = this.getChildAt(n8);
                if (child2 != null) {
                    if (child2.getVisibility() != 8) {
                        final int measuredWidth2 = child2.getMeasuredWidth();
                        final int measuredHeight2 = child2.getMeasuredHeight();
                        final qz qz2 = (qz)child2.getLayoutParams();
                        if (a && qz2.height != -1) {
                            n = child2.getBaseline();
                        }
                        else {
                            n = -1;
                        }
                        int gravity;
                        if ((gravity = qz2.gravity) < 0) {
                            gravity = n2;
                        }
                        switch (gravity & 0x70) {
                            default: {
                                n = paddingTop;
                                break;
                            }
                            case 80: {
                                final int n9 = n6 - measuredHeight2 - qz2.bottomMargin;
                                if (n != -1) {
                                    n = n9 - (l[2] - (child2.getMeasuredHeight() - n));
                                }
                                else {
                                    n = n9;
                                }
                                break;
                            }
                            case 48: {
                                final int n10 = paddingTop + qz2.topMargin;
                                if (n != -1) {
                                    n = n10 + (k[1] - n);
                                }
                                else {
                                    n = n10;
                                }
                                break;
                            }
                            case 16: {
                                n = (n5 - paddingTop - paddingBottom - measuredHeight2) / 2 + paddingTop + qz2.topMargin - qz2.bottomMargin;
                                break;
                            }
                        }
                        int n11 = i;
                        if (this.r(n8)) {
                            n11 = i + this.h;
                        }
                        i = n11 + qz2.leftMargin;
                        a(child2, i, n, measuredWidth2, measuredHeight2);
                        i += measuredWidth2 + qz2.rightMargin;
                    }
                }
                ++j;
            }
        }
    }
    
    protected void onMeasure(int i, int j) {
        if (this.d == 1) {
            this.e = 0;
            final int childCount = this.getChildCount();
            int mode = View$MeasureSpec.getMode(i);
            final int mode2 = View$MeasureSpec.getMode(j);
            final int b = this.b;
            final boolean k = this.j;
            int l = 0;
            int n = 1;
            boolean b2 = false;
            boolean b3 = false;
            int combineMeasuredStates = 0;
            int n2 = 0;
            int n3 = 0;
            float n4 = 0.0f;
            int max = 0;
            int n5 = 0;
            while (l < childCount) {
                final View child = this.getChildAt(l);
                if (child != null) {
                    if (child.getVisibility() != 8) {
                        if (this.r(l)) {
                            this.e += this.m;
                        }
                        final qz qz = (qz)child.getLayoutParams();
                        n4 += qz.weight;
                        if (mode2 == 1073741824 && qz.height == 0 && qz.weight > 0.0f) {
                            final int e = this.e;
                            this.e = Math.max(e, qz.topMargin + e + qz.bottomMargin);
                            b3 = true;
                        }
                        else {
                            int n6;
                            if (qz.height == 0 && qz.weight > 0.0f) {
                                qz.height = -2;
                                n6 = 0;
                            }
                            else {
                                n6 = Integer.MIN_VALUE;
                            }
                            int e2;
                            if (n4 == 0.0f) {
                                e2 = this.e;
                            }
                            else {
                                e2 = 0;
                            }
                            final qz qz2 = qz;
                            this.measureChildWithMargins(child, i, 0, j, e2);
                            if (n6 != Integer.MIN_VALUE) {
                                qz2.height = 0;
                            }
                            final int measuredHeight = child.getMeasuredHeight();
                            final int e3 = this.e;
                            this.e = Math.max(e3, e3 + measuredHeight + qz2.topMargin + qz2.bottomMargin);
                            if (k) {
                                max = Math.max(measuredHeight, max);
                            }
                        }
                        final int n7 = b;
                        if (n7 >= 0 && n7 == l + 1) {
                            this.c = this.e;
                        }
                        if (l < n7 && qz.weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        final int n8 = mode;
                        boolean b4;
                        if (n8 != 1073741824 && qz.width == -1) {
                            b4 = true;
                            b2 = true;
                        }
                        else {
                            b4 = false;
                        }
                        int n9 = qz.leftMargin + qz.rightMargin;
                        final int n10 = child.getMeasuredWidth() + n9;
                        n5 = Math.max(n5, n10);
                        combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, child.getMeasuredState());
                        int n11;
                        if (n != 0 && qz.width == -1) {
                            n11 = 1;
                        }
                        else {
                            n11 = 0;
                        }
                        int max2;
                        if (qz.weight > 0.0f) {
                            if (!b4) {
                                n9 = n10;
                            }
                            max2 = Math.max(n3, n9);
                        }
                        else {
                            if (!b4) {
                                n9 = n10;
                            }
                            n2 = Math.max(n2, n9);
                            max2 = n3;
                        }
                        n3 = max2;
                        n = n11;
                        mode = n8;
                    }
                }
                ++l;
            }
            if (this.e > 0 && this.r(childCount)) {
                this.e += this.m;
            }
            final int n12 = childCount;
            int n16 = 0;
            Label_0740: {
                Label_0737: {
                    if (k) {
                        final int n13 = mode2;
                        int n14;
                        if (n13 != Integer.MIN_VALUE) {
                            if (n13 != 0) {
                                break Label_0737;
                            }
                            n14 = 0;
                        }
                        else {
                            n14 = n13;
                        }
                        this.e = 0;
                        int n15 = 0;
                        while (true) {
                            n16 = n14;
                            if (n15 >= n12) {
                                break Label_0740;
                            }
                            final View child2 = this.getChildAt(n15);
                            if (child2 != null) {
                                if (child2.getVisibility() != 8) {
                                    final qz qz3 = (qz)child2.getLayoutParams();
                                    final int e4 = this.e;
                                    this.e = Math.max(e4, e4 + max + qz3.topMargin + qz3.bottomMargin);
                                }
                            }
                            ++n15;
                        }
                    }
                }
                n16 = mode2;
            }
            final int e5 = this.e + (this.getPaddingTop() + this.getPaddingBottom());
            this.e = e5;
            final int resolveSizeAndState = View.resolveSizeAndState(Math.max(e5, this.getSuggestedMinimumHeight()), j, 0);
            final int n17 = (0xFFFFFF & resolveSizeAndState) - this.e;
            int n19;
            int combineMeasuredStates2;
            if (!b3 && (n17 == 0 || n4 <= 0.0f)) {
                n2 = Math.max(n2, n3);
                if (k && n16 != 1073741824) {
                    for (int n18 = 0; n18 < n12; ++n18) {
                        final View child3 = this.getChildAt(n18);
                        if (child3 != null) {
                            if (child3.getVisibility() != 8) {
                                if (((qz)child3.getLayoutParams()).weight > 0.0f) {
                                    child3.measure(View$MeasureSpec.makeMeasureSpec(child3.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(max, 1073741824));
                                }
                            }
                        }
                    }
                }
                n19 = n;
                combineMeasuredStates2 = combineMeasuredStates;
            }
            else {
                final float m = this.i;
                if (m > 0.0f) {
                    n4 = m;
                }
                this.e = 0;
                final int n20 = 0;
                n19 = n;
                combineMeasuredStates2 = combineMeasuredStates;
                int n21 = n17;
                int n22 = n20;
                final int n23 = n16;
                while (n22 < n12) {
                    final View child4 = this.getChildAt(n22);
                    if (child4.getVisibility() != 8) {
                        final qz qz4 = (qz)child4.getLayoutParams();
                        final float weight = qz4.weight;
                        if (weight > 0.0f) {
                            final int n24 = (int)(n21 * weight / n4);
                            n4 -= weight;
                            final int childMeasureSpec = getChildMeasureSpec(i, this.getPaddingLeft() + this.getPaddingRight() + qz4.leftMargin + qz4.rightMargin, qz4.width);
                            if (qz4.height == 0 && n23 == 1073741824) {
                                int n25;
                                if (n24 > 0) {
                                    n25 = n24;
                                }
                                else {
                                    n25 = 0;
                                }
                                child4.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n25, 1073741824));
                            }
                            else {
                                int n26;
                                if ((n26 = child4.getMeasuredHeight() + n24) < 0) {
                                    n26 = 0;
                                }
                                child4.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n26, 1073741824));
                            }
                            combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates2, child4.getMeasuredState() & 0xFFFFFF00);
                            n21 -= n24;
                        }
                        int n27 = qz4.leftMargin + qz4.rightMargin;
                        final int n28 = child4.getMeasuredWidth() + n27;
                        n5 = Math.max(n5, n28);
                        if (mode == 1073741824 || qz4.width != -1) {
                            n27 = n28;
                        }
                        n2 = Math.max(n2, n27);
                        if (n19 != 0 && qz4.width == -1) {
                            n19 = 1;
                        }
                        else {
                            n19 = 0;
                        }
                        final int e6 = this.e;
                        this.e = Math.max(e6, child4.getMeasuredHeight() + e6 + qz4.topMargin + qz4.bottomMargin);
                    }
                    ++n22;
                }
                this.e += this.getPaddingTop() + this.getPaddingBottom();
            }
            if (n19 != 0 || mode == 1073741824) {
                n2 = n5;
            }
            this.setMeasuredDimension(View.resolveSizeAndState(Math.max(n2 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), i, combineMeasuredStates2), resolveSizeAndState);
            if (b2) {
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
                View child5;
                qz qz5;
                int height;
                for (i = 0; i < n12; ++i) {
                    child5 = this.getChildAt(i);
                    if (child5.getVisibility() != 8) {
                        qz5 = (qz)child5.getLayoutParams();
                        if (qz5.width == -1) {
                            height = qz5.height;
                            qz5.height = child5.getMeasuredHeight();
                            this.measureChildWithMargins(child5, measureSpec, 0, j, 0);
                            qz5.height = height;
                        }
                    }
                }
            }
        }
        else {
            this.e = 0;
            final int childCount2 = this.getChildCount();
            final int mode3 = View$MeasureSpec.getMode(i);
            final int mode4 = View$MeasureSpec.getMode(j);
            if (this.k == null || this.l == null) {
                this.k = new int[4];
                this.l = new int[4];
            }
            final int[] k2 = this.k;
            final int[] l2 = this.l;
            k2[2] = (k2[3] = -1);
            k2[0] = (k2[1] = -1);
            l2[2] = (l2[3] = -1);
            l2[0] = (l2[1] = -1);
            final boolean a = this.a;
            final boolean j2 = this.j;
            int n29 = 0;
            float n30 = 0.0f;
            int n31 = 0;
            int n32 = 0;
            int max3 = 0;
            boolean b5 = false;
            boolean b6 = false;
            int n33 = 1;
            int n34 = 0;
            int max4 = 0;
            while (n32 < childCount2) {
                final View child6 = this.getChildAt(n32);
                int n45 = 0;
                int n46 = 0;
                Label_2280: {
                    if (child6 != null) {
                        if (child6.getVisibility() != 8) {
                            if (this.r(n32)) {
                                this.e += this.h;
                            }
                            final qz qz6 = (qz)child6.getLayoutParams();
                            n30 += qz6.weight;
                            Label_1998: {
                                int n35;
                                if (mode3 == 1073741824) {
                                    if (qz6.width == 0) {
                                        if (qz6.weight > 0.0f) {
                                            this.e += qz6.leftMargin + qz6.rightMargin;
                                            if (a) {
                                                final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
                                                child6.measure(measureSpec2, measureSpec2);
                                                break Label_1998;
                                            }
                                            b6 = true;
                                            break Label_1998;
                                        }
                                        else {
                                            n35 = 1073741824;
                                        }
                                    }
                                    else {
                                        n35 = 1073741824;
                                    }
                                }
                                else {
                                    n35 = mode3;
                                }
                                int n36;
                                if (qz6.width == 0 && qz6.weight > 0.0f) {
                                    qz6.width = -2;
                                    n36 = 0;
                                }
                                else {
                                    n36 = Integer.MIN_VALUE;
                                }
                                int e7;
                                if (n30 == 0.0f) {
                                    e7 = this.e;
                                }
                                else {
                                    e7 = 0;
                                }
                                this.measureChildWithMargins(child6, i, e7, j, 0);
                                if (n36 != Integer.MIN_VALUE) {
                                    qz6.width = 0;
                                }
                                final qz qz7 = qz6;
                                final int measuredWidth = child6.getMeasuredWidth();
                                if (n35 == 1073741824) {
                                    this.e += qz7.leftMargin + measuredWidth + qz7.rightMargin;
                                }
                                else {
                                    final int e8 = this.e;
                                    this.e = Math.max(e8, e8 + measuredWidth + qz7.leftMargin + qz7.rightMargin);
                                }
                                if (j2) {
                                    max3 = Math.max(measuredWidth, max3);
                                }
                            }
                            final int n37 = n29;
                            boolean b7;
                            if (mode4 != 1073741824 && qz6.height == -1) {
                                b7 = true;
                                b5 = true;
                            }
                            else {
                                b7 = false;
                            }
                            final int n38 = qz6.topMargin + qz6.bottomMargin;
                            final int n39 = child6.getMeasuredHeight() + n38;
                            final int combineMeasuredStates3 = View.combineMeasuredStates(n31, child6.getMeasuredState());
                            if (a) {
                                final int baseline = child6.getBaseline();
                                if (baseline != -1) {
                                    int n40;
                                    if (qz6.gravity < 0) {
                                        n40 = this.f;
                                    }
                                    else {
                                        n40 = qz6.gravity;
                                    }
                                    final int n41 = (n40 & 0x70) >> 4 >> 1;
                                    k2[n41] = Math.max(k2[n41], baseline);
                                    l2[n41] = Math.max(l2[n41], n39 - baseline);
                                }
                            }
                            int n42 = n38;
                            max4 = Math.max(max4, n39);
                            int n43;
                            if (n33 != 0 && qz6.height == -1) {
                                n43 = 1;
                            }
                            else {
                                n43 = 0;
                            }
                            int max5;
                            int max6;
                            if (qz6.weight > 0.0f) {
                                if (!b7) {
                                    n42 = n39;
                                }
                                max5 = Math.max(n34, n42);
                                max6 = n37;
                            }
                            else {
                                if (!b7) {
                                    n42 = n39;
                                }
                                max6 = Math.max(n37, n42);
                                max5 = n34;
                            }
                            final int n44 = combineMeasuredStates3;
                            n34 = max5;
                            n45 = n32;
                            n33 = n43;
                            n46 = n44;
                            n29 = max6;
                            break Label_2280;
                        }
                    }
                    n45 = n32;
                    n46 = n31;
                }
                ++n45;
                n31 = n46;
                n32 = n45;
            }
            if (this.e > 0 && this.r(childCount2)) {
                this.e += this.h;
            }
            int n47 = k2[1];
            int n48 = 0;
            Label_2434: {
                if (n47 == -1) {
                    if (k2[0] == -1 && k2[2] == -1) {
                        if (k2[3] == -1) {
                            n48 = max4;
                            break Label_2434;
                        }
                        n47 = -1;
                    }
                    else {
                        n47 = -1;
                    }
                }
                n48 = Math.max(max4, Math.max(k2[3], Math.max(k2[0], Math.max(n47, k2[2]))) + Math.max(l2[3], Math.max(l2[0], Math.max(l2[1], l2[2]))));
            }
            final int n49 = n31;
            final int n50 = mode4;
            int n56 = 0;
            int n57 = 0;
            Label_2597: {
                Label_2585: {
                    if (j2) {
                        int n51;
                        int n52;
                        if (mode3 != Integer.MIN_VALUE) {
                            if (mode3 != 0) {
                                break Label_2585;
                            }
                            n51 = 0;
                            n52 = 0;
                        }
                        else {
                            final int n53 = mode3;
                            n52 = mode3;
                            n51 = n53;
                        }
                        this.e = 0;
                        for (int n54 = 0; n54 < childCount2; ++n54) {
                            final View child7 = this.getChildAt(n54);
                            if (child7 != null) {
                                if (child7.getVisibility() != 8) {
                                    final qz qz8 = (qz)child7.getLayoutParams();
                                    final int e9 = this.e;
                                    this.e = Math.max(e9, e9 + max3 + qz8.leftMargin + qz8.rightMargin);
                                }
                            }
                        }
                        final int n55 = n52;
                        n56 = n51;
                        n57 = n55;
                        break Label_2597;
                    }
                }
                final int n58 = mode3;
                n56 = mode3;
                n57 = n58;
            }
            final int e10 = this.e + (this.getPaddingLeft() + this.getPaddingRight());
            this.e = e10;
            final int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(e10, this.getSuggestedMinimumWidth()), i, 0);
            final int n59 = (0xFFFFFF & resolveSizeAndState2) - this.e;
            int n61;
            int combineMeasuredStates4;
            int max8;
            if (!b6 && (n59 == 0 || n30 <= 0.0f)) {
                final int max7 = Math.max(n29, n34);
                if (j2 && n56 != 1073741824) {
                    for (int n60 = 0; n60 < childCount2; ++n60) {
                        final View child8 = this.getChildAt(n60);
                        if (child8 != null) {
                            if (child8.getVisibility() != 8) {
                                if (((qz)child8.getLayoutParams()).weight > 0.0f) {
                                    child8.measure(View$MeasureSpec.makeMeasureSpec(max3, 1073741824), View$MeasureSpec.makeMeasureSpec(child8.getMeasuredHeight(), 1073741824));
                                }
                            }
                        }
                    }
                }
                n61 = childCount2;
                combineMeasuredStates4 = n49;
                max8 = max7;
            }
            else {
                final float i2 = this.i;
                if (i2 > 0.0f) {
                    n30 = i2;
                }
                k2[2] = (k2[3] = -1);
                k2[0] = (k2[1] = -1);
                l2[2] = (l2[3] = -1);
                l2[0] = (l2[1] = -1);
                this.e = 0;
                int n62 = n59;
                final int n63 = n49;
                final int n64 = 0;
                int max9 = -1;
                int n65 = n33;
                final int n66 = childCount2;
                int n67 = n64;
                final int n68 = n57;
                combineMeasuredStates4 = n63;
                max8 = n29;
                while (n67 < n66) {
                    final View child9 = this.getChildAt(n67);
                    int n69;
                    if (child9 != null) {
                        if (child9.getVisibility() == 8) {
                            n69 = n62;
                        }
                        else {
                            final qz qz9 = (qz)child9.getLayoutParams();
                            final float weight2 = qz9.weight;
                            if (weight2 > 0.0f) {
                                final int n70 = (int)(n62 * weight2 / n30);
                                final int childMeasureSpec2 = getChildMeasureSpec(j, this.getPaddingTop() + this.getPaddingBottom() + qz9.topMargin + qz9.bottomMargin, qz9.height);
                                if (qz9.width == 0 && n56 == 1073741824) {
                                    int n71;
                                    if (n70 > 0) {
                                        n71 = n70;
                                    }
                                    else {
                                        n71 = 0;
                                    }
                                    child9.measure(View$MeasureSpec.makeMeasureSpec(n71, 1073741824), childMeasureSpec2);
                                }
                                else {
                                    int n72;
                                    if ((n72 = child9.getMeasuredWidth() + n70) < 0) {
                                        n72 = 0;
                                    }
                                    child9.measure(View$MeasureSpec.makeMeasureSpec(n72, 1073741824), childMeasureSpec2);
                                }
                                combineMeasuredStates4 = View.combineMeasuredStates(combineMeasuredStates4, child9.getMeasuredState() & 0xFF000000);
                                n30 -= weight2;
                                n69 = n62 - n70;
                            }
                            else {
                                n69 = n62;
                            }
                            if (n68 == 1073741824) {
                                this.e += child9.getMeasuredWidth() + qz9.leftMargin + qz9.rightMargin;
                            }
                            else {
                                final int e11 = this.e;
                                this.e = Math.max(e11, child9.getMeasuredWidth() + e11 + qz9.leftMargin + qz9.rightMargin);
                            }
                            final boolean b8 = n50 != 1073741824 && qz9.height == -1;
                            final int n73 = qz9.topMargin + qz9.bottomMargin;
                            final int n74 = child9.getMeasuredHeight() + n73;
                            max9 = Math.max(max9, n74);
                            int n75;
                            if (!b8) {
                                n75 = n74;
                            }
                            else {
                                n75 = n73;
                            }
                            max8 = Math.max(max8, n75);
                            int n76;
                            if (n65 != 0 && qz9.height == -1) {
                                n76 = 1;
                            }
                            else {
                                n76 = 0;
                            }
                            if (a) {
                                final int baseline2 = child9.getBaseline();
                                if (baseline2 != -1) {
                                    int n77;
                                    if (qz9.gravity < 0) {
                                        n77 = this.f;
                                    }
                                    else {
                                        n77 = qz9.gravity;
                                    }
                                    final int n78 = (n77 & 0x70) >> 4 >> 1;
                                    k2[n78] = Math.max(k2[n78], baseline2);
                                    l2[n78] = Math.max(l2[n78], n74 - baseline2);
                                }
                            }
                            n65 = n76;
                        }
                    }
                    else {
                        n69 = n62;
                    }
                    ++n67;
                    n62 = n69;
                }
                this.e += this.getPaddingLeft() + this.getPaddingRight();
                Label_3526: {
                    int n79;
                    if ((n79 = k2[1]) == -1) {
                        if (k2[0] == -1 && k2[2] == -1) {
                            if (k2[3] == -1) {
                                n48 = max9;
                                break Label_3526;
                            }
                            n79 = -1;
                        }
                        else {
                            n79 = -1;
                        }
                    }
                    n48 = Math.max(max9, Math.max(k2[3], Math.max(k2[0], Math.max(n79, k2[2]))) + Math.max(l2[3], Math.max(l2[0], Math.max(l2[1], l2[2]))));
                }
                n61 = n66;
                n33 = n65;
            }
            if (n33 != 0 || n50 == 1073741824) {
                max8 = n48;
            }
            this.setMeasuredDimension((0xFF000000 & combineMeasuredStates4) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(max8 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), j, combineMeasuredStates4 << 16));
            if (b5) {
                final int measureSpec3 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);
                View child10;
                qz qz10;
                int width;
                for (j = 0; j < n61; ++j) {
                    child10 = this.getChildAt(j);
                    if (child10.getVisibility() != 8) {
                        qz10 = (qz)child10.getLayoutParams();
                        if (qz10.height == -1) {
                            width = qz10.width;
                            qz10.width = child10.getMeasuredWidth();
                            this.measureChildWithMargins(child10, i, 0, measureSpec3, 0);
                            qz10.width = width;
                        }
                    }
                }
            }
        }
    }
    
    final void p(final Canvas canvas, final int n) {
        this.g.setBounds(n, this.getPaddingTop() + this.o, this.h + n, this.getHeight() - this.getPaddingBottom() - this.o);
        this.g.draw(canvas);
    }
    
    public final void q(final int d) {
        if (this.d != d) {
            this.d = d;
            this.requestLayout();
        }
    }
    
    protected final boolean r(int i) {
        final boolean b = false;
        if (i == 0) {
            return (this.n & 0x1) != 0x0;
        }
        if (i == this.getChildCount()) {
            return (this.n & 0x4) != 0x0;
        }
        boolean b2 = b;
        if ((this.n & 0x2) != 0x0) {
            --i;
            while (i >= 0) {
                if (this.getChildAt(i).getVisibility() != 8) {
                    b2 = true;
                    return b2;
                }
                --i;
            }
            b2 = b;
        }
        return b2;
    }
    
    public final void s() {
        this.a = false;
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
