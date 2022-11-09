// 
// Decompiled by Procyon v0.6.0
// 

public final class prx extends oky implements omk
{
    public static final prx f;
    private static volatile omp g;
    public int a;
    public long b;
    public boolean c;
    public int d;
    public String e;
    
    static {
        oky.G(prx.class, f = new prx());
    }
    
    private prx() {
        this.e = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = prx.g) == null) {
                    synchronized (prx.class) {
                        if (prx.g == null) {
                            o = (prx.g = new oku(prx.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return prx.f;
            }
            case 4: {
                return new okt(prx.f);
            }
            case 3: {
                return new prx();
            }
            case 2: {
                return oky.F(prx.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u0004\u1008\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
