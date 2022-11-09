// 
// Decompiled by Procyon v0.6.0
// 

public final class lqk extends oky implements omk
{
    public static final lqk d;
    private static volatile omp f;
    public int a;
    public Object b;
    public lqj c;
    private int e;
    
    static {
        oky.G(lqk.class, d = new lqk());
    }
    
    private lqk() {
        this.a = 0;
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = lqk.f) == null) {
                    synchronized (lqk.class) {
                        if (lqk.f == null) {
                            o = (lqk.f = new oku(lqk.d));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return lqk.d;
            }
            case 4: {
                return new okt(lqk.d);
            }
            case 3: {
                return new lqk();
            }
            case 2: {
                return oky.F(lqk.d, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000", new Object[] { "b", "a", "e", "c", lrq.class, lrv.class, lrr.class, lru.class, lrs.class, oim.class, lrt.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
