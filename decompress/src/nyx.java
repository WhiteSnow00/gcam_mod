// 
// Decompiled by Procyon v0.6.0
// 

public final class nyx extends oky implements omk
{
    public static final nyx c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(nyx.class, c = new nyx());
    }
    
    private nyx() {
        final okz b = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nyx.d) == null) {
                    synchronized (nyx.class) {
                        if (nyx.d == null) {
                            o = (nyx.d = new oku(nyx.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nyx.c;
            }
            case 4: {
                return new okt(nyx.c);
            }
            case 3: {
                return new nyx();
            }
            case 2: {
                return oky.F(nyx.c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u1004\u0002", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
