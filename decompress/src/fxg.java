// 
// Decompiled by Procyon v0.6.0
// 

public final class fxg implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    
    public fxg(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final fxf a() {
        final kue kue = (kue)this.a.get();
        final fmb a = ((fmc)this.b).a();
        final lfw lfw = (lfw)this.c.get();
        final ixn ixn = (ixn)this.d.get();
        final cxl cxl = (cxl)this.e.get();
        final der der = (der)this.f.get();
        return new fxf(kue, a, lfw, ixn, cxl);
    }
}
