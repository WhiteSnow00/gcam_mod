// 
// Decompiled by Procyon v0.6.0
// 

public final class psu extends oky implements omk
{
    public static final psu b;
    private static volatile omp c;
    public psx a;
    
    static {
        oky.G(psu.class, b = new psu());
    }
    
    private psu() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = psu.c) == null) {
                    synchronized (psu.class) {
                        if (psu.c == null) {
                            o = (psu.c = new oku(psu.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return psu.b;
            }
            case 4: {
                return new okt(psu.b);
            }
            case 3: {
                return new psu();
            }
            case 2: {
                return oky.F(psu.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
