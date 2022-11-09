// 
// Decompiled by Procyon v0.6.0
// 

public final class pse extends oky implements omk
{
    public static final pse d;
    private static volatile omp e;
    public int a;
    public long b;
    public long c;
    
    static {
        oky.G(pse.class, d = new pse());
    }
    
    private pse() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = pse.e) == null) {
                    synchronized (pse.class) {
                        if (pse.e == null) {
                            o = (pse.e = new oku(pse.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return pse.d;
            }
            case 4: {
                return new okt(pse.d);
            }
            case 3: {
                return new pse();
            }
            case 2: {
                return oky.F(pse.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
