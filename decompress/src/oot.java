// 
// Decompiled by Procyon v0.6.0
// 

public final class oot extends oky implements omk
{
    public static final oot c;
    private static volatile omp d;
    public int a;
    public ooo b;
    
    static {
        oky.G(oot.class, c = new oot());
    }
    
    private oot() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oot.d) == null) {
                    synchronized (oot.class) {
                        if (oot.d == null) {
                            o = (oot.d = new oku(oot.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oot.c;
            }
            case 4: {
                return new okt(oot.c);
            }
            case 3: {
                return new oot();
            }
            case 2: {
                return oky.F(oot.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
