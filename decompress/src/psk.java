// 
// Decompiled by Procyon v0.6.0
// 

public final class psk extends oky implements omk
{
    public static final psk c;
    private static volatile omp d;
    public olf a;
    public olf b;
    
    static {
        oky.G(psk.class, c = new psk());
    }
    
    private psk() {
        this.a = okz.b;
        this.b = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = psk.d) == null) {
                    synchronized (psk.class) {
                        if (psk.d == null) {
                            o = (psk.d = new oku(psk.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return psk.c;
            }
            case 4: {
                return new okt(psk.c);
            }
            case 3: {
                return new psk();
            }
            case 2: {
                return oky.F(psk.c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
