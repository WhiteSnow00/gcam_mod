// 
// Decompiled by Procyon v0.6.0
// 

public final class opo extends oky implements omk
{
    public static final opo b;
    private static volatile omp c;
    public ole a;
    
    static {
        oky.G(opo.class, b = new opo());
    }
    
    private opo() {
        this.a = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = opo.c) == null) {
                    synchronized (opo.class) {
                        if (opo.c == null) {
                            o = (opo.c = new oku(opo.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return opo.b;
            }
            case 4: {
                return new okt(opo.b);
            }
            case 3: {
                return new opo();
            }
            case 2: {
                return oky.F(opo.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
