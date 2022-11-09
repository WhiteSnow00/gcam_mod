import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kss implements oun
{
    private final pii a;
    private final pii b;
    
    public kss(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final ksr a() {
        return new ksr(((krp)this.a).a(), (Executor)this.b.get());
    }
}
