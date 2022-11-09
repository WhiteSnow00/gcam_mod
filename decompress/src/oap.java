// 
// Decompiled by Procyon v0.6.0
// 

public final class oap extends oky implements omk
{
    public static final oap d;
    private static volatile omp e;
    public int a;
    public boolean b;
    public long c;
    
    static {
        oky.G(oap.class, d = new oap());
    }
    
    private oap() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oap.e) == null) {
                    synchronized (oap.class) {
                        if (oap.e == null) {
                            o = (oap.e = new oku(oap.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oap.d;
            }
            case 4: {
                return new okt(oap.d);
            }
            case 3: {
                return new oap();
            }
            case 2: {
                return oky.F(oap.d, "\u0001\u0002\u0000\u0001\t\n\u0002\u0000\u0000\u0000\t\u1007\u0001\n\u1002\u0002", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
