// 
// Decompiled by Procyon v0.6.0
// 

public final class drb implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public drb(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final dra a() {
        return new dra((dqx)this.a.get(), ((drf)this.b).a(), (drs)this.c.get());
    }
}
