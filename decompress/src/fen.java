// 
// Decompiled by Procyon v0.6.0
// 

public final class fen implements oun
{
    private final pii a;
    private final pii b;
    
    public fen(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static fen b(final pii pii, final pii pii2) {
        return new fen(pii, pii2);
    }
    
    public final fem a() {
        return new fem((fev)this.a.get(), (fdx)this.b.get());
    }
}
