// 
// Decompiled by Procyon v0.6.0
// 

public final class nys extends oky implements omk
{
    public static final nys c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(nys.class, c = new nys());
    }
    
    private nys() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nys.d) == null) {
                    synchronized (nys.class) {
                        if (nys.d == null) {
                            o = (nys.d = new oku(nys.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nys.c;
            }
            case 4: {
                return new okt(nys.c);
            }
            case 3: {
                return new nys();
            }
            case 2: {
                return oky.F(nys.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "a", "b", nxw.n });
            }
            case 0: {
                return 1;
            }
        }
    }
}
