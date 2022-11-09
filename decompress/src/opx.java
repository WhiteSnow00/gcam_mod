// 
// Decompiled by Procyon v0.6.0
// 

public final class opx extends oky implements omk
{
    public static final opx b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(opx.class, b = new opx());
    }
    
    private opx() {
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
                if ((c = opx.c) == null) {
                    synchronized (opx.class) {
                        if (opx.c == null) {
                            o = (opx.c = new oku(opx.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return opx.b;
            }
            case 4: {
                return new okt(opx.b);
            }
            case 3: {
                return new opx();
            }
            case 2: {
                return oky.F(opx.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", ncc.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
