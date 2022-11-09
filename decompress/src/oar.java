// 
// Decompiled by Procyon v0.6.0
// 

public final class oar extends oky implements omk
{
    public static final oar f;
    private static volatile omp g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    
    static {
        oky.G(oar.class, f = new oar());
    }
    
    private oar() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = oar.g) == null) {
                    synchronized (oar.class) {
                        if (oar.g == null) {
                            o = (oar.g = new oku(oar.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oar.f;
            }
            case 4: {
                return new okt(oar.f);
            }
            case 3: {
                return new oar();
            }
            case 2: {
                return oky.F(oar.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
