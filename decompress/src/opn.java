// 
// Decompiled by Procyon v0.6.0
// 

public final class opn extends oky implements omk
{
    public static final opn b;
    private static volatile omp c;
    public oli a;
    
    static {
        oky.G(opn.class, b = new opn());
    }
    
    private opn() {
        this.a = oly.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = opn.c) == null) {
                    synchronized (opn.class) {
                        if (opn.c == null) {
                            o = (opn.c = new oku(opn.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return opn.b;
            }
            case 4: {
                return new okt(opn.b);
            }
            case 3: {
                return new opn();
            }
            case 2: {
                return oky.F(opn.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
