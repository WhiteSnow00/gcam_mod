// 
// Decompiled by Procyon v0.6.0
// 

public final class pru extends oky implements omk
{
    public static final pru f;
    private static volatile omp g;
    public int a;
    public String b;
    public long c;
    public long d;
    public long e;
    
    static {
        oky.G(pru.class, f = new pru());
    }
    
    private pru() {
        this.b = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = pru.g) == null) {
                    synchronized (pru.class) {
                        if (pru.g == null) {
                            o = (pru.g = new oku(pru.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return pru.f;
            }
            case 4: {
                return new okt(pru.f);
            }
            case 3: {
                return new pru();
            }
            case 2: {
                return oky.F(pru.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
