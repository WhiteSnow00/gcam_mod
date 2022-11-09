// 
// Decompiled by Procyon v0.6.0
// 

public final class nyy extends oky implements omk
{
    public static final nyy d;
    private static volatile omp e;
    public int a;
    public int b;
    public int c;
    
    static {
        oky.G(nyy.class, d = new nyy());
    }
    
    private nyy() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nyy.e) == null) {
                    synchronized (nyy.class) {
                        if (nyy.e == null) {
                            o = (nyy.e = new oku(nyy.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nyy.d;
            }
            case 4: {
                return new okt(nyy.d);
            }
            case 3: {
                return new nyy();
            }
            case 2: {
                return oky.F(nyy.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001", new Object[] { "a", "b", "c", nxw.p });
            }
            case 0: {
                return 1;
            }
        }
    }
}
