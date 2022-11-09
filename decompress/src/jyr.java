// 
// Decompiled by Procyon v0.6.0
// 

public final class jyr extends oky implements omk
{
    public static final jyr n;
    private static volatile omp o;
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public long h;
    public int i;
    public String j;
    public int k;
    public int l;
    public boolean m;
    
    static {
        oky.G(jyr.class, n = new jyr());
    }
    
    private jyr() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.h = -1L;
        this.j = "";
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp o2;
                if ((o2 = jyr.o) == null) {
                    synchronized (jyr.class) {
                        if (jyr.o == null) {
                            o = (jyr.o = new oku(jyr.n));
                        }
                    }
                }
                return o2;
            }
            case 5: {
                return jyr.n;
            }
            case 4: {
                return new okt(jyr.n);
            }
            case 3: {
                return new jyr();
            }
            case 2: {
                return oky.F(jyr.n, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1008\u0006\u0013\u1002\u0018\u0017\u1004\u001e\u0019\u100c\b \u1008!!\u1008\u0004\"\u1004\"#\u1004#$\u1007$", new Object[] { "a", "b", "c", "d", "f", "h", "i", "g", opp.d, "j", "e", "k", "l", "m" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
