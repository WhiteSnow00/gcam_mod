// 
// Decompiled by Procyon v0.6.0
// 

public final class nzx extends oky implements omk
{
    public static final nzx e;
    private static volatile omp f;
    public int a;
    public int b;
    public int c;
    public nzn d;
    
    static {
        oky.G(nzx.class, e = new nzx());
    }
    
    private nzx() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = nzx.f) == null) {
                    synchronized (nzx.class) {
                        if (nzx.f == null) {
                            o = (nzx.f = new oku(nzx.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return nzx.e;
            }
            case 4: {
                return new okt(nzx.e);
            }
            case 3: {
                return new nzx();
            }
            case 2: {
                return oky.F(nzx.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1009\u0002", new Object[] { "a", "b", nzh.n, "c", nzh.m, "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
