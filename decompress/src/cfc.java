// 
// Decompiled by Procyon v0.6.0
// 

public final class cfc implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public cfc(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final cfb a() {
        final kna kna = (kna)this.a.get();
        final krf krf = (krf)this.b.get();
        return new cfb(kna, (lfw)this.c.get());
    }
}
