// 
// Decompiled by Procyon v0.6.0
// 

public final class byw extends oky implements omk
{
    public static final byw b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(byw.class, b = new byw());
    }
    
    private byw() {
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
                if ((c = byw.c) == null) {
                    synchronized (byw.class) {
                        if (byw.c == null) {
                            o = (byw.c = new oku(byw.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return byw.b;
            }
            case 4: {
                return new okt(byw.b);
            }
            case 3: {
                return new byw();
            }
            case 2: {
                return oky.F(byw.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", byv.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
