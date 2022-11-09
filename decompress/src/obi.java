// 
// Decompiled by Procyon v0.6.0
// 

public final class obi extends oky implements omk
{
    public static final obi f;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    
    static {
        oky.G(obi.class, f = new obi());
    }
    
    private obi() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = obi.g) == null) {
                    synchronized (obi.class) {
                        if (obi.g == null) {
                            o = (obi.g = new oku(obi.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return obi.f;
            }
            case 4: {
                return new okt(obi.f);
            }
            case 3: {
                return new obi();
            }
            case 2: {
                return oky.F(obi.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u1007\u0003", new Object[] { "a", "b", obh.a, "c", obh.c, "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
