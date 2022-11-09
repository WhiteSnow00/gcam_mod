import java.util.concurrent.ScheduledExecutorService;
import android.util.DisplayMetrics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class feq implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    
    public feq(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final fep a() {
        return new fep((gkw)this.a.get(), (klv)this.b.get(), (DisplayMetrics)this.c.get(), ((iii)this.d).a(), (ScheduledExecutorService)this.e.get());
    }
}
