import j$.time.Instant;

// 
// Decompiled by Procyon v0.6.0
// 

final class dcd extends dcc
{
    public dcd(final dce dce, final long n) {
        super(dce, hin.a(null, n, "STUB"), dce.f.instant(), hio.a);
    }
    
    @Override
    public final void a() {
        this.d("ShotStub: canceled");
    }
    
    @Override
    public final void b(final String s) {
        this.e(s);
    }
    
    @Override
    public final void c(final Instant instant, final String s) {
        this.e(s);
    }
    
    @Override
    public final void f(final Integer n) {
        this.e("ShotStub: makingProgress");
    }
    
    @Override
    public final void g(final Instant instant) {
        this.d("ShotStub: markStuck");
    }
    
    @Override
    public final void h() {
        this.d("ShotStub: persisted");
    }
    
    @Override
    public final void i() {
        this.d("ShotStub: started");
    }
}
