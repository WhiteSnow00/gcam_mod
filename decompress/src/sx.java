import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuffColorFilter;
import android.util.TypedValue;
import java.util.WeakHashMap;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sx
{
    private static final PorterDuff$Mode a;
    private static sx b;
    private static final za h;
    private WeakHashMap c;
    private final WeakHashMap d;
    private TypedValue e;
    private boolean f;
    private sw g;
    
    static {
        a = PorterDuff$Mode.SRC_IN;
        h = new za(6);
    }
    
    public sx() {
        this.d = new WeakHashMap(0);
    }
    
    public static PorterDuffColorFilter b(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (sx.class) {
            final za h = sx.h;
            PorterDuffColorFilter porterDuffColorFilter;
            if ((porterDuffColorFilter = (PorterDuffColorFilter)h.a(za.c(n, porterDuff$Mode))) == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(n, porterDuff$Mode);
                final PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter)h.b(za.c(n, porterDuff$Mode), porterDuffColorFilter);
            }
            return porterDuffColorFilter;
        }
    }
    
    public static sx e() {
        synchronized (sx.class) {
            if (sx.b == null) {
                sx.b = new sx();
            }
            return sx.b;
        }
    }
    
    static void h(final Drawable drawable, final tm tm, final int[] array) {
        if (qi.c(drawable) && drawable.mutate() != drawable) {
            return;
        }
        final boolean d = tm.d;
        final ColorFilter colorFilter = null;
        ColorStateList a;
        if (!d) {
            if (!tm.c) {
                drawable.clearColorFilter();
                return;
            }
            a = null;
        }
        else {
            a = tm.a;
        }
        PorterDuff$Mode porterDuff$Mode;
        if (tm.c) {
            porterDuff$Mode = tm.b;
        }
        else {
            porterDuff$Mode = sx.a;
        }
        Object b;
        if (a != null) {
            if (porterDuff$Mode == null) {
                b = colorFilter;
            }
            else {
                b = b(a.getColorForState(array, 0), porterDuff$Mode);
            }
        }
        else {
            b = colorFilter;
        }
        drawable.setColorFilter((ColorFilter)b);
    }
    
    private final Drawable i(final Context context, final long n) {
        synchronized (this) {
            final yz yz = this.d.get(context);
            if (yz == null) {
                return null;
            }
            final WeakReference weakReference = (WeakReference)yz.c(n);
            if (weakReference != null) {
                final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)weakReference.get();
                if (drawable$ConstantState != null) {
                    return drawable$ConstantState.newDrawable(context.getResources());
                }
                final int b = yx.b(yz.c, yz.e, n);
                if (b >= 0 && yz.d[b] != yz.a) {
                    yz.d[b] = yz.a;
                    yz.b = true;
                }
            }
            return null;
        }
    }
    
    private final void j(final Context context, final long n, final Drawable drawable) {
        synchronized (this) {
            final Drawable$ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                final yz yz = this.d.get(context);
                yz yz3;
                if (yz == null) {
                    final yz yz2 = new yz();
                    this.d.put(context, yz2);
                    yz3 = yz2;
                }
                else {
                    yz3 = yz;
                }
                yz3.g(n, new WeakReference(constantState));
            }
        }
    }
    
    final ColorStateList a(final Context context, int n) {
        monitorenter(this);
        try {
            final WeakHashMap c = this.c;
            final ColorStateList list = null;
            Object o = null;
            Label_0041: {
                if (c != null) {
                    final zc zc = c.get(context);
                    if (zc != null) {
                        o = zc.d(n);
                        break Label_0041;
                    }
                }
                o = null;
            }
            if (o == null) {
                final sw g = this.g;
                Label_0422: {
                    if (g == null) {
                        o = list;
                    }
                    else if (n == 2131231004) {
                        o = lp.a(context, 2131099669);
                    }
                    else if (n == 2131231050) {
                        o = lp.a(context, 2131099672);
                    }
                    else if (n == 2131231049) {
                        final int[][] array = new int[3][];
                        final int[] array2 = new int[3];
                        final ColorStateList c2 = tj.c(context, 2130968908);
                        if (c2 != null && c2.isStateful()) {
                            final int[] a = tj.a;
                            array[0] = a;
                            array2[0] = c2.getColorForState(a, 0);
                            array[1] = tj.d;
                            array2[1] = tj.b(context, 2130968845);
                            array[2] = tj.e;
                            array2[2] = c2.getDefaultColor();
                        }
                        else {
                            array[0] = tj.a;
                            array2[0] = tj.a(context, 2130968908);
                            array[1] = tj.d;
                            array2[1] = tj.b(context, 2130968845);
                            array[2] = tj.e;
                            array2[2] = tj.b(context, 2130968908);
                        }
                        o = new ColorStateList(array, array2);
                    }
                    else {
                        int n2;
                        if (n == 2131230992) {
                            n2 = tj.b(context, 2130968843);
                        }
                        else {
                            if (n == 2131230986) {
                                o = os.b(context, 0);
                                break Label_0422;
                            }
                            if (n == 2131230991) {
                                n2 = tj.b(context, 2130968841);
                            }
                            else {
                                if (n == 2131231045 || n == 2131231046) {
                                    o = lp.a(context, 2131099671);
                                    break Label_0422;
                                }
                                if (os.a(((os)g).b, n)) {
                                    o = tj.c(context, 2130968847);
                                    break Label_0422;
                                }
                                if (os.a(((os)g).e, n)) {
                                    o = lp.a(context, 2131099668);
                                    break Label_0422;
                                }
                                if (os.a(((os)g).f, n)) {
                                    o = lp.a(context, 2131099667);
                                    break Label_0422;
                                }
                                if (n == 2131231042) {
                                    o = lp.a(context, 2131099670);
                                    n = 2131231042;
                                    break Label_0422;
                                }
                                o = list;
                                break Label_0422;
                            }
                        }
                        o = os.b(context, n2);
                    }
                }
                if (o != null) {
                    if (this.c == null) {
                        this.c = new WeakHashMap();
                    }
                    final zc zc2 = this.c.get(context);
                    zc zc4;
                    if (zc2 == null) {
                        final zc zc3 = new zc();
                        this.c.put(context, zc3);
                        zc4 = zc3;
                    }
                    else {
                        zc4 = zc2;
                    }
                    final int e = zc4.e;
                    if (e != 0 && n <= zc4.c[e - 1]) {
                        zc4.g(n, o);
                    }
                    else {
                        if (zc4.b && e >= zc4.c.length) {
                            zc4.f();
                        }
                        final int e2 = zc4.e;
                        if (e2 >= zc4.c.length) {
                            final int d = yx.d(e2 + 1);
                            final int[] c3 = new int[d];
                            final Object[] d2 = new Object[d];
                            final int[] c4 = zc4.c;
                            System.arraycopy(c4, 0, c3, 0, c4.length);
                            final Object[] d3 = zc4.d;
                            System.arraycopy(d3, 0, d2, 0, d3.length);
                            zc4.c = c3;
                            zc4.d = d2;
                        }
                        zc4.c[e2] = n;
                        zc4.d[e2] = o;
                        zc4.e = e2 + 1;
                    }
                    monitorexit(this);
                    return (ColorStateList)o;
                }
            }
            monitorexit(this);
            return (ColorStateList)o;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Drawable c(final Context context, final int n) {
        synchronized (this) {
            return this.d(context, n, false);
        }
    }
    
    final Drawable d(final Context context, int alpha, final boolean b) {
        monitorenter(this);
        try {
            final boolean f = this.f;
            final int n = 0;
            if (!f) {
                this.f = true;
                final Drawable c = this.c(context, 2131231062);
                if (c == null || (!(c instanceof afz) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.e == null) {
                this.e = new TypedValue();
            }
            final TypedValue e = this.e;
            context.getResources().getValue(alpha, e, true);
            final long n2 = (long)e.assetCookie << 32 | (long)e.data;
            Object i = this.i(context, n2);
            final Drawable drawable = null;
            final PorterDuff$Mode porterDuff$Mode = null;
            int n3;
            if (i != null) {
                n3 = alpha;
            }
            else {
                LayerDrawable layerDrawable;
                if (this.g == null) {
                    layerDrawable = null;
                }
                else if (alpha == 2131231000) {
                    layerDrawable = new LayerDrawable(new Drawable[] { this.c(context, 2131230999), this.c(context, 2131231001) });
                }
                else if (alpha == 2131231035) {
                    layerDrawable = os.c(this, context, 2131165257);
                }
                else if (alpha == 2131231034) {
                    layerDrawable = os.c(this, context, 2131165258);
                }
                else if (alpha == 2131231036) {
                    layerDrawable = os.c(this, context, 2131165259);
                    alpha = 2131231036;
                }
                else {
                    layerDrawable = null;
                }
                n3 = alpha;
                i = layerDrawable;
                if (layerDrawable != null) {
                    ((Drawable)layerDrawable).setChangingConfigurations(e.changingConfigurations);
                    this.j(context, n2, (Drawable)layerDrawable);
                    i = layerDrawable;
                    n3 = alpha;
                }
            }
            Drawable drawable2;
            if ((drawable2 = (Drawable)i) == null) {
                drawable2 = aah.a(context, n3);
            }
            Drawable drawable4 = null;
            Label_0844: {
                Label_0841: {
                    if (drawable2 != null) {
                        final ColorStateList a = this.a(context, n3);
                        if (a != null) {
                            if (qi.c(drawable2)) {
                                drawable2 = drawable2.mutate();
                            }
                            drawable2.setTintList(a);
                            PorterDuff$Mode multiply;
                            if (this.g == null) {
                                multiply = porterDuff$Mode;
                            }
                            else {
                                multiply = porterDuff$Mode;
                                if (n3 == 2131231049) {
                                    multiply = PorterDuff$Mode.MULTIPLY;
                                }
                            }
                            if (multiply != null) {
                                drawable2.setTintMode(multiply);
                            }
                        }
                        else {
                            final sw g = this.g;
                            Label_0619: {
                                if (g != null) {
                                    PorterDuff$Mode a2;
                                    Drawable drawable3;
                                    if (n3 == 2131231044) {
                                        final LayerDrawable layerDrawable2 = (LayerDrawable)drawable2;
                                        os.d(layerDrawable2.findDrawableByLayerId(16908288), tj.b(context, 2130968847), ot.a);
                                        os.d(layerDrawable2.findDrawableByLayerId(16908303), tj.b(context, 2130968847), ot.a);
                                        final Drawable drawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                                        alpha = tj.b(context, 2130968845);
                                        a2 = ot.a;
                                        drawable3 = drawableByLayerId;
                                    }
                                    else {
                                        if (n3 != 2131231035 && n3 != 2131231034 && n3 != 2131231036) {
                                            break Label_0619;
                                        }
                                        final LayerDrawable layerDrawable3 = (LayerDrawable)drawable2;
                                        os.d(layerDrawable3.findDrawableByLayerId(16908288), tj.a(context, 2130968847), ot.a);
                                        os.d(layerDrawable3.findDrawableByLayerId(16908303), tj.b(context, 2130968845), ot.a);
                                        final Drawable drawableByLayerId2 = layerDrawable3.findDrawableByLayerId(16908301);
                                        alpha = tj.b(context, 2130968845);
                                        final PorterDuff$Mode a3 = ot.a;
                                        drawable3 = drawableByLayerId2;
                                        a2 = a3;
                                    }
                                    os.d(drawable3, alpha, a2);
                                    break Label_0841;
                                }
                            }
                            if (g != null) {
                                PorterDuff$Mode porterDuff$Mode2 = ot.a;
                                final boolean a4 = os.a(((os)g).a, n3);
                                int n4 = 16842801;
                                int n5;
                                if (a4) {
                                    alpha = -1;
                                    n5 = 1;
                                    n4 = 2130968847;
                                }
                                else if (os.a(((os)g).c, n3)) {
                                    alpha = -1;
                                    n5 = 1;
                                    n4 = 2130968845;
                                }
                                else if (os.a(((os)g).d, n3)) {
                                    porterDuff$Mode2 = PorterDuff$Mode.MULTIPLY;
                                    alpha = -1;
                                    n5 = 1;
                                }
                                else if (n3 == 2131231021) {
                                    alpha = Math.round(40.8f);
                                    n5 = 1;
                                    n4 = 16842800;
                                }
                                else if (n3 == 2131231003) {
                                    alpha = -1;
                                    n5 = 1;
                                }
                                else {
                                    alpha = -1;
                                    n4 = 0;
                                    n5 = n;
                                }
                                if (n5 != 0) {
                                    Drawable mutate;
                                    if (qi.c(drawable2)) {
                                        mutate = drawable2.mutate();
                                    }
                                    else {
                                        mutate = drawable2;
                                    }
                                    mutate.setColorFilter((ColorFilter)ot.b(tj.b(context, n4), porterDuff$Mode2));
                                    if (alpha != -1) {
                                        mutate.setAlpha(alpha);
                                    }
                                    break Label_0841;
                                }
                            }
                            if (b) {
                                drawable4 = drawable;
                                break Label_0844;
                            }
                        }
                    }
                }
                drawable4 = drawable2;
            }
            if (drawable4 != null) {
                final Rect a5 = qi.a;
            }
            monitorexit(this);
            return drawable4;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void f(final Context context) {
        synchronized (this) {
            final yz yz = this.d.get(context);
            if (yz != null) {
                yz.e();
            }
        }
    }
    
    public final void g(final sw g) {
        synchronized (this) {
            this.g = g;
        }
    }
}
