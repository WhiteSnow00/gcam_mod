import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eys
{
    public static final long a;
    public final krr b;
    public final eyt c;
    public final ScheduledExecutorService d;
    
    static {
        a = TimeUnit.SECONDS.toNanos(10L);
    }
    
    public eys(final eyt c, final krq krq, final ScheduledExecutorService d) {
        this.c = c;
        this.b = krq.a("ProcessingEvent");
        this.d = d;
    }
}
