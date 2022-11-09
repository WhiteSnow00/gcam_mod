// 
// Decompiled by Procyon v0.6.0
// 

public final class hea implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public hea(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final hdz a() {
        final klv klv = (klv)this.a.get();
        final cxl cxl = (cxl)this.b.get();
        ((hdy)this.c).a();
        return new hdz(klv, cxl);
    }
}
