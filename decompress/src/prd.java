// 
// Decompiled by Procyon v0.6.0
// 

public final class prd extends oky implements omk
{
    public static final prd d;
    private static volatile omp e;
    public int a;
    public long b;
    public String c;
    
    static {
        oky.G(prd.class, d = new prd());
    }
    
    private prd() {
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = prd.e) == null) {
                    synchronized (prd.class) {
                        if (prd.e == null) {
                            o = (prd.e = new oku(prd.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return prd.d;
            }
            case 4: {
                return new okt(prd.d);
            }
            case 3: {
                return new prd();
            }
            case 2: {
                return oky.F(prd.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1005\u0000\u0002\u1008\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
