import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drp implements oun
{
    private final pii a;
    private final pii b;
    
    public drp(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final dro a() {
        return new dro(((drr)this.a).a(), (Executor)this.b.get());
    }
}
