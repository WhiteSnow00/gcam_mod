// 
// Decompiled by Procyon v0.6.0
// 

public final class nxq extends oky implements omk
{
    public static final nxq d;
    private static volatile omp e;
    public int a;
    public int b;
    public long c;
    
    static {
        oky.G(nxq.class, d = new nxq());
    }
    
    private nxq() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nxq.e) == null) {
                    synchronized (nxq.class) {
                        if (nxq.e == null) {
                            o = (nxq.e = new oku(nxq.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nxq.d;
            }
            case 4: {
                return new okt(nxq.d);
            }
            case 3: {
                return new nxq();
            }
            case 2: {
                return oky.F(nxq.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "a", "b", lpx.n, "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
