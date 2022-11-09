// 
// Decompiled by Procyon v0.6.0
// 

public final class nzq extends oky implements omk
{
    public static final nzq i;
    private static volatile omp j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public olj f;
    public olj g;
    public int h;
    
    static {
        oky.G(nzq.class, i = new nzq());
    }
    
    private nzq() {
        this.f = oms.b;
        this.g = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = nzq.j) == null) {
                    synchronized (nzq.class) {
                        if (nzq.j == null) {
                            o = (nzq.j = new oku(nzq.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return nzq.i;
            }
            case 4: {
                return new okt(nzq.i);
            }
            case 3: {
                return new nzq();
            }
            case 2: {
                return oky.F(nzq.i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u1004\u0003\u0005\u001b\u0006\u001b\u0007\u1004\u0004", new Object[] { "a", "b", "c", nzh.h, "d", nzh.g, "e", "f", nzo.class, "g", nzp.class, "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
