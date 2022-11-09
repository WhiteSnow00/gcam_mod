// 
// Decompiled by Procyon v0.6.0
// 

public final class prf extends oky implements omk
{
    public static final prf a;
    private static volatile omp b;
    
    static {
        oky.G(prf.class, a = new prf());
    }
    
    private prf() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = prf.b) == null) {
                    synchronized (prf.class) {
                        if (prf.b == null) {
                            o = (prf.b = new oku(prf.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return prf.a;
            }
            case 4: {
                return new okt(prf.a);
            }
            case 3: {
                return new prf();
            }
            case 2: {
                return oky.F(prf.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
