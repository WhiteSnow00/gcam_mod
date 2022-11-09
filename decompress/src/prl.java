// 
// Decompiled by Procyon v0.6.0
// 

public final class prl extends oky implements omk
{
    private static volatile omp A;
    public static final prl z;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    
    static {
        oky.G(prl.class, z = new prl());
    }
    
    private prl() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp a;
                if ((a = prl.A) == null) {
                    synchronized (prl.class) {
                        if (prl.A == null) {
                            o = (prl.A = new oku(prl.z));
                        }
                    }
                }
                return a;
            }
            case 5: {
                return prl.z;
            }
            case 4: {
                return new okt(prl.z);
            }
            case 3: {
                return new prl();
            }
            case 2: {
                return oky.F(prl.z, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0007\b\u1004\b\t\u1004\t\n\u1004\n\u000b\u1004\u000b\f\u1004\f\r\u1004\r\u000e\u1004\u000e\u000f\u1004\u000f\u0010\u1004\u0010\u0011\u1004\u0011\u0012\u1004\u0012\u0013\u1004\u0006\u0014\u1002\u0013\u0015\u1002\u0014\u0016\u1002\u0015\u0017\u1002\u0016\u0018\u1002\u0017", new Object[] { "a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "h", "u", "v", "w", "x", "y" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
