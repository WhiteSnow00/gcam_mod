// 
// Decompiled by Procyon v0.6.0
// 

public final class osy extends oky implements omk
{
    public static final osy e;
    private static volatile omp f;
    public int a;
    public float b;
    public float c;
    public float d;
    
    static {
        oky.G(osy.class, e = new osy());
    }
    
    private osy() {
        final okr b = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = osy.f) == null) {
                    synchronized (osy.class) {
                        if (osy.f == null) {
                            o = (osy.f = new oku(osy.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return osy.e;
            }
            case 4: {
                return new okt(osy.e);
            }
            case 3: {
                return new osy();
            }
            case 2: {
                return oky.F(osy.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
