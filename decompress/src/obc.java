// 
// Decompiled by Procyon v0.6.0
// 

public final class obc extends oky implements omk
{
    public static final obc f;
    private static volatile omp g;
    public int a;
    public long b;
    public float c;
    public float d;
    public float e;
    
    static {
        oky.G(obc.class, f = new obc());
    }
    
    private obc() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = obc.g) == null) {
                    synchronized (obc.class) {
                        if (obc.g == null) {
                            o = (obc.g = new oku(obc.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return obc.f;
            }
            case 4: {
                return new okt(obc.f);
            }
            case 3: {
                return new obc();
            }
            case 2: {
                return oky.F(obc.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
