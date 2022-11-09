import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eag implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public eag(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static eag b(final pii pii, final pii pii2, final pii pii3) {
        return new eag(pii, pii2, pii3);
    }
    
    public final eaf a() {
        return new eaf(((eah)this.a).a(), (hhu)this.b.get(), (Executor)this.c.get());
    }
}
