// 
// Decompiled by Procyon v0.6.0
// 

public final class nzy extends oky implements omk
{
    public static final nzy f;
    private static volatile omp g;
    public int a;
    public nzz b;
    public nzw c;
    public oaa d;
    public String e;
    
    static {
        oky.G(nzy.class, f = new nzy());
    }
    
    private nzy() {
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
                if ((g = nzy.g) == null) {
                    synchronized (nzy.class) {
                        if (nzy.g == null) {
                            o = (nzy.g = new oku(nzy.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return nzy.f;
            }
            case 4: {
                return new okt(nzy.f);
            }
            case 3: {
                return new nzy();
            }
            case 2: {
                return oky.F(nzy.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
