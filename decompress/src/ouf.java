// 
// Decompiled by Procyon v0.6.0
// 

public final class ouf extends okw implements omk
{
    public static final ouf j;
    private static volatile omp l;
    public int a;
    public long b;
    public long c;
    public int d;
    public ojw e;
    public long g;
    public boolean h;
    public String i;
    private byte k;
    
    static {
        oky.G(ouf.class, j = new ouf());
    }
    
    private ouf() {
        this.k = 2;
        final oms b = oms.b;
        final ojw b2 = ojw.b;
        this.e = ojw.b;
        this.g = 180000L;
        final okz b3 = okz.b;
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
                this.k = (byte)n;
                return null;
            }
            case 6: {
                final omp l;
                if ((l = ouf.l) == null) {
                    synchronized (ouf.class) {
                        if (ouf.l == null) {
                            o = (ouf.l = new oku(ouf.j));
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ouf.j;
            }
            case 4: {
                return new okv(ouf.j);
            }
            case 3: {
                return new ouf();
            }
            case 2: {
                return oky.F(ouf.j, "\u0001\u0007\u0000\u0001\u0001\u001c\u0007\u0000\u0000\u0000\u0001\u1002\u0000\u0006\u100a\n\u000b\u1004\u0004\u000f\u1010\u0010\u0011\u1002\u0001\u0019\u1007\u0017\u001c\u1008\u0018", new Object[] { "a", "b", "e", "d", "g", "c", "h", "i" });
            }
            case 0: {
                return this.k;
            }
        }
    }
}
