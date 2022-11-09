import java.util.ArrayList;
import android.view.Display;
import java.util.List;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.view.WindowInsets;
import android.graphics.Rect;
import android.view.PointerIcon;
import android.view.View$OnApplyWindowInsetsListener;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View$AccessibilityDelegate;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ik
{
    public static final int[] a;
    private static WeakHashMap b;
    
    static {
        new AtomicInteger(1);
        ik.b = null;
        a = new int[] { 2131427346, 2131427347, 2131427358, 2131427369, 2131427372, 2131427373, 2131427374, 2131427375, 2131427376, 2131427377, 2131427348, 2131427349, 2131427350, 2131427351, 2131427352, 2131427353, 2131427354, 2131427355, 2131427356, 2131427357, 2131427359, 2131427360, 2131427361, 2131427362, 2131427363, 2131427364, 2131427365, 2131427366, 2131427367, 2131427368, 2131427370, 2131427371 };
        new ih();
    }
    
    public static void A(final View view, final Runnable runnable) {
        view.postOnAnimation(runnable);
    }
    
    public static void B(final View view, final Runnable runnable, final long n) {
        view.postOnAnimationDelayed(runnable, n);
    }
    
    public static void C(final View view, final int n) {
        af(n, view);
        ae(view);
    }
    
    public static void D(final View view) {
        view.requestApplyInsets();
    }
    
    public static void E(final View view, final Context context, final int[] array, final AttributeSet set, final TypedArray typedArray, final int n, final int n2) {
        view.saveAttributeDataForStyleable(context, array, set, typedArray, n, n2);
    }
    
    public static void F(final View view, final ht ht) {
        ht ht2 = ht;
        if (ht == null) {
            ht2 = ht;
            if (view.getAccessibilityDelegate() instanceof hs) {
                ht2 = new ht();
            }
        }
        View$AccessibilityDelegate a;
        if (ht2 == null) {
            a = null;
        }
        else {
            a = ht2.a;
        }
        view.setAccessibilityDelegate(a);
    }
    
    public static void G(final View view, final Drawable background) {
        view.setBackground(background);
    }
    
    public static void H(final View view, final ColorStateList backgroundTintList) {
        view.setBackgroundTintList(backgroundTintList);
    }
    
    public static void I(final View view, final PorterDuff$Mode backgroundTintMode) {
        view.setBackgroundTintMode(backgroundTintMode);
    }
    
    public static void J(final View view, final float elevation) {
        view.setElevation(elevation);
    }
    
    public static void K(final View view, final int importantForAccessibility) {
        view.setImportantForAccessibility(importantForAccessibility);
    }
    
    public static void L(final View view, final ie ie) {
        if (ie == null) {
            view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)view.getTag(2131428043));
            return;
        }
        view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new ii(ie));
    }
    
    public static void M(final View view, final int n, final int n2, final int n3, final int n4) {
        view.setPaddingRelative(n, n2, n3, n4);
    }
    
    public static void N(final View view, final ig ig) {
        view.setPointerIcon((PointerIcon)ig.a);
    }
    
    public static void O(final View view, final CharSequence stateDescription) {
        view.setStateDescription(stateDescription);
    }
    
    public static void P(final View view) {
        view.stopNestedScroll();
    }
    
    public static boolean Q(final View view) {
        return view.getFitsSystemWindows();
    }
    
    public static boolean R(final View view) {
        return view.hasOnClickListeners();
    }
    
    public static boolean S(final View view) {
        return view.hasTransientState();
    }
    
    public static boolean T(final View view) {
        return view.isAttachedToWindow();
    }
    
    public static boolean U(final View view) {
        return view.isLaidOut();
    }
    
    public static boolean V(final View view) {
        return view.isNestedScrollingEnabled();
    }
    
    public static boolean W(final View view) {
        return view.isPaddingRelative();
    }
    
    public static boolean X(final View view) {
        return (boolean)view.isScreenReaderFocusable();
    }
    
    public static String[] Y(final View view) {
        return (String[])view.getTag(2131428037);
    }
    
    public static void Z(final View view, final ix ix, final Rect rect) {
        final WindowInsets n = ix.n();
        if (n != null) {
            ix.m(view.computeSystemWindowInsets(n, rect), view);
            return;
        }
        rect.setEmpty();
    }
    
    public static float a(final View view) {
        return view.getElevation();
    }
    
    public static void aa(final View view, final iz iz, final jl jl) {
        if (jl == null) {
            C(view, iz.a());
            return;
        }
        w(view, new iz(null, iz.j, null, jl, iz.k));
    }
    
    public static void ab(final View view) {
        view.setImportantForAutofill(8);
    }
    
    public static void ac(final View view) {
        view.setLayoutDirection(3);
    }
    
    public static void ad(final View view, final int n) {
        view.setScrollIndicators(n, 3);
    }
    
    static void ae(final View view) {
        if (!((AccessibilityManager)view.getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        final boolean b = view.getAccessibilityPaneTitle() != null && view.getVisibility() == 0;
        if (view.getAccessibilityLiveRegion() == 0 && !b) {
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 0);
                }
                catch (final AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), (Throwable)abstractMethodError);
                }
            }
            return;
        }
        int eventType;
        if (!b) {
            eventType = 2048;
        }
        else {
            eventType = 32;
        }
        final AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(eventType);
        obtain.setContentChangeTypes(0);
        if (b) {
            obtain.getText().add(view.getAccessibilityPaneTitle());
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                if (((View)viewParent).getImportantForAccessibility() == 4) {
                    view.setImportantForAccessibility(2);
                    break;
                }
            }
        }
        view.sendAccessibilityEventUnchecked(obtain);
    }
    
    private static void af(final int n, final View view) {
        final List v = v(view);
        for (int i = 0; i < v.size(); ++i) {
            if (((iz)v.get(i)).a() == n) {
                v.remove(i);
                return;
            }
        }
    }
    
    public static float b(final View view) {
        return view.getZ();
    }
    
    public static int c() {
        return View.generateViewId();
    }
    
    public static int d(final View view) {
        return view.getImportantForAccessibility();
    }
    
    public static int e(final View view) {
        return view.getImportantForAutofill();
    }
    
    public static int f(final View view) {
        return view.getLayoutDirection();
    }
    
    public static int g(final View view) {
        return view.getMinimumHeight();
    }
    
    public static int h(final View view) {
        return view.getMinimumWidth();
    }
    
    public static int i(final View view) {
        return view.getPaddingEnd();
    }
    
    public static int j(final View view) {
        return view.getPaddingStart();
    }
    
    public static int k(final View view) {
        return view.getWindowSystemUiVisibility();
    }
    
    public static ColorStateList l(final View view) {
        return view.getBackgroundTintList();
    }
    
    public static PorterDuff$Mode m(final View view) {
        return view.getBackgroundTintMode();
    }
    
    public static ht n(final View view) {
        final View$AccessibilityDelegate accessibilityDelegate = view.getAccessibilityDelegate();
        if (accessibilityDelegate == null) {
            return null;
        }
        if (accessibilityDelegate instanceof hs) {
            return ((hs)accessibilityDelegate).a;
        }
        return new ht(accessibilityDelegate);
    }
    
    public static hw o(final View view, hw d) {
        if (view.getTag(2131428036) == null) {
            return aag.d(view, d);
        }
        d = aag.d(view, d);
        if (d == null) {
            return null;
        }
        return aag.d(view, d);
    }
    
    public static in p(final View view) {
        if (ik.b == null) {
            ik.b = new WeakHashMap();
        }
        in in;
        if ((in = ik.b.get(view)) == null) {
            in = new in(view);
            ik.b.put(view, in);
        }
        return in;
    }
    
    public static ix q(final View view, final ix ix) {
        final WindowInsets n = ix.n();
        if (n != null) {
            final WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(n);
            if (!dispatchApplyWindowInsets.equals((Object)n)) {
                return ix.m(dispatchApplyWindowInsets, view);
            }
        }
        return ix;
    }
    
    public static ix r(final View view) {
        return ij.a(view);
    }
    
    public static ix s(final View view, final ix ix) {
        final WindowInsets n = ix.n();
        if (n != null) {
            final WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(n);
            if (!onApplyWindowInsets.equals((Object)n)) {
                return ix.m(onApplyWindowInsets, view);
            }
        }
        return ix;
    }
    
    public static Display t(final View view) {
        return view.getDisplay();
    }
    
    public static CharSequence u(final View view) {
        return view.getAccessibilityPaneTitle();
    }
    
    public static List v(final View view) {
        ArrayList list;
        if ((list = (ArrayList)view.getTag(2131428031)) == null) {
            list = new ArrayList();
            view.setTag(2131428031, (Object)list);
        }
        return list;
    }
    
    public static void w(final View view, final iz iz) {
        ht n;
        if ((n = n(view)) == null) {
            n = new ht();
        }
        F(view, n);
        af(iz.a(), view);
        v(view).add(iz);
        ae(view);
    }
    
    public static void x(final View view, final int n) {
        view.offsetLeftAndRight(n);
    }
    
    public static void y(final View view, final int n) {
        view.offsetTopAndBottom(n);
    }
    
    public static void z(final View view) {
        view.postInvalidateOnAnimation();
    }
}
