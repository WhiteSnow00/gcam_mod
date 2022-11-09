import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inz implements oun
{
    private final pii a;
    
    public inz(final pii a) {
        this.a = a;
    }
    
    public static njp b(final AtomicReference atomicReference) {
        return new inx(atomicReference);
    }
    
    public final njp a() {
        return b((AtomicReference)this.a.get());
    }
}
