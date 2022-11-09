// 
// Decompiled by Procyon v0.6.0
// 

public final class oan extends oky implements omk
{
    public static final oan c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(oan.class, c = new oan());
    }
    
    private oan() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oan.d) == null) {
                    synchronized (oan.class) {
                        if (oan.d == null) {
                            o = (oan.d = new oku(oan.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oan.c;
            }
            case 4: {
                return new okt(oan.c);
            }
            case 3: {
                return new oan();
            }
            case 2: {
                return oky.F(oan.c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0000", new Object[] { "a", "b", oam.c() });
            }
            case 0: {
                return 1;
            }
        }
    }
}
