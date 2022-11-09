// 
// Decompiled by Procyon v0.6.0
// 

public final class obe extends oky implements omk
{
    public static final obe j;
    private static volatile omp k;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public boolean h;
    public boolean i;
    
    static {
        oky.G(obe.class, j = new obe());
    }
    
    private obe() {
        this.g = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp k;
                if ((k = obe.k) == null) {
                    synchronized (obe.class) {
                        if (obe.k == null) {
                            o = (obe.k = new oku(obe.j));
                        }
                    }
                }
                return k;
            }
            case 5: {
                return obe.j;
            }
            case 4: {
                return new okt(obe.j);
            }
            case 3: {
                return new obe();
            }
            case 2: {
                return oky.F(obe.j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1007\u0006\b\u1007\u0007", new Object[] { "a", "b", "c", oah.q, "d", oah.r, "e", "f", "g", "h", "i" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
