// 
// Decompiled by Procyon v0.6.0
// 

public final class nzu extends oky implements omk
{
    public static final nzu g;
    private static volatile omp h;
    public int a;
    public String b;
    public boolean c;
    public int d;
    public String e;
    public int f;
    
    static {
        oky.G(nzu.class, g = new nzu());
    }
    
    private nzu() {
        this.b = "";
        this.e = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = nzu.h) == null) {
                    synchronized (nzu.class) {
                        if (nzu.h == null) {
                            o = (nzu.h = new oku(nzu.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return nzu.g;
            }
            case 4: {
                return new okt(nzu.g);
            }
            case 3: {
                return new nzu();
            }
            case 2: {
                return oky.F(nzu.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u1008\u0003\u0005\u100b\u0004", new Object[] { "a", "b", "c", "d", lpx.q, "e", "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
