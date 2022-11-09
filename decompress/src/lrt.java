// 
// Decompiled by Procyon v0.6.0
// 

public final class lrt extends oky implements omk
{
    public static final lrt a;
    private static volatile omp b;
    
    static {
        oky.G(lrt.class, a = new lrt());
    }
    
    private lrt() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lrt.b) == null) {
                    synchronized (lrt.class) {
                        if (lrt.b == null) {
                            o = (lrt.b = new oku(lrt.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lrt.a;
            }
            case 4: {
                return new okt(lrt.a);
            }
            case 3: {
                return new lrt();
            }
            case 2: {
                return oky.F(lrt.a, "\u0000\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
