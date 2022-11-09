import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbe implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public hbe(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final hbd a() {
        return new hbd((Executor)this.a.get(), (klv)this.b.get(), (klv)this.c.get(), (hzf)this.d.get());
    }
}
