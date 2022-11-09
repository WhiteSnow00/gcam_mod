// 
// Decompiled by Procyon v0.6.0
// 

public final class oal extends oky implements omk
{
    public static final oal f;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    public String d;
    public int e;
    
    static {
        oky.G(oal.class, f = new oal());
    }
    
    private oal() {
        this.d = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = oal.g) == null) {
                    synchronized (oal.class) {
                        if (oal.g == null) {
                            o = (oal.g = new oku(oal.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oal.f;
            }
            case 4: {
                return new okt(oal.f);
            }
            case 3: {
                return new oal();
            }
            case 2: {
                return oky.F(oal.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u100c\u0003", new Object[] { "a", "b", oah.e, "c", "d", "e", oah.f });
            }
            case 0: {
                return 1;
            }
        }
    }
}
