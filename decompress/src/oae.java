// 
// Decompiled by Procyon v0.6.0
// 

public final class oae extends oky implements omk
{
    public static final oae f;
    private static volatile omp g;
    public int a;
    public int b;
    public String c;
    public float d;
    public float e;
    
    static {
        oky.G(oae.class, f = new oae());
    }
    
    private oae() {
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = oae.g) == null) {
                    synchronized (oae.class) {
                        if (oae.g == null) {
                            o = (oae.g = new oku(oae.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oae.f;
            }
            case 4: {
                return new okt(oae.f);
            }
            case 3: {
                return new oae();
            }
            case 2: {
                return oky.F(oae.f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0004\u1008\u0003\u0005\u1001\u0004\u0006\u1001\u0005", new Object[] { "a", "b", nzh.r, "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
