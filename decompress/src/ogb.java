// 
// Decompiled by Procyon v0.6.0
// 

public final class ogb extends oky implements omk
{
    public static final ogb d;
    private static volatile omp e;
    public int a;
    public ole b;
    public float c;
    
    static {
        oky.G(ogb.class, d = new ogb());
    }
    
    private ogb() {
        this.b = okr.b;
        this.c = 1.0E9f;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = ogb.e) == null) {
                    synchronized (ogb.class) {
                        if (ogb.e == null) {
                            o = (ogb.e = new oku(ogb.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ogb.d;
            }
            case 4: {
                return new okt(ogb.d);
            }
            case 3: {
                return new ogb();
            }
            case 2: {
                return oky.F(ogb.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0013\u0002\u1001\u0000", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
