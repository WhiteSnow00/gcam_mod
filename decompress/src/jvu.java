import android.util.TypedValue;
import android.content.res.Resources;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.List;
import android.text.TextUtils;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvu
{
    public static Object a(final Object o) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException("null reference");
    }
    
    public static void b(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void c(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException((String)o);
    }
    
    public static void d(final Handler handler) {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name;
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            else {
                name = "null current looper";
            }
            final String name2 = handler.getLooper().getThread().getName();
            final StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static void e(final String s) {
        if (jxc.d()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void f(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void g(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException((String)o);
    }
    
    public static void h(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
    
    public static void i(final String s, final Object o) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException((String)o);
    }
    
    public static void j(final Object o, final Object o2) {
        if (o != null) {
            return;
        }
        throw new NullPointerException((String)o2);
    }
    
    public static keg k(final jqz jqz, final jvt jvt) {
        final kej kej = new kej();
        jqz.l(new jvr(jqz, kej, jvt));
        return kej.a;
    }
    
    public static keg l(final jqz jqz) {
        return k(jqz, new jvs());
    }
    
    public static boolean m(final Object o, final Object o2) {
        boolean b = false;
        if (o != o2) {
            if (o == null) {
                return b;
            }
            if (!o.equals(o2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public static final String n(final List list, final Object o) {
        final StringBuilder sb = new StringBuilder(100);
        sb.append(o.getClass().getSimpleName());
        sb.append('{');
        for (int size = list.size(), i = 0; i < size; ++i) {
            sb.append((String)list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
    
    public static final void o(final String s, final Object o, final List list) {
        final String value = String.valueOf(o);
        final StringBuilder sb = new StringBuilder(s.length() + 1 + String.valueOf(value).length());
        sb.append(s);
        sb.append("=");
        sb.append(value);
        list.add(sb.toString());
    }
    
    public static int p(jcb jcb) {
        if (!jcb.d(jcb)) {
            switch (jcb.ordinal()) {
                default: {
                    final String value = String.valueOf(jcb);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 25);
                    sb.append("unsupported orientation: ");
                    sb.append(value);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 3: {
                    jcb = jcb.a;
                    break;
                }
                case 2: {
                    jcb = jcb.b;
                    break;
                }
                case 1: {
                    jcb = jcb.c;
                    break;
                }
                case 0: {
                    jcb = jcb.d;
                    break;
                }
            }
            return jcb.e;
        }
        return 0;
    }
    
    public static ValueAnimator q(final View view, final jcb jcb) {
        view.getClass();
        final float n = (float)p(jcb);
        final float abs = Math.abs(y(view.getRotation()) - y(n));
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, View.ROTATION, new float[] { view.getRotation(), y(n) });
        ((ValueAnimator)ofFloat).setInterpolator((TimeInterpolator)new adh());
        long duration;
        if (abs <= 90.0f) {
            duration = 250L;
        }
        else {
            duration = 0L;
        }
        ((ValueAnimator)ofFloat).setDuration(duration);
        return (ValueAnimator)ofFloat;
    }
    
    public static void r(final View view, final jcb jcb) {
        view.setRotation((float)jcb.e);
        view.setPivotX(view.getHeight() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        if (jcb.equals(jcb.b)) {
            view.setTranslationY((float)(view.getWidth() - view.getHeight()));
            return;
        }
        view.setTranslationY(0.0f);
    }
    
    public static void s(final View view, final jcb jcb) {
        q(view, jcb).start();
    }
    
    public static float t(final float n) {
        return n * 0.0624f;
    }
    
    public static int u(final float n) {
        return Math.round(TypedValue.applyDimension(1, n, Resources.getSystem().getDisplayMetrics()));
    }
    
    public static boolean v(final View view) {
        final int[] w = w(view.getRootView());
        return w[0] != 0 || w[1] != 0 || view.getRootWindowInsets().getDisplayCutout() != null;
    }
    
    public static int[] w(final View view) {
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        return array;
    }
    
    public static inf x() {
        return new inf(1, nii.a);
    }
    
    private static float y(final float n) {
        if (n >= 180.0f) {
            return 180.0f - n;
        }
        return n;
    }
}
