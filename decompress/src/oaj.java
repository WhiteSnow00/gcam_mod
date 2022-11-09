// 
// Decompiled by Procyon v0.6.0
// 

public final class oaj extends oky implements omk
{
    public static final oaj c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(oaj.class, c = new oaj());
    }
    
    private oaj() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oaj.d) == null) {
                    synchronized (oaj.class) {
                        if (oaj.d == null) {
                            o = (oaj.d = new oku(oaj.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oaj.c;
            }
            case 4: {
                return new okt(oaj.c);
            }
            case 3: {
                return new oaj();
            }
            case 2: {
                return oky.F(oaj.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
