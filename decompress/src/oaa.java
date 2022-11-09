// 
// Decompiled by Procyon v0.6.0
// 

public final class oaa extends oky implements omk
{
    public static final oaa c;
    private static volatile omp d;
    public int a;
    public boolean b;
    
    static {
        oky.G(oaa.class, c = new oaa());
    }
    
    private oaa() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oaa.d) == null) {
                    synchronized (oaa.class) {
                        if (oaa.d == null) {
                            o = (oaa.d = new oku(oaa.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oaa.c;
            }
            case 4: {
                return new okt(oaa.c);
            }
            case 3: {
                return new oaa();
            }
            case 2: {
                return oky.F(oaa.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
