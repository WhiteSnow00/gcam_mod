import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cuo implements oun
{
    private final pii a;
    private final pii b;
    
    public cuo(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final cvd a() {
        return new cuh((Executor)this.a.get(), ((ous)this.b).a());
    }
}
