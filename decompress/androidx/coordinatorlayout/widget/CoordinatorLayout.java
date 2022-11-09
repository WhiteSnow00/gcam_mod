// 
// Decompiled by Procyon v0.6.0
// 

package androidx.coordinatorlayout.widget;

import android.util.SparseArray;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import java.util.Collection;
import android.view.ViewParent;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.Gravity;
import java.util.Collections;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.graphics.Rect;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import android.text.TextUtils;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;
import android.view.ViewGroup$OnHierarchyChangeListener;
import java.util.Comparator;
import android.view.ViewGroup;

public class CoordinatorLayout extends ViewGroup implements ib, ic
{
    static final String a;
    static final Class[] b;
    static final ThreadLocal c;
    static final Comparator d;
    private static final hp h;
    public ix e;
    public boolean f;
    public ViewGroup$OnHierarchyChangeListener g;
    private final List i;
    private final aac j;
    private final List k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private zz s;
    private boolean t;
    private Drawable u;
    private ie v;
    private final id w;
    
    static {
        final Package package1 = CoordinatorLayout.class.getPackage();
        String name;
        if (package1 != null) {
            name = package1.getName();
        }
        else {
            name = null;
        }
        a = name;
        d = new aab();
        b = new Class[] { Context.class, AttributeSet.class };
        c = new ThreadLocal();
        h = new hr(12);
    }
    
    public CoordinatorLayout(final Context context) {
        this(context, null);
    }
    
    public CoordinatorLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130968940);
    }
    
    public CoordinatorLayout(final Context context, final AttributeSet set, int i) {
        super(context, set, i);
        this.i = new ArrayList();
        this.j = new aac();
        this.k = new ArrayList();
        this.l = new int[2];
        this.m = new int[2];
        this.w = new id();
        final int n = 0;
        TypedArray typedArray;
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(set, zs.a, 0, 2132018593);
        }
        else {
            typedArray = context.obtainStyledAttributes(set, zs.a, i, 0);
        }
        if (i == 0) {
            ik.E((View)this, context, zs.a, set, typedArray, 0, 2132018593);
        }
        else {
            ik.E((View)this, context, zs.a, set, typedArray, i, 0);
        }
        i = typedArray.getResourceId(0, 0);
        if (i != 0) {
            final Resources resources = context.getResources();
            this.p = resources.getIntArray(i);
            final float density = resources.getDisplayMetrics().density;
            int length;
            int[] p3;
            for (length = this.p.length, i = n; i < length; ++i) {
                p3 = this.p;
                p3[i] *= (int)density;
            }
        }
        this.u = typedArray.getDrawable(1);
        typedArray.recycle();
        this.v();
        super.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new zx(this));
        if (ik.d((View)this) == 0) {
            ik.K((View)this, 1);
        }
    }
    
    private static final void A(final View view, final int i) {
        final zy zy = (zy)view.getLayoutParams();
        final int j = zy.i;
        if (j != i) {
            ik.x(view, i - j);
            zy.i = i;
        }
    }
    
    private static final void B(final View view, final int j) {
        final zy zy = (zy)view.getLayoutParams();
        final int i = zy.j;
        if (i != j) {
            ik.y(view, j - i);
            zy.j = j;
        }
    }
    
    public static zv g(final Context context, final AttributeSet set, final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        String s2;
        if (s.startsWith(".")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(s);
            s2 = sb.toString();
        }
        else {
            s2 = s;
            if (s.indexOf(46) < 0) {
                final String a = CoordinatorLayout.a;
                s2 = s;
                if (!TextUtils.isEmpty((CharSequence)a)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(a);
                    sb2.append('.');
                    sb2.append(s);
                    s2 = sb2.toString();
                }
            }
        }
        try {
            final ThreadLocal c = CoordinatorLayout.c;
            Map map;
            if ((map = c.get()) == null) {
                map = new HashMap();
                c.set(map);
            }
            final Constructor constructor = (Constructor)map.get(s2);
            Constructor<?> constructor3;
            if (constructor == null) {
                final Constructor<?> constructor2 = Class.forName(s2, false, context.getClassLoader()).getConstructor((Class<?>[])CoordinatorLayout.b);
                constructor2.setAccessible(true);
                map.put(s2, constructor2);
                constructor3 = constructor2;
            }
            else {
                constructor3 = constructor;
            }
            return (zv)constructor3.newInstance(context, set);
        }
        catch (final Exception ex) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(s2);
            throw new RuntimeException(sb3.toString(), ex);
        }
    }
    
    static final zy m(View o) {
        final zy zy = (zy)((View)o).getLayoutParams();
        if (!zy.b) {
            if (o instanceof zu) {
                final zv a = ((zu)o).a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                zy.b(a);
                zy.b = true;
            }
            else {
                Class<?> clazz = o.getClass();
                o = null;
                while (clazz != null) {
                    o = clazz.getAnnotation(zw.class);
                    if (o != null) {
                        break;
                    }
                    clazz = clazz.getSuperclass();
                }
                if (o != null) {
                    try {
                        zy.b(((zw)o).a().getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                    }
                    catch (final Exception ex) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(((zw)o).a().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), (Throwable)ex);
                    }
                }
                zy.b = true;
            }
        }
        return zy;
    }
    
    private final int o(final int n) {
        final int[] p = this.p;
        if (p == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(n);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        }
        if (n >= 0 && n < p.length) {
            return p[n];
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Keyline index ");
        sb2.append(n);
        sb2.append(" out of range for ");
        sb2.append(this);
        Log.e("CoordinatorLayout", sb2.toString());
        return 0;
    }
    
    private static int p(int n) {
        int n2 = n;
        if ((n & 0x7) == 0x0) {
            n2 = (n | 0x800003);
        }
        n = n2;
        if ((n2 & 0x70) == 0x0) {
            n = (n2 | 0x30);
        }
        return n;
    }
    
    private static int q(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 8388661;
        }
        return n2;
    }
    
    private static Rect r() {
        Rect rect;
        if ((rect = (Rect)CoordinatorLayout.h.a()) == null) {
            rect = new Rect();
        }
        return rect;
    }
    
    private final void s(final zy zy, final Rect rect, final int n, final int n2) {
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int max = Math.max(this.getPaddingLeft() + zy.leftMargin, Math.min(rect.left, width - this.getPaddingRight() - n - zy.rightMargin));
        final int max2 = Math.max(this.getPaddingTop() + zy.topMargin, Math.min(rect.top, height - this.getPaddingBottom() - n2 - zy.bottomMargin));
        rect.set(max, max2, n + max, n2 + max2);
    }
    
    private static void t(final Rect rect) {
        rect.setEmpty();
        CoordinatorLayout.h.b(rect);
    }
    
    private final void u() {
        final View q = this.q;
        if (q != null) {
            final zv a = ((zy)q.getLayoutParams()).a;
            if (a != null) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                a.e(this, this.q, obtain);
                obtain.recycle();
            }
            this.q = null;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            ((zy)this.getChildAt(i).getLayoutParams()).m = false;
        }
        this.n = false;
    }
    
    private final void v() {
        if (ik.Q((View)this)) {
            if (this.v == null) {
                this.v = new zt(this);
            }
            ik.L((View)this, this.v);
            this.setSystemUiVisibility(1280);
            return;
        }
        ik.L((View)this, null);
    }
    
    private final boolean w(final zv zv, final View view, final MotionEvent motionEvent, final int n) {
        switch (n) {
            default: {
                return zv.e(this, view, motionEvent);
            }
            case 0: {
                return zv.c(this, view, motionEvent);
            }
        }
    }
    
    private final boolean x(final MotionEvent motionEvent, final int n) {
        final int actionMasked = motionEvent.getActionMasked();
        final List k = this.k;
        k.clear();
        final boolean childrenDrawingOrderEnabled = this.isChildrenDrawingOrderEnabled();
        final int childCount = this.getChildCount();
        for (int i = childCount - 1; i >= 0; --i) {
            int childDrawingOrder;
            if (childrenDrawingOrderEnabled) {
                childDrawingOrder = this.getChildDrawingOrder(childCount, i);
            }
            else {
                childDrawingOrder = i;
            }
            k.add(this.getChildAt(childDrawingOrder));
        }
        final Comparator d = CoordinatorLayout.d;
        if (d != null) {
            Collections.sort((List<Object>)k, d);
        }
        final int size = k.size();
        MotionEvent motionEvent2 = null;
        int j = 0;
        int n2 = 0;
        while (j < size) {
            final View q = k.get(j);
            final zy zy = (zy)q.getLayoutParams();
            final zv a = zy.a;
            int n3 = 0;
            Label_0417: {
                if (n2 != 0) {
                    if (actionMasked != 0) {
                        if (a != null) {
                            MotionEvent z;
                            if ((z = motionEvent2) == null) {
                                z = z(motionEvent);
                            }
                            this.w(a, q, z, n);
                            motionEvent2 = z;
                            n3 = n2;
                            break Label_0417;
                        }
                        n3 = n2;
                        break Label_0417;
                    }
                }
                MotionEvent motionEvent3 = motionEvent2;
                n3 = n2;
                if (n2 == 0) {
                    motionEvent3 = motionEvent2;
                    n3 = n2;
                    if (a != null) {
                        final boolean w = this.w(a, q, motionEvent, n);
                        motionEvent3 = motionEvent2;
                        if ((n3 = (w ? 1 : 0)) != 0) {
                            this.q = q;
                            motionEvent3 = motionEvent2;
                            n3 = (w ? 1 : 0);
                            if (actionMasked != 3) {
                                motionEvent3 = motionEvent2;
                                n3 = (w ? 1 : 0);
                                if (actionMasked != 1) {
                                    int n4 = 0;
                                    while (true) {
                                        motionEvent3 = motionEvent2;
                                        n3 = (w ? 1 : 0);
                                        if (n4 >= j) {
                                            break;
                                        }
                                        final View view = k.get(n4);
                                        final zv a2 = ((zy)view.getLayoutParams()).a;
                                        MotionEvent z2 = motionEvent2;
                                        if (a2 != null) {
                                            if ((z2 = motionEvent2) == null) {
                                                z2 = z(motionEvent);
                                            }
                                            this.w(a2, view, z2, n);
                                        }
                                        ++n4;
                                        motionEvent2 = z2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (zy.a == null) {
                    zy.m = false;
                }
                final boolean m = zy.m;
                motionEvent2 = motionEvent3;
            }
            ++j;
            n2 = n3;
        }
        k.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return n2 != 0;
    }
    
    private static final void y(int n, final Rect rect, final Rect rect2, final zy zy, final int n2, final int n3) {
        int c;
        if ((c = zy.c) == 0) {
            c = 17;
        }
        final int absoluteGravity = Gravity.getAbsoluteGravity(c, n);
        final int absoluteGravity2 = Gravity.getAbsoluteGravity(p(zy.d), n);
        switch (absoluteGravity2 & 0x7) {
            default: {
                n = rect.left;
                break;
            }
            case 5: {
                n = rect.right;
                break;
            }
            case 1: {
                n = rect.left + rect.width() / 2;
                break;
            }
        }
        int n4 = 0;
        switch (absoluteGravity2 & 0x70) {
            default: {
                n4 = rect.top;
                break;
            }
            case 80: {
                n4 = rect.bottom;
                break;
            }
            case 16: {
                n4 = rect.height() / 2 + rect.top;
                break;
            }
        }
        int n5 = n;
        switch (absoluteGravity & 0x7) {
            case 1: {
                n5 = n - n2 / 2;
            }
            default: {
                n5 = n - n2;
            }
            case 5: {
                n = n4;
                switch (absoluteGravity & 0x70) {
                    case 16: {
                        n = n4 - n3 / 2;
                    }
                    default: {
                        n = n4 - n3;
                    }
                    case 80: {
                        rect2.set(n5, n, n2 + n5, n3 + n);
                        return;
                    }
                }
                break;
            }
        }
    }
    
    private static final MotionEvent z(MotionEvent obtain) {
        obtain = MotionEvent.obtain(obtain);
        obtain.setAction(3);
        return obtain;
    }
    
    public final void a(final View view, final int n, final int n2, final int[] array, final int n3) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n4 = 0;
        int n5 = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final zy zy = (zy)child.getLayoutParams();
                if (zy.d(n3)) {
                    final zv a = zy.a;
                    if (a != null) {
                        final int[] l = this.l;
                        l[1] = (l[0] = 0);
                        a.k(child, view, n2, l, n3);
                        if (n > 0) {
                            n4 = Math.max(n4, this.l[0]);
                        }
                        else {
                            n4 = Math.min(n4, this.l[0]);
                        }
                        if (n2 > 0) {
                            n5 = Math.max(n5, this.l[1]);
                        }
                        else {
                            n5 = Math.min(n5, this.l[1]);
                        }
                        b = true;
                    }
                }
            }
            ++i;
        }
        array[0] = n4;
        array[1] = n5;
        if (b) {
            this.j(1);
        }
    }
    
    public final void b(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.f(view, n, n2, n3, n4, 0, this.m);
    }
    
    public final void c(final View view, final View r, int i, final int n) {
        this.w.b(i, n);
        this.r = r;
        int childCount;
        zy zy;
        zv a;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            zy = (zy)this.getChildAt(i).getLayoutParams();
            if (zy.d(n)) {
                a = zy.a;
            }
        }
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof zy && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void d(final View view, final int n) {
        this.w.c(n);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final zy zy = (zy)child.getLayoutParams();
            if (zy.d(n)) {
                final zv a = zy.a;
                if (a != null) {
                    a.q(child, view, n);
                }
                zy.c(n, false);
                zy.a();
            }
        }
        this.r = null;
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        final zv a = ((zy)view.getLayoutParams()).a;
        return super.drawChild(canvas, view, n);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable u = this.u;
        if (u != null && u.isStateful() && u.setState(drawableState)) {
            this.invalidate();
        }
    }
    
    public final boolean e(View child, final View view, final int n, final int n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            child = this.getChildAt(i);
            boolean b2 = b;
            if (child.getVisibility() != 8) {
                final zy zy = (zy)child.getLayoutParams();
                final zv a = zy.a;
                if (a != null) {
                    final boolean p4 = a.p(child, n, n2);
                    b2 = (b | p4);
                    zy.c(n2, p4);
                }
                else {
                    zy.c(n2, false);
                    b2 = b;
                }
            }
            ++i;
            b = b2;
        }
        return b;
    }
    
    public final void f(View child, int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        final int childCount = this.getChildCount();
        boolean b = false;
        int i = 0;
        n = 0;
        int n6 = 0;
        while (i < childCount) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final zy zy = (zy)child.getLayoutParams();
                if (zy.d(n5)) {
                    final zv a = zy.a;
                    if (a != null) {
                        final int[] l = this.l;
                        l[1] = (l[0] = 0);
                        a.l(this, child, n2, n3, n4, l);
                        if (n3 > 0) {
                            n = Math.max(n, this.l[0]);
                        }
                        else {
                            n = Math.min(n, this.l[0]);
                        }
                        if (n4 > 0) {
                            n6 = Math.max(n6, this.l[1]);
                        }
                        else {
                            n6 = Math.min(n6, this.l[1]);
                        }
                        b = true;
                    }
                }
            }
            ++i;
        }
        array[0] += n;
        array[1] += n6;
        if (b) {
            this.j(1);
        }
    }
    
    public final int getNestedScrollAxes() {
        return this.w.a();
    }
    
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }
    
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }
    
    public final List h(final View view) {
        final aac j = this.j;
        final int i = j.b.j;
        ArrayList<Object> list = null;
        ArrayList<Object> list3;
        for (int k = 0; k < i; ++k, list = list3) {
            final ArrayList list2 = (ArrayList)j.b.i(k);
            list3 = list;
            if (list2 != null) {
                list3 = list;
                if (list2.contains(view)) {
                    if ((list3 = list) == null) {
                        list3 = new ArrayList<Object>();
                    }
                    list3.add(j.b.f(k));
                }
            }
        }
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }
    
    final void i(final View view, final boolean b, final Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (b) {
            aad.a(this, view, rect);
            return;
        }
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
    
    public final void j(final int n) {
        final int f = ik.f((View)this);
        int size = this.i.size();
        final Rect r = r();
        final Rect r2 = r();
        Rect r3 = r();
        int n3 = 0;
        int n12;
        for (int i = 0; i < size; size = n3, i = n12) {
            final View view = this.i.get(i);
            final zy zy = (zy)view.getLayoutParams();
            int n2 = 0;
            Label_1225: {
                int j;
                if (n == 0) {
                    if (view.getVisibility() == 8) {
                        n2 = i;
                        n3 = size;
                        break Label_1225;
                    }
                    j = 0;
                }
                else {
                    j = 0;
                }
                while (j < i) {
                    if (zy.l == this.i.get(j)) {
                        final zy zy2 = (zy)view.getLayoutParams();
                        if (zy2.k != null) {
                            final Rect r4 = r();
                            final Rect r5 = r();
                            final Rect r6 = r();
                            aad.a(this, zy2.k, r4);
                            this.i(view, false, r5);
                            final int measuredWidth = view.getMeasuredWidth();
                            final int measuredHeight = view.getMeasuredHeight();
                            y(f, r4, r6, zy2, measuredWidth, measuredHeight);
                            final boolean b = r6.left != r5.left || r6.top != r5.top;
                            this.s(zy2, r6, measuredWidth, measuredHeight);
                            final int n4 = r6.left - r5.left;
                            final int n5 = r6.top - r5.top;
                            if (n4 != 0) {
                                ik.x(view, n4);
                            }
                            if (n5 != 0) {
                                ik.y(view, n5);
                            }
                            if (b) {
                                final zv a = zy2.a;
                                if (a != null) {
                                    a.j(this, view, zy2.k);
                                }
                            }
                            t(r4);
                            t(r5);
                            t(r6);
                        }
                    }
                    ++j;
                }
                final int n6 = i;
                this.i(view, true, r2);
                if (zy.g != 0 && !r2.isEmpty()) {
                    final int absoluteGravity = Gravity.getAbsoluteGravity(zy.g, f);
                    switch (absoluteGravity & 0x70) {
                        case 80: {
                            r.bottom = Math.max(r.bottom, this.getHeight() - r2.top);
                            break;
                        }
                        case 48: {
                            r.top = Math.max(r.top, r2.bottom);
                            break;
                        }
                    }
                    switch (absoluteGravity & 0x7) {
                        case 5: {
                            r.right = Math.max(r.right, this.getWidth() - r2.left);
                            break;
                        }
                        case 3: {
                            r.left = Math.max(r.left, r2.right);
                            break;
                        }
                    }
                }
                if (zy.h != 0 && view.getVisibility() == 0) {
                    if (ik.U(view)) {
                        if (view.getWidth() > 0 && view.getHeight() > 0) {
                            final zy zy3 = (zy)view.getLayoutParams();
                            final zv a2 = zy3.a;
                            final Rect r7 = r();
                            final Rect r8 = r();
                            r8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                            if (a2 != null) {
                                a2.r(view);
                            }
                            r7.set(r8);
                            t(r8);
                            if (r7.isEmpty()) {
                                t(r7);
                            }
                            else {
                                final int absoluteGravity2 = Gravity.getAbsoluteGravity(zy3.h, f);
                                boolean b2 = false;
                                Label_0779: {
                                    if ((absoluteGravity2 & 0x30) == 0x30) {
                                        final int n7 = r7.top - zy3.topMargin - zy3.j;
                                        if (n7 < r.top) {
                                            B(view, r.top - n7);
                                            b2 = true;
                                            break Label_0779;
                                        }
                                    }
                                    b2 = false;
                                }
                                Label_0850: {
                                    if ((absoluteGravity2 & 0x50) == 0x50) {
                                        final int n8 = this.getHeight() - r7.bottom - zy3.bottomMargin + zy3.j;
                                        if (n8 < r.bottom) {
                                            B(view, n8 - r.bottom);
                                            break Label_0850;
                                        }
                                    }
                                    if (!b2) {
                                        B(view, 0);
                                    }
                                }
                                boolean b3 = false;
                                Label_0909: {
                                    if ((absoluteGravity2 & 0x3) == 0x3) {
                                        final int n9 = r7.left - zy3.leftMargin - zy3.i;
                                        if (n9 < r.left) {
                                            A(view, r.left - n9);
                                            b3 = true;
                                            break Label_0909;
                                        }
                                    }
                                    b3 = false;
                                }
                                Label_0981: {
                                    if ((absoluteGravity2 & 0x5) == 0x5) {
                                        final int n10 = this.getWidth() - r7.right - zy3.rightMargin + zy3.i;
                                        if (n10 < r.right) {
                                            A(view, n10 - r.right);
                                            break Label_0981;
                                        }
                                    }
                                    if (!b3) {
                                        A(view, 0);
                                    }
                                }
                                t(r7);
                            }
                        }
                    }
                }
                if (n != 2) {
                    final Rect p = ((zy)view.getLayoutParams()).p;
                    final Rect rect = r3;
                    rect.set(p);
                    if (rect.equals((Object)r2)) {
                        n3 = size;
                        r3 = rect;
                        n2 = n6;
                        break Label_1225;
                    }
                    ((zy)view.getLayoutParams()).p.set(r2);
                }
                final Rect rect2 = r3;
                int n11 = n6 + 1;
                while (true) {
                    n3 = size;
                    r3 = rect2;
                    n2 = n6;
                    if (n11 >= size) {
                        break;
                    }
                    final View view2 = this.i.get(n11);
                    final zy zy4 = (zy)view2.getLayoutParams();
                    final zv a3 = zy4.a;
                    if (a3 != null && a3.f(view)) {
                        if (n == 0 && zy4.o) {
                            zy4.a();
                        }
                        else {
                            boolean o = false;
                            switch (n) {
                                default: {
                                    a3.j(this, view2, view);
                                    o = false;
                                    break;
                                }
                                case 2: {
                                    a3.g(this, view);
                                    o = true;
                                    break;
                                }
                            }
                            if (n == 1) {
                                zy4.o = o;
                            }
                        }
                    }
                    ++n11;
                }
            }
            n12 = n2 + 1;
        }
        t(r);
        t(r2);
        t(r3);
    }
    
    public final void k(final View view, int max) {
        final zy zy = (zy)view.getLayoutParams();
        final View k = zy.k;
        if (k == null && zy.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (k != null) {
            final Rect r = r();
            final Rect r2 = r();
            try {
                aad.a(this, k, r);
                final zy zy2 = (zy)view.getLayoutParams();
                final int measuredWidth = view.getMeasuredWidth();
                final int measuredHeight = view.getMeasuredHeight();
                y(max, r, r2, zy2, measuredWidth, measuredHeight);
                this.s(zy2, r2, measuredWidth, measuredHeight);
                view.layout(r2.left, r2.top, r2.right, r2.bottom);
                return;
            }
            finally {
                t(r);
                t(r2);
            }
        }
        final int e = zy.e;
        if (e >= 0) {
            final zy zy3 = (zy)view.getLayoutParams();
            final int absoluteGravity = Gravity.getAbsoluteGravity(q(zy3.c), max);
            final int width = this.getWidth();
            final int height = this.getHeight();
            final int measuredWidth2 = view.getMeasuredWidth();
            final int measuredHeight2 = view.getMeasuredHeight();
            if (max == 1) {
                max = width - e;
            }
            else {
                max = e;
            }
            max = this.o(max) - measuredWidth2;
            switch (absoluteGravity & 0x7) {
                case 5: {
                    max += measuredWidth2;
                    break;
                }
                case 1: {
                    max += measuredWidth2 / 2;
                    break;
                }
            }
            int n = 0;
            switch (absoluteGravity & 0x70) {
                default: {
                    n = 0;
                    break;
                }
                case 80: {
                    n = measuredHeight2;
                    break;
                }
                case 16: {
                    n = measuredHeight2 / 2;
                    break;
                }
            }
            max = Math.max(this.getPaddingLeft() + zy3.leftMargin, Math.min(max, width - this.getPaddingRight() - measuredWidth2 - zy3.rightMargin));
            final int max2 = Math.max(this.getPaddingTop() + zy3.topMargin, Math.min(n, height - this.getPaddingBottom() - measuredHeight2 - zy3.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        final zy zy4 = (zy)view.getLayoutParams();
        final Rect r3 = r();
        r3.set(this.getPaddingLeft() + zy4.leftMargin, this.getPaddingTop() + zy4.topMargin, this.getWidth() - this.getPaddingRight() - zy4.rightMargin, this.getHeight() - this.getPaddingBottom() - zy4.bottomMargin);
        if (this.e != null && ik.Q((View)this) && !ik.Q(view)) {
            r3.left += this.e.b();
            r3.top += this.e.d();
            r3.right -= this.e.c();
            r3.bottom -= this.e.a();
        }
        final Rect r4 = r();
        Gravity.apply(p(zy4.c), view.getMeasuredWidth(), view.getMeasuredHeight(), r3, r4, max);
        view.layout(r4.left, r4.top, r4.right, r4.bottom);
        t(r3);
        t(r4);
    }
    
    public final boolean l(final View view, final int n, final int n2) {
        final Rect r = r();
        aad.a(this, view, r);
        try {
            return r.contains(n, n2);
        }
        finally {
            t(r);
        }
    }
    
    public final void n(final View view, final int n, final int n2, final int n3) {
        this.measureChildWithMargins(view, n, n2, n3, 0);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u();
        if (this.t) {
            if (this.s == null) {
                this.s = new zz(this);
            }
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.s);
        }
        if (this.e == null && ik.Q((View)this)) {
            ik.D((View)this);
        }
        this.o = true;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u();
        if (this.t && this.s != null) {
            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.s);
        }
        final View r = this.r;
        if (r != null) {
            this.onStopNestedScroll(r);
        }
        this.o = false;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.f && this.u != null) {
            final ix e = this.e;
            int d;
            if (e != null) {
                d = e.d();
            }
            else {
                d = 0;
            }
            if (d > 0) {
                this.u.setBounds(0, 0, this.getWidth(), d);
                this.u.draw(canvas);
            }
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        int actionMasked;
        if ((actionMasked = motionEvent.getActionMasked()) == 0) {
            this.u();
            actionMasked = 0;
        }
        final boolean x = this.x(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            this.u();
        }
        return x;
    }
    
    protected final void onLayout(final boolean b, int i, int f, int size, final int n) {
        f = ik.f((View)this);
        View view;
        zv a;
        for (size = this.i.size(), i = 0; i < size; ++i) {
            view = this.i.get(i);
            if (view.getVisibility() != 8) {
                a = ((zy)view.getLayoutParams()).a;
                if (a == null || !a.d(this, view, f)) {
                    this.k(view, f);
                }
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.i.clear();
        final aac j = this.j;
        for (int i = j.b.j, k = 0; k < i; ++k) {
            final ArrayList list = (ArrayList)j.b.i(k);
            if (list != null) {
                list.clear();
                j.a.b(list);
            }
        }
        j.b.clear();
        for (int childCount = this.getChildCount(), l = 0; l < childCount; ++l) {
            final View child = this.getChildAt(l);
            final zy m = m(child);
            if (m.f == -1) {
                m.l = null;
                m.k = null;
            }
            else {
                final View k2 = m.k;
                Label_0421: {
                    Label_0248: {
                        if (k2 != null) {
                            if (k2.getId() == m.f) {
                                View k3 = m.k;
                                for (ViewParent viewParent = k3.getParent(); viewParent != this; viewParent = viewParent.getParent()) {
                                    if (viewParent == null || viewParent == child) {
                                        m.l = null;
                                        m.k = null;
                                        break Label_0248;
                                    }
                                    if (viewParent instanceof View) {
                                        k3 = (View)viewParent;
                                    }
                                }
                                m.l = k3;
                                break Label_0421;
                            }
                        }
                    }
                    m.k = this.findViewById(m.f);
                    View k4 = m.k;
                    if (k4 != null) {
                        if (k4 == this) {
                            if (!this.isInEditMode()) {
                                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                            }
                            m.l = null;
                            m.k = null;
                        }
                        else {
                            ViewParent viewParent2 = k4.getParent();
                            while (viewParent2 != this && viewParent2 != null) {
                                if (viewParent2 == child) {
                                    if (this.isInEditMode()) {
                                        m.l = null;
                                        m.k = null;
                                        break Label_0421;
                                    }
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                else {
                                    if (viewParent2 instanceof View) {
                                        k4 = (View)viewParent2;
                                    }
                                    viewParent2 = viewParent2.getParent();
                                }
                            }
                            m.l = k4;
                        }
                    }
                    else {
                        if (!this.isInEditMode()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Could not find CoordinatorLayout descendant view with id ");
                            sb.append(this.getResources().getResourceName(m.f));
                            sb.append(" to anchor view ");
                            sb.append(child);
                            throw new IllegalStateException(sb.toString());
                        }
                        m.l = null;
                        m.k = null;
                    }
                }
                final View k5 = m.k;
            }
            this.j.a(child);
            for (int n3 = 0; n3 < childCount; ++n3) {
                if (n3 != l) {
                    final View child2 = this.getChildAt(n3);
                    if (child2 != m.l) {
                        final int f = ik.f((View)this);
                        final int absoluteGravity = Gravity.getAbsoluteGravity(((zy)child2.getLayoutParams()).g, f);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(m.h, f) & absoluteGravity) != absoluteGravity) {
                            final zv a = m.a;
                            if (a == null || !a.f(child2)) {
                                continue;
                            }
                        }
                    }
                    if (!this.j.b.containsKey(child2)) {
                        this.j.a(child2);
                    }
                    final aac j2 = this.j;
                    if (!j2.b.containsKey(child2) || !j2.b.containsKey(child)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList list2;
                    if ((list2 = (ArrayList)j2.b.get(child2)) == null) {
                        if ((list2 = (ArrayList)j2.a.a()) == null) {
                            list2 = new ArrayList();
                        }
                        j2.b.put(child2, list2);
                    }
                    list2.add(child);
                }
            }
        }
        final List i2 = this.i;
        final aac j3 = this.j;
        j3.c.clear();
        j3.d.clear();
        for (int j4 = j3.b.j, n4 = 0; n4 < j4; ++n4) {
            j3.b(j3.b.f(n4), j3.c, j3.d);
        }
        i2.addAll(j3.c);
        Collections.reverse(this.i);
        final int childCount2 = this.getChildCount();
        int n5 = 0;
    Label_0953:
        while (true) {
            while (n5 < childCount2) {
                final View child3 = this.getChildAt(n5);
                final aac j5 = this.j;
                for (int j6 = j5.b.j, n6 = 0; n6 < j6; ++n6) {
                    final ArrayList list3 = (ArrayList)j5.b.i(n6);
                    if (list3 != null && list3.contains(child3)) {
                        final boolean b = true;
                        break Label_0953;
                    }
                }
                ++n5;
                continue;
                boolean b = false;
                if (b != this.t) {
                    if (b) {
                        if (this.o) {
                            if (this.s == null) {
                                this.s = new zz(this);
                            }
                            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.s);
                        }
                        this.t = true;
                    }
                    else {
                        if (this.o && this.s != null) {
                            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.s);
                        }
                        this.t = false;
                    }
                }
                final int paddingLeft = this.getPaddingLeft();
                final int paddingTop = this.getPaddingTop();
                final int paddingRight = this.getPaddingRight();
                final int paddingBottom = this.getPaddingBottom();
                final int f2 = ik.f((View)this);
                int n7;
                if (f2 == 1) {
                    n7 = 1;
                }
                else {
                    n7 = 0;
                }
                final int mode = View$MeasureSpec.getMode(n);
                final int size = View$MeasureSpec.getSize(n);
                final int mode2 = View$MeasureSpec.getMode(n2);
                final int size2 = View$MeasureSpec.getSize(n2);
                int n8 = this.getSuggestedMinimumWidth();
                int n9 = this.getSuggestedMinimumHeight();
                final boolean b2 = this.e != null && ik.Q((View)this);
                final int size3 = this.i.size();
                int combineMeasuredStates = 0;
                int n10 = 0;
                int n11 = paddingRight;
                int n12 = paddingLeft;
                while (true) {
                    final int n13 = n11;
                    final int n14 = n12;
                    if (n10 >= size3) {
                        break;
                    }
                    View view = this.i.get(n10);
                    if (view.getVisibility() != 8) {
                        final zy zy = (zy)view.getLayoutParams();
                        final int e = zy.e;
                        int n17 = 0;
                        Label_1368: {
                            Label_1365: {
                                if (e >= 0 && mode != 0) {
                                    final int o = this.o(e);
                                    int n15 = Gravity.getAbsoluteGravity(q(zy.c), f2) & 0x7;
                                    Label_1303: {
                                        int n16;
                                        if (n15 == 3) {
                                            if (n7 == 0) {
                                                break Label_1303;
                                            }
                                            n15 = 3;
                                            n16 = 1;
                                        }
                                        else {
                                            n16 = n7;
                                        }
                                        if (n15 == 5) {
                                            if (n16 != 0) {
                                                break Label_1303;
                                            }
                                            n15 = 5;
                                            n16 = 0;
                                        }
                                        if ((n15 == 5 && n16 == 0) || (n15 == 3 && n16 != 0)) {
                                            n17 = Math.max(0, o - n14);
                                            break Label_1368;
                                        }
                                        break Label_1365;
                                    }
                                    n17 = Math.max(0, size - n13 - o);
                                    break Label_1368;
                                }
                            }
                            n17 = 0;
                        }
                        final int n18 = combineMeasuredStates;
                        int measureSpec;
                        int measureSpec2;
                        if (b2 && !ik.Q(view)) {
                            final int b3 = this.e.b();
                            final int c = this.e.c();
                            final int d = this.e.d();
                            final int a2 = this.e.a();
                            measureSpec = View$MeasureSpec.makeMeasureSpec(size - (b3 + c), mode);
                            measureSpec2 = View$MeasureSpec.makeMeasureSpec(size2 - (d + a2), mode2);
                        }
                        else {
                            measureSpec = n;
                            measureSpec2 = n2;
                        }
                        final zv a3 = zy.a;
                        Label_1512: {
                            if (a3 != null) {
                                final View view2 = view;
                                if (a3.h(this, view2, measureSpec, n17, measureSpec2)) {
                                    view = view2;
                                    break Label_1512;
                                }
                            }
                            this.n(view, measureSpec, n17, measureSpec2);
                        }
                        n8 = Math.max(n8, paddingLeft + paddingRight + view.getMeasuredWidth() + zy.leftMargin + zy.rightMargin);
                        n9 = Math.max(n9, paddingTop + paddingBottom + view.getMeasuredHeight() + zy.topMargin + zy.bottomMargin);
                        combineMeasuredStates = View.combineMeasuredStates(n18, view.getMeasuredState());
                    }
                    ++n10;
                    n12 = n14;
                    n11 = n13;
                }
                this.setMeasuredDimension(View.resolveSizeAndState(n8, n, 0xFF000000 & combineMeasuredStates), View.resolveSizeAndState(n9, n2, combineMeasuredStates << 16));
                return;
            }
            final boolean b = false;
            continue Label_0953;
        }
    }
    
    public final boolean onNestedFling(View child, final float n, final float n2, final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final zy zy = (zy)child.getLayoutParams();
                if (zy.n) {
                    final zv a = zy.a;
                }
            }
        }
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b;
            if (child.getVisibility() == 8) {
                b = (n3 != 0);
            }
            else {
                final zy zy = (zy)child.getLayoutParams();
                b = (n3 != 0);
                if (zy.n) {
                    final zv a = zy.a;
                    b = (n3 != 0);
                    if (a != null) {
                        b = ((n3 | (a.i(view) ? 1 : 0)) != 0x0);
                    }
                }
            }
            ++i;
            n3 = (b ? 1 : 0);
        }
        return n3 != 0;
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.a(view, n, n2, array, 0);
    }
    
    public final void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.b(view, n, n2, n3, n4, 0);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.c(view, view2, n, 0);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof aaa)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final aaa aaa = (aaa)parcelable;
        super.onRestoreInstanceState(aaa.d);
        final SparseArray a = aaa.a;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final int id = child.getId();
            final zv a2 = m(child).a;
            if (id != -1 && a2 != null) {
                final Parcelable parcelable2 = (Parcelable)a.get(id);
                if (parcelable2 != null) {
                    a2.n(child, parcelable2);
                }
            }
        }
    }
    
    protected final Parcelable onSaveInstanceState() {
        final aaa aaa = new aaa(super.onSaveInstanceState());
        final SparseArray a = new SparseArray();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final int id = child.getId();
            final zv a2 = ((zy)child.getLayoutParams()).a;
            if (id != -1 && a2 != null) {
                final Parcelable o = a2.o(child);
                if (o != null) {
                    a.append(id, (Object)o);
                }
            }
        }
        aaa.a = a;
        return (Parcelable)aaa;
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.e(view, view2, n, 0);
    }
    
    public final void onStopNestedScroll(final View view) {
        this.d(view, 0);
    }
    
    public final boolean onTouchEvent(MotionEvent z) {
        final int actionMasked = z.getActionMasked();
        final View q = this.q;
        final boolean b = false;
        boolean x;
        int n;
        if (q != null) {
            final zv a = ((zy)q.getLayoutParams()).a;
            x = (a != null && a.e(this, this.q, z));
            n = (b ? 1 : 0);
        }
        else {
            final boolean b2 = x = this.x(z, 1);
            n = (b ? 1 : 0);
            if (actionMasked != 0) {
                x = b2;
                n = (b ? 1 : 0);
                if (b2) {
                    n = 1;
                    x = b2;
                }
            }
        }
        if (this.q != null && actionMasked != 3) {
            if (n != 0) {
                z = z(z);
                super.onTouchEvent(z);
                z.recycle();
            }
        }
        else {
            x |= super.onTouchEvent(z);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            this.u();
        }
        return x;
    }
    
    public final boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        final zv a = ((zy)view.getLayoutParams()).a;
        if (a != null) {
            a.m(this, view, rect);
        }
        return super.requestChildRectangleOnScreen(view, rect, b);
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b && !this.n) {
            if (this.q == null) {
                final int childCount = this.getChildCount();
                MotionEvent motionEvent = null;
                MotionEvent obtain;
                for (int i = 0; i < childCount; ++i, motionEvent = obtain) {
                    final View child = this.getChildAt(i);
                    final zv a = ((zy)child.getLayoutParams()).a;
                    obtain = motionEvent;
                    if (a != null) {
                        if ((obtain = motionEvent) == null) {
                            final long uptimeMillis = SystemClock.uptimeMillis();
                            obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        a.c(this, child, obtain);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            this.u();
            this.n = true;
        }
    }
    
    public final void setFitsSystemWindows(final boolean fitsSystemWindows) {
        super.setFitsSystemWindows(fitsSystemWindows);
        this.v();
    }
    
    public final void setOnHierarchyChangeListener(final ViewGroup$OnHierarchyChangeListener g) {
        this.g = g;
    }
    
    public final void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable u = this.u;
        if (u != null && u.isVisible() != b) {
            this.u.setVisible(b, false);
        }
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }
}
