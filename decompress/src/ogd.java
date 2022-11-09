// 
// Decompiled by Procyon v0.6.0
// 

public final class ogd extends oky implements omk
{
    public static final ogd e;
    private static volatile omp f;
    public int a;
    public float b;
    public float c;
    public float d;
    
    static {
        oky.G(ogd.class, e = new ogd());
    }
    
    private ogd() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ogd.f) == null) {
                    synchronized (ogd.class) {
                        if (ogd.f == null) {
                            o = (ogd.f = new oku(ogd.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ogd.e;
            }
            case 4: {
                return new okt(ogd.e);
            }
            case 3: {
                return new ogd();
            }
            case 2: {
                return oky.F(ogd.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
