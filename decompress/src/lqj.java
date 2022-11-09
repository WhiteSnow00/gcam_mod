// 
// Decompiled by Procyon v0.6.0
// 

public final class lqj extends oky implements omk
{
    public static final lqj b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(lqj.class, b = new lqj());
    }
    
    private lqj() {
        this.a = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = lqj.c) == null) {
                    synchronized (lqj.class) {
                        if (lqj.c == null) {
                            o = (lqj.c = new oku(lqj.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return lqj.b;
            }
            case 4: {
                return new okt(lqj.b);
            }
            case 3: {
                return new lqj();
            }
            case 2: {
                return oky.F(lqj.b, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0000\u0001\u0000\u0007\u001b", new Object[] { "a", lqi.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
