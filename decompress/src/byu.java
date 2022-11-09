// 
// Decompiled by Procyon v0.6.0
// 

public final class byu extends oky implements omk
{
    public static final byu c;
    private static volatile omp d;
    public int a;
    public Object b;
    
    static {
        oky.G(byu.class, c = new byu());
    }
    
    private byu() {
        this.a = 0;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = byu.d) == null) {
                    synchronized (byu.class) {
                        if (byu.d == null) {
                            o = (byu.d = new oku(byu.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return byu.c;
            }
            case 4: {
                return new okt(byu.c);
            }
            case 3: {
                return new byu();
            }
            case 2: {
                return oky.F(byu.c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[] { "b", "a", byw.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
