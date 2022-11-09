// 
// Decompiled by Procyon v0.6.0
// 

public final class oag extends oky implements omk
{
    public static final oag e;
    private static volatile omp f;
    public int a;
    public int b;
    public String c;
    public String d;
    
    static {
        oky.G(oag.class, e = new oag());
    }
    
    private oag() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = oag.f) == null) {
                    synchronized (oag.class) {
                        if (oag.f == null) {
                            o = (oag.f = new oku(oag.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return oag.e;
            }
            case 4: {
                return new okt(oag.e);
            }
            case 3: {
                return new oag();
            }
            case 2: {
                return oky.F(oag.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "a", "b", oah.b, "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
