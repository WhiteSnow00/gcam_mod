import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqt
{
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    
    static {
        a = pqf.b("kotlinx.coroutines.scheduler.resolution.ns", 100000L);
        pqf.a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);
        c = pqf.a("kotlinx.coroutines.scheduler.max.pool.size", poe.g(pqg.a * 128, b = pqf.a("kotlinx.coroutines.scheduler.core.pool.size", poe.e(pqg.a, 2), 1, 0, 8), 2097150), 0, 2097150, 4);
        d = TimeUnit.SECONDS.toNanos(pqf.b("kotlinx.coroutines.scheduler.keep.alive.sec", 60L));
    }
}
