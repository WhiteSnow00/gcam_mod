// 
// Decompiled by Procyon v0.6.0
// 

public final class lpr extends oky implements omk
{
    public static final lpr a;
    private static volatile omp b;
    
    static {
        oky.G(lpr.class, a = new lpr());
    }
    
    private lpr() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lpr.b) == null) {
                    synchronized (lpr.class) {
                        if (lpr.b == null) {
                            o = (lpr.b = new oku(lpr.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lpr.a;
            }
            case 4: {
                return new okt(lpr.a);
            }
            case 3: {
                return new lpr();
            }
            case 2: {
                return oky.F(lpr.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
