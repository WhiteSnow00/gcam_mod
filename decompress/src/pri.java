// 
// Decompiled by Procyon v0.6.0
// 

public final class pri extends oky implements omk
{
    public static final pri e;
    private static volatile omp f;
    public int a;
    public int b;
    public long c;
    public prd d;
    
    static {
        oky.G(pri.class, e = new pri());
    }
    
    private pri() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = pri.f) == null) {
                    synchronized (pri.class) {
                        if (pri.f == null) {
                            o = (pri.f = new oku(pri.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return pri.e;
            }
            case 4: {
                return new okt(pri.e);
            }
            case 3: {
                return new pri();
            }
            case 2: {
                return oky.F(pri.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001\u0003\u1009\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
