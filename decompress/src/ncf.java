// 
// Decompiled by Procyon v0.6.0
// 

public final class ncf extends oky implements omk
{
    public static final ncf b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(ncf.class, b = new ncf());
    }
    
    private ncf() {
        this.a = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = ncf.c) == null) {
                    synchronized (ncf.class) {
                        if (ncf.c == null) {
                            o = (ncf.c = new oku(ncf.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ncf.b;
            }
            case 4: {
                return new okt(ncf.b);
            }
            case 3: {
                return new ncf();
            }
            case 2: {
                return oky.F(ncf.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", nce.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
