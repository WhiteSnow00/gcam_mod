// 
// Decompiled by Procyon v0.6.0
// 

public final class blb implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public blb(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static blb b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new blb(pii, pii2, pii4);
    }
    
    public final bla a() {
        return new bla((fwk)this.a.get(), ((fww)this.b).a(), bmn.b(), ((bmi)this.c).a());
    }
}
