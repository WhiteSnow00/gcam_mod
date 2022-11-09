// 
// Decompiled by Procyon v0.6.0
// 

public final class oub extends oky implements omk
{
    public static final oub e;
    private static volatile omp f;
    public int a;
    public int b;
    public int c;
    public int d;
    
    static {
        oky.G(oub.class, e = new oub());
    }
    
    private oub() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = oub.f) == null) {
                    synchronized (oub.class) {
                        if (oub.f == null) {
                            o = (oub.f = new oku(oub.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return oub.e;
            }
            case 4: {
                return new okt(oub.e);
            }
            case 3: {
                return new oub();
            }
            case 2: {
                return oky.F(oub.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
