// 
// Decompiled by Procyon v0.6.0
// 

public final class lrv extends oky implements omk
{
    public static final lrv a;
    private static volatile omp b;
    
    static {
        oky.G(lrv.class, a = new lrv());
    }
    
    private lrv() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lrv.b) == null) {
                    synchronized (lrv.class) {
                        if (lrv.b == null) {
                            o = (lrv.b = new oku(lrv.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lrv.a;
            }
            case 4: {
                return new okt(lrv.a);
            }
            case 3: {
                return new lrv();
            }
            case 2: {
                return oky.F(lrv.a, "\u0000\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
