// 
// Decompiled by Procyon v0.6.0
// 

public final class prg extends oky implements omk
{
    public static final prg i;
    private static volatile omp j;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public prd h;
    
    static {
        oky.G(prg.class, i = new prg());
    }
    
    private prg() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = prg.j) == null) {
                    synchronized (prg.class) {
                        if (prg.j == null) {
                            o = (prg.j = new oku(prg.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return prg.i;
            }
            case 4: {
                return new okt(prg.i);
            }
            case 3: {
                return new prg();
            }
            case 2: {
                return oky.F(prg.i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1009\u0006", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
