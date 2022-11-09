// 
// Decompiled by Procyon v0.6.0
// 

public final class nye extends oky implements omk
{
    public static final nye f;
    private static volatile omp g;
    public int a;
    public nxs b;
    public long c;
    public long d;
    public nyk e;
    
    static {
        oky.G(nye.class, f = new nye());
    }
    
    private nye() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = nye.g) == null) {
                    synchronized (nye.class) {
                        if (nye.g == null) {
                            o = (nye.g = new oku(nye.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return nye.f;
            }
            case 4: {
                return new okt(nye.f);
            }
            case 3: {
                return new nye();
            }
            case 2: {
                return oky.F(nye.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1009\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
