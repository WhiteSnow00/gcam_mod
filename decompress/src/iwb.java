import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.transition.Transition;
import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.content.Context;
import android.graphics.Rect;
import android.view.View$MeasureSpec;
import android.widget.PopupWindow;
import android.hardware.display.DisplayManager;
import android.view.View$OnClickListener;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwb implements AutoCloseable, efl
{
    final iwt a;
    public List b;
    public Runnable c;
    private final int d;
    private final View e;
    private final boolean f;
    private final boolean g;
    private final AtomicBoolean h;
    private Date i;
    private boolean j;
    private final int k;
    private final iwm l;
    
    public iwb(final iwm l, final View i, int n, final View view, final int m, final int n2, final int o, int d, int k, final boolean f, final boolean g, final boolean b) {
        this.b = Collections.synchronizedList(new ArrayList<Object>());
        this.h = new AtomicBoolean(false);
        this.c = iey.f;
        this.j = false;
        i.getClass();
        view.getClass();
        final Context context = view.getContext();
        final iwt a = new iwt(context, b);
        a.setWillNotDraw(false);
        a.setLayerType(1, a.b);
        a.setLayerType(1, a.c);
        a.setOnClickListener((View$OnClickListener)new iwn(a));
        final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        displayManager.registerDisplayListener(a.v, kpo.d(context.getMainLooper()));
        a.u.add(new iwq(displayManager, a));
        this.a = a;
        a.i = i;
        a.f = new PopupWindow((View)a);
        a.addView(i);
        final boolean s = s(n);
        final int n3 = 3;
        int j = 0;
        Label_0451: {
            if (s) {
                final int[] array = new int[2];
                view.getLocationOnScreen(array);
                final int heightPixels = view.getResources().getDisplayMetrics().heightPixels;
                int n4;
                if ((n4 = view.getHeight()) == 0) {
                    final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                    view.measure(measureSpec, measureSpec);
                    n4 = view.getMeasuredHeight();
                }
                final int n5 = array[1];
                int n6;
                if (n5 > heightPixels - n5 - n4) {
                    n6 = 1;
                }
                else {
                    n6 = 2;
                }
                if (n6 != n) {
                    if (n == 1) {
                        j = 2;
                        break Label_0451;
                    }
                    j = 1;
                    break Label_0451;
                }
            }
            else {
                final int r = r(n, view);
                final int[] array2 = new int[2];
                view.getLocationInWindow(array2);
                final int widthPixels = view.getResources().getDisplayMetrics().widthPixels;
                int n7;
                if ((n7 = view.getWidth()) == 0) {
                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
                    view.measure(measureSpec2, measureSpec2);
                    n7 = view.getMeasuredWidth();
                }
                final int n8 = array2[0];
                int n9;
                if (n8 > widthPixels - n8 - n7) {
                    n9 = 5;
                }
                else {
                    n9 = 6;
                }
                if (n9 != r) {
                    j = n3;
                    if (n == 3) {
                        j = 4;
                    }
                    break Label_0451;
                }
            }
            j = n;
        }
        this.d = d;
        this.k = k;
        this.e = view;
        this.f = f;
        this.g = g;
        this.l = l;
        a.k = view;
        final View k2 = a.k;
        if (k2 != null) {
            final int[] a2 = a.a;
            n = View$MeasureSpec.makeMeasureSpec(0, 0);
            k2.measure(n, n);
            k2.getLocationOnScreen(a2);
            if (k2.getWidth() == 0) {
                n = k2.getMeasuredWidth();
            }
            else {
                n = k2.getWidth();
            }
            if (k2.getHeight() == 0) {
                d = k2.getMeasuredHeight();
            }
            else {
                d = k2.getHeight();
            }
            final int n10 = a2[0];
            k = a2[1];
            a.l = new Rect(n10, k, n + n10, d + k);
        }
        a.j = j;
        a.m = m;
        a.n = n2;
        a.o = o;
        a.a();
    }
    
    static int r(final int n, final View view) {
        final int f = ik.f(view);
        switch (n) {
            default: {
                throw new IllegalArgumentException();
            }
            case 4: {
                if (f != 1) {
                    return 6;
                }
                return 5;
            }
            case 3: {
                if (f != 1) {
                    return 5;
                }
                return 6;
            }
            case 2: {
                return 2;
            }
            case 1: {
                return 1;
            }
        }
    }
    
    static boolean s(final int n) {
        return n == 1 || n == 2;
    }
    
    @Override
    public final int a() {
        return this.d;
    }
    
    @Override
    public final efo b() {
        return efo.b;
    }
    
    @Override
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.c.run();
        this.a.b(false);
        this.a.close();
    }
    
    @Override
    public final Date e() {
        return this.i;
    }
    
    @Override
    public final void f(final Runnable runnable) {
        final String value = String.valueOf(this.getClass().getName());
        String concat;
        if (value.length() != 0) {
            concat = "Unsupported Operation delayedHide(Runnable) in: ".concat(value);
        }
        else {
            concat = new String("Unsupported Operation delayedHide(Runnable) in: ");
        }
        throw new UnsupportedOperationException(concat);
    }
    
    @Override
    public final void g() {
        this.a.b(true);
        if (this.h.get()) {
            this.l.a();
        }
    }
    
    @Override
    public final void i(final Date i) {
        this.i = i;
    }
    
    @Override
    public final void j() {
        final Rect l = new Rect();
        this.e.getGlobalVisibleRect(l);
        final iwt a = this.a;
        a.l = l;
        a.setVisibility(0);
        final PopupWindow f = a.f;
        final View k = a.k;
        if (f != null && k != null) {
            f.setClippingEnabled(false);
            final Fade enterTransition = new Fade();
            ((Transition)enterTransition).setDuration(a.r);
            ((Transition)enterTransition).setInterpolator((TimeInterpolator)new adh());
            ((Transition)enterTransition).setStartDelay(a.q);
            f.setEnterTransition((Transition)enterTransition);
            f.setBackgroundDrawable((Drawable)new BitmapDrawable(k.getResources(), ""));
            f.setOutsideTouchable(a.g);
            f.setTouchInterceptor((View$OnTouchListener)new iwo(a));
            f.setOnDismissListener((PopupWindow$OnDismissListener)new iwp(a));
            final WeakReference weakReference = new WeakReference(k.getContext());
            k.post((Runnable)new iwr(a, weakReference, 1));
            k.postDelayed((Runnable)new iwr(a, weakReference), a.q);
        }
        final List b = this.b;
        final iwt a2 = this.a;
        for (final iwa iwa : b) {
            if (iwa.c == 0L) {
                iwa.b.execute(iwa.a);
            }
            else {
                a2.postDelayed((Runnable)new ivz(a2, iwa), iwa.c);
            }
        }
        this.h.set(true);
    }
    
    @Override
    public final boolean l() {
        return true;
    }
    
    @Override
    public final boolean m() {
        return this.g;
    }
    
    @Override
    public final boolean n() {
        return false;
    }
    
    @Override
    public final boolean o() {
        return !this.f;
    }
    
    @Override
    public final int p() {
        return this.k;
    }
}
