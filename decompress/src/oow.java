// 
// Decompiled by Procyon v0.6.0
// 

public final class oow extends oky implements omk
{
    public static final oow f;
    private static volatile omp g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    
    static {
        oky.G(oow.class, f = new oow());
    }
    
    private oow() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = oow.g) == null) {
                    synchronized (oow.class) {
                        if (oow.g == null) {
                            o = (oow.g = new oku(oow.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oow.f;
            }
            case 4: {
                return new okt(oow.f);
            }
            case 3: {
                return new oow();
            }
            case 2: {
                return oky.F(oow.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
