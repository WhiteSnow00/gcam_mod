// 
// Decompiled by Procyon v0.6.0
// 

public final class obm extends oky implements omk
{
    public static final obm u;
    private static volatile omp v;
    public int a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public boolean t;
    
    static {
        oky.G(obm.class, u = new obm());
    }
    
    private obm() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp v;
                if ((v = obm.v) == null) {
                    synchronized (obm.class) {
                        if (obm.v == null) {
                            o = (obm.v = new oku(obm.u));
                        }
                    }
                }
                return v;
            }
            case 5: {
                return obm.u;
            }
            case 4: {
                return new okt(obm.u);
            }
            case 3: {
                return new obm();
            }
            case 2: {
                return oky.F(obm.u, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u100c\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1002\b\n\u1002\t\u000b\u1002\n\f\u1002\u000b\r\u1002\f\u000e\u1002\r\u000f\u1002\u000e\u0010\u1002\u000f\u0011\u1002\u0010\u0012\u1002\u0011\u0013\u1007\u0012", new Object[] { "a", "b", "c", "d", obl.c(), "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
