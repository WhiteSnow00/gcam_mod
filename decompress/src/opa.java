// 
// Decompiled by Procyon v0.6.0
// 

public final class opa extends oky implements omk
{
    public static final opa f;
    private static volatile omp g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    
    static {
        oky.G(opa.class, f = new opa());
    }
    
    private opa() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = opa.g) == null) {
                    synchronized (opa.class) {
                        if (opa.g == null) {
                            o = (opa.g = new oku(opa.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return opa.f;
            }
            case 4: {
                return new okt(opa.f);
            }
            case 3: {
                return new opa();
            }
            case 2: {
                return oky.F(opa.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
