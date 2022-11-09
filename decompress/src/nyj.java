// 
// Decompiled by Procyon v0.6.0
// 

public final class nyj extends oky implements omk
{
    public static final nyj m;
    private static volatile omp n;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public olj j;
    public long k;
    public long l;
    
    static {
        oky.G(nyj.class, m = new nyj());
    }
    
    private nyj() {
        this.j = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp n2;
                if ((n2 = nyj.n) == null) {
                    synchronized (nyj.class) {
                        if (nyj.n == null) {
                            o = (nyj.n = new oku(nyj.m));
                        }
                    }
                }
                return n2;
            }
            case 5: {
                return nyj.m;
            }
            case 4: {
                return new okt(nyj.m);
            }
            case 3: {
                return new nyj();
            }
            case 2: {
                return oky.F(nyj.m, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\t\u0005\u1002\n\u0006\u1002\f\t\u1002\u0005\n\u1002\u0006\u000e\u001b\u000f\u1002\r\u0010\u1002\u000e", new Object[] { "a", "b", "c", "d", "g", "h", "i", "e", "f", "j", oad.class, "k", "l" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
