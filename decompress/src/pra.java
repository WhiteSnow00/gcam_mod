// 
// Decompiled by Procyon v0.6.0
// 

public final class pra extends oky implements omk
{
    public static final pra k;
    private static volatile omp m;
    public int a;
    public int b;
    public long c;
    public String d;
    public String e;
    public prk f;
    public int g;
    public long h;
    public prj i;
    public long j;
    private byte l;
    
    static {
        oky.G(pra.class, k = new pra());
    }
    
    private pra() {
        this.l = 2;
        this.d = "";
        this.e = "";
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
                this.l = (byte)n;
                return null;
            }
            case 6: {
                final omp m;
                if ((m = pra.m) == null) {
                    synchronized (pra.class) {
                        if (pra.m == null) {
                            o = (pra.m = new oku(pra.k));
                        }
                    }
                }
                return m;
            }
            case 5: {
                return pra.k;
            }
            case 4: {
                return new okt(pra.k);
            }
            case 3: {
                return new pra();
            }
            case 2: {
                return oky.F(pra.k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u100c\u0005\u0003\u1002\u0006\u0006\u1009\u0007\u0007\u1002\b\b\u1005\u0001\t\u1008\u0002\n\u1008\u0003\u000b\u1409\u0004", new Object[] { "a", "b", pqz.c(), "g", pqz.c(), "h", "i", "j", "c", "d", "e", "f" });
            }
            case 0: {
                return this.l;
            }
        }
    }
}
