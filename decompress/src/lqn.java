// 
// Decompiled by Procyon v0.6.0
// 

public final class lqn extends oky implements omk
{
    public static final lqn b;
    private static volatile omp d;
    public long a;
    private int c;
    
    static {
        oky.G(lqn.class, b = new lqn());
    }
    
    private lqn() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = lqn.d) == null) {
                    synchronized (lqn.class) {
                        if (lqn.d == null) {
                            o = (lqn.d = new oku(lqn.b));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return lqn.b;
            }
            case 4: {
                return new okt(lqn.b);
            }
            case 3: {
                return new lqn();
            }
            case 2: {
                return oky.F(lqn.b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "c", "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
