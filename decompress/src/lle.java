// 
// Decompiled by Procyon v0.6.0
// 

public final class lle implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public lle(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final lld a() {
        final llb a = ((hxm)this.a).a();
        final lkm a2 = ((lkn)this.b).a();
        final lky a3 = ((lkz)this.c).a();
        final lkh lkh = (lkh)this.d.get();
        return new lld(a, a2, a3);
    }
}
