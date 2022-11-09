// 
// Decompiled by Procyon v0.6.0
// 

public final class knq implements knk
{
    private final /* synthetic */ int a;
    
    public knq() {
    }
    
    public knq(final int a) {
        this.a = a;
    }
    
    @Override
    public final niz a(final kmv kmv, final lfj lfj, final boolean b, final niz niz, final boolean b2) {
        switch (this.a) {
            default: {
                final knj a = knj.a(kmv);
                a.getClass();
                final kno h = krf.h(lfj, a);
                final int j = krf.j(h.g, kmv, b, niz);
                kno kno;
                if (b) {
                    final knn b3 = kno.b(h);
                    b3.i(5);
                    b3.k(1);
                    b3.j(65536);
                    b3.h(j);
                    kno = b3.a();
                }
                else {
                    final knn b4 = kno.b(h);
                    b4.i(2);
                    b4.k(1);
                    b4.j(32768);
                    b4.h(j);
                    kno = b4.a();
                }
                kno a2 = kno;
                if (b2) {
                    final knn b5 = kno.b(kno);
                    b5.d(3);
                    b5.c(2);
                    b5.b(192000);
                    b5.e(48000);
                    a2 = b5.a();
                }
                return niz.i(a2);
            }
            case 0: {
                final knl a3 = knl.a(kmv);
                a3.getClass();
                final kno i = krf.i(lfj, a3);
                final int k = krf.j(i.g, kmv, b, niz);
                kno kno2;
                if (b) {
                    final knn b6 = kno.b(i);
                    b6.i(5);
                    b6.k(1);
                    b6.j(65536);
                    b6.h(k);
                    kno2 = b6.a();
                }
                else {
                    final knn b7 = kno.b(i);
                    b7.i(2);
                    b7.k(8);
                    b7.j(32768);
                    b7.h(k);
                    kno2 = b7.a();
                }
                kno a4 = kno2;
                if (b2) {
                    final knn b8 = kno.b(kno2);
                    b8.d(3);
                    b8.c(2);
                    b8.b(192000);
                    b8.e(48000);
                    a4 = b8.a();
                }
                return niz.i(a4);
            }
        }
    }
}
