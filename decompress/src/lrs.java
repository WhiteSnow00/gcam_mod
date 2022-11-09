// 
// Decompiled by Procyon v0.6.0
// 

public final class lrs extends oky implements omk
{
    public static final lrs a;
    private static volatile omp b;
    
    static {
        oky.G(lrs.class, a = new lrs());
    }
    
    private lrs() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lrs.b) == null) {
                    synchronized (lrs.class) {
                        if (lrs.b == null) {
                            o = (lrs.b = new oku(lrs.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lrs.a;
            }
            case 4: {
                return new okt(lrs.a);
            }
            case 3: {
                return new lrs();
            }
            case 2: {
                return oky.F(lrs.a, "\u0000\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
