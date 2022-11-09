import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dio implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public dio(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static dio b(final pii pii, final pii pii2, final pii pii3) {
        return new dio(pii, pii2, pii3);
    }
    
    public final din a() {
        return new din(dfk.b(), (Executor)this.a.get(), (dsd)this.b.get(), ((krp)this.c).a());
    }
}
