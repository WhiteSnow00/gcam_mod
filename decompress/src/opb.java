// 
// Decompiled by Procyon v0.6.0
// 

public final class opb extends oky implements omk
{
    public static final opb e;
    private static volatile omp f;
    public int a;
    public float b;
    public float c;
    public int d;
    
    static {
        oky.G(opb.class, e = new opb());
    }
    
    private opb() {
        this.d = 15000;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = opb.f) == null) {
                    synchronized (opb.class) {
                        if (opb.f == null) {
                            o = (opb.f = new oku(opb.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return opb.e;
            }
            case 4: {
                return new okt(opb.e);
            }
            case 3: {
                return new opb();
            }
            case 2: {
                return oky.F(opb.e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0004\u100c\u0003", new Object[] { "a", "b", "c", "d", opp.b });
            }
            case 0: {
                return 1;
            }
        }
    }
}
