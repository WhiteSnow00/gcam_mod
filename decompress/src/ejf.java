// 
// Decompiled by Procyon v0.6.0
// 

public final class ejf implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public ejf(final pii a) {
        this.a = a;
    }
    
    public ejf(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static ejf b(final pii pii) {
        return new ejf(pii, 2);
    }
    
    public static ejf c(final pii pii) {
        return new ejf(pii, 3);
    }
    
    public static ejf d(final pii pii) {
        return new ejf(pii, 6);
    }
    
    public final niz a() {
        switch (this.b) {
            default: {
                final niz niz = (niz)((ouo)this.a).a;
                niz niz2;
                if (niz.g()) {
                    niz2 = niz.h(((pii)niz.c()).get());
                }
                else {
                    niz2 = nii.a;
                }
                return niz2;
            }
            case 9: {
                return ((cxl)this.a.get()).a(cyh.a);
            }
            case 8: {
                final cxl cxl = (cxl)this.a.get();
                final cxo a = cyj.a;
                cxl.e();
                return nii.a;
            }
            case 7: {
                return niz.h(((egg)this.a).a().getExternalCacheDir());
            }
            case 6: {
                niz niz3;
                if (((cxl)this.a.get()).k(cxs.al)) {
                    niz3 = niz.i(259L);
                }
                else {
                    niz3 = nii.a;
                }
                return niz3;
            }
            case 5: {
                final cxl cxl2 = (cxl)this.a.get();
                final int a2 = cym.a;
                cxl2.c();
                return nii.a;
            }
            case 4: {
                final cxl cxl3 = (cxl)this.a.get();
                final cxo a3 = cxr.a;
                cxl3.c();
                return nii.a;
            }
            case 3: {
                return (niz)((njd)((emd)this.a).a()).a;
            }
            case 2: {
                return (niz)((njd)((emd)this.a).a()).a;
            }
            case 1: {
                final cxl cxl4 = (cxl)this.a.get();
                final cxo a4 = cwv.a;
                cxl4.b();
                return nii.a;
            }
            case 0: {
                final cxl cxl5 = (cxl)this.a.get();
                final cxo a5 = cxy.a;
                cxl5.e();
                return nii.a;
            }
        }
    }
}
