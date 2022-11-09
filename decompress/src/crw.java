import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class crw
{
    private final cxl a;
    
    public crw(final cxl a) {
        this.a = a;
    }
    
    public final int a() {
        return (int)this.a.a(cxr.B).c();
    }
    
    public final int b() {
        return (int)this.a.a(cxr.A).c();
    }
    
    public final int c() {
        return (int)this.a.a(cxr.D).c();
    }
    
    public final int d() {
        return (int)this.a.a(cxr.C).c();
    }
    
    public final long e() {
        return Duration.ofMillis((long)Math.max((int)this.a.a(cxr.z).c(), (int)this.a.a(cxr.y).c())).toNanos();
    }
    
    public final String f() {
        final String i = this.a.i(cxr.bd);
        i.getClass();
        return i;
    }
    
    public final boolean g() {
        return this.a.k(cxr.bb);
    }
    
    public final boolean h() {
        final cxl a = this.a;
        final cxo a2 = cxr.a;
        a.e();
        return this.a.k(cxr.bc);
    }
}
