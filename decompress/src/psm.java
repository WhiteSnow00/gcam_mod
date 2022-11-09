// 
// Decompiled by Procyon v0.6.0
// 

public final class psm extends oky implements omk
{
    public static final psm d;
    private static volatile omp g;
    public int a;
    public int b;
    public int c;
    private psl e;
    private byte f;
    
    static {
        oky.G(psm.class, d = new psm());
    }
    
    private psm() {
        this.f = 2;
        this.c = 1;
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
                this.f = (byte)n;
                return null;
            }
            case 6: {
                final omp g;
                if ((g = psm.g) == null) {
                    synchronized (psm.class) {
                        if (psm.g == null) {
                            o = (psm.g = new oku(psm.d));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return psm.d;
            }
            case 4: {
                return new okt(psm.d);
            }
            case 3: {
                return new psm();
            }
            case 2: {
                return oky.F(psm.d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u1409\u0002", new Object[] { "a", "b", opp.n, "c", "e" });
            }
            case 0: {
                return this.f;
            }
        }
    }
}
