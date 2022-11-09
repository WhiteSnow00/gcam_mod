// 
// Decompiled by Procyon v0.6.0
// 

public final class ogv extends oky implements omk
{
    public static final ogv d;
    private static volatile omp f;
    public int a;
    public ogy b;
    public float c;
    private int e;
    
    static {
        oky.G(ogv.class, d = new ogv());
    }
    
    private ogv() {
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ogv.f) == null) {
                    synchronized (ogv.class) {
                        if (ogv.f == null) {
                            o = (ogv.f = new oku(ogv.d));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ogv.d;
            }
            case 4: {
                return new okt(ogv.d);
            }
            case 3: {
                return new ogv();
            }
            case 2: {
                return oky.F(ogv.d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0005\u1001\u0003", new Object[] { "e", "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
