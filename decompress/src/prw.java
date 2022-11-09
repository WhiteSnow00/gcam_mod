// 
// Decompiled by Procyon v0.6.0
// 

public final class prw extends oky implements omk
{
    public static final prw s;
    private static volatile omp t;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public pru p;
    public pru q;
    public ome r;
    
    static {
        oky.G(prw.class, s = new prw());
    }
    
    private prw() {
        this.r = ome.a;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp t;
                if ((t = prw.t) == null) {
                    synchronized (prw.class) {
                        if (prw.t == null) {
                            o = (prw.t = new oku(prw.s));
                        }
                    }
                }
                return t;
            }
            case 5: {
                return prw.s;
            }
            case 4: {
                return new okt(prw.s);
            }
            case 3: {
                return new prw();
            }
            case 2: {
                return oky.F(prw.s, "\u0001\u0011\u0000\u0001\u0001\u0015\u0011\u0001\u0000\u0000\u0001\u1002\u0000\u0003\u1002\u0004\u0004\u1002\u0007\u0005\u1002\t\t\u1002\n\n\u1002\r\u000b\u1007\u000e\f\u1009\u000f\r\u1009\u0010\u000e\u1002\u0001\u000f\u1002\u0002\u00102\u0011\u1002\u0005\u0012\u1002\b\u0013\u1002\u0006\u0014\u1002\u000b\u0015\u1002\f", new Object[] { "a", "b", "e", "h", "j", "k", "n", "o", "p", "q", "c", "d", "r", prv.a, "f", "i", "g", "l", "m" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
