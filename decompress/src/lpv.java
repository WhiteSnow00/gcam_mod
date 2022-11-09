// 
// Decompiled by Procyon v0.6.0
// 

public final class lpv extends oky implements omk
{
    public static final lpv a;
    private static volatile omp b;
    
    static {
        oky.G(lpv.class, a = new lpv());
    }
    
    private lpv() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lpv.b) == null) {
                    synchronized (lpv.class) {
                        if (lpv.b == null) {
                            o = (lpv.b = new oku(lpv.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lpv.a;
            }
            case 4: {
                return new okt(lpv.a);
            }
            case 3: {
                return new lpv();
            }
            case 2: {
                return oky.F(lpv.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
