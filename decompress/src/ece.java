// 
// Decompiled by Procyon v0.6.0
// 

public final class ece implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public ece(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final ecd a() {
        final ecb ecb = (ecb)this.a.get();
        final ebo ebo = (ebo)this.b.get();
        return new ecd((cxl)this.c.get());
    }
}
