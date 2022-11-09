// 
// Decompiled by Procyon v0.6.0
// 

public final class lqm extends oky implements omk
{
    public static final lqm d;
    private static volatile omp f;
    public int a;
    public ncf b;
    public nch c;
    private byte e;
    
    static {
        oky.G(lqm.class, d = new lqm());
    }
    
    private lqm() {
        this.e = 2;
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
                this.e = (byte)n;
                return null;
            }
            case 6: {
                final omp f;
                if ((f = lqm.f) == null) {
                    synchronized (lqm.class) {
                        if (lqm.f == null) {
                            o = (lqm.f = new oku(lqm.d));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return lqm.d;
            }
            case 4: {
                return new okt(lqm.d);
            }
            case 3: {
                return new lqm();
            }
            case 2: {
                return oky.F(lqm.d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u1009\u0000\u0004\u1009\u0002", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return this.e;
            }
        }
    }
}
