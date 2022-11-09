// 
// Decompiled by Procyon v0.6.0
// 

public final class lrm extends oky implements omk
{
    public static final lrm b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(lrm.class, b = new lrm());
    }
    
    private lrm() {
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
                if ((c = lrm.c) == null) {
                    synchronized (lrm.class) {
                        if (lrm.c == null) {
                            o = (lrm.c = new oku(lrm.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return lrm.b;
            }
            case 4: {
                return new okt(lrm.b);
            }
            case 3: {
                return new lrm();
            }
            case 2: {
                return oky.F(lrm.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
