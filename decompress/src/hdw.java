// 
// Decompiled by Procyon v0.6.0
// 

public final class hdw implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public hdw(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final hdv a() {
        return new hdv(((ejp)this.a).b(), (klv)this.b.get(), (klj)this.c.get(), (kjm)this.d.get());
    }
}
