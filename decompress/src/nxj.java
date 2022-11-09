// 
// Decompiled by Procyon v0.6.0
// 

public final class nxj extends oky implements omk
{
    public static final nxj h;
    private static volatile omp i;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    
    static {
        oky.G(nxj.class, h = new nxj());
    }
    
    private nxj() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = nxj.i) == null) {
                    synchronized (nxj.class) {
                        if (nxj.i == null) {
                            o = (nxj.i = new oku(nxj.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return nxj.h;
            }
            case 4: {
                return new okt(nxj.h);
            }
            case 3: {
                return new nxj();
            }
            case 2: {
                return oky.F(nxj.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005", new Object[] { "a", "b", lpx.l, "c", "d", "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
