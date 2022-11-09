// 
// Decompiled by Procyon v0.6.0
// 

public final class oay extends oky implements omk
{
    public static final oay h;
    private static volatile omp i;
    public int a;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    public String f;
    public String g;
    
    static {
        oky.G(oay.class, h = new oay());
    }
    
    private oay() {
        this.c = "";
        this.f = "";
        this.g = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = oay.i) == null) {
                    synchronized (oay.class) {
                        if (oay.i == null) {
                            o = (oay.i = new oku(oay.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return oay.h;
            }
            case 4: {
                return new okt(oay.h);
            }
            case 3: {
                return new oay();
            }
            case 2: {
                return oky.F(oay.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1008\u0004\u0006\u1008\u0005", new Object[] { "a", "b", oah.m, "c", "d", "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
