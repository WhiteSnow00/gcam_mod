// 
// Decompiled by Procyon v0.6.0
// 

public final class obt extends oky implements omk
{
    public static final obt g;
    private static volatile omp h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        oky.G(obt.class, g = new obt());
    }
    
    private obt() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = obt.h) == null) {
                    synchronized (obt.class) {
                        if (obt.h == null) {
                            o = (obt.h = new oku(obt.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return obt.g;
            }
            case 4: {
                return new okt(obt.g);
            }
            case 3: {
                return new obt();
            }
            case 2: {
                return oky.F(obt.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u1004\u0004", new Object[] { "a", "b", "c", "d", "e", obh.i, "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
