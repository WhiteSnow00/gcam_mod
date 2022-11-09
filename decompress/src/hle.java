// 
// Decompiled by Procyon v0.6.0
// 

public final class hle
{
    private final cxl a;
    private final klv b;
    private final hzg c;
    
    public hle(final cxl a, final klv b, final hzg c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final boolean d() {
        return (boolean)this.b.aQ() || this.a.k(cxr.aT);
    }
    
    public final boolean a() {
        return this.a.k(cxr.aS) && this.d() && !this.c.c().a(hzf.f);
    }
    
    public final boolean b() {
        return this.a.k(cxr.aR) && this.d();
    }
    
    public final void c() {
        final cxl a = this.a;
        final cxo a2 = cxr.a;
        a.e();
    }
}
