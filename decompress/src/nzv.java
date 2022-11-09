// 
// Decompiled by Procyon v0.6.0
// 

public final class nzv extends oky implements omk
{
    public static final nzv s;
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
    public boolean m;
    public int n;
    public obc o;
    public int p;
    public long q;
    public long r;
    
    static {
        oky.G(nzv.class, s = new nzv());
    }
    
    private nzv() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp t;
                if ((t = nzv.t) == null) {
                    synchronized (nzv.class) {
                        if (nzv.t == null) {
                            o = (nzv.t = new oku(nzv.s));
                        }
                    }
                }
                return t;
            }
            case 5: {
                return nzv.s;
            }
            case 4: {
                return new okt(nzv.s);
            }
            case 3: {
                return new nzv();
            }
            case 2: {
                return oky.F(nzv.s, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1002\u0007\t\u1002\b\f\u1002\u000b\r\u1002\f\u000e\u1007\r\u000f\u100c\u000e\u0010\u1009\u000f\u0011\u100c\u0010\u0012\u1002\u0011\u0013\u1002\u0012", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", nzh.i, "o", "p", nzh.j, "q", "r" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
