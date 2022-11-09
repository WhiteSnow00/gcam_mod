// 
// Decompiled by Procyon v0.6.0
// 

public final class nyi extends oky implements omk
{
    public static final nyi h;
    private static volatile omp i;
    public int a;
    public nxs b;
    public long c;
    public int d;
    public int e;
    public int f;
    public float g;
    
    static {
        oky.G(nyi.class, h = new nyi());
    }
    
    private nyi() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = nyi.i) == null) {
                    synchronized (nyi.class) {
                        if (nyi.i == null) {
                            o = (nyi.i = new oku(nyi.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return nyi.h;
            }
            case 4: {
                return new okt(nyi.h);
            }
            case 3: {
                return new nyi();
            }
            case 2: {
                return oky.F(nyi.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u1001\u0005", new Object[] { "a", "b", "c", "d", oah.d, "e", nzh.t, "f", nzh.s, "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
