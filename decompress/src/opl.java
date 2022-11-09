// 
// Decompiled by Procyon v0.6.0
// 

public final class opl extends oky implements omk
{
    public static final opl d;
    private static volatile omp e;
    public int a;
    public opn b;
    public opm c;
    
    static {
        oky.G(opl.class, d = new opl());
    }
    
    private opl() {
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = opl.e) == null) {
                    synchronized (opl.class) {
                        if (opl.e == null) {
                            o = (opl.e = new oku(opl.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return opl.d;
            }
            case 4: {
                return new okt(opl.d);
            }
            case 3: {
                return new opl();
            }
            case 2: {
                return oky.F(opl.d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003\u1009\u0000\u0005\u1009\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
