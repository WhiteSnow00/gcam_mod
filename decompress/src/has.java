import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class has
{
    public final long a;
    public final niz b;
    public final float c;
    public final niz d;
    public final float e;
    public final niz f;
    public final niz g;
    
    public has(final opc opc, final boolean b) {
        final okk j = oqc.j;
        opc.j(j);
        Object o = opc.f.k(j.d);
        if (o == null) {
            o = j.b;
        }
        else {
            j.d(o);
        }
        final oqc oqc = (oqc)o;
        final int a = opc.a;
        boolean b2 = false;
        if ((a & 0x80) != 0x0 && !b) {
            b2 = true;
        }
        this.a = (int)opc.j;
        niz b3;
        if (b2) {
            b3 = niz.i(opc.k);
        }
        else {
            b3 = nii.a;
        }
        this.b = b3;
        this.c = oqc.d;
        final float e = oqc.e;
        final float f = oqc.f;
        niz g;
        if ((oqc.a & 0x1) != 0x0) {
            opz opz;
            if ((opz = oqc.b) == null) {
                opz = opz.b;
            }
            g = niz.i(nns.j(opz.a));
        }
        else {
            g = nii.a;
        }
        this.g = g;
        niz f2;
        if ((oqc.a & 0x2) != 0x0) {
            opz opz2;
            if ((opz2 = oqc.c) == null) {
                opz2 = opz.b;
            }
            f2 = niz.i(nns.j(opz2.a));
        }
        else {
            f2 = nii.a;
        }
        this.f = f2;
        final int n = oqc.a & 0x40;
        float c;
        if (n != 0) {
            oqd oqd;
            if ((oqd = oqc.h) == null) {
                oqd = oqd.d;
            }
            c = oqd.c;
        }
        else {
            c = 0.0f;
        }
        this.e = c;
        niz d;
        if (n != 0) {
            oqd oqd2;
            if ((oqd2 = oqc.h) == null) {
                oqd2 = oqd.d;
            }
            d = niz.i(nns.j(oqd2.b));
        }
        else {
            d = nii.a;
        }
        this.d = d;
    }
}
