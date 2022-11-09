// 
// Decompiled by Procyon v0.6.0
// 

public final class pst extends oky implements omk
{
    public static final pst b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(pst.class, b = new pst());
    }
    
    private pst() {
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
                if ((c = pst.c) == null) {
                    synchronized (pst.class) {
                        if (pst.c == null) {
                            o = (pst.c = new oku(pst.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return pst.b;
            }
            case 4: {
                return new okt(pst.b);
            }
            case 3: {
                return new pst();
            }
            case 2: {
                return oky.F(pst.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
