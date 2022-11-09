// 
// Decompiled by Procyon v0.6.0
// 

public final class oqc extends oky implements omk
{
    public static final oqc i;
    public static final okk j;
    private static volatile omp m;
    public int a;
    public opz b;
    public opz c;
    public float d;
    public float e;
    public float f;
    public oqd g;
    public oqd h;
    private ome k;
    private ome l;
    
    static {
        final oqc k = new oqc();
        oky.G(oqc.class, i = k);
        j = oky.J(opc.l, k, k, 202575443, onv.k);
    }
    
    private oqc() {
        this.k = ome.a;
        this.l = ome.a;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp m;
                if ((m = oqc.m) == null) {
                    synchronized (oqc.class) {
                        if (oqc.m == null) {
                            o = (oqc.m = new oku(oqc.i));
                        }
                    }
                }
                return m;
            }
            case 5: {
                return oqc.i;
            }
            case 4: {
                return new okt(oqc.i);
            }
            case 3: {
                return new oqc();
            }
            case 2: {
                return oky.F(oqc.i, "\u0001\t\u0000\u0001\u0001\t\t\u0002\u0000\u0000\u00012\u00022\u0003\u1009\u0001\u0004\u1001\u0002\u0005\u1001\u0003\u0006\u1001\u0004\u0007\u1009\u0000\b\u1009\u0005\t\u1009\u0006", new Object[] { "a", "k", oqa.a, "l", opy.a, "c", "d", "e", "f", "b", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
