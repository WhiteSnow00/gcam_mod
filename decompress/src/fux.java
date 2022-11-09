// 
// Decompiled by Procyon v0.6.0
// 

public final class fux implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public fux(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static fux b(final pii pii, final pii pii2, final pii pii3) {
        return new fux(pii, pii2, pii3);
    }
    
    public final fup a() {
        final cxl cxl = (cxl)this.a.get();
        final int intValue = ((bxo)this.b).a();
        final int intValue2 = ((bxo)this.c).a();
        final fuo fuo = new fuo();
        fuo.b(15);
        fuo.d();
        fuo.c = 5;
        fuo.c(2);
        fuo.a();
        fuo.f = 1000L;
        fuo.g = 2;
        fuo.b(intValue - intValue2);
        fuo.d();
        final cxm a = cxx.a;
        cxl.b();
        fuo.a();
        if (cxl.k(cxx.q) || cxl.k(cxx.r)) {
            fuo.c(1);
        }
        final Integer a2 = fuo.a;
        if (a2 != null && fuo.b != null && fuo.c != null && fuo.d != null && fuo.e != null && fuo.f != null && fuo.g != null) {
            return new fup(a2, fuo.b, fuo.c, fuo.d, fuo.e, fuo.f, fuo.g);
        }
        throw new IllegalStateException();
    }
}
