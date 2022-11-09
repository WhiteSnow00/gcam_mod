// 
// Decompiled by Procyon v0.6.0
// 

public final class ouu extends oky implements omk
{
    public static final ouu d;
    private static volatile omp f;
    public boolean a;
    public String b;
    public String c;
    private int e;
    
    static {
        oky.G(ouu.class, d = new ouu());
    }
    
    private ouu() {
        this.b = "";
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ouu.f) == null) {
                    synchronized (ouu.class) {
                        if (ouu.f == null) {
                            o = (ouu.f = new oku(ouu.d));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ouu.d;
            }
            case 4: {
                return new okt(ouu.d);
            }
            case 3: {
                return new ouu();
            }
            case 2: {
                return oky.F(ouu.d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "e", "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
