// 
// Decompiled by Procyon v0.6.0
// 

public final class knm implements knk
{
    public final kns a;
    
    public knm(final kns a) {
        this.a = a;
    }
    
    @Override
    public final niz a(final kmv kmv, final lfj lfj, final boolean b, final niz niz, final boolean b2) {
        final kno d = this.a.d;
        if (d == null) {
            return nii.a;
        }
        final int j = krf.j(d.g, kmv, b, niz);
        kno kno;
        if (b) {
            final knn b3 = kno.b(d);
            b3.i(5);
            b3.k(1);
            b3.j(65536);
            b3.h(j);
            kno = b3.a();
        }
        else {
            final knn b4 = kno.b(d);
            b4.i(2);
            b4.k(8);
            b4.j(32768);
            b4.h(j);
            kno = b4.a();
        }
        return niz.i(kno);
    }
}
