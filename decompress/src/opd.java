// 
// Decompiled by Procyon v0.6.0
// 

public final class opd extends oky implements omk
{
    public static final opd b;
    private static volatile omp d;
    public olj a;
    private byte c;
    
    static {
        oky.G(opd.class, b = new opd());
    }
    
    private opd() {
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
                if ((d = opd.d) == null) {
                    synchronized (opd.class) {
                        if (opd.d == null) {
                            o = (opd.d = new oku(opd.b));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return opd.b;
            }
            case 4: {
                return new okt(opd.b);
            }
            case 3: {
                return new opd();
            }
            case 2: {
                return oky.F(opd.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "a", opc.class });
            }
            case 0: {
                return this.c;
            }
        }
    }
}
