import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class ofi
{
    protected ofi() {
    }
    
    public static int A(final int... array) {
        int i = 1;
        njo.d(true);
        int n = array[0];
        while (i < 4) {
            final int n2 = array[i];
            int n3;
            if (n2 > (n3 = n)) {
                n3 = n2;
            }
            ++i;
            n = n3;
        }
        return n;
    }
    
    public static int B(final int... array) {
        int i = 1;
        njo.d(true);
        int n = array[0];
        while (i < 4) {
            final int n2 = array[i];
            int n3;
            if (n2 < (n3 = n)) {
                n3 = n2;
            }
            ++i;
            n = n3;
        }
        return n;
    }
    
    public static int C(final long n) {
        if (n > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (n < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int)n;
    }
    
    public static List D(final int... array) {
        final int length = array.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new ocj(array, 0, length);
    }
    
    public static int[] E() {
        return new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16 };
    }
    
    public static int F(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int G(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static ofa b(final ExecutorService executorService) {
        ofa ofa;
        if (executorService instanceof ofa) {
            ofa = (ofa)executorService;
        }
        else if (executorService instanceof ScheduledExecutorService) {
            ofa = new ofh((ScheduledExecutorService)executorService);
        }
        else {
            ofa = new ofe(executorService);
        }
        return ofa;
    }
    
    public static ofa c() {
        return new ofd();
    }
    
    public static ofb d(final ScheduledExecutorService scheduledExecutorService) {
        ofb ofb;
        if (scheduledExecutorService instanceof ofb) {
            ofb = (ofb)scheduledExecutorService;
        }
        else {
            ofb = new ofh(scheduledExecutorService);
        }
        return ofb;
    }
    
    public static Executor e(final Executor executor) {
        return new ofm(executor);
    }
    
    static Executor f(final Executor executor, final odc odc) {
        executor.getClass();
        if (executor == odx.a) {
            return executor;
        }
        return new ofc(executor, odc);
    }
    
    public static oer g(final Iterable iterable) {
        return new oer(false, nns.i(iterable));
    }
    
    @SafeVarargs
    public static oer h(final oey... array) {
        return new oer(false, nns.k(array));
    }
    
    public static oer i(final Iterable iterable) {
        return new oer(true, nns.i(iterable));
    }
    
    public static oey j(final Iterable iterable) {
        return new ods(nns.i(iterable), true);
    }
    
    @SafeVarargs
    public static oey k(final oey... array) {
        return new ods(nns.k(array), true);
    }
    
    public static oey l() {
        return new oeu();
    }
    
    public static oey m(final Throwable t) {
        t.getClass();
        return new oeu(t);
    }
    
    public static oey n(final Object o) {
        if (o == null) {
            return oev.a;
        }
        return new oev(o);
    }
    
    public static oey o(final oey oey) {
        if (oey.isDone()) {
            return oey;
        }
        final oes oes = new oes(oey);
        oey.d(oes, odx.a);
        return oes;
    }
    
    public static oey p(final Runnable runnable, final Executor executor) {
        final ofv h = ofv.h(runnable, null);
        executor.execute(h);
        return h;
    }
    
    public static oey q(final Callable callable, final Executor executor) {
        final ofv g = ofv.g(callable);
        executor.execute(g);
        return g;
    }
    
    public static oey r(final odo odo, final Executor executor) {
        final ofv f = ofv.f(odo);
        executor.execute(f);
        return f;
    }
    
    public static oey s(final Iterable iterable) {
        return new ods(nns.i(iterable), false);
    }
    
    public static oey t(final oey oey, final long n, final TimeUnit timeUnit, final ScheduledExecutorService scheduledExecutorService) {
        if (oey.isDone()) {
            return oey;
        }
        final ofs ofs = new ofs(oey);
        final ofq ofq = new ofq(ofs);
        ofs.b = scheduledExecutorService.schedule(ofq, n, timeUnit);
        oey.d(ofq, odx.a);
        return ofs;
    }
    
    public static Object u(final Future future) {
        njo.r(future.isDone(), "Future was expected to be done: %s", future);
        return okn.C(future);
    }
    
    public static Object v(final Future future) {
        future.getClass();
        try {
            return okn.C(future);
        }
        catch (final ExecutionException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof Error) {
                throw new ody((Error)cause);
            }
            throw new ofw(cause);
        }
    }
    
    public static void w(final oey oey, final oen oen, final Executor executor) {
        oen.getClass();
        oey.d(new oep(oey, oen), executor);
    }
    
    public static Callable x() {
        return new mpx(3);
    }
    
    public static int y(final int n, final int n2, final int n3) {
        njo.j(n2 <= n3, "min (%s) must be less than or equal to max (%s)", n2, n3);
        return Math.min(Math.max(n, n2), n3);
    }
    
    public static int z(final int[] array, final int n, int i, final int n2) {
        while (i < n2) {
            if (array[i] == n) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public byte[] a() {
        throw null;
    }
}
