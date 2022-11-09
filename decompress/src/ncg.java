// 
// Decompiled by Procyon v0.6.0
// 

public final class ncg extends oky implements omk
{
    public static final ncg c;
    private static volatile omp e;
    public nci a;
    public int b;
    private int d;
    
    static {
        oky.G(ncg.class, c = new ncg());
    }
    
    private ncg() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = ncg.e) == null) {
                    synchronized (ncg.class) {
                        if (ncg.e == null) {
                            o = (ncg.e = new oku(ncg.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ncg.c;
            }
            case 4: {
                return new okt(ncg.c);
            }
            case 3: {
                return new ncg();
            }
            case 2: {
                return oky.F(ncg.c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001", new Object[] { "d", "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
