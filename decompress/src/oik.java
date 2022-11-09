// 
// Decompiled by Procyon v0.6.0
// 

public final class oik extends oky implements omk
{
    public static final oik d;
    private static volatile omp e;
    public int a;
    public Object b;
    public olj c;
    
    static {
        oky.G(oik.class, d = new oik());
    }
    
    private oik() {
        this.a = 0;
        this.c = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oik.e) == null) {
                    synchronized (oik.class) {
                        if (oik.e == null) {
                            o = (oik.e = new oku(oik.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oik.d;
            }
            case 4: {
                return new okt(oik.d);
            }
            case 3: {
                return new oik();
            }
            case 2: {
                return oky.F(oik.d, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1035\u0000\u0002\u001a\u0003\u103b\u0000\u0004\u103b\u0000", new Object[] { "b", "a", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
