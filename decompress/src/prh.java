// 
// Decompiled by Procyon v0.6.0
// 

public final class prh extends oky implements omk
{
    public static final prh e;
    private static volatile omp f;
    public int a;
    public int b;
    public int c;
    public prd d;
    
    static {
        oky.G(prh.class, e = new prh());
    }
    
    private prh() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = prh.f) == null) {
                    synchronized (prh.class) {
                        if (prh.f == null) {
                            o = (prh.f = new oku(prh.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return prh.e;
            }
            case 4: {
                return new okt(prh.e);
            }
            case 3: {
                return new prh();
            }
            case 2: {
                return oky.F(prh.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1009\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
