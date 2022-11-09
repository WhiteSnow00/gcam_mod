// 
// Decompiled by Procyon v0.6.0
// 

public final class ooh extends oky implements omk
{
    public static final ooh c;
    private static volatile omp d;
    public int a;
    public Object b;
    
    static {
        oky.G(ooh.class, c = new ooh());
    }
    
    private ooh() {
        this.a = 0;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = ooh.d) == null) {
                    synchronized (ooh.class) {
                        if (ooh.d == null) {
                            o = (ooh.d = new oku(ooh.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ooh.c;
            }
            case 4: {
                return new okt(ooh.c);
            }
            case 3: {
                return new ooh();
            }
            case 2: {
                return oky.F(ooh.c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103f\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "b", "a", ood.c(), ooe.class, oog.class });
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final void i(final ood ood) {
        this.b = ood.v;
        this.a = 1;
    }
}
