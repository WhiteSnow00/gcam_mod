// 
// Decompiled by Procyon v0.6.0
// 

public final class oao extends oky implements omk
{
    public static final oao d;
    private static volatile omp e;
    public int a;
    public int b;
    public float c;
    
    static {
        oky.G(oao.class, d = new oao());
    }
    
    private oao() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oao.e) == null) {
                    synchronized (oao.class) {
                        if (oao.e == null) {
                            o = (oao.e = new oku(oao.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oao.d;
            }
            case 4: {
                return new okt(oao.d);
            }
            case 3: {
                return new oao();
            }
            case 2: {
                return oky.F(oao.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1001\u0001", new Object[] { "a", "b", oah.h, "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
