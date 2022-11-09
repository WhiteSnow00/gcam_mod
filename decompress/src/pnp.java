import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnp extends poo
{
    public static final pnp b;
    private static final int d;
    private static volatile Executor pool;
    
    static {
        b = new pnp();
        final Integer n = null;
        String s;
        try {
            System.getProperty("kotlinx.coroutines.default.parallelism");
        }
        finally {
            s = null;
        }
        int intValue;
        if (s != null) {
            final int length = s.length();
            Integer n2 = null;
            Label_0240: {
                if (length == 0) {
                    n2 = n;
                }
                else {
                    int n3 = 0;
                    final char char1 = s.charAt(0);
                    final int c = plr.c(char1);
                    int n4 = -2147483647;
                    int i = 1;
                    boolean b2;
                    if (c < 0) {
                        if (length == 1) {
                            n2 = n;
                            break Label_0240;
                        }
                        if (char1 == '-') {
                            n4 = Integer.MIN_VALUE;
                            b2 = true;
                        }
                        else {
                            n2 = n;
                            if (char1 != '+') {
                                break Label_0240;
                            }
                            b2 = false;
                        }
                    }
                    else {
                        b2 = false;
                        i = 0;
                    }
                    int n5 = -59652323;
                    while (i < length) {
                        final int u = plr.u(s.charAt(i));
                        Label_0145: {
                            if (u >= 0) {
                                int n6;
                                if (n3 < (n6 = n5)) {
                                    if (n5 != -59652323) {
                                        break Label_0145;
                                    }
                                    if (n3 < -214748364) {
                                        break Label_0145;
                                    }
                                    n6 = -214748364;
                                }
                                final int n7 = n3 * 10;
                                if (n7 >= n4 + u) {
                                    n3 = n7 - u;
                                    ++i;
                                    n5 = n6;
                                    continue;
                                }
                            }
                        }
                        n2 = n;
                        break Label_0240;
                    }
                    if (b2) {
                        n2 = n3;
                    }
                    else {
                        n2 = -n3;
                    }
                }
            }
            if (n2 == null || n2 <= 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected positive number in kotlinx.coroutines.default.parallelism, but has ");
                sb.append(s);
                throw new IllegalStateException(sb.toString().toString());
            }
            intValue = n2;
        }
        else {
            intValue = -1;
        }
        d = intValue;
    }
    
    private pnp() {
    }
    
    private final int j() {
        Integer value;
        if ((value = pnp.d).intValue() <= 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = poe.e(Runtime.getRuntime().availableProcessors() - 1, 1);
        }
        return n;
    }
    
    private final Executor k() {
        synchronized (this) {
            final Executor pool = pnp.pool;
            if (pool == null) {
                ExecutorService executorService = null;
                if (System.getSecurityManager() != null) {
                    executorService = this.l();
                }
                else {
                    final ExecutorService executorService2 = null;
                    Class clazz;
                    try {
                        Class.forName("java.util.concurrent.ForkJoinPool");
                    }
                    finally {
                        clazz = null;
                    }
                    if (clazz != null) {
                        if (pnp.d < 0) {
                            try {
                                Object invoke;
                                if (!((invoke = clazz.getMethod("commonPool", (Class[])new Class[0]).invoke(null, new Object[0])) instanceof ExecutorService)) {
                                    invoke = null;
                                }
                                final ExecutorService executorService3 = (ExecutorService)invoke;
                            }
                            finally {
                                executorService = null;
                            }
                            if (executorService != null) {
                                executorService.submit(ohk.d);
                                Integer n2 = null;
                                try {
                                    Object invoke2;
                                    if (!((invoke2 = clazz.getMethod("getPoolSize", (Class[])new Class[0]).invoke(executorService, new Object[0])) instanceof Integer)) {
                                        invoke2 = null;
                                    }
                                    final Integer n = (Integer)invoke2;
                                }
                                finally {
                                    n2 = null;
                                }
                                if (n2 == null || n2 <= 0) {
                                    executorService = null;
                                }
                                if (executorService != null) {
                                    return pnp.pool = executorService;
                                }
                            }
                        }
                        try {
                            Object instance;
                            if (!((instance = clazz.getConstructor(Integer.TYPE).newInstance(pnp.b.j())) instanceof ExecutorService)) {
                                instance = null;
                            }
                            final ExecutorService executorService4 = (ExecutorService)instance;
                        }
                        finally {
                            executorService = executorService2;
                        }
                        if (executorService == null) {
                            executorService = this.l();
                        }
                    }
                    else {
                        executorService = this.l();
                    }
                }
                return pnp.pool = executorService;
            }
            return pool;
        }
    }
    
    private final ExecutorService l() {
        return Executors.newFixedThreadPool(this.j(), new pno(new AtomicInteger()));
    }
    
    @Override
    public final void cj(final pjq pjq, final Runnable runnable) {
        pjq.getClass();
        runnable.getClass();
        try {
            Executor executor = pnp.pool;
            if (executor == null) {
                executor = this.k();
            }
            executor.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            pof.b.s(runnable);
        }
    }
    
    @Override
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }
    
    @Override
    public final String toString() {
        return "CommonPool";
    }
}
