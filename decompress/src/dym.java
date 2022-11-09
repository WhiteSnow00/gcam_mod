import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dym implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    
    public dym(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static dym b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new dym(pii, pii2, pii3, pii4, pii5, pii6, pii7);
    }
    
    public final dyl a() {
        final dyp dyp = (dyp)this.a.get();
        final fxu a = ((fzw)this.b).a();
        final dty a2 = ((dtz)this.c).a();
        final oui a3 = oum.a(this.d);
        final Executor executor = (Executor)this.e.get();
        final cxl cxl = (cxl)this.f.get();
        return new dyl(dyp, a, a2, a3, executor, (kse)this.g.get());
    }
}
