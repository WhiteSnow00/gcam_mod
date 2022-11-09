// 
// Decompiled by Procyon v0.6.0
// 

public final class oqe extends oky implements omk
{
    public static final oqe c;
    private static volatile omp d;
    public int a;
    public boolean b;
    
    static {
        oky.G(oqe.class, c = new oqe());
    }
    
    private oqe() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oqe.d) == null) {
                    synchronized (oqe.class) {
                        if (oqe.d == null) {
                            o = (oqe.d = new oku(oqe.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oqe.c;
            }
            case 4: {
                return new okt(oqe.c);
            }
            case 3: {
                return new oqe();
            }
            case 2: {
                return oky.F(oqe.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
