// 
// Decompiled by Procyon v0.6.0
// 

public final class mfw implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public mfw(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final mfv a() {
        return new mfv((String)this.a.get(), ((mgo)this.b).a(), (lmy)this.c.get(), this.d);
    }
}
