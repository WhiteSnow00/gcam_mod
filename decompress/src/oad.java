// 
// Decompiled by Procyon v0.6.0
// 

public final class oad extends oky implements omk
{
    public static final oad d;
    private static volatile omp e;
    public int a;
    public long b;
    public long c;
    
    static {
        oky.G(oad.class, d = new oad());
    }
    
    private oad() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oad.e) == null) {
                    synchronized (oad.class) {
                        if (oad.e == null) {
                            o = (oad.e = new oku(oad.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oad.d;
            }
            case 4: {
                return new okt(oad.d);
            }
            case 3: {
                return new oad();
            }
            case 2: {
                return oky.F(oad.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
