// 
// Decompiled by Procyon v0.6.0
// 

public final class nyz extends oky implements omk
{
    public static final nyz i;
    private static volatile omp j;
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    
    static {
        oky.G(nyz.class, i = new nyz());
    }
    
    private nyz() {
        this.b = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = nyz.j) == null) {
                    synchronized (nyz.class) {
                        if (nyz.j == null) {
                            o = (nyz.j = new oku(nyz.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return nyz.i;
            }
            case 4: {
                return new okt(nyz.i);
            }
            case 3: {
                return new nyz();
            }
            case 2: {
                return oky.F(nyz.i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1002\u0006", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
