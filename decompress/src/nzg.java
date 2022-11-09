// 
// Decompiled by Procyon v0.6.0
// 

public final class nzg extends oky implements omk
{
    public static final nzg f;
    private static volatile omp g;
    public int a;
    public int b;
    public long c;
    public long d;
    public int e;
    
    static {
        oky.G(nzg.class, f = new nzg());
    }
    
    private nzg() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = nzg.g) == null) {
                    synchronized (nzg.class) {
                        if (nzg.g == null) {
                            o = (nzg.g = new oku(nzg.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return nzg.f;
            }
            case 4: {
                return new okt(nzg.f);
            }
            case 3: {
                return new nzg();
            }
            case 2: {
                return oky.F(nzg.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1004\u0003", new Object[] { "a", "b", nzh.a, "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
