// 
// Decompiled by Procyon v0.6.0
// 

public final class psa extends oky implements omk
{
    public static final psa g;
    private static volatile omp h;
    public int a;
    public String b;
    public String c;
    public int d;
    public long e;
    public String f;
    
    static {
        oky.G(psa.class, g = new psa());
    }
    
    private psa() {
        this.b = "";
        this.c = "";
        this.f = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = psa.h) == null) {
                    synchronized (psa.class) {
                        if (psa.h == null) {
                            o = (psa.h = new oku(psa.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return psa.g;
            }
            case 4: {
                return new okt(psa.g);
            }
            case 3: {
                return new psa();
            }
            case 2: {
                return oky.F(psa.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1008\u0004", new Object[] { "a", "b", "c", "d", opp.k, "e", "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
