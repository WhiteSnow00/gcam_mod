import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dke implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public dke(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static dke b(final pii pii, final pii pii2, final pii pii3) {
        return new dke(pii, pii2, pii3);
    }
    
    public final dkd a() {
        dfk.c();
        return new dkd((dsd)this.a.get(), (Executor)this.b.get(), ((egg)this.c).a());
    }
}
