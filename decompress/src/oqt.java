// 
// Decompiled by Procyon v0.6.0
// 

public final class oqt extends oky implements omk
{
    public static final oqt a;
    private static volatile omp e;
    private int b;
    private oqr c;
    private oqr d;
    
    static {
        oky.G(oqt.class, a = new oqt());
    }
    
    private oqt() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oqt.e) == null) {
                    synchronized (oqt.class) {
                        if (oqt.e == null) {
                            o = (oqt.e = new oku(oqt.a));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oqt.a;
            }
            case 4: {
                return new okt(oqt.a);
            }
            case 3: {
                return new oqt();
            }
            case 2: {
                return oky.F(oqt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0001\u0002\u1009\u0002", new Object[] { "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
