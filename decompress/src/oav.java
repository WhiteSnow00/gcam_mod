// 
// Decompiled by Procyon v0.6.0
// 

public final class oav extends oky implements omk
{
    public static final oav f;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    public int d;
    public oaw e;
    
    static {
        oky.G(oav.class, f = new oav());
    }
    
    private oav() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = oav.g) == null) {
                    synchronized (oav.class) {
                        if (oav.g == null) {
                            o = (oav.g = new oku(oav.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oav.f;
            }
            case 4: {
                return new okt(oav.f);
            }
            case 3: {
                return new oav();
            }
            case 2: {
                return oky.F(oav.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1009\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
