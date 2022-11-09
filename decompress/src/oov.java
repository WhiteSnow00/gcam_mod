// 
// Decompiled by Procyon v0.6.0
// 

public final class oov extends oky implements omk
{
    public static final oov b;
    private static volatile omp d;
    public olj a;
    private byte c;
    
    static {
        oky.G(oov.class, b = new oov());
    }
    
    private oov() {
        this.c = 2;
        this.a = oms.b;
    }
    
    @Override
    protected final Object a(int n, Object o) {
        final int n2 = 1;
        switch (n - 1) {
            default: {
                n = n2;
                if (o == null) {
                    n = 0;
                }
                this.c = (byte)n;
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oov.d) == null) {
                    synchronized (oov.class) {
                        if (oov.d == null) {
                            o = (oov.d = new oku(oov.b));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oov.b;
            }
            case 4: {
                return new okt(oov.b);
            }
            case 3: {
                return new oov();
            }
            case 2: {
                return oky.F(oov.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "a", oou.class });
            }
            case 0: {
                return this.c;
            }
        }
    }
}
