// 
// Decompiled by Procyon v0.6.0
// 

public final class nyf extends oky implements omk
{
    public static final nyf e;
    private static volatile omp f;
    public int a;
    public nxs b;
    public nyj c;
    public nyk d;
    
    static {
        oky.G(nyf.class, e = new nyf());
    }
    
    private nyf() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = nyf.f) == null) {
                    synchronized (nyf.class) {
                        if (nyf.f == null) {
                            o = (nyf.f = new oku(nyf.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return nyf.e;
            }
            case 4: {
                return new okt(nyf.e);
            }
            case 3: {
                return new nyf();
            }
            case 2: {
                return oky.F(nyf.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
