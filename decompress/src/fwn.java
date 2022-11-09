import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwn implements oun
{
    private final pii a;
    private final pii b;
    
    public fwn(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static fwn a(final pii pii, final pii pii2) {
        return new fwn(pii, pii2);
    }
    
    public final kkd b() {
        return new kkd((ScheduledExecutorService)this.a.get(), ((bxo)this.b).a(), TimeUnit.SECONDS);
    }
}
