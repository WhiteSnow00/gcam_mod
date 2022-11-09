import java.util.Arrays;
import java.util.ArrayDeque;
import android.net.Uri$Builder;
import android.net.Uri;
import java.util.concurrent.Callable;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pip
{
    static volatile oye a;
    static volatile oyf b;
    public static volatile oyf c;
    public static volatile oyf d;
    public static volatile oyf e;
    public static volatile oyf f;
    public static volatile oyf g;
    public static volatile oyf h;
    static volatile oyf i;
    static volatile oyf j;
    static volatile oyf k;
    static volatile oyf l;
    static volatile oyf m;
    static volatile oyf n;
    static volatile oyf o;
    public static volatile oyd p;
    public static volatile oyd q;
    public static volatile oyd r;
    public static volatile oyd s;
    public static volatile oyd t;
    
    public static final Object a(final Throwable t) {
        return new pin(t);
    }
    
    public static final void b(final Object o) {
        if (!(o instanceof pin)) {
            return;
        }
        throw ((pin)o).a;
    }
    
    public static final pik c(final pkn pkn) {
        return new pir(pkn);
    }
    
    public static final pik d(final pkn pkn) {
        return new piq(pkn);
    }
    
    public static final void e(final Throwable t, final Throwable t2) {
        t2.getClass();
        if (t != t2) {
            final int a = pki.a;
            t2.getClass();
            final Method a2 = pkg.a;
            if (a2 != null) {
                a2.invoke(t, t2);
            }
        }
    }
    
    public static oxj f(final Callable callable) {
        try {
            final oxj oxj = callable.call();
            phn.g(oxj, "Scheduler Callable result can't be null");
            return oxj;
        }
        finally {
            final Throwable t;
            throw phi.a(t);
        }
    }
    
    public static void g(final Throwable t) {
        Throwable t2;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else {
            t2 = t;
            if (!(t instanceof oxy)) {
                t2 = t;
                if (!(t instanceof oxx)) {
                    t2 = t;
                    if (!(t instanceof IllegalStateException)) {
                        t2 = t;
                        if (!(t instanceof NullPointerException)) {
                            t2 = t;
                            if (!(t instanceof IllegalArgumentException)) {
                                t2 = t;
                                if (!(t instanceof oxw)) {
                                    t2 = new oya(t);
                                }
                            }
                        }
                    }
                }
            }
        }
        t2.printStackTrace();
        final Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t2);
    }
    
    public static void h(final Runnable runnable) {
        phn.g(runnable, "run is null");
    }
    
    public static void i() {
    }
    
    public static void j() {
    }
    
    public static void k() {
    }
    
    public static void l() {
    }
    
    public static void m() {
    }
    
    public static void n() {
    }
    
    public static void o() {
    }
    
    public static Uri p(final String s, final String s2) {
        return new Uri$Builder().scheme("content").authority(s).path(s2).build();
    }
    
    public static final void q(final ojw ojw, final ArrayDeque arrayDeque) {
        if (ojw.h()) {
            final int r = r(ojw.d());
            final int c = omx.c(r + 1);
            if (!arrayDeque.isEmpty() && arrayDeque.peek().d() < c) {
                final int c2 = omx.c(r);
                ojw ojw2 = arrayDeque.pop();
                while (!arrayDeque.isEmpty() && arrayDeque.peek().d() < c2) {
                    ojw2 = new omx(arrayDeque.pop(), ojw2);
                }
                omx omx;
                for (omx = new omx(ojw2, ojw); !arrayDeque.isEmpty() && arrayDeque.peek().d() < omx.c(r(omx.d) + 1); omx = new omx(arrayDeque.pop(), omx)) {}
                arrayDeque.push(omx);
                return;
            }
            arrayDeque.push(ojw);
        }
        else {
            if (ojw instanceof omx) {
                final omx omx2 = (omx)ojw;
                final int[] a = omx.a;
                q(omx2.e, arrayDeque);
                q(omx2.f, arrayDeque);
                return;
            }
            final String value = String.valueOf(ojw.getClass());
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(value);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    private static final int r(int binarySearch) {
        final int n = binarySearch = Arrays.binarySearch(omx.a, binarySearch);
        if (n < 0) {
            binarySearch = -(n + 1) - 1;
        }
        return binarySearch;
    }
}
