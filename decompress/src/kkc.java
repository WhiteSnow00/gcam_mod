import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

class kkc extends oej implements RunnableScheduledFuture
{
    private final RunnableScheduledFuture a;
    
    public kkc(final RunnableScheduledFuture a) {
        super(a);
        this.a = a;
    }
    
    @Override
    public final long getDelay(final TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
    
    @Override
    public final boolean isPeriodic() {
        return this.a.isPeriodic();
    }
    
    @Override
    public void run() {
        this.a.run();
    }
}
