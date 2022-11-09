// 
// Decompiled by Procyon v0.6.0
// 

public final class obn extends oky implements omk
{
    public static final obn f;
    private static volatile omp g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    
    static {
        oky.G(obn.class, f = new obn());
    }
    
    private obn() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = obn.g) == null) {
                    synchronized (obn.class) {
                        if (obn.g == null) {
                            o = (obn.g = new oku(obn.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return obn.f;
            }
            case 4: {
                return new okt(obn.f);
            }
            case 3: {
                return new obn();
            }
            case 2: {
                return oky.F(obn.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
