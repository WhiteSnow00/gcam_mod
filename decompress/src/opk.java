// 
// Decompiled by Procyon v0.6.0
// 

public final class opk extends oky implements omk
{
    public static final opk j;
    private static volatile omp k;
    public int a;
    public oii b;
    public String c;
    public oil d;
    public oih e;
    public boolean f;
    public olj g;
    public olj h;
    public olj i;
    
    static {
        oky.G(opk.class, j = new opk());
    }
    
    private opk() {
        this.c = "";
        final ojw b = ojw.b;
        this.g = oms.b;
        this.h = oms.b;
        this.i = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp k;
                if ((k = opk.k) == null) {
                    synchronized (opk.class) {
                        if (opk.k == null) {
                            o = (opk.k = new oku(opk.j));
                        }
                    }
                }
                return k;
            }
            case 5: {
                return opk.j;
            }
            case 4: {
                return new okt(opk.j);
            }
            case 3: {
                return new opk();
            }
            case 2: {
                return oky.F(opk.j, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0003\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0005\u1009\u0004\u0006\u1009\u0005\u0007\u001b\b\u001b\t\u001b\u0010\u1007\u0006", new Object[] { "a", "b", "c", "d", "e", "g", oph.class, "h", opi.class, "i", opj.class, "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
