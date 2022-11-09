// 
// Decompiled by Procyon v0.6.0
// 

public final class lqh extends oky implements omk
{
    public static final lqh b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(lqh.class, b = new lqh());
    }
    
    private lqh() {
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
                if ((c = lqh.c) == null) {
                    synchronized (lqh.class) {
                        if (lqh.c == null) {
                            o = (lqh.c = new oku(lqh.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return lqh.b;
            }
            case 4: {
                return new okt(lqh.b);
            }
            case 3: {
                return new lqh();
            }
            case 2: {
                return oky.F(lqh.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", lpw.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
