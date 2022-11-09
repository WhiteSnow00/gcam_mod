// 
// Decompiled by Procyon v0.6.0
// 

public final class dwl implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public dwl(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static dwl b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new dwl(pii, pii2, pii3, pii4);
    }
    
    public final dwk a() {
        return new dwk((cxl)this.a.get(), (jdi)this.b.get(), (gbf)this.c.get(), ((krp)this.d).a());
    }
}
