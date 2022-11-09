import android.os.Trace;
import java.util.ArrayDeque;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nhz
{
    public static final WeakHashMap a;
    private static final ThreadLocal b;
    
    static {
        a = new WeakHashMap();
        b = new nhv();
        new ArrayDeque();
        new ArrayDeque();
    }
    
    static nhr a() {
        return nhz.b.get().c;
    }
    
    static nhr b() {
        nhr a;
        if ((a = a()) == null) {
            a = new nhm();
        }
        return a;
    }
    
    static nhr c(final nhr nhr) {
        return h(nhz.b.get(), nhr);
    }
    
    static String d(final nhr nhr) {
        if (nhr.a() == null) {
            return nhr.b();
        }
        final String d = d(nhr.a());
        final String b = nhr.b();
        final StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 4 + b.length());
        sb.append(d);
        sb.append(" -> ");
        sb.append(b);
        return sb.toString();
    }
    
    static void e(final nhr nhr) {
        nhr.getClass();
        final nhy nhy = nhz.b.get();
        final nhr c = nhy.c;
        njo.s(nhr == c, "Wrong trace, expected %s but got %s", c.b(), nhr.b());
        h(nhy, c.a());
    }
    
    public static nho f(final String s) {
        return g(s, nhp.a, true);
    }
    
    public static nho g(final String s, final nhq nhq, final boolean b) {
        final nhr a = a();
        nhr nhr;
        if (a == null) {
            nhr = new nhn(s, nhq, b);
        }
        else if (a instanceof nhh) {
            nhr = ((nhh)a).d(s, nhq, b);
        }
        else {
            nhr = a.f(s, nhq);
        }
        c(nhr);
        return new nho(nhr);
    }
    
    private static nhr h(final nhy nhy, final nhr c) {
        final nhr c2 = nhy.c;
        if (c2 == c) {
            return c;
        }
        if (c2 == null) {
            nhy.b = nhw.a();
        }
        if (nhy.b) {
            l(c2, c);
        }
        nhy.c = c;
        final nhx a = nhy.a;
        return c2;
    }
    
    private static void i(final String s) {
        String substring = s;
        if (s.length() > 127) {
            substring = s.substring(0, 127);
        }
        Trace.beginSection(substring);
    }
    
    private static void j(final nhr nhr) {
        if (nhr.a() != null) {
            j(nhr.a());
        }
        i(nhr.b());
    }
    
    private static void k(final nhr nhr) {
        Trace.endSection();
        if (nhr.a() != null) {
            k(nhr.a());
        }
    }
    
    private static void l(final nhr nhr, final nhr nhr2) {
        if (nhr != null) {
            if (nhr2 != null) {
                if (nhr.a() == nhr2) {
                    Trace.endSection();
                    return;
                }
                if (nhr == nhr2.a()) {
                    i(nhr2.b());
                    return;
                }
            }
            k(nhr);
        }
        if (nhr2 != null) {
            j(nhr2);
        }
    }
}
