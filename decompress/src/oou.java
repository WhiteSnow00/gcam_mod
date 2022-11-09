// 
// Decompiled by Procyon v0.6.0
// 

public final class oou extends oky implements omk
{
    public static final oou e;
    private static volatile omp g;
    public int a;
    public olf b;
    public ole c;
    public ooy d;
    private byte f;
    
    static {
        oky.G(oou.class, e = new oou());
    }
    
    private oou() {
        this.f = 2;
        final oms b = oms.b;
        this.b = okz.b;
        this.c = okr.b;
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
                if ((g = oou.g) == null) {
                    synchronized (oou.class) {
                        if (oou.g == null) {
                            o = (oou.g = new oku(oou.e));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oou.e;
            }
            case 4: {
                return new okt(oou.e);
            }
            case 3: {
                return new oou();
            }
            case 2: {
                return oky.F(oou.e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0001\u0002'\u0003$\u0004\u1409\u0000", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return this.f;
            }
        }
    }
}
