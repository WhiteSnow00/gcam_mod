// 
// Decompiled by Procyon v0.6.0
// 

public final class jkz extends oky implements omk
{
    public static final jkz f;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        oky.G(jkz.class, f = new jkz());
    }
    
    private jkz() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = jkz.g) == null) {
                    synchronized (jkz.class) {
                        if (jkz.g == null) {
                            o = (jkz.g = new oku(jkz.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return jkz.f;
            }
            case 4: {
                return new okt(jkz.f);
            }
            case 3: {
                return new jkz();
            }
            case 2: {
                return oky.F(jkz.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
