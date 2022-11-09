// 
// Decompiled by Procyon v0.6.0
// 

public final class opz extends oky implements omk
{
    public static final opz b;
    private static volatile omp c;
    public ole a;
    
    static {
        oky.G(opz.class, b = new opz());
    }
    
    private opz() {
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
                if ((c = opz.c) == null) {
                    synchronized (opz.class) {
                        if (opz.c == null) {
                            o = (opz.c = new oku(opz.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return opz.b;
            }
            case 4: {
                return new okt(opz.b);
            }
            case 3: {
                return new opz();
            }
            case 2: {
                return oky.F(opz.b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u0013", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
