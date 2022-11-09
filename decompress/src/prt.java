// 
// Decompiled by Procyon v0.6.0
// 

public final class prt extends oky implements omk
{
    public static final prt e;
    private static volatile omp g;
    public int a;
    public String b;
    public long c;
    public String d;
    private byte f;
    
    static {
        oky.G(prt.class, e = new prt());
    }
    
    private prt() {
        this.f = 2;
        this.b = "";
        this.d = "";
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
                this.f = (byte)n;
                return null;
            }
            case 6: {
                final omp g;
                if ((g = prt.g) == null) {
                    synchronized (prt.class) {
                        if (prt.g == null) {
                            o = (prt.g = new oku(prt.e));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return prt.e;
            }
            case 4: {
                return new okt(prt.e);
            }
            case 3: {
                return new prt();
            }
            case 2: {
                return oky.F(prt.e, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001\u1008\u0000\b\u1005\u0001\t\u1008\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return this.f;
            }
        }
    }
}
