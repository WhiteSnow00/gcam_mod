// 
// Decompiled by Procyon v0.6.0
// 

public final class lql extends oky implements omk
{
    public static final lql b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(lql.class, b = new lql());
    }
    
    private lql() {
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
                if ((c = lql.c) == null) {
                    synchronized (lql.class) {
                        if (lql.c == null) {
                            o = (lql.c = new oku(lql.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return lql.b;
            }
            case 4: {
                return new okt(lql.b);
            }
            case 3: {
                return new lql();
            }
            case 2: {
                return oky.F(lql.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", lqk.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
