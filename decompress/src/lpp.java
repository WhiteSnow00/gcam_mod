// 
// Decompiled by Procyon v0.6.0
// 

public final class lpp extends oky implements omk
{
    public static final lpp a;
    private static volatile omp b;
    
    static {
        oky.G(lpp.class, a = new lpp());
    }
    
    private lpp() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lpp.b) == null) {
                    synchronized (lpp.class) {
                        if (lpp.b == null) {
                            o = (lpp.b = new oku(lpp.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lpp.a;
            }
            case 4: {
                return new okt(lpp.a);
            }
            case 3: {
                return new lpp();
            }
            case 2: {
                return oky.F(lpp.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
