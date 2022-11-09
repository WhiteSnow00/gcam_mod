// 
// Decompiled by Procyon v0.6.0
// 

public final class oca extends oky implements omk
{
    public static final oca a;
    private static volatile omp h;
    private int b;
    private obz c;
    private String d;
    private int e;
    private ocd f;
    private byte g;
    
    static {
        oky.G(oca.class, a = new oca());
    }
    
    private oca() {
        this.g = 2;
        this.d = "";
        final oms b = oms.b;
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
                this.g = (byte)n;
                return null;
            }
            case 6: {
                final omp h;
                if ((h = oca.h) == null) {
                    synchronized (oca.class) {
                        if (oca.h == null) {
                            o = (oca.h = new oku(oca.a));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return oca.a;
            }
            case 4: {
                return new okt(oca.a);
            }
            case 3: {
                return new oca();
            }
            case 2: {
                return oky.F(oca.a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001\u1509\u0000\u0002\u1508\u0001\u0003\u1504\u0002\b\u1409\n", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 0: {
                return this.g;
            }
        }
    }
}
