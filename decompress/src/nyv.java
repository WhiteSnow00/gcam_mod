// 
// Decompiled by Procyon v0.6.0
// 

public final class nyv extends oky implements omk
{
    public static final nyv i;
    private static volatile omp j;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    
    static {
        oky.G(nyv.class, i = new nyv());
    }
    
    private nyv() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = nyv.j) == null) {
                    synchronized (nyv.class) {
                        if (nyv.j == null) {
                            o = (nyv.j = new oku(nyv.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return nyv.i;
            }
            case 4: {
                return new okt(nyv.i);
            }
            case 3: {
                return new nyv();
            }
            case 2: {
                return oky.F(nyv.i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1001\u0006", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
