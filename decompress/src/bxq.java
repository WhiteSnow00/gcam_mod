import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxq implements oun
{
    private final pii a;
    private final pii b;
    
    public bxq(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final bxv a() {
        return new bxn((Executor)this.a.get(), ((ous)this.b).a());
    }
}
