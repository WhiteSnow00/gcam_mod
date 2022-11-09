import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppo
{
    private static final Method a;
    
    static {
        Method a2;
        try {
            ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        }
        finally {
            a2 = null;
        }
        a = a2;
    }
    
    public static final void a(final Executor executor) {
        executor.getClass();
        Executor executor2 = executor;
        try {
            if (!(executor instanceof ScheduledThreadPoolExecutor)) {
                executor2 = null;
            }
            final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)executor2;
            if (scheduledThreadPoolExecutor != null) {
                final Method a = ppo.a;
                if (a != null) {
                    a.invoke(scheduledThreadPoolExecutor, true);
                }
            }
        }
        finally {}
    }
}
