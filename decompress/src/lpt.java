// 
// Decompiled by Procyon v0.6.0
// 

public final class lpt extends oky implements omk
{
    public static final lpt a;
    private static volatile omp b;
    
    static {
        oky.G(lpt.class, a = new lpt());
    }
    
    private lpt() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lpt.b) == null) {
                    synchronized (lpt.class) {
                        if (lpt.b == null) {
                            o = (lpt.b = new oku(lpt.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lpt.a;
            }
            case 4: {
                return new okt(lpt.a);
            }
            case 3: {
                return new lpt();
            }
            case 2: {
                return oky.F(lpt.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
