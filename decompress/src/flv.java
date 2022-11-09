// 
// Decompiled by Procyon v0.6.0
// 

public final class flv implements fvp
{
    public final kjk a;
    public final flq b;
    public final fxu c;
    private final fvp d;
    
    public flv(final fvp d, final kjk a, final flq b, final fxu c) {
        d.getClass();
        b.getClass();
        c.getClass();
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        return this.d.a(bjz);
    }
    
    public final klj b() {
        return this.d.h().a;
    }
    
    @Override
    public final krc c(final kvp kvp) {
        return this.d.c(kvp);
    }
    
    @Override
    public final void close() {
        this.d.close();
        this.a.close();
    }
    
    @Override
    public final niz d() {
        return this.d.d();
    }
    
    @Override
    public final oey e() {
        return this.d.e();
    }
    
    @Override
    public final oey f(final fvn fvn, final hhy hhy) {
        return this.d.f(fvn, hhy);
    }
    
    @Override
    public final boolean g() {
        return this.a.a();
    }
    
    @Override
    public final gsy h() {
        return this.d.h();
    }
    
    @Override
    public final kjk i() {
        return this.d.i();
    }
}
