// 
// Decompiled by Procyon v0.6.0
// 

public final class jla extends oky implements omk
{
    public static final jla e;
    private static volatile omp g;
    public int a;
    public jkz b;
    public jky c;
    public int d;
    private int f;
    
    static {
        oky.G(jla.class, e = new jla());
    }
    
    private jla() {
        this.d = -1;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = jla.g) == null) {
                    synchronized (jla.class) {
                        if (jla.g == null) {
                            o = (jla.g = new oku(jla.e));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return jla.e;
            }
            case 4: {
                return new okt(jla.e);
            }
            case 3: {
                return new jla();
            }
            case 2: {
                return oky.F(jla.e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0007\u100c\u0005", new Object[] { "f", "a", "b", "c", "d", lpx.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
