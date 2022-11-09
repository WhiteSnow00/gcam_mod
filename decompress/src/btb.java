import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btb implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public btb(final pii a) {
        this.a = a;
    }
    
    public btb(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ExecutorService a() {
        switch (this.b) {
            default: {
                final ofa ofa = (ofa)this.a.get();
                final ScheduledExecutorService a = bsy.a;
                pqf.k(ofa);
                return ofa;
            }
            case 1: {
                return bsy.g((ScheduledExecutorService)this.a.get());
            }
            case 0: {
                return bsy.h((ScheduledExecutorService)this.a.get());
            }
        }
    }
}
