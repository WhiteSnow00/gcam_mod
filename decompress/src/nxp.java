// 
// Decompiled by Procyon v0.6.0
// 

public final class nxp extends oky implements omk
{
    public static final nxp e;
    private static volatile omp f;
    public int a;
    public long b;
    public long c;
    public int d;
    
    static {
        oky.G(nxp.class, e = new nxp());
    }
    
    private nxp() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = nxp.f) == null) {
                    synchronized (nxp.class) {
                        if (nxp.f == null) {
                            o = (nxp.f = new oku(nxp.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return nxp.e;
            }
            case 4: {
                return new okt(nxp.e);
            }
            case 3: {
                return new nxp();
            }
            case 2: {
                return oky.F(nxp.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u100c\u0002", new Object[] { "a", "b", "c", "d", oah.d });
            }
            case 0: {
                return 1;
            }
        }
    }
}
