// 
// Decompiled by Procyon v0.6.0
// 

public final class nyg extends oky implements omk
{
    public static final nyg f;
    private static volatile omp g;
    public int a;
    public nxs b;
    public long c;
    public long d;
    public nyk e;
    
    static {
        oky.G(nyg.class, f = new nyg());
    }
    
    private nyg() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = nyg.g) == null) {
                    synchronized (nyg.class) {
                        if (nyg.g == null) {
                            o = (nyg.g = new oku(nyg.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return nyg.f;
            }
            case 4: {
                return new okt(nyg.f);
            }
            case 3: {
                return new nyg();
            }
            case 2: {
                return oky.F(nyg.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1009\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
