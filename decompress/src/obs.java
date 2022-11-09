// 
// Decompiled by Procyon v0.6.0
// 

public final class obs extends oky implements omk
{
    private static volatile omp A;
    public static final obs z;
    public int a;
    public float b;
    public long c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public long k;
    public obr l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public olf u;
    public int v;
    public float w;
    public long x;
    public long y;
    
    static {
        oky.G(obs.class, z = new obs());
    }
    
    private obs() {
        this.u = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp a;
                if ((a = obs.A) == null) {
                    synchronized (obs.class) {
                        if (obs.A == null) {
                            o = (obs.A = new oku(obs.z));
                        }
                    }
                }
                return a;
            }
            case 5: {
                return obs.z;
            }
            case 4: {
                return new okt(obs.z);
            }
            case 3: {
                return new obs();
            }
            case 2: {
                return oky.F(obs.z, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0001\u0000\u0001\u1001\u0000\u0002\u1002\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1001\u0004\u0006\u1007\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1004\b\n\u1002\t\u000b\u1009\n\f\u1004\u000b\r\u1004\f\u000e\u1004\r\u000f\u1004\u000e\u0010\u1004\u000f\u0011\u1004\u0010\u0012\u1004\u0011\u0013\u1004\u0012\u0014\u001e\u0015\u1004\u0013\u0016\u1001\u0014\u0017\u1002\u0015\u0018\u1002\u0016", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", obu.c(), "v", "w", "x", "y" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
