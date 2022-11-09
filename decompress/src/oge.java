// 
// Decompiled by Procyon v0.6.0
// 

public final class oge extends oky implements omk
{
    public static final oge b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(oge.class, b = new oge());
    }
    
    private oge() {
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
                if ((c = oge.c) == null) {
                    synchronized (oge.class) {
                        if (oge.c == null) {
                            o = (oge.c = new oku(oge.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return oge.b;
            }
            case 4: {
                return new okt(oge.b);
            }
            case 3: {
                return new oge();
            }
            case 2: {
                return oky.F(oge.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", ogd.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
