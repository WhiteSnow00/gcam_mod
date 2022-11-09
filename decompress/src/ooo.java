// 
// Decompiled by Procyon v0.6.0
// 

public final class ooo extends oky implements omk
{
    public static final ooo e;
    private static volatile omp f;
    public int a;
    public int b;
    public int c;
    public ojw d;
    
    static {
        oky.G(ooo.class, e = new ooo());
    }
    
    private ooo() {
        this.d = ojw.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ooo.f) == null) {
                    synchronized (ooo.class) {
                        if (ooo.f == null) {
                            o = (ooo.f = new oku(ooo.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ooo.e;
            }
            case 4: {
                return new okt(ooo.e);
            }
            case 3: {
                return new ooo();
            }
            case 2: {
                return oky.F(ooo.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u100a\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
