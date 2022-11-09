// 
// Decompiled by Procyon v0.6.0
// 

public final class lrq extends oky implements omk
{
    public static final lrq a;
    private static volatile omp b;
    
    static {
        oky.G(lrq.class, a = new lrq());
    }
    
    private lrq() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lrq.b) == null) {
                    synchronized (lrq.class) {
                        if (lrq.b == null) {
                            o = (lrq.b = new oku(lrq.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lrq.a;
            }
            case 4: {
                return new okt(lrq.a);
            }
            case 3: {
                return new lrq();
            }
            case 2: {
                return oky.F(lrq.a, "\u0000\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
