import java.util.Set;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adc
{
    private static final adb a;
    
    static {
        a = adb.a;
    }
    
    public static void a(final ei ei, final String s) {
        final acx acx = new acx(ei, s);
        f(acx);
        final adb d = d(ei);
        final adb a = adb.a;
        if (d.b.contains(acz.c) && g(d, ei.getClass(), acx.getClass())) {
            e(d, acx);
        }
    }
    
    public static void b(final ei ei, final ViewGroup viewGroup) {
        final add add = new add(ei, viewGroup);
        f(add);
        final adb d = d(ei);
        final adb a = adb.a;
        if (d.b.contains(acz.d) && g(d, ei.getClass(), add.getClass())) {
            e(d, add);
        }
    }
    
    public static void c(final ei ei, final ViewGroup viewGroup) {
        final adf adf = new adf(ei, viewGroup);
        f(adf);
        final adb d = d(ei);
        final adb a = adb.a;
        if (d.b.contains(acz.h) && g(d, ei.getClass(), adf.getClass())) {
            e(d, adf);
        }
    }
    
    private static adb d(ei d) {
        while (d != null) {
            if (d.Q()) {
                d.x();
            }
            d = d.D;
        }
        return adc.a;
    }
    
    private static void e(final adb adb, final ade ade) {
        final ei a = ade.a;
        final String name = a.getClass().getName();
        final adb a2 = adb.a;
        adb.b.contains(acz.a);
        final ada c = adb.c;
        if (adb.b.contains(acz.b)) {
            final acy acy = new acy(name, ade);
            if (a.Q()) {
                final Handler d = a.x().j.d;
                if (d.getLooper() == Looper.myLooper()) {
                    acy.run();
                    return;
                }
                d.post((Runnable)acy);
            }
            else {
                acy.run();
            }
        }
    }
    
    private static void f(final ade ade) {
        if (fi.R(3)) {
            ade.a.getClass().getName();
        }
    }
    
    private static boolean g(final adb adb, final Class clazz, final Class clazz2) {
        final adb a = adb.a;
        final Set set = adb.d.get(clazz);
        return set == null || ((clazz2.getSuperclass() == ade.class || !set.contains(clazz2.getSuperclass())) && !set.contains(clazz2));
    }
}
