// 
// Decompiled by Procyon v0.6.0
// 

public final class nzz extends oky implements omk
{
    public static final nzz f;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    
    static {
        oky.G(nzz.class, f = new nzz());
    }
    
    private nzz() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = nzz.g) == null) {
                    synchronized (nzz.class) {
                        if (nzz.g == null) {
                            o = (nzz.g = new oku(nzz.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return nzz.f;
            }
            case 4: {
                return new okt(nzz.f);
            }
            case 3: {
                return new nzz();
            }
            case 2: {
                return oky.F(nzz.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0002\u0003\u1008\u0003\u0004\u100c\u0001", new Object[] { "a", "b", nzh.o, "d", "e", "c", nzh.p });
            }
            case 0: {
                return 1;
            }
        }
    }
}
