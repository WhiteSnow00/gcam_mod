// 
// Decompiled by Procyon v0.6.0
// 

public final class oaq extends oky implements omk
{
    public static final oaq f;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    public float d;
    public int e;
    
    static {
        oky.G(oaq.class, f = new oaq());
    }
    
    private oaq() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = oaq.g) == null) {
                    synchronized (oaq.class) {
                        if (oaq.g == null) {
                            o = (oaq.g = new oku(oaq.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oaq.f;
            }
            case 4: {
                return new okt(oaq.f);
            }
            case 3: {
                return new oaq();
            }
            case 2: {
                return oky.F(oaq.f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1001\u0003\u0005\u100c\u0004", new Object[] { "a", "b", "c", "d", "e", oah.i });
            }
            case 0: {
                return 1;
            }
        }
    }
}
