// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.os.SystemClock;
import android.animation.LayoutTransition;
import android.graphics.PointF;
import android.view.View$MeasureSpec;
import android.view.Display;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.util.Log;
import android.os.Trace;
import android.view.accessibility.AccessibilityEvent;
import android.widget.OverScroller;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import android.os.Parcelable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.graphics.RectF;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityManager;
import android.graphics.Rect;
import java.util.List;
import android.widget.EdgeEffect;
import android.view.animation.Interpolator;
import android.view.ViewGroup;

public class RecyclerView extends ViewGroup implements hz
{
    private static final int[] Q;
    private static final Class[] R;
    public static final Interpolator a;
    static final sr b;
    public EdgeEffect A;
    public sa B;
    public int C;
    public sg D;
    public final int E;
    public final ss F;
    public qv G;
    public qt H;
    public final sq I;
    public boolean J;
    public boolean K;
    public boolean L;
    public sv M;
    public final int[] N;
    final List O;
    private final Rect S;
    private int T;
    private boolean U;
    private int V;
    private final AccessibilityManager W;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private VelocityTracker ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private final int aj;
    private float ak;
    private float al;
    private boolean am;
    private List an;
    private final int[] ao;
    private ia ap;
    private final int[] aq;
    private final int[] ar;
    private Runnable as;
    private boolean at;
    private int au;
    private int av;
    private sb aw;
    private final rt ax;
    private aai ay;
    private final aah az;
    public final sk c;
    sm d;
    public om e;
    public px f;
    public final ud g;
    boolean h;
    public final Rect i;
    public final RectF j;
    public rw k;
    public se l;
    public final List m;
    public final ArrayList n;
    public final ArrayList o;
    public sh p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public List v;
    public boolean w;
    public EdgeEffect x;
    public EdgeEffect y;
    public EdgeEffect z;
    
    static {
        Q = new int[] { 16843830 };
        R = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
        a = (Interpolator)new abn(1);
        b = new sr();
    }
    
    public RecyclerView(final Context context) {
        this(context, null);
    }
    
    public RecyclerView(final Context context, final AttributeSet set) {
        this(context, set, 2130969596);
    }
    
    public RecyclerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.az = new aah();
        this.c = new sk(this);
        this.g = new ud();
        new rs(this, 1);
        this.i = new Rect();
        this.S = new Rect();
        this.j = new RectF();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.T = 0;
        this.w = false;
        this.aa = 0;
        this.ab = 0;
        this.ay = RecyclerView.b;
        this.B = new sa(null);
        this.ac = 0;
        this.ad = -1;
        this.ak = Float.MIN_VALUE;
        this.al = Float.MIN_VALUE;
        this.am = true;
        this.F = new ss(this);
        this.H = new qt();
        this.I = new sq();
        this.J = false;
        this.K = false;
        this.aw = new sb(this);
        this.L = false;
        this.ao = new int[2];
        this.aq = new int[2];
        this.ar = new int[2];
        this.N = new int[2];
        this.O = new ArrayList();
        this.as = new rs(this);
        this.au = 0;
        this.av = 0;
        this.ax = new rt(this);
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.C = value.getScaledTouchSlop();
        this.ak = value.getScaledHorizontalScrollFactor();
        this.al = value.getScaledVerticalScrollFactor();
        this.E = value.getScaledMinimumFlingVelocity();
        this.aj = value.getScaledMaximumFlingVelocity();
        this.setWillNotDraw(this.getOverScrollMode() == 2);
        this.B.a = this.aw;
        this.e = new om(new rv(this));
        this.f = new px(new ru(this));
        if (ik.e((View)this) == 0) {
            ik.ab((View)this);
        }
        if (ik.d((View)this) == 0) {
            ik.K((View)this, 1);
        }
        this.W = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        ik.F((View)this, this.M = new sv(this));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lr.a, n, 0);
        ik.E((View)this, context, lr.a, set, obtainStyledAttributes, n, 0);
        final String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            this.setDescendantFocusability(262144);
        }
        this.h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            final StateListDrawable stateListDrawable = (StateListDrawable)obtainStyledAttributes.getDrawable(6);
            final Drawable drawable = obtainStyledAttributes.getDrawable(7);
            final StateListDrawable stateListDrawable2 = (StateListDrawable)obtainStyledAttributes.getDrawable(4);
            final Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Trying to set fast scroller without both required drawables.");
                sb.append(this.i());
                throw new IllegalArgumentException(sb.toString());
            }
            final Resources resources = this.getContext().getResources();
            new qq(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131165456), resources.getDimensionPixelSize(2131165458), resources.getDimensionPixelOffset(2131165457));
        }
        obtainStyledAttributes.recycle();
        this.ay(context, string, set, n);
        final int[] q = RecyclerView.Q;
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, q, n, 0);
        ik.E((View)this, context, q, set, obtainStyledAttributes2, n, 0);
        final boolean boolean1 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        this.setNestedScrollingEnabled(boolean1);
    }
    
    public static void C(final View view, final Rect rect) {
        final sf sf = (sf)view.getLayoutParams();
        final Rect d = sf.d;
        rect.set(view.getLeft() - d.left - sf.leftMargin, view.getTop() - d.top - sf.topMargin, view.getRight() + d.right + sf.rightMargin, view.getBottom() + d.bottom + sf.bottomMargin);
    }
    
    private final int a(int round, float f) {
        final float n = f / this.getHeight();
        final float n2 = round / (float)this.getWidth();
        final EdgeEffect x = this.x;
        f = 0.0f;
        if (x != null && aag.e(x) != 0.0f) {
            final float n3 = f = -aag.f(this.x, -n2, 1.0f - n);
            if (aag.e(this.x) == 0.0f) {
                this.x.onRelease();
                f = n3;
            }
        }
        else {
            final EdgeEffect z = this.z;
            if (z != null && aag.e(z) != 0.0f) {
                final float n4 = f = aag.f(this.z, n2, n);
                if (aag.e(this.z) == 0.0f) {
                    this.z.onRelease();
                    f = n4;
                }
            }
        }
        round = Math.round(f * this.getWidth());
        if (round != 0) {
            this.invalidate();
        }
        return round;
    }
    
    static final long ae(final st st) {
        return st.c;
    }
    
    private final int al(int round, float f) {
        final float n = f / this.getWidth();
        final float n2 = round / (float)this.getHeight();
        final EdgeEffect y = this.y;
        f = 0.0f;
        if (y != null && aag.e(y) != 0.0f) {
            final float n3 = f = -aag.f(this.y, -n2, n);
            if (aag.e(this.y) == 0.0f) {
                this.y.onRelease();
                f = n3;
            }
        }
        else {
            final EdgeEffect a = this.A;
            if (a != null && aag.e(a) != 0.0f) {
                final float n4 = f = aag.f(this.A, n2, 1.0f - n);
                if (aag.e(this.A) == 0.0f) {
                    this.A.onRelease();
                    f = n4;
                }
            }
        }
        round = Math.round(f * this.getHeight());
        if (round != 0) {
            this.invalidate();
        }
        return round;
    }
    
    private final ia am() {
        if (this.ap == null) {
            this.ap = new ia((View)this);
        }
        return this.ap;
    }
    
    private final void an() {
        this.au();
        this.R(0);
    }
    
    private final void ao() {
        final sq i = this.I;
        final boolean b = true;
        i.b(1);
        this.B(this.I);
        this.I.i = false;
        this.U();
        this.g.f();
        this.H();
        if (this.w) {
            this.e.i();
        }
        if (this.ax()) {
            final om e = this.e;
            final ArrayList a = e.a;
            for (int j = a.size() - 1; j >= 0; --j) {
                final int a2 = ((ol)a.get(j)).a;
            }
            for (int size = e.a.size(), k = 0; k < size; ++k) {
                ol ol2;
                ol ol = ol2 = e.a.get(k);
                Label_0619: {
                    switch (ol.a) {
                        default: {
                            continue;
                        }
                        case 4: {
                            final int b2 = ol.b;
                            final int d = ol.d;
                            int n = b2;
                            int n2 = 0;
                            int n3 = -1;
                            int n8;
                            for (int l = b2; l < d + b2; ++l, n3 = n8) {
                                int n7;
                                if (e.c.a(l) == null && !e.j(l)) {
                                    int n4 = n;
                                    int n5 = n2;
                                    if (n3 == 1) {
                                        final Object c = ol.c;
                                        e.f(e.l(4, n, n2));
                                        n4 = l;
                                        n5 = 0;
                                    }
                                    final int n6 = 0;
                                    n = n4;
                                    n7 = n5;
                                    n8 = n6;
                                }
                                else {
                                    int n9 = n;
                                    n7 = n2;
                                    if (n3 == 0) {
                                        final Object c2 = ol.c;
                                        e.d(e.l(4, n, n2));
                                        n9 = l;
                                        n7 = 0;
                                    }
                                    n8 = 1;
                                    n = n9;
                                }
                                n2 = n7 + 1;
                            }
                            if (n2 != ol.d) {
                                final Object c3 = ol.c;
                                e.g(ol);
                                ol = e.l(4, n, n2);
                            }
                            ol2 = ol;
                            if (n3 == 0) {
                                break;
                            }
                            break Label_0619;
                        }
                        case 2: {
                            final int b3 = ol.b;
                            int n10 = ol.d + b3;
                            int n11 = b3;
                            int n12 = 0;
                            int n13 = -1;
                            while (n11 < n10) {
                                boolean b5;
                                if (e.c.a(n11) == null && !e.j(n11)) {
                                    boolean b4;
                                    if (n13 == 1) {
                                        e.f(e.l(2, b3, n12));
                                        b4 = true;
                                    }
                                    else {
                                        b4 = false;
                                    }
                                    final int n14 = 0;
                                    b5 = b4;
                                    n13 = n14;
                                }
                                else {
                                    if (n13 == 0) {
                                        e.d(e.l(2, b3, n12));
                                        b5 = true;
                                    }
                                    else {
                                        b5 = false;
                                    }
                                    n13 = 1;
                                }
                                int n15;
                                if (b5) {
                                    n11 -= n12;
                                    n10 -= n12;
                                    n15 = 1;
                                }
                                else {
                                    n15 = n12 + 1;
                                }
                                ++n11;
                                n12 = n15;
                            }
                            if (n12 != ol.d) {
                                e.g(ol);
                                ol = e.l(2, b3, n12);
                            }
                            ol2 = ol;
                            if (n13 == 0) {
                                break;
                            }
                            break Label_0619;
                        }
                        case 1: {
                            e.f(ol2);
                            continue;
                        }
                    }
                }
                e.d(ol);
            }
            e.a.clear();
        }
        else {
            this.e.c();
        }
        final boolean b6 = this.J || this.K;
        final sq m = this.I;
        boolean j2 = false;
        Label_0742: {
            if (this.s && this.B != null) {
                final boolean w = this.w;
                if (w || b6 || this.l.u) {
                    j2 = !w;
                    break Label_0742;
                }
            }
            j2 = false;
        }
        m.j = j2;
        m.k = (j2 && b6 && !this.w && this.ax());
        final boolean am = this.am;
        final st st = null;
        View focusedChild;
        if (am && this.hasFocus() && this.k != null) {
            focusedChild = this.getFocusedChild();
        }
        else {
            focusedChild = null;
        }
        st e2;
        if (focusedChild == null) {
            e2 = st;
        }
        else {
            final View h = this.h(focusedChild);
            if (h == null) {
                e2 = st;
            }
            else {
                e2 = this.e(h);
            }
        }
        if (e2 == null) {
            this.at();
        }
        else {
            final sq i2 = this.I;
            i2.m = -1L;
            int l2;
            if (this.w) {
                l2 = -1;
            }
            else if (e2.t()) {
                l2 = e2.d;
            }
            else {
                l2 = e2.a();
            }
            i2.l = l2;
            final sq i3 = this.I;
            View view = e2.a;
            int n16 = view.getId();
            while (!view.isFocused() && view instanceof ViewGroup && view.hasFocus()) {
                final View view2 = view = ((ViewGroup)view).getFocusedChild();
                if (view2.getId() != -1) {
                    n16 = view2.getId();
                    view = view2;
                }
            }
            i3.n = n16;
        }
        final sq i4 = this.I;
        i4.h = (i4.j && this.K && b);
        this.K = false;
        this.J = false;
        i4.g = i4.k;
        i4.e = this.k.a();
        this.aq(this.ao);
        if (this.I.j) {
            for (int a3 = this.f.a(), n17 = 0; n17 < a3; ++n17) {
                final st f = f(this.f.e(n17));
                if (!f.y()) {
                    if (!f.r()) {
                        sa.d(f);
                        f.c();
                        this.g.e(f, sa.e(f));
                        if (this.I.h && f.w() && !f.t() && !f.y() && !f.r()) {
                            this.g.c(ae(f), f);
                        }
                    }
                }
            }
        }
        if (this.I.k) {
            for (int c4 = this.f.c(), n18 = 0; n18 < c4; ++n18) {
                final st f2 = f(this.f.f(n18));
                if (!f2.y() && f2.d == -1) {
                    f2.d = f2.c;
                }
            }
            final sq i5 = this.I;
            final boolean f3 = i5.f;
            i5.f = false;
            this.l.n(this.c, i5);
            this.I.f = f3;
            for (int n19 = 0; n19 < this.f.a(); ++n19) {
                final st f4 = f(this.f.e(n19));
                if (!f4.y()) {
                    final uc uc = (uc)this.g.a.get(f4);
                    if (uc == null || (uc.b & 0x4) == 0x0) {
                        sa.d(f4);
                        final boolean o = f4.o(8192);
                        f4.c();
                        final rz e3 = sa.e(f4);
                        if (o) {
                            this.L(f4, e3);
                        }
                        else {
                            final ud g = this.g;
                            uc a4 = (uc)g.a.get(f4);
                            if (a4 == null) {
                                a4 = uc.a();
                                g.a.put(f4, a4);
                            }
                            a4.b |= 0x2;
                            a4.c = e3;
                        }
                    }
                }
            }
            this.p();
        }
        else {
            this.p();
        }
        this.I();
        this.V(false);
        this.I.d = 2;
    }
    
    private final void ap() {
        this.U();
        this.H();
        this.I.b(6);
        this.e.c();
        this.I.e = this.k.a();
        this.I.c = 0;
        final sm d = this.d;
        if (d != null) {
            final int a = this.k.a;
            final Parcelable a2 = d.a;
            if (a2 != null) {
                this.l.P(a2);
            }
            this.d = null;
        }
        final sq i = this.I;
        i.g = false;
        this.l.n(this.c, i);
        final sq j = this.I;
        j.f = false;
        j.j = (j.j && this.B != null);
        j.d = 4;
        this.I();
        this.V(false);
    }
    
    private final void aq(final int[] array) {
        final int a = this.f.a();
        if (a != 0) {
            int n = Integer.MAX_VALUE;
            int n2 = Integer.MIN_VALUE;
            int n3;
            for (int i = 0; i < a; ++i, n = n3) {
                final st f = f(this.f.e(i));
                if (f.y()) {
                    n3 = n;
                }
                else {
                    final int b = f.b();
                    if (b < (n3 = n)) {
                        n3 = b;
                    }
                    if (b > n2) {
                        n2 = b;
                    }
                }
            }
            array[0] = n;
            array[1] = n2;
            return;
        }
        array[1] = (array[0] = -1);
    }
    
    private final void ar(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ad) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.ad = motionEvent.getPointerId(n);
            final int n2 = (int)(motionEvent.getX(n) + 0.5f);
            this.ah = n2;
            this.af = n2;
            final int n3 = (int)(motionEvent.getY(n) + 0.5f);
            this.ai = n3;
            this.ag = n3;
        }
    }
    
    private final void as(final View view, View view2) {
        View view3;
        if (view2 != null) {
            view3 = view2;
        }
        else {
            view3 = view;
        }
        this.i.set(0, 0, view3.getWidth(), view3.getHeight());
        final ViewGroup$LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof sf) {
            final sf sf = (sf)layoutParams;
            if (!sf.e) {
                final Rect d = sf.d;
                final Rect i = this.i;
                i.left -= d.left;
                final Rect j = this.i;
                j.right += d.right;
                final Rect k = this.i;
                k.top -= d.top;
                final Rect l = this.i;
                l.bottom += d.bottom;
            }
        }
        if (view2 != null) {
            this.offsetDescendantRectToMyCoords(view2, this.i);
            this.offsetRectIntoDescendantCoords(view, this.i);
        }
        else {
            view2 = null;
        }
        this.l.aW(this, view, this.i, this.s ^ true, view2 == null);
    }
    
    private final void at() {
        final sq i = this.I;
        i.m = -1L;
        i.l = -1;
        i.n = -1;
    }
    
    private final void au() {
        final VelocityTracker ae = this.ae;
        if (ae != null) {
            ae.clear();
        }
        int finished = 0;
        this.W(0);
        final EdgeEffect x = this.x;
        if (x != null) {
            x.onRelease();
            finished = (this.x.isFinished() ? 1 : 0);
        }
        final EdgeEffect y = this.y;
        int n = finished;
        if (y != null) {
            y.onRelease();
            n = (finished | (this.y.isFinished() ? 1 : 0));
        }
        final EdgeEffect z = this.z;
        int n2 = n;
        if (z != null) {
            z.onRelease();
            n2 = (n | (this.z.isFinished() ? 1 : 0));
        }
        final EdgeEffect a = this.A;
        int n3 = n2;
        if (a != null) {
            a.onRelease();
            n3 = (n2 | (this.A.isFinished() ? 1 : 0));
        }
        if (n3 != 0) {
            ik.z((View)this);
        }
    }
    
    private final void av() {
        this.F.c();
        final se l = this.l;
        if (l != null) {
            final sp t = l.t;
            if (t != null) {
                t.f();
            }
        }
    }
    
    private final boolean aw(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        for (int size = this.o.size(), i = 0; i < size; ++i) {
            final sh p = this.o.get(i);
            if (p.g(motionEvent) && action != 3) {
                this.p = p;
                return true;
            }
        }
        return false;
    }
    
    private final boolean ax() {
        return this.B != null && this.l.s();
    }
    
    private final void ay(Context ex, String s, final AttributeSet set, final int n) {
        if (s != null) {
            final String trim = s.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(((Context)ex).getPackageName());
                    sb.append(trim);
                    s = sb.toString();
                }
                else {
                    s = trim;
                    if (!trim.contains(".")) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(RecyclerView.class.getPackage().getName());
                        sb2.append('.');
                        sb2.append(trim);
                        s = sb2.toString();
                    }
                }
                try {
                    ClassLoader classLoader;
                    if (this.isInEditMode()) {
                        classLoader = this.getClass().getClassLoader();
                    }
                    else {
                        classLoader = ((Context)ex).getClassLoader();
                    }
                    final Class<? extends se> subclass = Class.forName(s, false, classLoader).asSubclass(se.class);
                    try {
                        final Constructor<? extends se> constructor = subclass.getConstructor((Class<?>[])RecyclerView.R);
                        ex = (NoSuchMethodException)new Object[] { ex, set, n, 0 };
                    }
                    catch (final NoSuchMethodException ex) {
                        try {
                            final Constructor<? extends se> constructor = subclass.getConstructor((Class<?>[])new Class[0]);
                            ex = null;
                            constructor.setAccessible(true);
                            this.Q((se)constructor.newInstance((Object[])(Object)ex));
                        }
                        catch (final NoSuchMethodException ex2) {
                            ex2.initCause(ex);
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append(set.getPositionDescription());
                            sb3.append(": Error creating LayoutManager ");
                            sb3.append(s);
                            throw new IllegalStateException(sb3.toString(), ex2);
                        }
                    }
                }
                catch (final ClassCastException ex3) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(set.getPositionDescription());
                    sb4.append(": Class is not a LayoutManager ");
                    sb4.append(s);
                    throw new IllegalStateException(sb4.toString(), ex3);
                }
                catch (final IllegalAccessException ex4) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append(set.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(s);
                    throw new IllegalStateException(sb5.toString(), ex4);
                }
                catch (final InstantiationException ex5) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(set.getPositionDescription());
                    sb6.append(": Could not instantiate the LayoutManager: ");
                    sb6.append(s);
                    throw new IllegalStateException(sb6.toString(), ex5);
                }
                catch (final InvocationTargetException ex6) {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append(set.getPositionDescription());
                    sb7.append(": Could not instantiate the LayoutManager: ");
                    sb7.append(s);
                    throw new IllegalStateException(sb7.toString(), ex6);
                }
                catch (final ClassNotFoundException ex7) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append(set.getPositionDescription());
                    sb8.append(": Unable to find LayoutManager ");
                    sb8.append(s);
                    throw new IllegalStateException(sb8.toString(), ex7);
                }
            }
        }
    }
    
    public static st f(final View view) {
        if (view == null) {
            return null;
        }
        return ((sf)view.getLayoutParams()).c;
    }
    
    public static RecyclerView g(final View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView)view;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final RecyclerView g = g(viewGroup.getChildAt(i));
            if (g != null) {
                return g;
            }
        }
        return null;
    }
    
    public static void o(final st st) {
        final WeakReference b = st.b;
        if (b != null) {
            View view = (View)b.get();
            while (view != null) {
                if (view == st.a) {
                    return;
                }
                final ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View)parent;
                }
                else {
                    view = null;
                }
            }
            st.b = null;
        }
    }
    
    public final void A() {
        if (this.y != null) {
            return;
        }
        final EdgeEffect a = this.ay.a(this);
        this.y = a;
        if (this.h) {
            a.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        a.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    final void B(final sq sq) {
        if (this.ac == 2) {
            final OverScroller c = this.F.c;
            sq.o = c.getFinalX() - c.getCurrX();
            sq.p = c.getFinalY() - c.getCurrY();
            return;
        }
        sq.o = 0;
        sq.p = 0;
    }
    
    final void D() {
        this.A = null;
        this.y = null;
        this.z = null;
        this.x = null;
    }
    
    public final void E(final int n) {
        if (this.l == null) {
            return;
        }
        this.R(2);
        this.l.Q(n);
        this.awakenScrollBars();
    }
    
    public final void F() {
        final int c = this.f.c();
        final int n = 0;
        for (int i = 0; i < c; ++i) {
            ((sf)this.f.f(i).getLayoutParams()).e = true;
        }
        final sk c2 = this.c;
        for (int size = c2.c.size(), j = n; j < size; ++j) {
            final sf sf = (sf)c2.c.get(j).a.getLayoutParams();
            if (sf != null) {
                sf.e = true;
            }
        }
    }
    
    public final void G(final int n, final int n2, final boolean b) {
        final int n3 = n + n2;
        for (int c = this.f.c(), i = 0; i < c; ++i) {
            final st f = f(this.f.f(i));
            if (f != null && !f.y()) {
                final int c2 = f.c;
                if (c2 >= n3) {
                    f.i(-n2, b);
                    this.I.f = true;
                }
                else if (c2 >= n) {
                    f.d(8);
                    f.i(-n2, b);
                    f.c = n - 1;
                    this.I.f = true;
                }
            }
        }
        final sk c3 = this.c;
        for (int j = c3.c.size() - 1; j >= 0; --j) {
            final st st = c3.c.get(j);
            if (st != null) {
                final int c4 = st.c;
                if (c4 >= n3) {
                    st.i(-n2, b);
                }
                else if (c4 >= n) {
                    st.d(8);
                    c3.g(j);
                }
            }
        }
        this.requestLayout();
    }
    
    public final void H() {
        ++this.aa;
    }
    
    final void I() {
        this.J(true);
    }
    
    public final void J(final boolean b) {
        final int aa = this.aa - 1;
        this.aa = aa;
        if (aa <= 0) {
            this.aa = 0;
            if (b) {
                final int v = this.V;
                this.V = 0;
                if (v != 0 && this.ab()) {
                    final AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(v);
                    this.sendAccessibilityEventUnchecked(obtain);
                }
                for (int i = this.O.size() - 1; i >= 0; --i) {
                    final st st = this.O.get(i);
                    if (st.a.getParent() == this) {
                        if (!st.y()) {
                            final int n = st.n;
                            if (n != -1) {
                                ik.K(st.a, n);
                                st.n = -1;
                            }
                        }
                    }
                }
                this.O.clear();
            }
        }
    }
    
    public final void K() {
        if (!this.L && this.q) {
            ik.A((View)this, this.as);
            this.L = true;
        }
    }
    
    public final void L(final st st, final rz rz) {
        st.k(0, 8192);
        if (this.I.h && st.w() && !st.t() && !st.y()) {
            this.g.c(ae(st), st);
        }
        this.g.e(st, rz);
    }
    
    public final void M() {
        final sa b = this.B;
        if (b != null) {
            b.i();
        }
        final se l = this.l;
        if (l != null) {
            l.aH(this.c);
            this.l.aI(this.c);
        }
        this.c.e();
    }
    
    public final void N(int d, int e, final int[] array) {
        this.U();
        this.H();
        Trace.beginSection("RV Scroll");
        this.B(this.I);
        if (d != 0) {
            d = this.l.d(d, this.c, this.I);
        }
        else {
            d = 0;
        }
        if (e != 0) {
            e = this.l.e(e, this.c, this.I);
        }
        else {
            e = 0;
        }
        Trace.endSection();
        for (int a = this.f.a(), i = 0; i < a; ++i) {
            final View e2 = this.f.e(i);
            final st e3 = this.e(e2);
            if (e3 != null) {
                final st j = e3.i;
                if (j != null) {
                    final View a2 = j.a;
                    final int left = e2.getLeft();
                    final int top = e2.getTop();
                    if (left != a2.getLeft() || top != a2.getTop()) {
                        a2.layout(left, top, a2.getWidth() + left, a2.getHeight() + top);
                    }
                }
            }
        }
        this.I();
        this.V(false);
        if (array != null) {
            array[0] = d;
            array[1] = e;
        }
    }
    
    public final void O(final int n) {
        if (this.u) {
            return;
        }
        this.X();
        final se l = this.l;
        if (l == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        l.Q(n);
        this.awakenScrollBars();
    }
    
    public final void P(rw k) {
        final int n = 0;
        this.suppressLayout(false);
        final rw i = this.k;
        if (i != null) {
            i.f(this.az);
        }
        this.M();
        this.e.i();
        final rw j = this.k;
        (this.k = k).e(this.az);
        final se l = this.l;
        if (l != null) {
            l.bi();
        }
        final sk c = this.c;
        k = this.k;
        c.e();
        final sj b = c.b();
        if (j != null) {
            --b.b;
        }
        if (b.b == 0) {
            for (int n2 = 0; n2 < b.a.size(); ++n2) {
                ((si)b.a.valueAt(n2)).a.clear();
            }
        }
        if (k != null) {
            ++b.b;
        }
        this.I.f = true;
        this.w = true;
        for (int c2 = this.f.c(), n3 = 0; n3 < c2; ++n3) {
            final st f = f(this.f.f(n3));
            if (f != null && !f.y()) {
                f.d(6);
            }
        }
        this.F();
        final sk c3 = this.c;
        for (int size = c3.c.size(), n4 = n; n4 < size; ++n4) {
            final st st = c3.c.get(n4);
            if (st != null) {
                st.d(6);
                st.A();
            }
        }
        final RecyclerView g = c3.g;
        c3.f();
        this.requestLayout();
    }
    
    public final void Q(final se l) {
        if (l == this.l) {
            return;
        }
        this.X();
        if (this.l != null) {
            final sa b = this.B;
            if (b != null) {
                b.i();
            }
            this.l.aH(this.c);
            this.l.aI(this.c);
            this.c.e();
            if (this.q) {
                this.l.bl(this);
            }
            this.l.aR(null);
            this.l = null;
        }
        else {
            this.c.e();
        }
        final px f = this.f;
        f.a.d();
        for (int i = f.b.size() - 1; i >= 0; --i) {
            f.c.d((View)f.b.get(i));
            f.b.remove(i);
        }
        final ru c = f.c;
        for (int a = c.a(), j = 0; j < a; ++j) {
            final View c2 = c.c(j);
            c.a.t(c2);
            c2.clearAnimation();
        }
        c.a.removeAllViews();
        if ((this.l = l) != null) {
            if (l.q != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(l);
                sb.append(" is already attached to a RecyclerView:");
                sb.append(l.q.i());
                throw new IllegalArgumentException(sb.toString());
            }
            this.l.aR(this);
            if (this.q) {
                this.l.aY();
            }
        }
        this.c.l();
        this.requestLayout();
    }
    
    public final void R(final int ac) {
        if (ac == this.ac) {
            return;
        }
        if ((this.ac = ac) != 2) {
            this.av();
        }
        final se l = this.l;
        if (l != null) {
            l.aG(ac);
        }
        final List an = this.an;
        if (an != null) {
            for (int i = an.size() - 1; i >= 0; --i) {
                ((aak)this.an.get(i)).b(ac);
            }
        }
    }
    
    public final void S(final int n, final int n2) {
        this.ag(n, n2, false);
    }
    
    public final void T(final int n) {
        if (this.u) {
            return;
        }
        final se l = this.l;
        if (l == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        l.af(this, n);
    }
    
    public final void U() {
        final int t = this.T + 1;
        this.T = t;
        if (t == 1 && !this.u) {
            this.t = false;
        }
    }
    
    public final void V(final boolean b) {
        int t;
        if ((t = this.T) <= 0) {
            this.T = 1;
            t = 1;
        }
        if (!b && !this.u) {
            this.t = false;
        }
        if (t == 1) {
            if (b && this.t && !this.u && this.l != null && this.k != null) {
                this.u();
            }
            if (!this.u) {
                this.t = false;
            }
        }
        --this.T;
    }
    
    public final void W(final int n) {
        this.am().b(n);
    }
    
    public final void X() {
        this.R(0);
        this.av();
    }
    
    public final boolean Z(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.am().e(n, n2, array, array2, n3);
    }
    
    public final boolean aa() {
        return !this.s || this.w || this.e.k();
    }
    
    public final boolean ab() {
        final AccessibilityManager w = this.W;
        return w != null && w.isEnabled();
    }
    
    public final boolean ac() {
        return this.aa > 0;
    }
    
    final boolean ad(final int n, final int n2, final MotionEvent motionEvent, int n3) {
        this.r();
        int n8;
        int n9;
        int n10;
        int n11;
        if (this.k != null) {
            final int[] n4 = this.N;
            n4[1] = (n4[0] = 0);
            this.N(n, n2, n4);
            final int[] n5 = this.N;
            final int n6 = n5[0];
            final int n7 = n8 = n5[1];
            n9 = n6;
            n10 = n - n6;
            n11 = n2 - n7;
        }
        else {
            n8 = 0;
            n9 = 0;
            n10 = 0;
            n11 = 0;
        }
        if (!this.n.isEmpty()) {
            this.invalidate();
        }
        final int[] n12 = this.N;
        n12[1] = (n12[0] = 0);
        this.v(n9, n8, n10, n11, this.aq, n3, n12);
        final int[] n13 = this.N;
        final int n14 = n13[0];
        final int n15 = n13[1];
        if (n14 == 0) {
            if (n15 != 0) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
        }
        else {
            n3 = 1;
        }
        final int ah = this.ah;
        final int[] aq = this.aq;
        final int n16 = aq[0];
        this.ah = ah - n16;
        this.ai -= aq[1];
        final int[] ar = this.ar;
        ar[0] += n16;
        ar[1] += aq[1];
        if (this.getOverScrollMode() != 2) {
            Label_0498: {
                if (motionEvent != null) {
                    if ((motionEvent.getSource() & 0x2002) != 0x2002) {
                        final float x = motionEvent.getX();
                        final float n17 = (float)(n10 - n14);
                        final float y = motionEvent.getY();
                        final float n18 = (float)(n11 - n15);
                        boolean b;
                        if (n17 < 0.0f) {
                            this.y();
                            aag.f(this.x, -n17 / this.getWidth(), 1.0f - y / this.getHeight());
                            b = true;
                        }
                        else if (n17 > 0.0f) {
                            this.z();
                            aag.f(this.z, n17 / this.getWidth(), y / this.getHeight());
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        if (n18 < 0.0f) {
                            this.A();
                            aag.f(this.y, -n18 / this.getHeight(), x / this.getWidth());
                        }
                        else if (n18 > 0.0f) {
                            this.x();
                            aag.f(this.A, n18 / this.getHeight(), 1.0f - x / this.getWidth());
                        }
                        else if (!b && n17 == 0.0f && n18 == 0.0f) {
                            break Label_0498;
                        }
                        ik.z((View)this);
                    }
                }
            }
            this.q(n, n2);
        }
        Label_0537: {
            if (n9 == 0) {
                if (n8 == 0) {
                    n8 = 0;
                    n9 = 0;
                    break Label_0537;
                }
                n9 = 0;
            }
            this.w(n9, n8);
        }
        if (!this.awakenScrollBars()) {
            this.invalidate();
        }
        return n3 != 0 || n9 != 0 || n8 != 0;
    }
    
    public final void af(final st st, final int n) {
        if (this.ac()) {
            st.n = n;
            this.O.add(st);
            return;
        }
        ik.K(st.a, n);
    }
    
    public final void ag(int n, int n2, final boolean b) {
        final se l = this.l;
        if (l == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.u) {
            return;
        }
        final boolean t = l.T();
        final int n3 = 0;
        if (!t) {
            n = 0;
        }
        if (!this.l.U()) {
            n2 = 0;
        }
        int n4;
        if ((n4 = n) == 0) {
            if (n2 == 0) {
                return;
            }
            n4 = 0;
        }
        if (b) {
            if (n4 != 0) {
                n = 1;
            }
            else {
                n = n3;
            }
            int n5 = n;
            if (n2 != 0) {
                n5 = (n | 0x2);
            }
            this.ah(n5, 1);
        }
        this.F.b(n4, n2, Integer.MIN_VALUE, null);
    }
    
    public final void ah(final int n, final int n2) {
        this.am().i(n, n2);
    }
    
    public final void ai(final aaj aaj) {
        final se l = this.l;
        if (l != null) {
            l.L("Cannot add item decoration during a scroll  or layout");
        }
        if (this.n.isEmpty()) {
            this.setWillNotDraw(false);
        }
        this.n.add(aaj);
        this.F();
        this.requestLayout();
    }
    
    public final void aj(final aak aak) {
        if (this.an == null) {
            this.an = new ArrayList();
        }
        this.an.add(aak);
    }
    
    public final void ak(final aak aak) {
        final List an = this.an;
        if (an != null) {
            an.remove(aak);
        }
    }
    
    public final int b(final st st) {
        final boolean o = st.o(524);
        final int n = -1;
        if (!o && st.q()) {
            final om e = this.e;
            int c = st.c;
            int n2 = 0;
        Label_0184:
            for (int size = e.a.size(), i = 0; i < size; ++i, c = n2) {
                final ol ol = e.a.get(i);
                switch (ol.a) {
                    default: {
                        n2 = c;
                        break;
                    }
                    case 2: {
                        final int b = ol.b;
                        n2 = c;
                        if (b > c) {
                            break;
                        }
                        final int d = ol.d;
                        if (b + d > c) {
                            c = n;
                            break Label_0184;
                        }
                        n2 = c - d;
                        break;
                    }
                    case 1: {
                        n2 = c;
                        if (ol.b <= c) {
                            n2 = c + ol.d;
                            break;
                        }
                        break;
                    }
                }
            }
            return c;
        }
        return -1;
    }
    
    public final Rect c(final View view) {
        final sf sf = (sf)view.getLayoutParams();
        if (!sf.e) {
            return sf.d;
        }
        if (this.I.g && (sf.b() || sf.c.r())) {
            return sf.d;
        }
        final Rect d = sf.d;
        d.set(0, 0, 0, 0);
        for (int size = this.n.size(), i = 0; i < size; ++i) {
            this.i.set(0, 0, 0, 0);
            ((aaj)this.n.get(i)).o(this.i, view, this);
            d.left += this.i.left;
            d.top += this.i.top;
            d.right += this.i.right;
            d.bottom += this.i.bottom;
        }
        sf.e = false;
        return d;
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof sf && this.l.r((sf)viewGroup$LayoutParams);
    }
    
    public final int computeHorizontalScrollExtent() {
        final se l = this.l;
        if (l == null) {
            return 0;
        }
        if (l.T()) {
            return this.l.x(this.I);
        }
        return 0;
    }
    
    public final int computeHorizontalScrollOffset() {
        final se l = this.l;
        if (l == null) {
            return 0;
        }
        if (l.T()) {
            return this.l.y(this.I);
        }
        return 0;
    }
    
    public final int computeHorizontalScrollRange() {
        final se l = this.l;
        if (l == null) {
            return 0;
        }
        if (l.T()) {
            return this.l.z(this.I);
        }
        return 0;
    }
    
    public final int computeVerticalScrollExtent() {
        final se l = this.l;
        if (l == null) {
            return 0;
        }
        if (l.U()) {
            return this.l.A(this.I);
        }
        return 0;
    }
    
    public final int computeVerticalScrollOffset() {
        final se l = this.l;
        if (l == null) {
            return 0;
        }
        if (l.U()) {
            return this.l.B(this.I);
        }
        return 0;
    }
    
    public final int computeVerticalScrollRange() {
        final se l = this.l;
        if (l == null) {
            return 0;
        }
        if (l.U()) {
            return this.l.C(this.I);
        }
        return 0;
    }
    
    public final st d(final int n) {
        final boolean w = this.w;
        st st = null;
        if (w) {
            return null;
        }
        st st2;
        for (int c = this.f.c(), i = 0; i < c; ++i, st = st2) {
            final st f = f(this.f.f(i));
            st2 = st;
            if (f != null) {
                st2 = st;
                if (!f.t()) {
                    st2 = st;
                    if (this.b(f) == n) {
                        if (!this.f.k(f.a)) {
                            return f;
                        }
                        st2 = f;
                    }
                }
            }
        }
        return st;
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.am().c(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.am().d(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.am().e(n, n2, array, array2, 0);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.am().f(n, n2, n3, n4, array);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        this.onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }
    
    protected final void dispatchRestoreInstanceState(final SparseArray sparseArray) {
        this.dispatchThawSelfOnly(sparseArray);
    }
    
    protected final void dispatchSaveInstanceState(final SparseArray sparseArray) {
        this.dispatchFreezeSelfOnly(sparseArray);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final int size = this.n.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            ((aaj)this.n.get(i)).f(canvas);
        }
        final EdgeEffect x = this.x;
        int n2;
        if (x != null && !x.isFinished()) {
            final int save = canvas.save();
            int paddingBottom;
            if (this.h) {
                paddingBottom = this.getPaddingBottom();
            }
            else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float)(-this.getHeight() + paddingBottom), 0.0f);
            final EdgeEffect x2 = this.x;
            n2 = ((x2 != null && x2.draw(canvas)) ? 1 : 0);
            canvas.restoreToCount(save);
        }
        else {
            n2 = 0;
        }
        final EdgeEffect y = this.y;
        int n3 = n2;
        if (y != null) {
            n3 = n2;
            if (!y.isFinished()) {
                final int save2 = canvas.save();
                if (this.h) {
                    canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
                }
                final EdgeEffect y2 = this.y;
                n3 = (n2 | ((y2 != null && y2.draw(canvas)) ? 1 : 0));
                canvas.restoreToCount(save2);
            }
        }
        final EdgeEffect z = this.z;
        int n4 = n3;
        if (z != null) {
            n4 = n3;
            if (!z.isFinished()) {
                final int save3 = canvas.save();
                final int width = this.getWidth();
                int paddingTop;
                if (this.h) {
                    paddingTop = this.getPaddingTop();
                }
                else {
                    paddingTop = 0;
                }
                canvas.rotate(90.0f);
                canvas.translate((float)paddingTop, (float)(-width));
                final EdgeEffect z2 = this.z;
                boolean b;
                if (z2 != null && z2.draw(canvas)) {
                    b = true;
                }
                else {
                    b = false;
                }
                n4 = (n3 | (b ? 1 : 0));
                canvas.restoreToCount(save3);
            }
        }
        final EdgeEffect a = this.A;
        if (a != null && !a.isFinished()) {
            final int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate((float)(-this.getWidth() + this.getPaddingRight()), (float)(-this.getHeight() + this.getPaddingBottom()));
            }
            else {
                canvas.translate((float)(-this.getWidth()), (float)(-this.getHeight()));
            }
            final EdgeEffect a2 = this.A;
            int n5;
            if (a2 != null && a2.draw(canvas)) {
                n5 = 1;
            }
            else {
                n5 = n;
            }
            n4 |= n5;
            canvas.restoreToCount(save4);
        }
        if (n4 == 0 && (this.B == null || this.n.size() <= 0 || !this.B.l())) {
            return;
        }
        ik.z((View)this);
    }
    
    public final boolean drawChild(final Canvas canvas, final View view, final long n) {
        return super.drawChild(canvas, view, n);
    }
    
    public final st e(final View view) {
        final ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            final StringBuilder sb = new StringBuilder();
            sb.append("View ");
            sb.append(view);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        return f(view);
    }
    
    public final View focusSearch(final View view, int ak) {
        final rw k = this.k;
        final boolean b = true;
        final boolean b2 = k != null && (this.l != null && !this.ac() && !this.u);
        final FocusFinder instance = FocusFinder.getInstance();
        View view2 = null;
        int n2 = 0;
        Label_0304: {
            Label_0237: {
                if (b2) {
                    int n;
                    if ((n = ak) != 2) {
                        if (ak != 1) {
                            break Label_0237;
                        }
                        n = 1;
                    }
                    Label_0221: {
                        Label_0179: {
                            if (this.l.U()) {
                                if (n == 2) {
                                    ak = 130;
                                }
                                else {
                                    ak = 33;
                                }
                                if (instance.findNextFocus((ViewGroup)this, view, ak) == null) {
                                    break Label_0179;
                                }
                            }
                            if (!this.l.T()) {
                                break Label_0221;
                            }
                            if (this.l.ak() == 1) {
                                ak = 1;
                            }
                            else {
                                ak = 0;
                            }
                            if (0x1 != (ak ^ ((n == 2) ? 1 : 0))) {
                                ak = 17;
                            }
                            else {
                                ak = 66;
                            }
                            if (instance.findNextFocus((ViewGroup)this, view, ak) != null) {
                                break Label_0221;
                            }
                        }
                        this.r();
                        if (this.h(view) == null) {
                            return null;
                        }
                        this.U();
                        this.l.j(view, n, this.c, this.I);
                        this.V(false);
                    }
                    view2 = instance.findNextFocus((ViewGroup)this, view, n);
                    n2 = n;
                    break Label_0304;
                }
            }
            view2 = instance.findNextFocus((ViewGroup)this, view, ak);
            if (view2 == null && b2) {
                this.r();
                if (this.h(view) == null) {
                    return null;
                }
                this.U();
                view2 = this.l.j(view, ak, this.c, this.I);
                this.V(false);
                n2 = ak;
            }
            else {
                n2 = ak;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            if (view2 != null && view2 != this) {
                if (view2 != view) {
                    if (this.h(view2) != null) {
                        if (view != null) {
                            if (this.h(view) != null) {
                                this.i.set(0, 0, view.getWidth(), view.getHeight());
                                this.S.set(0, 0, view2.getWidth(), view2.getHeight());
                                this.offsetDescendantRectToMyCoords(view, this.i);
                                this.offsetDescendantRectToMyCoords(view2, this.S);
                                ak = this.l.ak();
                                int n3 = -1;
                                int n4;
                                if (ak == 1) {
                                    n4 = -1;
                                }
                                else {
                                    n4 = 1;
                                }
                                if ((this.i.left < this.S.left || this.i.right <= this.S.left) && this.i.right < this.S.right) {
                                    ak = 1;
                                }
                                else if ((this.i.right > this.S.right || this.i.left >= this.S.right) && this.i.left > this.S.left) {
                                    ak = -1;
                                }
                                else {
                                    ak = 0;
                                }
                                if ((this.i.top < this.S.top || this.i.bottom <= this.S.top) && this.i.bottom < this.S.bottom) {
                                    n3 = 1;
                                }
                                else if ((this.i.bottom <= this.S.bottom && this.i.top < this.S.bottom) || this.i.top <= this.S.top) {
                                    n3 = 0;
                                }
                                int n5 = 0;
                                Label_0877: {
                                    Label_0874: {
                                        switch (n2) {
                                            default: {
                                                final StringBuilder sb = new StringBuilder();
                                                sb.append("Invalid direction: ");
                                                sb.append(n2);
                                                sb.append(this.i());
                                                throw new IllegalArgumentException(sb.toString());
                                            }
                                            case 130: {
                                                if (n3 > 0) {
                                                    break;
                                                }
                                                return super.focusSearch(view, n2);
                                            }
                                            case 66: {
                                                if (ak > 0) {
                                                    break;
                                                }
                                                return super.focusSearch(view, n2);
                                            }
                                            case 33: {
                                                if (n3 < 0) {
                                                    break;
                                                }
                                                return super.focusSearch(view, n2);
                                            }
                                            case 17: {
                                                if (ak < 0) {
                                                    break;
                                                }
                                                return super.focusSearch(view, n2);
                                            }
                                            case 2: {
                                                n5 = (b ? 1 : 0);
                                                if (n3 > 0) {
                                                    break Label_0877;
                                                }
                                                if (n3 != 0) {
                                                    break Label_0874;
                                                }
                                                if (ak * n4 > 0) {
                                                    n5 = (b ? 1 : 0);
                                                    break Label_0877;
                                                }
                                                return super.focusSearch(view, n2);
                                            }
                                            case 1: {
                                                n5 = (b ? 1 : 0);
                                                if (n3 < 0) {
                                                    break Label_0877;
                                                }
                                                if (n3 != 0) {
                                                    break Label_0874;
                                                }
                                                if (ak * n4 < 0) {
                                                    n5 = (b ? 1 : 0);
                                                    break Label_0877;
                                                }
                                                return super.focusSearch(view, n2);
                                            }
                                        }
                                        return view2;
                                    }
                                    n5 = 0;
                                }
                                if (n5 != 0) {
                                    return view2;
                                }
                                return super.focusSearch(view, n2);
                            }
                        }
                        return view2;
                    }
                }
            }
            return super.focusSearch(view, n2);
        }
        if (this.getFocusedChild() == null) {
            return super.focusSearch(view, n2);
        }
        this.as(view2, null);
        return view;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        final se l = this.l;
        if (l != null) {
            return (ViewGroup$LayoutParams)l.f();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(this.i());
        throw new IllegalStateException(sb.toString());
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        final se l = this.l;
        if (l != null) {
            return (ViewGroup$LayoutParams)l.h(this.getContext(), set);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(this.i());
        throw new IllegalStateException(sb.toString());
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final se l = this.l;
        if (l != null) {
            return (ViewGroup$LayoutParams)l.g(viewGroup$LayoutParams);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(this.i());
        throw new IllegalStateException(sb.toString());
    }
    
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }
    
    public final int getBaseline() {
        if (this.l != null) {
            return -1;
        }
        return super.getBaseline();
    }
    
    public final boolean getClipToPadding() {
        return this.h;
    }
    
    public final View h(final View view) {
        final ViewParent parent = view.getParent();
        View view2;
        ViewParent parent2;
        for (view2 = view, parent2 = parent; parent2 != null && parent2 != this && parent2 instanceof View; parent2 = view2.getParent()) {
            view2 = (View)parent2;
        }
        if (parent2 == this) {
            return view2;
        }
        return null;
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.am().h(0);
    }
    
    public final String i() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.k);
        sb.append(", layout:");
        sb.append(this.l);
        sb.append(", context:");
        sb.append(this.getContext());
        return sb.toString();
    }
    
    public final boolean isAttachedToWindow() {
        return this.q;
    }
    
    public final boolean isLayoutSuppressed() {
        return this.u;
    }
    
    public final boolean isNestedScrollingEnabled() {
        return this.am().a;
    }
    
    public final void m(final st st) {
        final View a = st.a;
        final ViewParent parent = a.getParent();
        this.c.k(this.e(a));
        if (st.v()) {
            this.f.h(a, -1, a.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.f.g(a, -1, true);
            return;
        }
        final px f = this.f;
        final int b = f.c.b(a);
        if (b >= 0) {
            f.a.e(b);
            f.j(a);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(a);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void n(final String s) {
        if (this.ac()) {
            if (s == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(this.i());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(s);
        }
        else if (this.ab > 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.i());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", (Throwable)new IllegalStateException(sb2.toString()));
        }
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aa = 0;
        boolean s = true;
        this.q = true;
        if (!this.s || this.isLayoutRequested()) {
            s = false;
        }
        this.s = s;
        final se l = this.l;
        if (l != null) {
            l.aY();
        }
        this.L = false;
        if ((this.G = qv.a.get()) == null) {
            this.G = new qv();
            final Display t = ik.t((View)this);
            final boolean inEditMode = this.isInEditMode();
            float n = 60.0f;
            if (!inEditMode && t != null) {
                final float refreshRate = t.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    n = refreshRate;
                }
            }
            this.G.e = (long)(1.0E9f / n);
            qv.a.set(this.G);
        }
        this.G.c.add(this);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final sa b = this.B;
        if (b != null) {
            b.i();
        }
        this.X();
        this.q = false;
        final se l = this.l;
        if (l != null) {
            l.bl(this);
        }
        this.O.clear();
        this.removeCallbacks(this.as);
        uc.b();
        final qv g = this.G;
        if (g != null) {
            g.c.remove(this);
            this.G = null;
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        for (int size = this.n.size(), i = 0; i < size; ++i) {
            final aaj aaj = this.n.get(i);
        }
    }
    
    public final boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        if (this.l == null) {
            return false;
        }
        if (this.u) {
            return false;
        }
        if (motionEvent.getAction() == 8) {
            float n = 0.0f;
            float n2 = 0.0f;
            Label_0139: {
                if ((motionEvent.getSource() & 0x2) != 0x0) {
                    if (this.l.U()) {
                        n = -motionEvent.getAxisValue(9);
                    }
                    else {
                        n = 0.0f;
                    }
                    if (this.l.T()) {
                        n2 = motionEvent.getAxisValue(10);
                    }
                    else {
                        n2 = 0.0f;
                    }
                }
                else {
                    if ((motionEvent.getSource() & 0x400000) != 0x0) {
                        n2 = motionEvent.getAxisValue(26);
                        if (this.l.U()) {
                            n = -n2;
                            n2 = 0.0f;
                            break Label_0139;
                        }
                        if (this.l.T()) {
                            n = 0.0f;
                            break Label_0139;
                        }
                    }
                    n = 0.0f;
                    n2 = 0.0f;
                }
            }
            if (n != 0.0f || n2 != 0.0f) {
                final int n3 = (int)(n2 * this.ak);
                final int n4 = (int)(n * this.al);
                final se l = this.l;
                if (l == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                }
                else if (!this.u) {
                    final int[] n5 = this.N;
                    n5[1] = (n5[0] = 0);
                    final int t = l.T() ? 1 : 0;
                    final boolean u = this.l.U();
                    int n7;
                    final int n6 = n7 = t;
                    if (u) {
                        n7 = (n6 | 0x2);
                    }
                    float y;
                    if (motionEvent == null) {
                        y = this.getHeight() / 2.0f;
                    }
                    else {
                        y = motionEvent.getY();
                    }
                    float x;
                    if (motionEvent == null) {
                        x = this.getWidth() / 2.0f;
                    }
                    else {
                        x = motionEvent.getX();
                    }
                    int n8 = n3 - this.a(n3, y);
                    int n9 = n4 - this.al(n4, x);
                    this.ah(n7, 1);
                    int n10;
                    if (t == 0) {
                        n10 = 0;
                    }
                    else {
                        n10 = n8;
                    }
                    int n11;
                    if (!u) {
                        n11 = 0;
                    }
                    else {
                        n11 = n9;
                    }
                    if (this.Z(n10, n11, this.N, this.aq, 1)) {
                        final int[] n12 = this.N;
                        n8 -= n12[0];
                        n9 -= n12[1];
                    }
                    int n13;
                    if (t == 0) {
                        n13 = 0;
                    }
                    else {
                        n13 = n8;
                    }
                    int n14;
                    if (!u) {
                        n14 = 0;
                    }
                    else {
                        n14 = n9;
                    }
                    this.ad(n13, n14, motionEvent, 1);
                    final qv g = this.G;
                    Label_0488: {
                        if (g != null) {
                            if (n8 == 0) {
                                if (n9 == 0) {
                                    break Label_0488;
                                }
                                n8 = 0;
                            }
                            g.a(this, n8, n9);
                        }
                    }
                    this.W(1);
                }
            }
        }
        return false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.u) {
            return false;
        }
        this.p = null;
        if (this.aw(motionEvent)) {
            this.an();
            return true;
        }
        final se l = this.l;
        if (l == null) {
            return false;
        }
        final int t = l.T() ? 1 : 0;
        final boolean u = this.l.U();
        if (this.ae == null) {
            this.ae = VelocityTracker.obtain();
        }
        this.ae.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 6: {
                this.ar(motionEvent);
                break;
            }
            case 5: {
                this.ad = motionEvent.getPointerId(actionIndex);
                final int n = (int)(motionEvent.getX(actionIndex) + 0.5f);
                this.ah = n;
                this.af = n;
                final int n2 = (int)(motionEvent.getY(actionIndex) + 0.5f);
                this.ai = n2;
                this.ag = n2;
                break;
            }
            case 3: {
                this.an();
                break;
            }
            case 2: {
                final int pointerIndex = motionEvent.findPointerIndex(this.ad);
                if (pointerIndex < 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error processing scroll; pointer index for id ");
                    sb.append(this.ad);
                    sb.append(" not found. Did any MotionEvents get skipped?");
                    Log.e("RecyclerView", sb.toString());
                    return false;
                }
                final int ah = (int)(motionEvent.getX(pointerIndex) + 0.5f);
                final int ai = (int)(motionEvent.getY(pointerIndex) + 0.5f);
                if (this.ac != 1) {
                    final int af = this.af;
                    final int ag = this.ag;
                    boolean b;
                    if (t && Math.abs(ah - af) > this.C) {
                        this.ah = ah;
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    if (u && Math.abs(ai - ag) > this.C) {
                        this.ai = ai;
                    }
                    else if (!b) {
                        break;
                    }
                    this.R(1);
                    break;
                }
                break;
            }
            case 1: {
                this.ae.clear();
                this.W(0);
                break;
            }
            case 0: {
                if (this.U) {
                    this.U = false;
                }
                this.ad = motionEvent.getPointerId(0);
                final int n3 = (int)(motionEvent.getX() + 0.5f);
                this.ah = n3;
                this.af = n3;
                final int n4 = (int)(motionEvent.getY() + 0.5f);
                this.ai = n4;
                this.ag = n4;
                final EdgeEffect x = this.x;
                boolean b2;
                if (x != null && aag.e(x) != 0.0f) {
                    aag.f(this.x, 0.0f, 1.0f - motionEvent.getY() / this.getHeight());
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                final EdgeEffect z = this.z;
                boolean b3 = b2;
                if (z != null) {
                    b3 = b2;
                    if (aag.e(z) != 0.0f) {
                        aag.f(this.z, 0.0f, motionEvent.getY() / this.getHeight());
                        b3 = true;
                    }
                }
                final EdgeEffect y = this.y;
                boolean b4 = b3;
                if (y != null) {
                    b4 = b3;
                    if (aag.e(y) != 0.0f) {
                        aag.f(this.y, 0.0f, motionEvent.getX() / this.getWidth());
                        b4 = true;
                    }
                }
                final EdgeEffect a = this.A;
                Label_0697: {
                    if (a != null && aag.e(a) != 0.0f) {
                        aag.f(this.A, 0.0f, 1.0f - motionEvent.getX() / this.getWidth());
                    }
                    else if (!b4 && this.ac != 2) {
                        break Label_0697;
                    }
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    this.R(1);
                    this.W(1);
                }
                final int[] ar = this.ar;
                ar[ar[1] = 0] = 0;
                int n5;
                if (u) {
                    n5 = (t | 0x2);
                }
                else {
                    n5 = t;
                }
                this.ah(n5, 0);
                break;
            }
        }
        return this.ac == 1;
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        Trace.beginSection("RV OnLayout");
        this.u();
        Trace.endSection();
        this.s = true;
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final se l = this.l;
        if (l == null) {
            this.s(n, n2);
            return;
        }
        final boolean v = l.V();
        boolean at = false;
        if (v) {
            final int mode = View$MeasureSpec.getMode(n);
            final int mode2 = View$MeasureSpec.getMode(n2);
            this.l.bj(n, n2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                at = true;
            }
            if (!(this.at = at) && this.k != null) {
                if (this.I.d == 1) {
                    this.ao();
                }
                this.l.aO(n, n2);
                this.I.i = true;
                this.ap();
                this.l.aQ(n, n2);
                if (this.l.Y()) {
                    this.l.aO(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824));
                    this.I.i = true;
                    this.ap();
                    this.l.aQ(n, n2);
                }
                this.au = this.getMeasuredWidth();
                this.av = this.getMeasuredHeight();
            }
        }
        else {
            if (this.r) {
                this.l.bj(n, n2);
                return;
            }
            final sq i = this.I;
            if (!i.k) {
                final rw k = this.k;
                if (k != null) {
                    i.e = k.a();
                }
                else {
                    i.e = 0;
                }
                this.U();
                this.l.bj(n, n2);
                this.V(false);
                this.I.g = false;
                return;
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }
    
    protected final boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        return !this.ac() && super.onRequestFocusInDescendants(n, rect);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof sm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final sm d = (sm)parcelable;
        this.d = d;
        super.onRestoreInstanceState(d.d);
        this.requestLayout();
    }
    
    protected final Parcelable onSaveInstanceState() {
        final sm sm = new sm(super.onSaveInstanceState());
        final sm d = this.d;
        if (d != null) {
            sm.a = d.a;
        }
        else {
            final se l = this.l;
            Parcelable i;
            if (l != null) {
                i = l.I();
            }
            else {
                i = null;
            }
            sm.a = i;
        }
        return (Parcelable)sm;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n == n3 && n2 == n4) {
            return;
        }
        this.D();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean u = this.u;
        final int n = 0;
        if (!u && !this.U) {
            final sh p = this.p;
            Label_1967: {
                if (p == null) {
                    if (motionEvent.getAction() != 0) {
                        if (this.aw(motionEvent)) {
                            break Label_1967;
                        }
                    }
                    final se l = this.l;
                    if (l == null) {
                        return false;
                    }
                    final int t = l.T() ? 1 : 0;
                    final boolean u2 = this.l.U();
                    if (this.ae == null) {
                        this.ae = VelocityTracker.obtain();
                    }
                    final int actionMasked = motionEvent.getActionMasked();
                    final int actionIndex = motionEvent.getActionIndex();
                    int n2;
                    if ((n2 = actionMasked) == 0) {
                        final int[] ar = this.ar;
                        ar[ar[1] = 0] = 0;
                        n2 = 0;
                    }
                    final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    final int[] ar2 = this.ar;
                    obtain.offsetLocation((float)ar2[0], (float)ar2[1]);
                    Label_1929: {
                        switch (n2) {
                            case 6: {
                                this.ar(motionEvent);
                                break;
                            }
                            case 5: {
                                this.ad = motionEvent.getPointerId(actionIndex);
                                final int n3 = (int)(motionEvent.getX(actionIndex) + 0.5f);
                                this.ah = n3;
                                this.af = n3;
                                final int n4 = (int)(motionEvent.getY(actionIndex) + 0.5f);
                                this.ai = n4;
                                this.ag = n4;
                                break;
                            }
                            case 3: {
                                this.an();
                                break;
                            }
                            case 2: {
                                final int pointerIndex = motionEvent.findPointerIndex(this.ad);
                                if (pointerIndex < 0) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Error processing scroll; pointer index for id ");
                                    sb.append(this.ad);
                                    sb.append(" not found. Did any MotionEvents get skipped?");
                                    Log.e("RecyclerView", sb.toString());
                                    return false;
                                }
                                final int n5 = (int)(motionEvent.getX(pointerIndex) + 0.5f);
                                final int n6 = (int)(motionEvent.getY(pointerIndex) + 0.5f);
                                int n7 = this.ah - n5;
                                int n8 = this.ai - n6;
                                if (this.ac != 1) {
                                    boolean b;
                                    if (t != 0) {
                                        if (n7 > 0) {
                                            n7 = Math.max(0, n7 - this.C);
                                        }
                                        else {
                                            n7 = Math.min(0, n7 + this.C);
                                        }
                                        b = (n7 != 0);
                                    }
                                    else {
                                        b = false;
                                    }
                                    if (u2) {
                                        if (n8 > 0) {
                                            n8 = Math.max(0, n8 - this.C);
                                        }
                                        else {
                                            n8 = Math.min(0, n8 + this.C);
                                        }
                                        if (n8 != 0) {
                                            b = true;
                                        }
                                    }
                                    if (b) {
                                        this.R(1);
                                    }
                                }
                                if (this.ac != 1) {
                                    break;
                                }
                                final int[] n9 = this.N;
                                n9[1] = (n9[0] = 0);
                                final int n10 = n7 - this.a(n7, motionEvent.getY());
                                final int n11 = n8 - this.al(n8, motionEvent.getX());
                                int n12;
                                if (t == 0) {
                                    n12 = 0;
                                }
                                else {
                                    n12 = n10;
                                }
                                int n13;
                                if (!u2) {
                                    n13 = 0;
                                }
                                else {
                                    n13 = n11;
                                }
                                int n18;
                                int n19;
                                if (this.Z(n12, n13, this.N, this.aq, 0)) {
                                    final int[] n14 = this.N;
                                    final int n15 = n10 - n14[0];
                                    final int n16 = n14[1];
                                    final int[] ar3 = this.ar;
                                    final int n17 = ar3[0];
                                    final int[] aq = this.aq;
                                    ar3[0] = n17 + aq[0];
                                    ar3[1] += aq[1];
                                    this.getParent().requestDisallowInterceptTouchEvent(true);
                                    n18 = n11 - n16;
                                    n19 = n15;
                                }
                                else {
                                    final int n20 = n11;
                                    n19 = n10;
                                    n18 = n20;
                                }
                                final int[] aq2 = this.aq;
                                this.ah = n5 - aq2[0];
                                this.ai = n6 - aq2[1];
                                int n21;
                                if (t == 0) {
                                    n21 = 0;
                                }
                                else {
                                    n21 = n19;
                                }
                                int n22;
                                if (!u2) {
                                    n22 = 0;
                                }
                                else {
                                    n22 = n18;
                                }
                                if (this.ad(n21, n22, motionEvent, 0)) {
                                    this.getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                final qv g = this.G;
                                if (g != null) {
                                    if (n19 == 0) {
                                        if (n18 == 0) {
                                            break;
                                        }
                                        n19 = n;
                                    }
                                    g.a(this, n19, n18);
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                this.ae.addMovement(obtain);
                                this.ae.computeCurrentVelocity(1000, (float)this.aj);
                                float n23;
                                if (t != 0) {
                                    n23 = -this.ae.getXVelocity(this.ad);
                                }
                                else {
                                    n23 = 0.0f;
                                }
                                float n24;
                                if (u2) {
                                    n24 = -this.ae.getYVelocity(this.ad);
                                }
                                else {
                                    n24 = 0.0f;
                                }
                                Label_1834: {
                                    Label_1829: {
                                        if (n23 != 0.0f || n24 != 0.0f) {
                                            final int n25 = (int)n23;
                                            final int n26 = (int)n24;
                                            final se i = this.l;
                                            if (i == null) {
                                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                            }
                                            else if (!this.u) {
                                                final int t2 = i.T() ? 1 : 0;
                                                final boolean u3 = this.l.U();
                                                int n27;
                                                if (t2 != 0) {
                                                    n27 = n25;
                                                    if (Math.abs(n25) < this.E) {
                                                        n27 = 0;
                                                    }
                                                }
                                                else {
                                                    n27 = 0;
                                                }
                                                int n28;
                                                if (u3) {
                                                    n28 = n26;
                                                    if (Math.abs(n26) < this.E) {
                                                        n28 = 0;
                                                    }
                                                }
                                                else {
                                                    n28 = 0;
                                                }
                                                int n29;
                                                if ((n29 = n27) == 0) {
                                                    if (n28 == 0) {
                                                        break Label_1829;
                                                    }
                                                    n29 = 0;
                                                }
                                                final float n30 = (float)n29;
                                                final float n31 = (float)n28;
                                                if (!this.dispatchNestedPreFling(n30, n31)) {
                                                    this.dispatchNestedFling(n30, n31, true);
                                                    final sg d = this.D;
                                                    if (d != null) {
                                                        final RecyclerView a = d.a;
                                                        final se j = a.l;
                                                        if (j != null) {
                                                            if (a.k != null) {
                                                                final int e = a.E;
                                                                if (Math.abs(n28) > e || Math.abs(n29) > e) {
                                                                    final boolean b2 = j instanceof so;
                                                                    if (b2) {
                                                                        final rr rr = (rr)d;
                                                                        final rq rq = new rq(rr, rr.a.getContext());
                                                                        final int aj = j.aj();
                                                                        int b3;
                                                                        if (aj == 0) {
                                                                            b3 = -1;
                                                                        }
                                                                        else {
                                                                            rp rp;
                                                                            if (j.U()) {
                                                                                rp = rr.b(j);
                                                                            }
                                                                            else if (j.T()) {
                                                                                rp = rr.a(j);
                                                                            }
                                                                            else {
                                                                                rp = null;
                                                                            }
                                                                            if (rp == null) {
                                                                                b3 = -1;
                                                                            }
                                                                            else {
                                                                                final int ah = j.ah();
                                                                                int k = 0;
                                                                                int n32 = Integer.MIN_VALUE;
                                                                                int n33 = Integer.MAX_VALUE;
                                                                                View view = null;
                                                                                View view2 = null;
                                                                                while (k < ah) {
                                                                                    final View at = j.at(k);
                                                                                    int n34;
                                                                                    View view3;
                                                                                    if (at == null) {
                                                                                        n34 = n33;
                                                                                        view3 = view;
                                                                                    }
                                                                                    else {
                                                                                        final int e2 = rr.e(at, rp);
                                                                                        int n35 = n32;
                                                                                        View view4 = view2;
                                                                                        if (e2 <= 0) {
                                                                                            n35 = n32;
                                                                                            view4 = view2;
                                                                                            if (e2 > n32) {
                                                                                                n35 = e2;
                                                                                                view4 = at;
                                                                                            }
                                                                                        }
                                                                                        n32 = n35;
                                                                                        n34 = n33;
                                                                                        view3 = view;
                                                                                        view2 = view4;
                                                                                        if (e2 >= 0) {
                                                                                            if (e2 >= n33) {
                                                                                                n32 = n35;
                                                                                                n34 = n33;
                                                                                                view3 = view;
                                                                                                view2 = view4;
                                                                                            }
                                                                                            else {
                                                                                                n34 = e2;
                                                                                                view2 = view4;
                                                                                                view3 = at;
                                                                                                n32 = n35;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    ++k;
                                                                                    n33 = n34;
                                                                                    view = view3;
                                                                                }
                                                                                int n36;
                                                                                if (j.T() ? (n29 > 0) : (n28 > 0)) {
                                                                                    n36 = 1;
                                                                                }
                                                                                else {
                                                                                    n36 = 0;
                                                                                }
                                                                                if (n36 != 0 && view != null) {
                                                                                    b3 = se.bd(view);
                                                                                }
                                                                                else if (n36 == 0 && view2 != null) {
                                                                                    b3 = se.bd(view2);
                                                                                }
                                                                                else {
                                                                                    if (n36 == 0) {
                                                                                        view2 = view;
                                                                                    }
                                                                                    if (view2 == null) {
                                                                                        b3 = -1;
                                                                                    }
                                                                                    else {
                                                                                        final int bd = se.bd(view2);
                                                                                        final int aj2 = j.aj();
                                                                                        int n37 = 0;
                                                                                        Label_1592: {
                                                                                            if (b2) {
                                                                                                final PointF h = ((so)j).H(aj2 - 1);
                                                                                                if (h != null && (h.x < 0.0f || h.y < 0.0f)) {
                                                                                                    n37 = 1;
                                                                                                    break Label_1592;
                                                                                                }
                                                                                            }
                                                                                            n37 = 0;
                                                                                        }
                                                                                        int n38;
                                                                                        if (n37 == n36) {
                                                                                            n38 = -1;
                                                                                        }
                                                                                        else {
                                                                                            n38 = 1;
                                                                                        }
                                                                                        final int n39 = n38 + bd;
                                                                                        if (n39 < 0 || (b3 = n39) >= aj) {
                                                                                            b3 = -1;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (b3 != -1) {
                                                                            rq.b = b3;
                                                                            j.aS(rq);
                                                                            break Label_1834;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int n40;
                                                    if (u3) {
                                                        n40 = (t2 | 0x2);
                                                    }
                                                    else {
                                                        n40 = t2;
                                                    }
                                                    this.ah(n40, 1);
                                                    final int aj3 = this.aj;
                                                    final int max = Math.max(-aj3, Math.min(n29, aj3));
                                                    final int aj4 = this.aj;
                                                    final int max2 = Math.max(-aj4, Math.min(n28, aj4));
                                                    final ss f = this.F;
                                                    f.e.R(2);
                                                    f.b = 0;
                                                    f.a = 0;
                                                    final Interpolator d2 = f.d;
                                                    final Interpolator a2 = RecyclerView.a;
                                                    if (d2 != a2) {
                                                        f.d = a2;
                                                        f.c = new OverScroller(f.e.getContext(), a2);
                                                    }
                                                    f.c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                    f.a();
                                                    break Label_1834;
                                                }
                                            }
                                        }
                                    }
                                    this.R(0);
                                }
                                this.au();
                                break Label_1929;
                            }
                            case 0: {
                                this.ad = motionEvent.getPointerId(0);
                                final int n41 = (int)(motionEvent.getX() + 0.5f);
                                this.ah = n41;
                                this.af = n41;
                                final int n42 = (int)(motionEvent.getY() + 0.5f);
                                this.ai = n42;
                                this.ag = n42;
                                int n43;
                                if (u2) {
                                    n43 = (t | 0x2);
                                }
                                else {
                                    n43 = t;
                                }
                                this.ah(n43, 0);
                                break;
                            }
                        }
                        this.ae.addMovement(obtain);
                    }
                    obtain.recycle();
                    return true;
                }
                else {
                    p.i(motionEvent);
                    final int action = motionEvent.getAction();
                    if (action == 3 || action == 1) {
                        this.p = null;
                    }
                }
            }
            this.an();
            return true;
        }
        return false;
    }
    
    final void p() {
        final int c = this.f.c();
        final int n = 0;
        for (int i = 0; i < c; ++i) {
            final st f = f(this.f.f(i));
            if (!f.y()) {
                f.e();
            }
        }
        final sk c2 = this.c;
        for (int size = c2.c.size(), j = 0; j < size; ++j) {
            ((st)c2.c.get(j)).e();
        }
        for (int size2 = c2.a.size(), k = 0; k < size2; ++k) {
            ((st)c2.a.get(k)).e();
        }
        final ArrayList b = c2.b;
        if (b != null) {
            for (int size3 = b.size(), l = n; l < size3; ++l) {
                ((st)c2.b.get(l)).e();
            }
        }
    }
    
    public final void q(final int n, final int n2) {
        final EdgeEffect x = this.x;
        int finished = 0;
        if (x != null && !x.isFinished() && n > 0) {
            this.x.onRelease();
            finished = (this.x.isFinished() ? 1 : 0);
        }
        final EdgeEffect z = this.z;
        if (z != null && !z.isFinished() && n < 0) {
            this.z.onRelease();
            finished |= (this.z.isFinished() ? 1 : 0);
        }
        final EdgeEffect y = this.y;
        boolean b = finished != 0;
        if (y != null) {
            b = (finished != 0);
            if (!y.isFinished()) {
                b = (finished != 0);
                if (n2 > 0) {
                    this.y.onRelease();
                    b = ((finished | (this.y.isFinished() ? 1 : 0)) != 0x0);
                }
            }
        }
        final EdgeEffect a = this.A;
        boolean b2 = b;
        if (a != null) {
            b2 = b;
            if (!a.isFinished()) {
                b2 = b;
                if (n2 < 0) {
                    this.A.onRelease();
                    b2 = (b | this.A.isFinished());
                }
            }
        }
        if (b2) {
            ik.z((View)this);
        }
    }
    
    public final void r() {
        if (this.s && !this.w) {
            if (this.e.k() && this.e.k()) {
                Trace.beginSection("RV FullInvalidate");
                this.u();
                Trace.endSection();
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        this.u();
        Trace.endSection();
    }
    
    public final void removeDetachedView(final View view, final boolean b) {
        final st f = f(view);
        if (f != null) {
            if (f.v()) {
                f.h();
            }
            else if (!f.y()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(f);
                sb.append(this.i());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        this.t(view);
        super.removeDetachedView(view, b);
    }
    
    public final void requestChildFocus(final View view, final View view2) {
        if (!this.l.aU()) {
            if (!this.ac()) {
                if (view2 != null) {
                    this.as(view, view2);
                }
            }
        }
        super.requestChildFocus(view, view2);
    }
    
    public final boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        return this.l.aW(this, view, rect, b, false);
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        for (int size = this.o.size(), i = 0; i < size; ++i) {
            ((sh)this.o.get(i)).h();
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public final void requestLayout() {
        if (this.T == 0 && !this.u) {
            super.requestLayout();
            return;
        }
        this.t = true;
    }
    
    public final void s(final int n, final int n2) {
        this.setMeasuredDimension(se.ag(n, this.getPaddingLeft() + this.getPaddingRight(), ik.h((View)this)), se.ag(n2, this.getPaddingTop() + this.getPaddingBottom(), ik.g((View)this)));
    }
    
    public final void scrollBy(int n, int n2) {
        final se l = this.l;
        if (l == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.u) {
            return;
        }
        final boolean t = l.T();
        boolean u = this.l.U();
        if (!t) {
            if (!u) {
                return;
            }
            u = true;
        }
        if (!t) {
            n = 0;
        }
        if (!u) {
            n2 = 0;
        }
        this.ad(n, n2, null, 0);
    }
    
    public final void scrollTo(final int n, final int n2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }
    
    public final void sendAccessibilityEventUnchecked(final AccessibilityEvent accessibilityEvent) {
        if (this.ac()) {
            final int n = 0;
            int contentChangeTypes;
            if (accessibilityEvent != null) {
                contentChangeTypes = accessibilityEvent.getContentChangeTypes();
            }
            else {
                contentChangeTypes = 0;
            }
            if (contentChangeTypes == 0) {
                contentChangeTypes = n;
            }
            this.V |= contentChangeTypes;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }
    
    public final void setClipToPadding(final boolean h) {
        if (h != this.h) {
            this.D();
        }
        super.setClipToPadding(this.h = h);
        if (this.s) {
            this.requestLayout();
        }
    }
    
    @Deprecated
    public final void setLayoutTransition(final LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition)null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }
    
    public final void setNestedScrollingEnabled(final boolean b) {
        this.am().a(b);
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.am().i(n, 0);
    }
    
    public final void stopNestedScroll() {
        this.am().b(0);
    }
    
    public final void suppressLayout(final boolean b) {
        if (b != this.u) {
            this.n("Do not suppressLayout in layout or scroll");
            if (!b) {
                this.u = false;
                if (this.t && this.l != null && this.k != null) {
                    this.requestLayout();
                }
                this.t = false;
                return;
            }
            final long uptimeMillis = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.u = true;
            this.U = true;
            this.X();
        }
    }
    
    public final void t(final View view) {
        f(view);
        final List v = this.v;
        if (v != null) {
            for (int i = v.size() - 1; i >= 0; --i) {
                final acw acw = this.v.get(i);
            }
        }
    }
    
    final void u() {
        if (this.k == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.l == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        final sq i = this.I;
        final int n = 0;
        i.i = false;
        boolean b = false;
        Label_0089: {
            if (this.at) {
                if (this.au != this.getWidth()) {
                    b = true;
                    break Label_0089;
                }
                if (this.av != this.getHeight()) {
                    b = true;
                    break Label_0089;
                }
            }
            b = false;
        }
        this.au = 0;
        this.av = 0;
        this.at = false;
        Label_0217: {
            if (this.I.d == 1) {
                this.ao();
                this.l.aN(this);
                this.ap();
            }
            else {
                final om e = this.e;
                if (e.b.isEmpty() || e.a.isEmpty()) {
                    if (!b && this.l.C == this.getWidth() && this.l.D == this.getHeight()) {
                        this.l.aN(this);
                        break Label_0217;
                    }
                }
                this.l.aN(this);
                this.ap();
            }
        }
        this.I.b(4);
        this.U();
        this.H();
        final sq j = this.I;
        j.d = 1;
        final boolean k = j.j;
        View view = null;
        if (k) {
            for (int l = this.f.a() - 1; l >= 0; --l) {
                final st f = f(this.f.e(l));
                if (!f.y()) {
                    final long ae = ae(f);
                    final rz c = sa.c();
                    c.a(f);
                    final st m = (st)this.g.b.c(ae);
                    if (m != null && !m.y()) {
                        final boolean i2 = this.g.i(m);
                        final boolean i3 = this.g.i(f);
                        if (i2 && m == f) {
                            this.g.d(f, c);
                        }
                        else {
                            final rz a = this.g.a(m, 4);
                            this.g.d(f, c);
                            final rz a2 = this.g.a(f, 8);
                            if (a == null) {
                                for (int a3 = this.f.a(), n2 = 0; n2 < a3; ++n2) {
                                    final st f2 = f(this.f.e(n2));
                                    if (f2 != f) {
                                        if (ae(f2) == ae) {
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(f2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(f);
                                            sb.append(this.i());
                                            throw new IllegalStateException(sb.toString());
                                        }
                                    }
                                }
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
                                sb2.append(m);
                                sb2.append(" cannot be found but it is necessary for ");
                                sb2.append(f);
                                sb2.append(this.i());
                                Log.e("RecyclerView", sb2.toString());
                            }
                            else {
                                m.l(false);
                                if (i2) {
                                    this.m(m);
                                }
                                if (m != f) {
                                    if (i3) {
                                        this.m(f);
                                    }
                                    m.h = f;
                                    this.m(m);
                                    this.c.k(m);
                                    f.l(false);
                                    f.i = m;
                                }
                                if (this.B.f(m, f, a, a2)) {
                                    this.K();
                                }
                            }
                        }
                    }
                    else {
                        this.g.d(f, c);
                    }
                }
            }
            final ud g = this.g;
            final rt ax = this.ax;
            for (int n3 = g.a.j - 1; n3 >= 0; --n3) {
                final st st = (st)g.a.f(n3);
                final uc uc = (uc)g.a.g(n3);
                final int b2 = uc.b;
                if ((b2 & 0x3) == 0x3) {
                    ax.c(st);
                }
                else if ((b2 & 0x1) != 0x0) {
                    final rz c2 = uc.c;
                    if (c2 == null) {
                        ax.c(st);
                    }
                    else {
                        ax.b(st, c2, uc.d);
                    }
                }
                else if ((b2 & 0xE) == 0xE) {
                    ax.a(st, uc.c, uc.d);
                }
                else if ((b2 & 0xC) == 0xC) {
                    final rz c3 = uc.c;
                    final rz d = uc.d;
                    st.l(false);
                    final RecyclerView a4 = ax.a;
                    if (a4.w) {
                        if (a4.B.f(st, st, c3, d)) {
                            ax.a.K();
                        }
                    }
                    else {
                        final sa b3 = a4.B;
                        final int a5 = c3.a;
                        final int a6 = d.a;
                        if (a5 == a6 && c3.b == d.b) {
                            b3.a(st);
                        }
                        else if (b3.k(st, a5, c3.b, a6, d.b)) {
                            ax.a.K();
                        }
                    }
                }
                else if ((b2 & 0x4) != 0x0) {
                    ax.b(st, uc.c, null);
                }
                else if ((b2 & 0x8) != 0x0) {
                    ax.a(st, uc.c, uc.d);
                }
                uc.c(uc);
            }
        }
        this.l.aI(this.c);
        final sq i4 = this.I;
        i4.b = i4.e;
        this.w = false;
        i4.j = false;
        i4.k = false;
        this.l.u = false;
        final ArrayList b4 = this.c.b;
        if (b4 != null) {
            b4.clear();
        }
        final se l2 = this.l;
        if (l2.z) {
            l2.y = 0;
            l2.z = false;
            this.c.l();
        }
        this.l.o(this.I);
        this.I();
        this.V(false);
        this.g.f();
        final int[] ao = this.ao;
        final int n4 = ao[0];
        final int n5 = ao[1];
        this.aq(ao);
        final int[] ao2 = this.ao;
        if (ao2[0] != n4 || ao2[1] != n5) {
            this.w(0, 0);
        }
        if (this.am && this.k != null && this.hasFocus() && this.getDescendantFocusability() != 393216 && (this.getDescendantFocusability() != 131072 || !this.isFocused()) && (this.isFocused() || this.f.k(this.getFocusedChild()))) {
            final long m2 = this.I.m;
            Label_1520: {
                if (this.f.a() > 0) {
                    final sq i5 = this.I;
                    int l3 = i5.l;
                    if (l3 == -1) {
                        l3 = n;
                    }
                    final int a7 = i5.a();
                    for (int n6 = l3; n6 < a7; ++n6) {
                        final st d2 = this.d(n6);
                        if (d2 == null) {
                            break;
                        }
                        if (d2.a.hasFocusable()) {
                            view = d2.a;
                            break Label_1520;
                        }
                    }
                    for (int n7 = Math.min(a7, l3) - 1; n7 >= 0; --n7) {
                        final st d3 = this.d(n7);
                        if (d3 == null) {
                            break;
                        }
                        if (d3.a.hasFocusable()) {
                            view = d3.a;
                            break;
                        }
                    }
                }
            }
            if (view != null) {
                final int n8 = this.I.n;
                View view2 = view;
                if (n8 != -1L) {
                    final View viewById = view.findViewById(n8);
                    view2 = view;
                    if (viewById != null) {
                        view2 = view;
                        if (viewById.isFocusable()) {
                            view2 = viewById;
                        }
                    }
                }
                view2.requestFocus();
            }
        }
        this.at();
    }
    
    public final void v(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, final int[] array2) {
        this.am().g(n, n2, n3, n4, array, n5, array2);
    }
    
    public final void w(final int n, final int n2) {
        ++this.ab;
        final int scrollX = this.getScrollX();
        final int scrollY = this.getScrollY();
        this.onScrollChanged(scrollX, scrollY, scrollX - n, scrollY - n2);
        final List an = this.an;
        if (an != null) {
            for (int i = an.size() - 1; i >= 0; --i) {
                ((aak)this.an.get(i)).a(this, n, n2);
            }
        }
        --this.ab;
    }
    
    public final void x() {
        if (this.A != null) {
            return;
        }
        final EdgeEffect a = this.ay.a(this);
        this.A = a;
        if (this.h) {
            a.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        a.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    public final void y() {
        if (this.x != null) {
            return;
        }
        final EdgeEffect a = this.ay.a(this);
        this.x = a;
        if (this.h) {
            a.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        a.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }
    
    public final void z() {
        if (this.z != null) {
            return;
        }
        final EdgeEffect a = this.ay.a(this);
        this.z = a;
        if (this.h) {
            a.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        a.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }
}
