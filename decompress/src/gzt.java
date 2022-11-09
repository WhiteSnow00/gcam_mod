// 
// Decompiled by Procyon v0.6.0
// 

public final class gzt implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public gzt(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static gzt b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new gzt(pii, pii2, pii3, pii4);
    }
    
    public final gzs a() {
        return new gzs(((bmi)this.a).a(), ((bmi)this.b).a(), ((bmi)this.c).a(), ((bmi)this.d).a());
    }
}
