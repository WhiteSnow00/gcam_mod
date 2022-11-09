// 
// Decompiled by Procyon v0.6.0
// 

public final class cpg implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public cpg(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public cpg(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cpg(final pii b, final pii a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cpg(final pii b, final pii a, final int c, final char[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cpg(final pii b, final pii a, final int c, final float[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cpg(final pii b, final pii a, final int c, final int[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cpg(final pii b, final pii a, final int c, final short[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cpg(final pii b, final pii a, final int c, final boolean[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cpg(final pii b, final pii a, final int c, final byte[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cpg(final pii b, final pii a, final int c, final char[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cpg(final pii b, final pii a, final int c, final short[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static cpg b(final pii pii, final pii pii2) {
        return new cpg(pii, pii2, 3);
    }
    
    public static cpg c(final pii pii, final pii pii2) {
        return new cpg(pii, pii2, 4);
    }
    
    public static cpg d(final pii pii, final pii pii2) {
        return new cpg(pii, pii2, 11);
    }
    
    public static cpg e(final pii pii, final pii pii2) {
        return new cpg(pii, pii2, 12, (boolean[])null);
    }
    
    public static cpg f(final pii pii, final pii pii2) {
        return new cpg(pii, pii2, 13);
    }
    
    public final niz a() {
        switch (this.c) {
            default: {
                final pii a = this.a;
                niz niz;
                if (!(boolean)this.b.get()) {
                    niz = nii.a;
                }
                else {
                    niz = ((emd)a).a();
                }
                return niz;
            }
            case 19: {
                final pii b = this.b;
                niz niz2;
                if (!(boolean)this.a.get()) {
                    niz2 = nii.a;
                }
                else {
                    niz2 = ((emd)b).a();
                }
                return niz2;
            }
            case 18: {
                final pii a2 = this.a;
                niz niz3;
                if (this.b.get()) {
                    niz3 = nii.a;
                }
                else {
                    niz3 = niz.i(a2.get());
                }
                return niz3;
            }
            case 17: {
                final cxl cxl = (cxl)this.b.get();
                final pii a3 = this.a;
                niz niz4;
                if (cxl.k(cxr.aC)) {
                    niz4 = ((emd)a3).a();
                }
                else {
                    niz4 = nii.a;
                }
                return niz4;
            }
            case 16: {
                final pii b2 = this.b;
                niz niz5;
                if (!(boolean)this.a.get()) {
                    niz5 = nii.a;
                }
                else {
                    niz5 = ((emd)b2).a();
                }
                return niz5;
            }
            case 15: {
                final pii a4 = this.a;
                niz niz6;
                if ((int)((cxl)this.b.get()).a(cyd.a).c() != 0) {
                    niz6 = ((emd)a4).a();
                }
                else {
                    niz6 = nii.a;
                }
                return niz6;
            }
            case 14: {
                final pii b3 = this.b;
                niz niz7;
                if (((bmi)this.a).a()) {
                    niz7 = ((emd)b3).a();
                }
                else {
                    niz7 = nii.a;
                }
                return niz7;
            }
            case 13: {
                final ddm a5 = ((ddn)this.a).a();
                final niz niz8 = (niz)this.b.get();
                niz niz9;
                if (!a5.b()) {
                    niz9 = nii.a;
                }
                else if (!niz8.g()) {
                    niz9 = nii.a;
                }
                else {
                    niz9 = niz.i(((pii)niz8.c()).get());
                }
                return niz9;
            }
            case 12: {
                final niz niz10 = (niz)this.b.get();
                final niz niz11 = (niz)this.a.get();
                niz niz12;
                if (niz11.g() && (boolean)niz11.c() && niz10.g()) {
                    niz12 = niz.i(((pii)niz10.c()).get());
                }
                else {
                    niz12 = nii.a;
                }
                return niz12;
            }
            case 11: {
                final pii a6 = this.a;
                niz a7;
                if (((ddn)this.b).a().a()) {
                    a7 = (niz)a6.get();
                }
                else {
                    a7 = nii.a;
                }
                pqf.k(a7);
                return a7;
            }
            case 10: {
                final pii b4 = this.b;
                niz niz13;
                if (!((ddn)this.a).a().a()) {
                    niz13 = nii.a;
                }
                else {
                    niz13 = ((emd)b4).a();
                }
                return niz13;
            }
            case 9: {
                final pii a8 = this.a;
                niz niz14;
                if (((cxl)this.b.get()).k(cxv.g)) {
                    niz14 = ((emd)a8).a();
                }
                else {
                    niz14 = nii.a;
                }
                return niz14;
            }
            case 8: {
                final pii a9 = this.a;
                final cxl cxl2 = (cxl)this.b.get();
                final cxo a10 = cxr.a;
                cxl2.f();
                final niz niz15 = (niz)((ouo)a9).a;
                pqf.k(niz15);
                return niz15;
            }
            case 7: {
                final pii b5 = this.b;
                final cxl cxl3 = (cxl)this.a.get();
                final cxm a11 = cxt.a;
                cxl3.f();
                return ((emd)b5).a();
            }
            case 6: {
                dqv.c((klv)this.b.get(), (cxl)this.a.get());
                return nii.a;
            }
            case 5: {
                dqv.c((klv)this.b.get(), (cxl)this.a.get());
                return nii.a;
            }
            case 4: {
                niz a12 = (niz)((ouo)this.a).a;
                if (!((ggk)this.b).b()) {
                    a12 = nii.a;
                }
                pqf.k(a12);
                return a12;
            }
            case 3: {
                niz a13 = (niz)((ouo)this.a).a;
                if (!((ggk)this.b).b()) {
                    a13 = nii.a;
                }
                pqf.k(a13);
                return a13;
            }
            case 2: {
                final pii a14 = this.a;
                niz niz16;
                if (((cxl)this.b.get()).k(cwv.J)) {
                    niz16 = ((emd)a14).a();
                }
                else {
                    niz16 = nii.a;
                }
                return niz16;
            }
            case 1: {
                final pii a15 = this.a;
                niz niz17;
                if (((cxl)this.b.get()).k(cwv.H)) {
                    niz17 = ((emd)a15).a();
                }
                else {
                    niz17 = nii.a;
                }
                return niz17;
            }
            case 0: {
                final pii a16 = this.a;
                niz niz18;
                if (((cxl)this.b.get()).k(cwv.H)) {
                    niz18 = ((emd)a16).a();
                }
                else {
                    niz18 = nii.a;
                }
                return niz18;
            }
        }
    }
}
