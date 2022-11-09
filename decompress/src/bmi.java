// 
// Decompiled by Procyon v0.6.0
// 

public final class bmi implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public bmi(final pii a) {
        this.a = a;
    }
    
    public bmi(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static bmi b(final pii pii) {
        return new bmi(pii, 1);
    }
    
    public final Boolean a() {
        final int b = this.b;
        final boolean b2 = true;
        final boolean b3 = true;
        final boolean b4 = true;
        final boolean b5 = true;
        final boolean b6 = true;
        boolean b7 = true;
        final Boolean value = false;
        switch (b) {
            default: {
                final cxl cxl = (cxl)this.a.get();
                final cxo a = cwv.a;
                cxl.b();
                return value;
            }
            case 14: {
                return gvv.a((cxl)this.a.get());
            }
            case 13: {
                final cxl cxl2 = (cxl)this.a.get();
                final cxm a2 = cxx.a;
                cxl2.e();
                return value;
            }
            case 12: {
                return ((cxl)this.a.get()).k(cxx.C);
            }
            case 11: {
                return ((cxl)this.a.get()).k(cxx.D);
            }
            case 10: {
                final cxl cxl3 = (cxl)this.a.get();
                if (!cxl3.k(cxx.w) || !cxl3.k(cxx.x)) {
                    b7 = false;
                }
                return b7;
            }
            case 9: {
                return ((cxl)this.a.get()).k(cxx.a);
            }
            case 8: {
                final cxl cxl4 = (cxl)this.a.get();
                return cxl4.k(cxx.y) && cxl4.k(cxx.z) && b2;
            }
            case 7: {
                return huf.c((cxl)this.a.get(), dna.a());
            }
            case 6: {
                final cxl cxl5 = (cxl)this.a.get();
                final cxo a3 = cxr.a;
                cxl5.e();
                return value;
            }
            case 5: {
                final cxl cxl6 = (cxl)this.a.get();
                return cxl6.k(cww.b) && cxl6.k(cww.f) && b3;
            }
            case 4: {
                final cxl cxl7 = (cxl)this.a.get();
                return cxl7.k(cww.b) && cxl7.k(cww.g) && b4;
            }
            case 3: {
                final cxl cxl8 = (cxl)this.a.get();
                final cxo a4 = cxr.a;
                cxl8.e();
                return value;
            }
            case 2: {
                final cxl cxl9 = (cxl)this.a.get();
                final cxo a5 = cxr.a;
                cxl9.d();
                return value;
            }
            case 1: {
                return ((cxl)this.a.get()).k(cxk.g) && jlk.h != null && jlk.i != null && jlk.j != null && jlk.k != null && b5;
            }
            case 0: {
                final cxl cxl10 = (cxl)this.a.get();
                return cxl10.k(cxk.c) && cxl10.k(cxr.as) && b6;
            }
        }
    }
}
