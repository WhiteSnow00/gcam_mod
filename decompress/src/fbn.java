// 
// Decompiled by Procyon v0.6.0
// 

public final class fbn implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public fbn(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final fbm a() {
        final cxl cxl = (cxl)this.a.get();
        final kjm kjm = (kjm)this.b.get();
        return new fbm(cxl, ((eft)this.c).a());
    }
}
