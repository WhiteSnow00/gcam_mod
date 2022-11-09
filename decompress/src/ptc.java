// 
// Decompiled by Procyon v0.6.0
// 

public final class ptc extends oky implements omk
{
    public static final olg c;
    public static final ptc e;
    private static volatile omp f;
    public int a;
    public olf b;
    public int d;
    
    static {
        c = new oof(2);
        oky.G(ptc.class, e = new ptc());
    }
    
    private ptc() {
        this.b = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ptc.f) == null) {
                    synchronized (ptc.class) {
                        if (ptc.f == null) {
                            o = (ptc.f = new oku(ptc.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ptc.e;
            }
            case 4: {
                return new okt(ptc.e);
            }
            case 3: {
                return new ptc();
            }
            case 2: {
                return oky.F(ptc.e, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002,\u0003\u1004\u0001", new Object[] { "a", "b", ooi.c(), "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
