// 
// Decompiled by Procyon v0.6.0
// 

public final class oua extends oky implements omk
{
    public static final oua d;
    private static volatile omp e;
    public int a;
    public int b;
    public int c;
    
    static {
        oky.G(oua.class, d = new oua());
    }
    
    private oua() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oua.e) == null) {
                    synchronized (oua.class) {
                        if (oua.e == null) {
                            o = (oua.e = new oku(oua.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oua.d;
            }
            case 4: {
                return new okt(oua.d);
            }
            case 3: {
                return new oua();
            }
            case 2: {
                return oky.F(oua.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
