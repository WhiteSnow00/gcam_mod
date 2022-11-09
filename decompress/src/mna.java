// 
// Decompiled by Procyon v0.6.0
// 

public final class mna extends oky implements omk
{
    public static final mna g;
    public static final okk h;
    private static volatile omp i;
    public int a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    
    static {
        final mna g2 = new mna();
        oky.G(mna.class, g = g2);
        h = oky.J(mmt.c, g2, g2, 334728578, onv.k);
    }
    
    private mna() {
        this.b = "";
        this.c = "";
        this.e = "";
        this.f = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = mna.i) == null) {
                    synchronized (mna.class) {
                        if (mna.i == null) {
                            o = (mna.i = new oku(mna.g));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return mna.g;
            }
            case 4: {
                return new okt(mna.g);
            }
            case 3: {
                return new mna();
            }
            case 2: {
                return oky.F(mna.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "a", "b", "c", "d", "e", "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
