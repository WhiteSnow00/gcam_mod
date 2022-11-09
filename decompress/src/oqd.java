// 
// Decompiled by Procyon v0.6.0
// 

public final class oqd extends oky implements omk
{
    public static final oqd d;
    private static volatile omp e;
    public int a;
    public ole b;
    public float c;
    
    static {
        oky.G(oqd.class, d = new oqd());
    }
    
    private oqd() {
        this.b = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oqd.e) == null) {
                    synchronized (oqd.class) {
                        if (oqd.e == null) {
                            o = (oqd.e = new oku(oqd.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oqd.d;
            }
            case 4: {
                return new okt(oqd.d);
            }
            case 3: {
                return new oqd();
            }
            case 2: {
                return oky.F(oqd.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001$\u0002\u1001\u0000", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
