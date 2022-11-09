// 
// Decompiled by Procyon v0.6.0
// 

public final class nzt extends oky implements omk
{
    public static final nzt f;
    private static volatile omp g;
    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    
    static {
        oky.G(nzt.class, f = new nzt());
    }
    
    private nzt() {
        this.b = "";
        this.c = "";
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
                if ((g = nzt.g) == null) {
                    synchronized (nzt.class) {
                        if (nzt.g == null) {
                            o = (nzt.g = new oku(nzt.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return nzt.f;
            }
            case 4: {
                return new okt(nzt.f);
            }
            case 3: {
                return new nzt();
            }
            case 2: {
                return oky.F(nzt.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1004\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
