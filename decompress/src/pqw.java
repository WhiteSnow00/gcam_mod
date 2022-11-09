// 
// Decompiled by Procyon v0.6.0
// 

public final class pqw extends oky implements omk
{
    public static final pqw j;
    private static volatile omp k;
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    
    static {
        oky.G(pqw.class, j = new pqw());
    }
    
    private pqw() {
        this.b = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp k;
                if ((k = pqw.k) == null) {
                    synchronized (pqw.class) {
                        if (pqw.k == null) {
                            o = (pqw.k = new oku(pqw.j));
                        }
                    }
                }
                return k;
            }
            case 5: {
                return pqw.j;
            }
            case 4: {
                return new okt(pqw.j);
            }
            case 3: {
                return new pqw();
            }
            case 2: {
                return oky.F(pqw.j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1007\u0007", new Object[] { "a", "b", "c", opp.f, "d", "e", opp.e, "f", "g", "h", "i" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
