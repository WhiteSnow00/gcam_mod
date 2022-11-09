// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import android.view.View$BaseSavedState;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.view.View$OnAttachStateChangeListener;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import java.util.HashMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import android.text.TextUtils;
import android.view.View;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.util.Map;
import android.view.VelocityTracker;
import android.animation.ValueAnimator;

public class BottomSheetBehavior extends zv
{
    public boolean A;
    private int B;
    private float C;
    private boolean D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private nfi K;
    private boolean L;
    private ndg M;
    private ValueAnimator N;
    private boolean O;
    private int P;
    private boolean Q;
    private int R;
    private VelocityTracker S;
    private int T;
    private Map U;
    private int V;
    private final abp W;
    public boolean a;
    public int b;
    public nfd c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    int j;
    public int k;
    public int l;
    float m;
    public int n;
    float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public abq t;
    int u;
    public int v;
    public WeakReference w;
    public WeakReference x;
    public final ArrayList y;
    public int z;
    
    public BottomSheetBehavior() {
        this.B = 0;
        this.a = true;
        this.H = -1;
        this.M = null;
        this.m = 0.5f;
        this.o = -1.0f;
        this.r = true;
        this.s = 4;
        this.y = new ArrayList();
        this.V = -1;
        this.W = new ndb(this);
    }
    
    public BottomSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.B = 0;
        this.a = true;
        this.H = -1;
        this.M = null;
        this.m = 0.5f;
        this.o = -1.0f;
        this.r = true;
        this.s = 4;
        this.y = new ArrayList();
        this.V = -1;
        this.W = new ndb(this);
        this.F = context.getResources().getDimensionPixelSize(2131165991);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ndn.a);
        this.G = obtainStyledAttributes.hasValue(16);
        if (obtainStyledAttributes.hasValue(2)) {
            this.O(context, set, true, neu.a(context, obtainStyledAttributes, 2));
        }
        else {
            this.O(context, set, false, null);
        }
        (this.N = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f })).setDuration(500L);
        this.N.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ncz(this));
        this.o = obtainStyledAttributes.getDimension(1, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.H = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        final TypedValue peekValue = obtainStyledAttributes.peekValue(8);
        if (peekValue != null && peekValue.data == -1) {
            this.D(peekValue.data);
        }
        else {
            this.D(obtainStyledAttributes.getDimensionPixelSize(8, -1));
        }
        this.C(obtainStyledAttributes.getBoolean(7, false));
        this.I = obtainStyledAttributes.getBoolean(11, false);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(5, true);
        if (this.a != boolean1) {
            this.a = boolean1;
            if (this.w != null) {
                this.M();
            }
            int s;
            if (this.a && this.s == 6) {
                s = 3;
            }
            else {
                s = this.s;
            }
            this.F(s);
            this.R();
        }
        this.q = obtainStyledAttributes.getBoolean(10, false);
        this.r = obtainStyledAttributes.getBoolean(3, true);
        this.B = obtainStyledAttributes.getInt(9, 0);
        final float float1 = obtainStyledAttributes.getFloat(6, 0.5f);
        if (float1 > 0.0f && float1 < 1.0f) {
            this.m = float1;
            if (this.w != null) {
                this.N();
            }
            final TypedValue peekValue2 = obtainStyledAttributes.peekValue(4);
            if (peekValue2 != null && peekValue2.type == 16) {
                this.B(peekValue2.data);
            }
            else {
                this.B(obtainStyledAttributes.getDimensionPixelOffset(4, 0));
            }
            this.e = obtainStyledAttributes.getBoolean(12, false);
            this.f = obtainStyledAttributes.getBoolean(13, false);
            this.g = obtainStyledAttributes.getBoolean(14, false);
            this.J = obtainStyledAttributes.getBoolean(15, true);
            obtainStyledAttributes.recycle();
            this.C = (float)ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
    
    private final int K() {
        if (this.D) {
            return Math.min(Math.max(this.E, this.v - this.u * 9 / 16), this.R) + this.h;
        }
        if (!this.I && !this.e) {
            final int d = this.d;
            if (d > 0) {
                return Math.max(this.b, d + this.F);
            }
        }
        return this.b + this.h;
    }
    
    private final jl L(final int n) {
        return new ndc(this, n);
    }
    
    private final void M() {
        final int k = this.K();
        if (this.a) {
            this.n = Math.max(this.v - k, this.k);
            return;
        }
        this.n = this.v - k;
    }
    
    private final void N() {
        this.l = (int)(this.v * (1.0f - this.m));
    }
    
    private final void O(final Context context, final AttributeSet set, final boolean b, final ColorStateList list) {
        if (this.G) {
            this.K = nfi.a(context, set, 2130968709, 2132018204).a();
            (this.c = new nfd(this.K)).e(context);
            if (b && list != null) {
                this.c.g(list);
                return;
            }
            final TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.c.setTint(typedValue.data);
        }
    }
    
    private final void P(final View view, final iz iz, final int n) {
        ik.aa(view, iz, this.L(n));
    }
    
    private final void Q() {
        this.z = -1;
        final VelocityTracker s = this.S;
        if (s != null) {
            s.recycle();
            this.S = null;
        }
    }
    
    private final void R() {
        final WeakReference w = this.w;
        if (w == null) {
            return;
        }
        final View view = (View)w.get();
        if (view == null) {
            return;
        }
        ik.C(view, 524288);
        ik.C(view, 262144);
        ik.C(view, 1048576);
        final int v = this.V;
        if (v != -1) {
            ik.C(view, v);
        }
        final boolean a = this.a;
        int n = 6;
        Label_0299: {
            if (!a && this.s != 6) {
                final String string = view.getResources().getString(2131951766);
                final jl l = this.L(6);
                final List v2 = ik.v(view);
            Label_0271:
                while (true) {
                    for (int i = 0; i < v2.size(); ++i) {
                        if (TextUtils.equals((CharSequence)string, ((iz)v2.get(i)).b())) {
                            final int a2 = v2.get(i).a();
                            if (a2 != -1) {
                                ik.w(view, new iz(null, a2, string, l, null));
                            }
                            this.V = a2;
                            break Label_0299;
                        }
                    }
                    int a2 = -1;
                    int n2 = 0;
                    while (true) {
                        final int length = ik.a.length;
                        if (n2 >= 32 || a2 != -1) {
                            continue Label_0271;
                        }
                        final int n3 = ik.a[n2];
                        int j = 0;
                        boolean b = true;
                        while (j < v2.size()) {
                            b &= (v2.get(j).a() != n3);
                            ++j;
                        }
                        a2 = n3;
                        if (!b) {
                            a2 = -1;
                        }
                        ++n2;
                    }
                    break;
                }
            }
        }
        if (this.p && this.s != 5) {
            this.P(view, iz.f, 5);
        }
        switch (this.s) {
            default: {
                return;
            }
            case 6: {
                this.P(view, iz.e, 4);
                this.P(view, iz.d, 3);
                return;
            }
            case 4: {
                if (this.a) {
                    n = 3;
                }
                this.P(view, iz.d, n);
                return;
            }
            case 3: {
                if (this.a) {
                    n = 4;
                }
                this.P(view, iz.e, n);
            }
        }
    }
    
    private final void S(final int n) {
        if (n == 2) {
            return;
        }
        final boolean l = n == 3;
        if (this.L != l) {
            this.L = l;
            if (this.c != null) {
                final ValueAnimator n2 = this.N;
                if (n2 != null) {
                    if (n2.isRunning()) {
                        this.N.reverse();
                        return;
                    }
                    float n3;
                    if (n == 3) {
                        n3 = 0.0f;
                    }
                    else {
                        n3 = 1.0f;
                    }
                    this.N.setFloatValues(new float[] { 1.0f - n3, n3 });
                    this.N.start();
                }
            }
        }
    }
    
    private final void T(final boolean b) {
        final WeakReference w = this.w;
        if (w == null) {
            return;
        }
        final ViewParent parent = ((View)w.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)parent;
        final int childCount = coordinatorLayout.getChildCount();
        int i = 0;
        if (b) {
            if (this.U != null) {
                return;
            }
            this.U = new HashMap(childCount);
        }
        while (i < childCount) {
            final View child = coordinatorLayout.getChildAt(i);
            if (child != this.w.get() && b) {
                this.U.put(child, child.getImportantForAccessibility());
            }
            ++i;
        }
        if (!b) {
            this.U = null;
        }
    }
    
    public static BottomSheetBehavior y(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof zy)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        final zv a = ((zy)layoutParams).a;
        if (a instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior)a;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    
    public final void A(int i) {
        final View view = (View)this.w.get();
        if (view != null && !this.y.isEmpty()) {
            final int n = this.n;
            final int n2 = 0;
            if (i <= n) {
                if (n == this.w()) {
                    i = n2;
                }
                else {
                    this.w();
                    i = n2;
                }
            }
            else {
                i = n2;
            }
            while (i < this.y.size()) {
                this.y.get(i).b(view);
                ++i;
            }
        }
    }
    
    public final void B(final int j) {
        if (j >= 0) {
            this.j = j;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }
    
    public final void C(final boolean p) {
        if (this.p != p) {
            this.p = p;
            if (!p && this.s == 5) {
                this.E(4);
            }
            this.R();
        }
    }
    
    public final void D(final int n) {
        Label_0053: {
            if (n == -1) {
                if (!this.D) {
                    this.D = true;
                    break Label_0053;
                }
            }
            else if (this.D || this.b != n) {
                this.D = false;
                this.b = Math.max(0, n);
                break Label_0053;
            }
            return;
        }
        this.J();
    }
    
    public final void E(final int n) {
        if (n == this.s) {
            return;
        }
        final WeakReference w = this.w;
        if (w == null) {
            int s = n;
            if (n != 4 && (s = n) != 3 && (s = n) != 6) {
                if (!this.p || n != 5) {
                    return;
                }
                s = 5;
            }
            this.s = s;
            return;
        }
        final View view = (View)w.get();
        if (view == null) {
            return;
        }
        final ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && ik.T(view)) {
            view.post((Runnable)new ncy(this, view, n));
            return;
        }
        this.G(view, n);
    }
    
    public final void F(int s) {
        if (this.s == s) {
            return;
        }
        this.s = s;
        final int n = 4;
        int n2 = s;
        if (s != 4 && (n2 = s) != 3 && (n2 = s) != 6) {
            n2 = s;
            if (this.p && (n2 = s) == 5) {
                n2 = 5;
            }
        }
        final WeakReference w = this.w;
        if (w == null) {
            return;
        }
        final View view = (View)w.get();
        if (view == null) {
            return;
        }
        final int n3 = 0;
        Label_0132: {
            if (n2 == 3) {
                this.T(true);
                s = n2;
            }
            else {
                if (n2 != 6 && n2 != 5) {
                    if ((s = n2) != 4) {
                        break Label_0132;
                    }
                    s = n;
                }
                else {
                    s = n2;
                }
                this.T(false);
            }
        }
        this.S(s);
        for (int i = n3; i < this.y.size(); ++i) {
            ((ndd)this.y.get(i)).a(view, s);
        }
        this.R();
    }
    
    public final void G(final View view, final int n) {
        int n2;
        int n3;
        if (n == 4) {
            n2 = this.n;
            n3 = n;
        }
        else if (n == 6) {
            final int n4 = n2 = this.l;
            n3 = n;
            if (this.a) {
                final int k = this.k;
                n2 = n4;
                n3 = n;
                if (n4 <= k) {
                    n2 = k;
                    n3 = 3;
                }
            }
        }
        else if (n == 3) {
            n2 = this.w();
            n3 = n;
        }
        else {
            if (!this.p || n != 5) {
                final StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal state argument: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            n2 = this.v;
            n3 = 5;
        }
        this.H(view, n3, n2, false);
    }
    
    public final void H(final View d, final int n, final int n2, final boolean b) {
        final abq t = this.t;
        Label_0161: {
            if (t != null) {
                if (b) {
                    if (!t.i(d.getLeft(), n2)) {
                        break Label_0161;
                    }
                }
                else {
                    final int left = d.getLeft();
                    t.d = d;
                    t.c = -1;
                    if (!t.g(left, n2, 0, 0)) {
                        if (t.a == 0 && t.d != null) {
                            t.d = null;
                        }
                        break Label_0161;
                    }
                }
                this.F(2);
                this.S(n);
                if (this.M == null) {
                    this.M = new ndg(this, d, n);
                }
                final ndg m = this.M;
                if (!m.a) {
                    m.b = n;
                    ik.A(d, m);
                    this.M.a = true;
                    return;
                }
                m.b = n;
                return;
            }
        }
        this.F(n);
    }
    
    public final boolean I(final View view, final float n) {
        return this.q || (view.getTop() >= this.n && Math.abs(view.getTop() + n * 0.1f - this.n) / this.K() > 0.5f);
    }
    
    public final void J() {
        if (this.w != null) {
            this.M();
            if (this.s == 4) {
                final View view = (View)this.w.get();
                if (view != null) {
                    view.requestLayout();
                }
            }
        }
    }
    
    @Override
    public final void a(final zy zy) {
        this.w = null;
        this.t = null;
    }
    
    @Override
    public final void b() {
        this.w = null;
        this.t = null;
    }
    
    @Override
    public final boolean c(final CoordinatorLayout coordinatorLayout, View view, final MotionEvent motionEvent) {
        if (view.isShown() && this.r) {
            int actionMasked;
            if ((actionMasked = motionEvent.getActionMasked()) == 0) {
                this.Q();
                actionMasked = 0;
            }
            if (this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            this.S.addMovement(motionEvent);
            final View view2 = null;
            switch (actionMasked) {
                case 1:
                case 3: {
                    this.A = false;
                    this.z = -1;
                    if (this.O) {
                        return this.O = false;
                    }
                    break;
                }
                case 0: {
                    final int n = (int)motionEvent.getX();
                    this.T = (int)motionEvent.getY();
                    if (this.s != 2) {
                        final WeakReference x = this.x;
                        View view3;
                        if (x != null) {
                            view3 = (View)x.get();
                        }
                        else {
                            view3 = null;
                        }
                        if (view3 != null && coordinatorLayout.l(view3, n, this.T)) {
                            this.z = motionEvent.getPointerId(motionEvent.getActionIndex());
                            this.A = true;
                        }
                    }
                    this.O = (this.z == -1 && !coordinatorLayout.l(view, n, this.T));
                    break;
                }
            }
            if (!this.O) {
                final abq t = this.t;
                if (t != null) {
                    if (t.j(motionEvent)) {
                        return true;
                    }
                }
            }
            final WeakReference x2 = this.x;
            if (x2 != null) {
                view = (View)x2.get();
            }
            else {
                view = view2;
            }
            return actionMasked == 2 && view != null && !this.O && this.s != 1 && !coordinatorLayout.l(view, (int)motionEvent.getX(), (int)motionEvent.getY()) && this.t != null && Math.abs(this.T - motionEvent.getY()) > this.t.b;
        }
        this.O = true;
        return false;
    }
    
    @Override
    public final boolean d(final CoordinatorLayout coordinatorLayout, final View view, int s) {
        if (ik.Q((View)coordinatorLayout) && !ik.Q(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.w == null) {
            this.E = coordinatorLayout.getResources().getDimensionPixelSize(2131165382);
            boolean b2;
            final boolean b = b2 = (!this.I && !this.D);
            Label_0176: {
                if (!this.e) {
                    b2 = b;
                    if (!this.f) {
                        b2 = b;
                        if (!this.g) {
                            if (!b) {
                                break Label_0176;
                            }
                            b2 = true;
                        }
                    }
                }
                ik.L(view, new nen(new nda(this, b2), new nep(ik.j(view), view.getPaddingTop(), ik.i(view), view.getPaddingBottom())));
                if (ik.T(view)) {
                    ik.D(view);
                }
                else {
                    view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new neo());
                }
            }
            this.w = new WeakReference((T)view);
            if (this.G) {
                final nfd c = this.c;
                if (c != null) {
                    ik.G(view, c);
                }
            }
            final nfd c2 = this.c;
            if (c2 != null) {
                float n;
                if ((n = this.o) == -1.0f) {
                    n = ik.a(view);
                }
                c2.f(n);
                final int s2 = this.s;
                this.L = (s2 == 3);
                final nfd c3 = this.c;
                float n2;
                if (s2 == 3) {
                    n2 = 0.0f;
                }
                else {
                    n2 = 1.0f;
                }
                c3.h(n2);
            }
            this.R();
            if (ik.d(view) == 0) {
                ik.K(view, 1);
            }
            final int measuredWidth = view.getMeasuredWidth();
            final int h = this.H;
            if (measuredWidth > h && h != -1) {
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = this.H;
                view.post((Runnable)new ncx(view, layoutParams));
            }
        }
        if (this.t == null) {
            this.t = abq.b(coordinatorLayout, this.W);
        }
        final int top = view.getTop();
        coordinatorLayout.k(view, s);
        this.u = coordinatorLayout.getWidth();
        this.v = coordinatorLayout.getHeight();
        final int height = view.getHeight();
        this.R = height;
        final int v = this.v;
        final int i = this.i;
        s = height;
        if (v - height < i) {
            if (this.J) {
                this.R = v;
                s = v;
            }
            else {
                s = v - i;
                this.R = s;
            }
        }
        this.k = Math.max(0, v - s);
        this.N();
        this.M();
        s = this.s;
        if (s == 3) {
            ik.y(view, this.w());
        }
        else if (s == 6) {
            ik.y(view, this.l);
        }
        else if (this.p && s == 5) {
            ik.y(view, this.v);
        }
        else if (s == 4) {
            ik.y(view, this.n);
        }
        else if (s == 1 || s == 2) {
            ik.y(view, top - view.getTop());
        }
        this.x = new WeakReference((T)this.x(view));
        return true;
    }
    
    @Override
    public final boolean e(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (this.s == 1 && actionMasked == 0) {
            return true;
        }
        final abq t = this.t;
        if (t != null) {
            t.e(motionEvent);
        }
        if (actionMasked == 0) {
            this.Q();
        }
        if (this.S == null) {
            this.S = VelocityTracker.obtain();
        }
        this.S.addMovement(motionEvent);
        if (this.t != null && actionMasked == 2 && !this.O) {
            final float abs = Math.abs(this.T - motionEvent.getY());
            final abq t2 = this.t;
            if (abs > t2.b) {
                t2.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.O;
    }
    
    @Override
    public final boolean i(final View view) {
        final WeakReference x = this.x;
        boolean b2;
        final boolean b = b2 = false;
        if (x != null) {
            b2 = b;
            if (view == x.get()) {
                b2 = b;
                if (this.s != 3) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Override
    public final void k(final View view, final View view2, final int p5, final int[] array, int n) {
        if (n == 1) {
            return;
        }
        final WeakReference x = this.x;
        View view3;
        if (x != null) {
            view3 = (View)x.get();
        }
        else {
            view3 = null;
        }
        if (view2 == view3) {
            final int top = view.getTop();
            final int n2 = top - p5;
            if (p5 > 0) {
                if (n2 < this.w()) {
                    n = top - this.w();
                    ik.y(view, -(array[1] = n));
                    this.F(3);
                }
                else {
                    if (!this.r) {
                        return;
                    }
                    ik.y(view, -(array[1] = p5));
                    this.F(1);
                }
            }
            else if (p5 < 0 && !view2.canScrollVertically(-1)) {
                n = this.n;
                if (n2 > n && !this.p) {
                    n = top - n;
                    ik.y(view, -(array[1] = n));
                    this.F(4);
                }
                else {
                    if (!this.r) {
                        return;
                    }
                    ik.y(view, -(array[1] = p5));
                    this.F(1);
                }
            }
            this.A(view.getTop());
            this.P = p5;
            this.Q = true;
        }
    }
    
    @Override
    public final void l(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3, final int[] array) {
    }
    
    @Override
    public final void n(final View view, final Parcelable parcelable) {
        final ndf ndf = (ndf)parcelable;
        final int b = this.B;
        if (b != 0) {
            if (b == -1 || (b & 0x1) == 0x1) {
                this.b = ndf.b;
            }
            if (b == -1 || (b & 0x2) == 0x2) {
                this.a = ndf.e;
            }
            if (b == -1 || (b & 0x4) == 0x4) {
                this.p = ndf.f;
            }
            if (b == -1 || (b & 0x8) == 0x8) {
                this.q = ndf.g;
            }
        }
        final int a = ndf.a;
        if (a != 1 && a != 2) {
            this.s = a;
            return;
        }
        this.s = 4;
    }
    
    @Override
    public final Parcelable o(final View view) {
        return (Parcelable)new ndf((Parcelable)View$BaseSavedState.EMPTY_STATE, this);
    }
    
    @Override
    public final boolean p(final View view, final int n, final int n2) {
        boolean b = false;
        this.P = 0;
        this.Q = false;
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final void q(final View view, final View view2, int n) {
        n = view.getTop();
        final int w = this.w();
        int n2 = 3;
        if (n == w) {
            this.F(3);
            return;
        }
        final WeakReference x = this.x;
        if (x != null && view2 == x.get() && this.Q) {
            Label_0381: {
                if (this.P > 0) {
                    if (this.a) {
                        n = this.k;
                    }
                    else {
                        final int top = view.getTop();
                        n = this.l;
                        if (top > n) {
                            n2 = 6;
                        }
                        else {
                            n = this.w();
                        }
                    }
                }
                else {
                    if (this.p) {
                        final VelocityTracker s = this.S;
                        float yVelocity;
                        if (s == null) {
                            yVelocity = 0.0f;
                        }
                        else {
                            s.computeCurrentVelocity(1000, this.C);
                            yVelocity = this.S.getYVelocity(this.z);
                        }
                        if (this.I(view, yVelocity)) {
                            n = this.v;
                            n2 = 5;
                            break Label_0381;
                        }
                    }
                    if (this.P == 0) {
                        final int top2 = view.getTop();
                        if (this.a) {
                            if (Math.abs(top2 - this.k) < Math.abs(top2 - this.n)) {
                                n = this.k;
                                break Label_0381;
                            }
                            n = this.n;
                            n2 = 4;
                            break Label_0381;
                        }
                        else {
                            n = this.l;
                            if (top2 < n) {
                                if (top2 < Math.abs(top2 - this.n)) {
                                    n = this.w();
                                    break Label_0381;
                                }
                                n = this.l;
                                n2 = 6;
                                break Label_0381;
                            }
                            else if (Math.abs(top2 - n) < Math.abs(top2 - this.n)) {
                                n = this.l;
                                n2 = 6;
                                break Label_0381;
                            }
                        }
                    }
                    else if (!this.a) {
                        n = view.getTop();
                        if (Math.abs(n - this.l) < Math.abs(n - this.n)) {
                            n = this.l;
                            n2 = 6;
                            break Label_0381;
                        }
                        n = this.n;
                        n2 = 4;
                        break Label_0381;
                    }
                    n = this.n;
                    n2 = 4;
                }
            }
            this.H(view, n2, n, false);
            this.Q = false;
        }
    }
    
    public final int w() {
        int n;
        if (this.a) {
            n = this.k;
        }
        else {
            final int j = this.j;
            int i;
            if (this.J) {
                i = 0;
            }
            else {
                i = this.i;
            }
            n = Math.max(j, i);
        }
        return n;
    }
    
    final View x(View x) {
        if (ik.V(x)) {
            return x;
        }
        if (x instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)x;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                x = this.x(viewGroup.getChildAt(i));
                if (x != null) {
                    return x;
                }
            }
        }
        return null;
    }
    
    public final void z(final ndd ndd) {
        if (!this.y.contains(ndd)) {
            this.y.add(ndd);
        }
    }
}
