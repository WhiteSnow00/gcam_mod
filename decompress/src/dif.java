// 
// Decompiled by Procyon v0.6.0
// 

public final class dif implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    
    public dif(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static dif a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new dif(pii, pii2, pii3, pii4, pii5, pii6, pii7);
    }
    
    public final Runnable b() {
        final boolean booleanValue = (boolean)this.a.get();
        final dir dir = (dir)this.b.get();
        final boolean booleanValue2 = (boolean)this.c.get();
        final pii d = this.d;
        final boolean booleanValue3 = (boolean)this.e.get();
        final pii f = this.f;
        final fxu a = ((fzw)this.g).a();
        Runnable a2;
        if (!booleanValue) {
            a2 = ofj.a;
        }
        else {
            a2 = new did(a, dir, booleanValue2, d, booleanValue3, f);
        }
        return a2;
    }
}
