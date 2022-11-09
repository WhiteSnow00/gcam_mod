// 
// Decompiled by Procyon v0.6.0
// 

public final class ogx extends oky implements omk
{
    public static final ogx e;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    public int d;
    private int f;
    
    static {
        oky.G(ogx.class, e = new ogx());
    }
    
    private ogx() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = ogx.g) == null) {
                    synchronized (ogx.class) {
                        if (ogx.g == null) {
                            o = (ogx.g = new oku(ogx.e));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ogx.e;
            }
            case 4: {
                return new okt(ogx.e);
            }
            case 3: {
                return new ogx();
            }
            case 2: {
                return oky.F(ogx.e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "f", "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
