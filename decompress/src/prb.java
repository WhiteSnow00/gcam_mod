// 
// Decompiled by Procyon v0.6.0
// 

public final class prb extends oky implements omk
{
    public static final prb c;
    private static volatile omp e;
    public int a;
    public pra b;
    private byte d;
    
    static {
        oky.G(prb.class, c = new prb());
    }
    
    private prb() {
        this.d = 2;
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
                this.d = (byte)n;
                return null;
            }
            case 6: {
                final omp e;
                if ((e = prb.e) == null) {
                    synchronized (prb.class) {
                        if (prb.e == null) {
                            o = (prb.e = new oku(prb.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return prb.c;
            }
            case 4: {
                return new okt(prb.c);
            }
            case 3: {
                return new prb();
            }
            case 2: {
                return oky.F(prb.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return this.d;
            }
        }
    }
}
