// 
// Decompiled by Procyon v0.6.0
// 

public final class nzd extends oky implements omk
{
    public static final nzd i;
    private static volatile omp j;
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    static {
        oky.G(nzd.class, i = new nzd());
    }
    
    private nzd() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = nzd.j) == null) {
                    synchronized (nzd.class) {
                        if (nzd.j == null) {
                            o = (nzd.j = new oku(nzd.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return nzd.i;
            }
            case 4: {
                return new okt(nzd.i);
            }
            case 3: {
                return new nzd();
            }
            case 2: {
                return oky.F(nzd.i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
