// 
// Decompiled by Procyon v0.6.0
// 

public final class lps extends oky implements omk
{
    public static final lps a;
    private static volatile omp b;
    
    static {
        oky.G(lps.class, a = new lps());
    }
    
    private lps() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lps.b) == null) {
                    synchronized (lps.class) {
                        if (lps.b == null) {
                            o = (lps.b = new oku(lps.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lps.a;
            }
            case 4: {
                return new okt(lps.a);
            }
            case 3: {
                return new lps();
            }
            case 2: {
                return oky.F(lps.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
