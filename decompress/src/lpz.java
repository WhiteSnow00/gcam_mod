// 
// Decompiled by Procyon v0.6.0
// 

public final class lpz extends oky implements omk
{
    public static final lpz f;
    private static volatile omp g;
    public int a;
    public String b;
    public String c;
    public int d;
    public int e;
    
    static {
        oky.G(lpz.class, f = new lpz());
    }
    
    private lpz() {
        this.b = "";
        this.c = "";
        this.d = -1;
        this.e = -1;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = lpz.g) == null) {
                    synchronized (lpz.class) {
                        if (lpz.g == null) {
                            o = (lpz.g = new oku(lpz.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return lpz.f;
            }
            case 4: {
                return new okt(lpz.f);
            }
            case 3: {
                return new lpz();
            }
            case 2: {
                return oky.F(lpz.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "a", "b", "c", "d", lpx.a, "e", lpx.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
