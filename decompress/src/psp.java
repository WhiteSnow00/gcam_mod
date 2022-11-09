// 
// Decompiled by Procyon v0.6.0
// 

public final class psp extends oky implements omk
{
    public static final psp t;
    private static volatile omp w;
    public int a;
    public pro b;
    public long c;
    public String d;
    public psa e;
    public prq f;
    public psc g;
    public psm h;
    public psj i;
    public prb j;
    public psg k;
    public prk l;
    public prs m;
    public String n;
    public prz o;
    public pse p;
    public pso q;
    public psd r;
    public pqx s;
    private psb u;
    private byte v;
    
    static {
        oky.G(psp.class, t = new psp());
    }
    
    private psp() {
        this.v = 2;
        this.d = "";
        this.n = "";
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(int n, Object o) {
        final int n2 = 1;
        switch (n - 1) {
            default: {
                n = n2;
                if (o == null) {
                    n = 0;
                }
                this.v = (byte)n;
                return null;
            }
            case 6: {
                final omp w;
                if ((w = psp.w) == null) {
                    synchronized (psp.class) {
                        if (psp.w == null) {
                            o = (psp.w = new oku(psp.t));
                        }
                    }
                }
                return w;
            }
            case 5: {
                return psp.t;
            }
            case 4: {
                return new okt(psp.t);
            }
            case 3: {
                return new psp();
            }
            case 2: {
                return oky.F(psp.t, "\u0001\u0013\u0000\u0001\u0001 \u0013\u0000\u0000\b\u0001\u1409\u0000\u0002\u1005\u0001\u0003\u1008\u0002\u0005\u1009\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1009\b\n\u1409\t\f\u1009\u000b\u000e\u1409\r\u0010\u1409\u000e\u0011\u1008\u000f\u0015\u1009\u0013\u0017\u1009\u0015\u001d\u1409\u0018\u001e\u1009\u0019\u001f\u1009\u001a \u1009\u001b", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "u", "q", "r", "s" });
            }
            case 0: {
                return this.v;
            }
        }
    }
}
