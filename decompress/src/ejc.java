// 
// Decompiled by Procyon v0.6.0
// 

public final class ejc implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    
    public ejc(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final ejb a() {
        return new ejb(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
