import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dht implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public dht(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static dht b(final pii pii, final pii pii2, final pii pii3) {
        return new dht(pii, pii2, pii3);
    }
    
    public final dhs a() {
        return new dhs((liz)this.a.get(), dfk.b(), (Executor)this.b.get(), (int)this.c.get());
    }
}
