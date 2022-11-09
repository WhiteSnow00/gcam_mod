// 
// Decompiled by Procyon v0.6.0
// 

public final class prp extends oky implements omk
{
    public static final prp g;
    private static volatile omp i;
    public int a;
    public int b;
    public int c;
    public String d;
    public oli e;
    public prr f;
    private byte h;
    
    static {
        oky.G(prp.class, g = new prp());
    }
    
    private prp() {
        this.h = 2;
        final oms b = oms.b;
        this.d = "";
        this.e = oly.b;
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
                this.h = (byte)n;
                return null;
            }
            case 6: {
                final omp i;
                if ((i = prp.i) == null) {
                    synchronized (prp.class) {
                        if (prp.i == null) {
                            o = (prp.i = new oku(prp.g));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return prp.g;
            }
            case 4: {
                return new okt(prp.g);
            }
            case 3: {
                return new prp();
            }
            case 2: {
                return oky.F(prp.g, "\u0001\u0005\u0000\u0001\u0005\u0016\u0005\u0000\u0001\u0000\u0005\u1004\u0005\b\u100c\b\u0011\u1008\u0013\u0015(\u0016\u1009\u0016", new Object[] { "a", "b", "c", opp.i, "d", "e", "f" });
            }
            case 0: {
                return this.h;
            }
        }
    }
}
