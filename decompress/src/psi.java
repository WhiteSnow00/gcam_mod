// 
// Decompiled by Procyon v0.6.0
// 

public final class psi extends oky implements omk
{
    public static final psi f;
    private static volatile omp g;
    public int a;
    public String b;
    public oli c;
    public long d;
    public int e;
    
    static {
        oky.G(psi.class, f = new psi());
    }
    
    private psi() {
        this.b = "";
        this.c = oly.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = psi.g) == null) {
                    synchronized (psi.class) {
                        if (psi.g == null) {
                            o = (psi.g = new oku(psi.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return psi.f;
            }
            case 4: {
                return new okt(psi.f);
            }
            case 3: {
                return new psi();
            }
            case 2: {
                return oky.F(psi.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003(\u0004\u100c\u0002", new Object[] { "a", "b", "d", "c", "e", psh.c() });
            }
            case 0: {
                return 1;
            }
        }
    }
}
