import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgr
{
    public static final boolean a;
    public static final int b;
    static final AtomicReference c;
    public static final Map d;
    
    static {
        c = new AtomicReference();
        d = (Map)new ConcurrentHashMap();
        final Properties properties = System.getProperties();
        final pgq pgq = new pgq();
        Label_0099: {
            Label_0094: {
                if (properties.containsKey("rx2.purge-enabled")) {
                    final boolean boolean1 = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
                    pgq.a = boolean1;
                    if (!boolean1) {
                        break Label_0094;
                    }
                }
                else {
                    pgq.a = true;
                }
                if (properties.containsKey("rx2.purge-period-seconds")) {
                    try {
                        pgq.b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                        break Label_0099;
                    }
                    catch (final NumberFormatException ex) {}
                }
            }
            pgq.b = 1;
        }
        final boolean b2 = a = pgq.a;
        b = pgq.b;
        if (b2) {
            while (true) {
                final AtomicReference c2 = pgr.c;
                if (c2.get() != null) {
                    break;
                }
                final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, new pgm("RxSchedulerPurge"));
                if (c2.compareAndSet(null, scheduledThreadPool)) {
                    final ohk ohk = new ohk(3);
                    final int b3 = pgr.b;
                    scheduledThreadPool.scheduleAtFixedRate(ohk, b3, b3, TimeUnit.SECONDS);
                    return;
                }
                scheduledThreadPool.shutdownNow();
            }
        }
    }
    
    public static ScheduledExecutorService a(final ThreadFactory threadFactory) {
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (pgr.a && scheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            pgr.d.put(scheduledThreadPool, scheduledThreadPool);
        }
        return scheduledThreadPool;
    }
}
