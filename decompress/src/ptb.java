// 
// Decompiled by Procyon v0.6.0
// 

public final class ptb extends oky implements omk
{
    public static final ptb e;
    private static volatile omp f;
    public int a;
    public int b;
    public ome c;
    public olf d;
    
    static {
        oky.G(ptb.class, e = new ptb());
    }
    
    private ptb() {
        this.c = ome.a;
        final oms b = oms.b;
        this.d = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ptb.f) == null) {
                    synchronized (ptb.class) {
                        if (ptb.f == null) {
                            o = (ptb.f = new oku(ptb.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ptb.e;
            }
            case 4: {
                return new okt(ptb.e);
            }
            case 3: {
                return new ptb();
            }
            case 2: {
                return oky.F(ptb.e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0001\u0001\u0000\u0002\u1004\u0001\u00032\u0005'", new Object[] { "a", "b", "c", pta.a, "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
