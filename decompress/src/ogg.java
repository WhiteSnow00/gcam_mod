// 
// Decompiled by Procyon v0.6.0
// 

public final class ogg extends oky implements omk
{
    public static final ogg b;
    private static volatile omp d;
    public ogf a;
    private int c;
    
    static {
        oky.G(ogg.class, b = new ogg());
    }
    
    private ogg() {
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = ogg.d) == null) {
                    synchronized (ogg.class) {
                        if (ogg.d == null) {
                            o = (ogg.d = new oku(ogg.b));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ogg.b;
            }
            case 4: {
                return new okt(ogg.b);
            }
            case 3: {
                return new ogg();
            }
            case 2: {
                return oky.F(ogg.b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0000", new Object[] { "c", "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
