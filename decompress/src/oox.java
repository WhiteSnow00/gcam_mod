// 
// Decompiled by Procyon v0.6.0
// 

public final class oox extends oky implements omk
{
    public static final oox d;
    private static volatile omp e;
    public int a;
    public float b;
    public float c;
    
    static {
        oky.G(oox.class, d = new oox());
    }
    
    private oox() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oox.e) == null) {
                    synchronized (oox.class) {
                        if (oox.e == null) {
                            o = (oox.e = new oku(oox.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oox.d;
            }
            case 4: {
                return new okt(oox.d);
            }
            case 3: {
                return new oox();
            }
            case 2: {
                return oky.F(oox.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
