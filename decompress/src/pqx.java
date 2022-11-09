// 
// Decompiled by Procyon v0.6.0
// 

public final class pqx extends oky implements omk
{
    public static final pqx e;
    private static volatile omp f;
    public int a;
    public olj b;
    public pqy c;
    public int d;
    
    static {
        oky.G(pqx.class, e = new pqx());
    }
    
    private pqx() {
        this.b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = pqx.f) == null) {
                    synchronized (pqx.class) {
                        if (pqx.f == null) {
                            o = (pqx.f = new oku(pqx.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return pqx.e;
            }
            case 4: {
                return new okt(pqx.e);
            }
            case 3: {
                return new pqx();
            }
            case 2: {
                return oky.F(pqx.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000\u0003\u1004\u0001", new Object[] { "a", "b", pqw.class, "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
