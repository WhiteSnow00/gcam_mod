// 
// Decompiled by Procyon v0.6.0
// 

public final class prq extends oky implements omk
{
    public static final prq b;
    private static volatile omp d;
    public olj a;
    private byte c;
    
    static {
        oky.G(prq.class, b = new prq());
    }
    
    private prq() {
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
                if ((d = prq.d) == null) {
                    synchronized (prq.class) {
                        if (prq.d == null) {
                            o = (prq.d = new oku(prq.b));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return prq.b;
            }
            case 4: {
                return new okt(prq.b);
            }
            case 3: {
                return new prq();
            }
            case 2: {
                return oky.F(prq.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "a", prp.class });
            }
            case 0: {
                return this.c;
            }
        }
    }
}
