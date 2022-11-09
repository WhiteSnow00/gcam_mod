import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public class mvc
{
    public static int b(final oni oni, final oni oni2) {
        oni.getClass();
        oni2.getClass();
        ooc.d(oni);
        ooc.d(oni2);
        final long a = oni.a;
        final long a2 = oni2.a;
        long n = lcmp(a, a2);
        if (a == a2) {
            final int b = oni.b;
            final int b2 = oni2.b;
            if (b == b2) {
                n = 0;
            }
            else if (b < b2) {
                n = -1;
            }
            else {
                n = 1;
            }
        }
        return (int)n;
    }
    
    public static long c(final okj okj) {
        okj.getClass();
        long n;
        if (plr.b(okj, ooa.b)) {
            n = Long.MAX_VALUE;
        }
        else {
            if (!plr.b(okj, ooa.a)) {
                ooa.c(okj);
                return och.j(och.k(okj.a, 1000L), okj.b / 1000000L);
            }
            n = Long.MIN_VALUE;
        }
        return n;
    }
    
    public static owt d(final owt owt, final pkn pkn) {
        final ozq ozq = new ozq(new mum(pkn));
        pip.i();
        final ozn ozn = new ozn(owt, ozq);
        pip.i();
        return ozn;
    }
    
    public static oxk e(final owt owt, final pkn pkn) {
        final pem pem = new pem(new mum(pkn));
        pip.o();
        return owt.g(pem);
    }
    
    public static oxk f(final owt owt, final Throwable t) {
        t.getClass();
        return owt.g(oxk.g(t));
    }
}
