import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public interface ofb extends ScheduledExecutorService, ofa
{
    off d(final Runnable p0, final long p1, final TimeUnit p2);
    
    off e(final Callable p0, final long p1, final TimeUnit p2);
    
    off f(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
    
    off g(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
}
