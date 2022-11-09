// 
// Decompiled by Procyon v0.6.0
// 

public final class ooz extends oky implements omk
{
    public static final ooz e;
    private static volatile omp f;
    public int a;
    public String b;
    public float c;
    public float d;
    
    static {
        oky.G(ooz.class, e = new ooz());
    }
    
    private ooz() {
        this.b = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ooz.f) == null) {
                    synchronized (ooz.class) {
                        if (ooz.f == null) {
                            o = (ooz.f = new oku(ooz.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ooz.e;
            }
            case 4: {
                return new okt(ooz.e);
            }
            case 3: {
                return new ooz();
            }
            case 2: {
                return oky.F(ooz.e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
