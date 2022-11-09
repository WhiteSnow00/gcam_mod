// 
// Decompiled by Procyon v0.6.0
// 

public final class ncb extends oky implements omk
{
    public static final ncb a;
    private static volatile omp b;
    
    static {
        oky.G(ncb.class, a = new ncb());
    }
    
    private ncb() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = ncb.b) == null) {
                    synchronized (ncb.class) {
                        if (ncb.b == null) {
                            o = (ncb.b = new oku(ncb.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ncb.a;
            }
            case 4: {
                return new okt(ncb.a);
            }
            case 3: {
                return new ncb();
            }
            case 2: {
                return oky.F(ncb.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
