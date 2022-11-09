// 
// Decompiled by Procyon v0.6.0
// 

public final class pry extends oky implements omk
{
    public static final pry c;
    private static volatile omp d;
    public int a;
    public prx b;
    
    static {
        oky.G(pry.class, c = new pry());
    }
    
    private pry() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = pry.d) == null) {
                    synchronized (pry.class) {
                        if (pry.d == null) {
                            o = (pry.d = new oku(pry.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return pry.c;
            }
            case 4: {
                return new okt(pry.c);
            }
            case 3: {
                return new pry();
            }
            case 2: {
                return oky.F(pry.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
