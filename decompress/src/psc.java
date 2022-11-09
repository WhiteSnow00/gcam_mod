// 
// Decompiled by Procyon v0.6.0
// 

public final class psc extends oky implements omk
{
    public static final psc l;
    private static volatile omp n;
    public int a;
    public boolean b;
    public pry c;
    public String d;
    public String e;
    public int f;
    public long g;
    public long h;
    public String i;
    public ocd j;
    public ope k;
    private byte m;
    
    static {
        oky.G(psc.class, l = new psc());
    }
    
    private psc() {
        this.m = 2;
        this.d = "";
        this.e = "";
        this.i = "";
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
                this.m = (byte)n;
                return null;
            }
            case 6: {
                final omp n3;
                if ((n3 = psc.n) == null) {
                    synchronized (psc.class) {
                        if (psc.n == null) {
                            o = (psc.n = new oku(psc.l));
                        }
                    }
                }
                return n3;
            }
            case 5: {
                return psc.l;
            }
            case 4: {
                return new okt(psc.l);
            }
            case 3: {
                return new psc();
            }
            case 2: {
                return oky.F(psc.l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u100c\u0004\u0006\u1005\u0005\u0007\u1008\u0007\b\u1005\u0006\t\u1409\b\n\u1009\t", new Object[] { "a", "b", "c", "d", "e", "f", opp.l, "g", "i", "h", "j", "k" });
            }
            case 0: {
                return this.m;
            }
        }
    }
}
