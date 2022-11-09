// 
// Decompiled by Procyon v0.6.0
// 

public final class opm extends oky implements omk
{
    public static final opm b;
    private static volatile omp d;
    public long a;
    private int c;
    
    static {
        oky.G(opm.class, b = new opm());
    }
    
    private opm() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = opm.d) == null) {
                    synchronized (opm.class) {
                        if (opm.d == null) {
                            o = (opm.d = new oku(opm.b));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return opm.b;
            }
            case 4: {
                return new okt(opm.b);
            }
            case 3: {
                return new opm();
            }
            case 2: {
                return oky.F(opm.b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1003\u0001", new Object[] { "c", "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
