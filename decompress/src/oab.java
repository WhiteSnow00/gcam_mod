// 
// Decompiled by Procyon v0.6.0
// 

public final class oab extends oky implements omk
{
    public static final oab g;
    private static volatile omp h;
    public int a;
    public int b;
    public float c;
    public float d;
    public float e;
    public long f;
    
    static {
        oky.G(oab.class, g = new oab());
    }
    
    private oab() {
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = oab.h) == null) {
                    synchronized (oab.class) {
                        if (oab.h == null) {
                            o = (oab.h = new oku(oab.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return oab.g;
            }
            case 4: {
                return new okt(oab.g);
            }
            case 3: {
                return new oab();
            }
            case 2: {
                return oky.F(oab.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1002\u0004", new Object[] { "a", "b", "c", "d", "e", "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
