// 
// Decompiled by Procyon v0.6.0
// 

public final class ogw extends oky implements omk
{
    public static final ogw b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(ogw.class, b = new ogw());
    }
    
    private ogw() {
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
                if ((c = ogw.c) == null) {
                    synchronized (ogw.class) {
                        if (ogw.c == null) {
                            o = (ogw.c = new oku(ogw.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ogw.b;
            }
            case 4: {
                return new okt(ogw.b);
            }
            case 3: {
                return new ogw();
            }
            case 2: {
                return oky.F(ogw.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", ogv.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
