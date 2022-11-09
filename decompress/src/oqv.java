// 
// Decompiled by Procyon v0.6.0
// 

public final class oqv extends oky implements omk
{
    public static final oqv d;
    private static volatile omp e;
    public int a;
    public float b;
    public boolean c;
    
    static {
        oky.G(oqv.class, d = new oqv());
    }
    
    private oqv() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oqv.e) == null) {
                    synchronized (oqv.class) {
                        if (oqv.e == null) {
                            o = (oqv.e = new oku(oqv.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oqv.d;
            }
            case 4: {
                return new okt(oqv.d);
            }
            case 3: {
                return new oqv();
            }
            case 2: {
                return oky.F(oqv.d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0003\u1007\u0002", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
