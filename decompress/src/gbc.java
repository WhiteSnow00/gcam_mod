import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbc implements oun
{
    private final pii a;
    
    public gbc(final pii a) {
        this.a = a;
    }
    
    public static gbc b(final pii pii) {
        return new gbc(pii);
    }
    
    public final gbb a() {
        return new gbb((Executor)this.a.get());
    }
}
