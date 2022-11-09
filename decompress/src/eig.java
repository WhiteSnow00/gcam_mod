// 
// Decompiled by Procyon v0.6.0
// 

public final class eig implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public eig(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final eif a() {
        return new eif((hif)this.a.get(), (cxl)this.b.get(), (drs)this.c.get());
    }
}
