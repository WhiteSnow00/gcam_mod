// 
// Decompiled by Procyon v0.6.0
// 

public final class psb extends oky implements omk
{
    public static final psb a;
    private static volatile omp e;
    private int b;
    private oca c;
    private byte d;
    
    static {
        oky.G(psb.class, a = new psb());
    }
    
    private psb() {
        this.d = 2;
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
                this.d = (byte)n;
                return null;
            }
            case 6: {
                final omp e;
                if ((e = psb.e) == null) {
                    synchronized (psb.class) {
                        if (psb.e == null) {
                            o = (psb.e = new oku(psb.a));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return psb.a;
            }
            case 4: {
                return new okt(psb.a);
            }
            case 3: {
                return new psb();
            }
            case 2: {
                return oky.F(psb.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "b", "c" });
            }
            case 0: {
                return this.d;
            }
        }
    }
}
