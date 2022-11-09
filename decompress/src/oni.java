// 
// Decompiled by Procyon v0.6.0
// 

public final class oni extends oky implements omk
{
    public static final oni c;
    private static volatile omp d;
    public long a;
    public int b;
    
    static {
        oky.G(oni.class, c = new oni());
    }
    
    private oni() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oni.d) == null) {
                    synchronized (oni.class) {
                        if (oni.d == null) {
                            o = (oni.d = new oku(oni.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oni.c;
            }
            case 4: {
                return new okt(oni.c);
            }
            case 3: {
                return new oni();
            }
            case 2: {
                return oky.F(oni.c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
