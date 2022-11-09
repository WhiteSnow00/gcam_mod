import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class off extends oel implements ScheduledFuture, oey
{
    private final ScheduledFuture a;
    
    public off(final oey oey, final ScheduledFuture a) {
        super(oey);
        this.a = a;
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        final boolean cancel = super.cancel(b);
        if (cancel) {
            this.a.cancel(b);
        }
        return cancel;
    }
    
    @Override
    public final long getDelay(final TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
