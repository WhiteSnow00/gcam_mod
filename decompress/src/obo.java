// 
// Decompiled by Procyon v0.6.0
// 

public final class obo extends oky implements omk
{
    public static final obo d;
    private static volatile omp e;
    public int a;
    public float b;
    public float c;
    
    static {
        oky.G(obo.class, d = new obo());
    }
    
    private obo() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = obo.e) == null) {
                    synchronized (obo.class) {
                        if (obo.e == null) {
                            o = (obo.e = new oku(obo.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return obo.d;
            }
            case 4: {
                return new okt(obo.d);
            }
            case 3: {
                return new obo();
            }
            case 2: {
                return oky.F(obo.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
