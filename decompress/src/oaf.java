// 
// Decompiled by Procyon v0.6.0
// 

public final class oaf extends oky implements omk
{
    public static final oaf m;
    private static volatile omp n;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public olj i;
    public boolean j;
    public int k;
    public int l;
    
    static {
        oky.G(oaf.class, m = new oaf());
    }
    
    private oaf() {
        this.i = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp n2;
                if ((n2 = oaf.n) == null) {
                    synchronized (oaf.class) {
                        if (oaf.n == null) {
                            o = (oaf.n = new oku(oaf.m));
                        }
                    }
                }
                return n2;
            }
            case 5: {
                return oaf.m;
            }
            case 4: {
                return new okt(oaf.m);
            }
            case 3: {
                return new oaf();
            }
            case 2: {
                return oky.F(oaf.m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u100c\u0006\b\u001b\t\u1007\u0007\n\u100c\b\u000b\u100c\t", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", nzh.t, "i", oaj.class, "j", "k", nzh.u, "l", nzh.s });
            }
            case 0: {
                return 1;
            }
        }
    }
}
