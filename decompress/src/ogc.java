// 
// Decompiled by Procyon v0.6.0
// 

public final class ogc extends oky implements omk
{
    public static final ogc d;
    private static volatile omp e;
    public int a;
    public float b;
    public float c;
    
    static {
        oky.G(ogc.class, d = new ogc());
    }
    
    private ogc() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = ogc.e) == null) {
                    synchronized (ogc.class) {
                        if (ogc.e == null) {
                            o = (ogc.e = new oku(ogc.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ogc.d;
            }
            case 4: {
                return new okt(ogc.d);
            }
            case 3: {
                return new ogc();
            }
            case 2: {
                return oky.F(ogc.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
