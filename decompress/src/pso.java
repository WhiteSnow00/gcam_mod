// 
// Decompiled by Procyon v0.6.0
// 

public final class pso extends oky implements omk
{
    public static final pso d;
    private static volatile omp e;
    public int a;
    public long b;
    public int c;
    
    static {
        oky.G(pso.class, d = new pso());
    }
    
    private pso() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = pso.e) == null) {
                    synchronized (pso.class) {
                        if (pso.e == null) {
                            o = (pso.e = new oku(pso.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return pso.d;
            }
            case 4: {
                return new okt(pso.d);
            }
            case 3: {
                return new pso();
            }
            case 2: {
                return oky.F(pso.d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1002\u0001\u0003\u100c\u0002", new Object[] { "a", "b", "c", opp.o });
            }
            case 0: {
                return 1;
            }
        }
    }
}
