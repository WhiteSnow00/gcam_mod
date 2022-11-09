// 
// Decompiled by Procyon v0.6.0
// 

public final class nyt extends oky implements omk
{
    public static final nyt f;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        oky.G(nyt.class, f = new nyt());
    }
    
    private nyt() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = nyt.g) == null) {
                    synchronized (nyt.class) {
                        if (nyt.g == null) {
                            o = (nyt.g = new oku(nyt.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return nyt.f;
            }
            case 4: {
                return new okt(nyt.f);
            }
            case 3: {
                return new nyt();
            }
            case 2: {
                return oky.F(nyt.f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0006\u1004\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
