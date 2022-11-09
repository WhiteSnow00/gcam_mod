import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eia implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public eia(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ehy a() {
        return new ehy((dsd)this.a.get(), (eya)this.b.get(), (Executor)this.c.get(), (cxl)this.d.get());
    }
}
