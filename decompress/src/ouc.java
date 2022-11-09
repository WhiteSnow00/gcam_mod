// 
// Decompiled by Procyon v0.6.0
// 

public final class ouc extends oky implements omk
{
    public static final ouc d;
    private static volatile omp e;
    public int a;
    public oub b;
    public oua c;
    
    static {
        oky.G(ouc.class, d = new ouc());
    }
    
    private ouc() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = ouc.e) == null) {
                    synchronized (ouc.class) {
                        if (ouc.e == null) {
                            o = (ouc.e = new oku(ouc.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ouc.d;
            }
            case 4: {
                return new okt(ouc.d);
            }
            case 3: {
                return new ouc();
            }
            case 2: {
                return oky.F(ouc.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
