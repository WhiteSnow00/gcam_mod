import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxr implements oun
{
    private final pii a;
    private final pii b;
    
    public bxr(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final bxu a() {
        return new bxl((Executor)this.a.get(), ((ous)this.b).a());
    }
}
