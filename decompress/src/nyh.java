// 
// Decompiled by Procyon v0.6.0
// 

public final class nyh extends oky implements omk
{
    public static final nyh f;
    private static volatile omp g;
    public int a;
    public nxs b;
    public long c;
    public long d;
    public nyk e;
    
    static {
        oky.G(nyh.class, f = new nyh());
    }
    
    private nyh() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = nyh.g) == null) {
                    synchronized (nyh.class) {
                        if (nyh.g == null) {
                            o = (nyh.g = new oku(nyh.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return nyh.f;
            }
            case 4: {
                return new okt(nyh.f);
            }
            case 3: {
                return new nyh();
            }
            case 2: {
                return oky.F(nyh.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1009\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
