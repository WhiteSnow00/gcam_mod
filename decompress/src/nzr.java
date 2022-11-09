// 
// Decompiled by Procyon v0.6.0
// 

public final class nzr extends oky implements omk
{
    public static final nzr b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(nzr.class, b = new nzr());
    }
    
    private nzr() {
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
                if ((c = nzr.c) == null) {
                    synchronized (nzr.class) {
                        if (nzr.c == null) {
                            o = (nzr.c = new oku(nzr.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return nzr.b;
            }
            case 4: {
                return new okt(nzr.b);
            }
            case 3: {
                return new nzr();
            }
            case 2: {
                return oky.F(nzr.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", nzs.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
