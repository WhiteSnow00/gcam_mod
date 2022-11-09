// 
// Decompiled by Procyon v0.6.0
// 

package android.support.constraint;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConstraintLayout extends ViewGroup
{
    SparseArray a;
    de b;
    public ct c;
    private final ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    
    public ConstraintLayout(final Context context) {
        super(context);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new de();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        this.f(null);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new de();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        this.f(set);
    }
    
    public ConstraintLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new de();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        this.f(set);
    }
    
    private final dd d(final int n) {
        if (n == 0) {
            return this.b;
        }
        final View view = (View)this.a.get(n);
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((cr)view.getLayoutParams()).Y;
    }
    
    private final dd e(final View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((cr)view.getLayoutParams()).Y;
    }
    
    private final void f(final AttributeSet set) {
        this.b.J = this;
        this.a.put(this.getId(), (Object)this);
        this.c = null;
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, cu.a);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(16, this.e);
                }
                else if (index == 17) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(17, this.f);
                }
                else if (index == 14) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(14, this.g);
                }
                else if (index == 15) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(15, this.h);
                }
                else if (index == 112) {
                    this.j = obtainStyledAttributes.getInt(112, this.j);
                }
                else if (index == 34) {
                    (this.c = new ct()).h(this.getContext(), obtainStyledAttributes.getResourceId(34, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.ai = this.j;
    }
    
    public cr bA(final AttributeSet set) {
        return new cr(this.getContext(), set);
    }
    
    protected final void bB() {
        this.b.D();
    }
    
    public cr bz() {
        return new cr(-2, -2);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof cr;
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new cr(viewGroup$LayoutParams);
    }
    
    protected void onLayout(final boolean b, int i, int childCount, int c, int b2) {
        childCount = this.getChildCount();
        final boolean inEditMode = this.isInEditMode();
        View child;
        cr cr;
        dd y;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            cr = (cr)child.getLayoutParams();
            if (child.getVisibility() != 8 || cr.Q || inEditMode) {
                y = cr.Y;
                b2 = y.b();
                c = y.c();
                child.layout(b2, c, y.h() + b2, y.d() + c);
            }
        }
    }
    
    protected void onMeasure(int resolveSizeAndState, int n) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final de b = this.b;
        b.w = paddingLeft;
        b.x = paddingTop;
        final int mode = View$MeasureSpec.getMode(resolveSizeAndState);
        int size = View$MeasureSpec.getSize(resolveSizeAndState);
        final int mode2 = View$MeasureSpec.getMode(n);
        int size2 = View$MeasureSpec.getSize(n);
        final int paddingTop2 = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int paddingLeft2 = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        this.getLayoutParams();
        int n2 = 0;
        switch (mode) {
            default: {
                n2 = 1;
                size = 0;
                break;
            }
            case 1073741824: {
                size = Math.min(this.g, size) - (paddingLeft2 + paddingRight);
                n2 = 1;
                break;
            }
            case 0: {
                n2 = 2;
                size = 0;
                break;
            }
            case Integer.MIN_VALUE: {
                n2 = 2;
                break;
            }
        }
        int n3 = 0;
        switch (mode2) {
            default: {
                n3 = 1;
                size2 = 0;
                break;
            }
            case 1073741824: {
                size2 = Math.min(this.h, size2) - (paddingTop2 + paddingBottom);
                n3 = 1;
                break;
            }
            case 0: {
                n3 = 2;
                size2 = 0;
                break;
            }
            case Integer.MIN_VALUE: {
                n3 = 2;
                break;
            }
        }
        this.b.n(0);
        this.b.m(0);
        this.b.w(n2);
        this.b.q(size);
        this.b.x(n3);
        this.b.k(size2);
        this.b.n(this.e - this.getPaddingLeft() - this.getPaddingRight());
        this.b.m(this.f - this.getPaddingTop() - this.getPaddingBottom());
        if (this.i) {
            this.i = false;
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                if (this.getChildAt(i).isLayoutRequested()) {
                    this.d.clear();
                    final ct c = this.c;
                    if (c != null) {
                        c.c(this);
                    }
                    final int childCount2 = this.getChildCount();
                    this.b.al.clear();
                    for (int j = 0; j < childCount2; ++j) {
                        final View child = this.getChildAt(j);
                        final dd e = this.e(child);
                        if (e != null) {
                            final cr cr = (cr)child.getLayoutParams();
                            e.i();
                            e.K = child.getVisibility();
                            e.J = child;
                            final de b2 = this.b;
                            b2.al.add(e);
                            final dd r = e.r;
                            if (r != null) {
                                ((di)r).F(e);
                            }
                            e.r = b2;
                            if (!cr.O || !cr.N) {
                                this.d.add(e);
                            }
                            if (cr.Q) {
                                final df df = (df)e;
                                final int a = cr.a;
                                if (a != -1 && a >= 0) {
                                    df.af = -1.0f;
                                    df.ag = a;
                                    df.ah = -1;
                                }
                                final int b3 = cr.b;
                                if (b3 != -1 && b3 >= 0) {
                                    df.af = -1.0f;
                                    df.ag = -1;
                                    df.ah = b3;
                                }
                                final float c2 = cr.c;
                                if (c2 != -1.0f && c2 > -1.0f) {
                                    df.af = c2;
                                    df.ag = -1;
                                    df.ah = -1;
                                }
                            }
                            else if (cr.R != -1 || cr.S != -1 || cr.T != -1 || cr.U != -1 || cr.h != -1 || cr.i != -1 || cr.j != -1 || cr.k != -1 || cr.l != -1 || cr.K != -1 || cr.L != -1 || cr.width == -1 || cr.height == -1) {
                                final int r2 = cr.R;
                                final int s = cr.S;
                                final int t = cr.T;
                                final int u = cr.U;
                                final int v = cr.V;
                                final int w = cr.W;
                                final float x = cr.X;
                                if (r2 != -1) {
                                    final dd d = this.d(r2);
                                    if (d != null) {
                                        e.v(2, d, 2, cr.leftMargin, v);
                                    }
                                }
                                else if (s != -1) {
                                    final dd d2 = this.d(s);
                                    if (d2 != null) {
                                        e.v(2, d2, 4, cr.leftMargin, v);
                                    }
                                }
                                if (t != -1) {
                                    final dd d3 = this.d(t);
                                    if (d3 != null) {
                                        e.v(4, d3, 2, cr.rightMargin, w);
                                    }
                                }
                                else if (u != -1) {
                                    final dd d4 = this.d(u);
                                    if (d4 != null) {
                                        e.v(4, d4, 4, cr.rightMargin, w);
                                    }
                                }
                                final int h = cr.h;
                                if (h != -1) {
                                    final dd d5 = this.d(h);
                                    if (d5 != null) {
                                        e.v(3, d5, 3, cr.topMargin, cr.r);
                                    }
                                }
                                else {
                                    final int k = cr.i;
                                    if (k != -1) {
                                        final dd d6 = this.d(k);
                                        if (d6 != null) {
                                            e.v(3, d6, 5, cr.topMargin, cr.r);
                                        }
                                    }
                                }
                                final int l = cr.j;
                                if (l != -1) {
                                    final dd d7 = this.d(l);
                                    if (d7 != null) {
                                        e.v(5, d7, 3, cr.bottomMargin, cr.t);
                                    }
                                }
                                else {
                                    final int m = cr.k;
                                    if (m != -1) {
                                        final dd d8 = this.d(m);
                                        if (d8 != null) {
                                            e.v(5, d8, 5, cr.bottomMargin, cr.t);
                                        }
                                    }
                                }
                                final int l2 = cr.l;
                                if (l2 != -1) {
                                    final View view = (View)this.a.get(l2);
                                    final dd d9 = this.d(cr.l);
                                    if (d9 != null && view != null) {
                                        if (view.getLayoutParams() instanceof cr) {
                                            final cr cr2 = (cr)view.getLayoutParams();
                                            cr.P = true;
                                            cr2.P = true;
                                            final df df2 = (df)e;
                                            df2.u(6).d(d9.u(6), 0, -1, 2, 0, true);
                                            df2.u(3).b();
                                            df2.u(5).b();
                                        }
                                    }
                                }
                                if (x >= 0.0f && x != 0.5f) {
                                    e.H = x;
                                }
                                final float x2 = cr.x;
                                if (x2 >= 0.0f && x2 != 0.5f) {
                                    e.I = x2;
                                }
                                Label_1453: {
                                    if (this.isInEditMode()) {
                                        int k2;
                                        if ((k2 = cr.K) == -1) {
                                            if (cr.L == -1) {
                                                break Label_1453;
                                            }
                                            k2 = -1;
                                        }
                                        final int l3 = cr.L;
                                        e.w = k2;
                                        e.x = l3;
                                    }
                                }
                                if (!cr.N) {
                                    if (cr.width == -1) {
                                        e.w(4);
                                        e.u(2).c = cr.leftMargin;
                                        e.u(4).c = cr.rightMargin;
                                    }
                                    else {
                                        e.w(3);
                                        e.q(0);
                                    }
                                }
                                else {
                                    e.w(1);
                                    e.q(cr.width);
                                }
                                if (!cr.O) {
                                    if (cr.height == -1) {
                                        e.x(4);
                                        e.u(3).c = cr.topMargin;
                                        e.u(5).c = cr.bottomMargin;
                                    }
                                    else {
                                        e.x(3);
                                        e.k(0);
                                    }
                                }
                                else {
                                    e.x(1);
                                    e.k(cr.height);
                                }
                                final String y = cr.y;
                                if (y != null) {
                                    if (y.length() == 0) {
                                        e.u = 0.0f;
                                    }
                                    else {
                                        final int length = y.length();
                                        int index = y.indexOf(44);
                                        int v2;
                                        if (index > 0 && index < length - 1) {
                                            final String substring = y.substring(0, index);
                                            if (substring.equalsIgnoreCase("W")) {
                                                v2 = 0;
                                            }
                                            else if (substring.equalsIgnoreCase("H")) {
                                                v2 = 1;
                                            }
                                            else {
                                                v2 = -1;
                                            }
                                            ++index;
                                        }
                                        else {
                                            index = 0;
                                            v2 = -1;
                                        }
                                        final int index2 = y.indexOf(58);
                                        float u2 = 0.0f;
                                        Label_1906: {
                                            Label_1868: {
                                                if (index2 < 0 || index2 >= length - 1) {
                                                    break Label_1868;
                                                }
                                                final String substring2 = y.substring(index, index2);
                                                final String substring3 = y.substring(index2 + 1);
                                                Label_1862: {
                                                    if (substring2.length() <= 0 || substring3.length() <= 0) {
                                                        break Label_1862;
                                                    }
                                                    try {
                                                        final float float1 = Float.parseFloat(substring2);
                                                        final float float2 = Float.parseFloat(substring3);
                                                        if (float1 <= 0.0f || float2 <= 0.0f) {
                                                            u2 = 0.0f;
                                                            break Label_1906;
                                                        }
                                                        if (v2 == 1) {
                                                            u2 = Math.abs(float2 / float1);
                                                            break Label_1906;
                                                        }
                                                        u2 = Math.abs(float1 / float2);
                                                        break Label_1906;
                                                        final String substring4 = y.substring(index);
                                                        iftrue(Label_1903:)(substring4.length() <= 0);
                                                        u2 = Float.parseFloat(substring4);
                                                    }
                                                    catch (final NumberFormatException ex) {
                                                        u2 = 0.0f;
                                                    }
                                                }
                                            }
                                            break Label_1906;
                                            Label_1903: {
                                                u2 = 0.0f;
                                            }
                                        }
                                        if (u2 > 0.0f) {
                                            e.u = u2;
                                            e.v = v2;
                                        }
                                    }
                                }
                                e.Z = cr.A;
                                e.aa = cr.B;
                                e.V = cr.C;
                                e.W = cr.D;
                                final int e2 = cr.E;
                                final int g = cr.G;
                                final int i2 = cr.I;
                                e.c = e2;
                                e.e = g;
                                e.f = i2;
                                final int f = cr.F;
                                final int h2 = cr.H;
                                final int j2 = cr.J;
                                e.d = f;
                                e.g = h2;
                                e.h = j2;
                            }
                        }
                    }
                    break;
                }
            }
        }
        final int n4 = this.getPaddingTop() + this.getPaddingBottom();
        final int n5 = this.getPaddingLeft() + this.getPaddingRight();
        for (int childCount3 = this.getChildCount(), n6 = 0; n6 < childCount3; ++n6) {
            final View child2 = this.getChildAt(n6);
            if (child2.getVisibility() != 8) {
                final cr cr3 = (cr)child2.getLayoutParams();
                final dd y2 = cr3.Y;
                if (!cr3.Q) {
                    int f2 = cr3.width;
                    final int height = cr3.height;
                    int g2 = 0;
                    int n7 = 0;
                    boolean b4 = false;
                    Label_2363: {
                        Label_2246: {
                            if (!cr3.N && !cr3.O && cr3.E != 1 && cr3.width != -1) {
                                if (!cr3.O) {
                                    if (cr3.F == 1) {
                                        break Label_2246;
                                    }
                                    if (cr3.height == -1) {
                                        break Label_2246;
                                    }
                                }
                                g2 = height;
                                n7 = 0;
                                b4 = false;
                                break Label_2363;
                            }
                        }
                        int n8;
                        int n9;
                        if (f2 != 0 && f2 != -1) {
                            n8 = getChildMeasureSpec(resolveSizeAndState, n5, f2);
                            n9 = 0;
                        }
                        else {
                            n8 = getChildMeasureSpec(resolveSizeAndState, n5, -2);
                            n9 = 1;
                        }
                        int n10;
                        if (height != 0 && height != -1) {
                            n10 = getChildMeasureSpec(n, n4, height);
                            b4 = false;
                        }
                        else {
                            n10 = getChildMeasureSpec(n, n4, -2);
                            b4 = true;
                        }
                        child2.measure(n8, n10);
                        f2 = child2.getMeasuredWidth();
                        final int measuredHeight = child2.getMeasuredHeight();
                        n7 = n9;
                        g2 = measuredHeight;
                    }
                    y2.q(f2);
                    y2.k(g2);
                    if (n7 != 0) {
                        y2.F = f2;
                    }
                    if (b4) {
                        y2.G = g2;
                    }
                    if (cr3.P) {
                        final int baseline = child2.getBaseline();
                        if (baseline != -1) {
                            y2.C = baseline;
                        }
                    }
                }
            }
        }
        if (this.getChildCount() > 0) {
            this.bB();
        }
        final int size3 = this.d.size();
        final int n11 = paddingTop + this.getPaddingBottom();
        final int n12 = paddingLeft + this.getPaddingRight();
        int n18;
        if (size3 > 0) {
            final de b5 = this.b;
            final int ad = b5.ad;
            final int ae = b5.ae;
            int combineMeasuredStates = 0;
            int n13 = 0;
            int n14 = 0;
            while (n13 < size3) {
                final dd dd = this.d.get(n13);
                if (!(dd instanceof df)) {
                    final Object j3 = dd.J;
                    if (j3 != null) {
                        final View view2 = (View)j3;
                        if (view2.getVisibility() != 8) {
                            final cr cr4 = (cr)view2.getLayoutParams();
                            int n15;
                            if (cr4.width == -2) {
                                n15 = getChildMeasureSpec(resolveSizeAndState, n12, cr4.width);
                            }
                            else {
                                n15 = View$MeasureSpec.makeMeasureSpec(dd.h(), 1073741824);
                            }
                            int n16;
                            if (cr4.height == -2) {
                                n16 = getChildMeasureSpec(n, n11, cr4.height);
                            }
                            else {
                                n16 = View$MeasureSpec.makeMeasureSpec(dd.d(), 1073741824);
                            }
                            view2.measure(n15, n16);
                            final int measuredWidth = view2.getMeasuredWidth();
                            final int measuredHeight2 = view2.getMeasuredHeight();
                            if (measuredWidth != dd.h()) {
                                dd.q(measuredWidth);
                                if (ad == 2 && dd.g() > this.b.h()) {
                                    this.b.q(Math.max(this.e, dd.g() + dd.u(4).a()));
                                    n14 = 1;
                                }
                                else {
                                    n14 = 1;
                                }
                            }
                            if (measuredHeight2 != dd.d()) {
                                dd.k(measuredHeight2);
                                if (ae == 2 && dd.a() > this.b.d()) {
                                    this.b.k(Math.max(this.f, dd.a() + dd.u(5).a()));
                                    n14 = 1;
                                }
                                else {
                                    n14 = 1;
                                }
                            }
                            int n17;
                            if (cr4.P) {
                                final int baseline2 = view2.getBaseline();
                                n17 = n14;
                                if (baseline2 != -1) {
                                    n17 = n14;
                                    if (baseline2 != dd.C) {
                                        dd.C = baseline2;
                                        n17 = 1;
                                    }
                                }
                            }
                            else {
                                n17 = n14;
                            }
                            combineMeasuredStates = combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
                            n14 = n17;
                        }
                    }
                }
                ++n13;
            }
            if (n14 != 0) {
                this.bB();
            }
            n18 = combineMeasuredStates;
        }
        else {
            n18 = 0;
        }
        final int h3 = this.b.h();
        final int d10 = this.b.d();
        resolveSizeAndState = resolveSizeAndState(h3 + n12, resolveSizeAndState, n18);
        final int resolveSizeAndState2 = resolveSizeAndState(d10 + n11, n, n18 << 16);
        n = (Math.min(this.g, resolveSizeAndState) & 0xFFFFFF);
        final int n19 = Math.min(this.h, resolveSizeAndState2) & 0xFFFFFF;
        final de b6 = this.b;
        resolveSizeAndState = n;
        if (b6.aj) {
            resolveSizeAndState = (n | 0x1000000);
        }
        n = n19;
        if (b6.ak) {
            n = (n19 | 0x1000000);
        }
        this.setMeasuredDimension(resolveSizeAndState, n);
    }
    
    public final void onViewAdded(final View view) {
        super.onViewAdded(view);
        final dd e = this.e(view);
        if (view instanceof Guideline && !(e instanceof df)) {
            final cr cr = (cr)view.getLayoutParams();
            cr.Y = new df();
            cr.Q = true;
            ((df)cr.Y).A(cr.M);
            final dd y = cr.Y;
        }
        this.a.put(view.getId(), (Object)view);
        this.i = true;
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(this.e(view));
        this.i = true;
    }
    
    public final void requestLayout() {
        super.requestLayout();
        this.i = true;
    }
    
    public final void setId(final int id) {
        this.a.remove(this.getId());
        super.setId(id);
        this.a.put(this.getId(), (Object)this);
    }
}
