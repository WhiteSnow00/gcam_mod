// 
// Decompiled by Procyon v0.6.0
// 

public final class oqb extends oky implements omk
{
    public static final oqb a;
    private static volatile omp b;
    
    static {
        oky.G(oqb.class, a = new oqb());
    }
    
    private oqb() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = oqb.b) == null) {
                    synchronized (oqb.class) {
                        if (oqb.b == null) {
                            o = (oqb.b = new oku(oqb.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return oqb.a;
            }
            case 4: {
                return new okt(oqb.a);
            }
            case 3: {
                return new oqb();
            }
            case 2: {
                return oky.F(oqb.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
