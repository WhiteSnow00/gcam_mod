// 
// Decompiled by Procyon v0.6.0
// 

public final class cpz implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public cpz(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final cpy a() {
        return new cpy(((eft)this.a).a(), (ihg)this.b.get(), (cxl)this.c.get());
    }
}
