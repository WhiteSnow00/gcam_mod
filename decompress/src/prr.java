// 
// Decompiled by Procyon v0.6.0
// 

public final class prr extends oky implements omk
{
    public static final prr c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(prr.class, c = new prr());
    }
    
    private prr() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = prr.d) == null) {
                    synchronized (prr.class) {
                        if (prr.d == null) {
                            o = (prr.d = new oku(prr.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return prr.c;
            }
            case 4: {
                return new okt(prr.c);
            }
            case 3: {
                return new prr();
            }
            case 2: {
                return oky.F(prr.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
