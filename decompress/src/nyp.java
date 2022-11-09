// 
// Decompiled by Procyon v0.6.0
// 

public final class nyp extends oky implements omk
{
    public static final nyp c;
    private static volatile omp d;
    public int a;
    public long b;
    
    static {
        oky.G(nyp.class, c = new nyp());
    }
    
    private nyp() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nyp.d) == null) {
                    synchronized (nyp.class) {
                        if (nyp.d == null) {
                            o = (nyp.d = new oku(nyp.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nyp.c;
            }
            case 4: {
                return new okt(nyp.c);
            }
            case 3: {
                return new nyp();
            }
            case 2: {
                return oky.F(nyp.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
