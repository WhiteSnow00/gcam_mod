// 
// Decompiled by Procyon v0.6.0
// 

public final class nya extends oky implements omk
{
    public static final nya c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(nya.class, c = new nya());
    }
    
    private nya() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nya.d) == null) {
                    synchronized (nya.class) {
                        if (nya.d == null) {
                            o = (nya.d = new oku(nya.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nya.c;
            }
            case 4: {
                return new okt(nya.c);
            }
            case 3: {
                return new nya();
            }
            case 2: {
                return oky.F(nya.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "a", "b", nxw.d });
            }
            case 0: {
                return 1;
            }
        }
    }
}
