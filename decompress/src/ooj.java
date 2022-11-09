// 
// Decompiled by Procyon v0.6.0
// 

public final class ooj extends oky implements omk
{
    public static final ooj m;
    private static volatile omp n;
    public int a;
    public String b;
    public int c;
    public long d;
    public long e;
    public long f;
    public String g;
    public int h;
    public int i;
    public ooh j;
    public oli k;
    public String l;
    
    static {
        oky.G(ooj.class, m = new ooj());
    }
    
    private ooj() {
        this.b = "";
        this.g = "";
        this.k = oly.b;
        this.l = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp n2;
                if ((n2 = ooj.n) == null) {
                    synchronized (ooj.class) {
                        if (ooj.n == null) {
                            o = (ooj.n = new oku(ooj.m));
                        }
                    }
                }
                return n2;
            }
            case 5: {
                return ooj.m;
            }
            case 4: {
                return new okt(ooj.m);
            }
            case 3: {
                return new ooj();
            }
            case 2: {
                return oky.F(ooj.m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0002\u0003\u1002\u0003\u0004\u1002\u0004\u0005\u1008\u0005\u0006\u100c\u0006\u0007\u100c\u0007\t\u0014\u000b\u1008\u000b\f\u1004\u0001\r\u1009\t", new Object[] { "a", "b", "d", "e", "f", "g", "h", obh.r, "i", ooi.c(), "k", "l", "c", "j" });
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final void i() {
        final oli k = this.k;
        if (!k.c()) {
            this.k = oky.A(k);
        }
    }
}
