// 
// Decompiled by Procyon v0.6.0
// 

public final class ooy extends oky implements omk
{
    public static final ooy e;
    private static volatile omp g;
    public int a;
    public int b;
    public oow c;
    public olj d;
    private byte f;
    
    static {
        oky.G(ooy.class, e = new ooy());
    }
    
    private ooy() {
        this.f = 2;
        this.d = oms.b;
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
                if ((g = ooy.g) == null) {
                    synchronized (ooy.class) {
                        if (ooy.g == null) {
                            o = (ooy.g = new oku(ooy.e));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ooy.e;
            }
            case 4: {
                return new okt(ooy.e);
            }
            case 3: {
                return new ooy();
            }
            case 2: {
                return oky.F(ooy.e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\u100c\u0000\u0003\u1009\u0002\u0005\u001b", new Object[] { "a", "b", obh.u, "c", "d", oox.class });
            }
            case 0: {
                return this.f;
            }
        }
    }
}
