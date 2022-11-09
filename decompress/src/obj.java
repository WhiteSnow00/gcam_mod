// 
// Decompiled by Procyon v0.6.0
// 

public final class obj extends oky implements omk
{
    public static final obj d;
    private static volatile omp e;
    public int a;
    public obn b;
    public boolean c;
    
    static {
        oky.G(obj.class, d = new obj());
    }
    
    private obj() {
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = obj.e) == null) {
                    synchronized (obj.class) {
                        if (obj.e == null) {
                            o = (obj.e = new oku(obj.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return obj.d;
            }
            case 4: {
                return new okt(obj.d);
            }
            case 3: {
                return new obj();
            }
            case 2: {
                return oky.F(obj.d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0005\u1007\u0003", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
