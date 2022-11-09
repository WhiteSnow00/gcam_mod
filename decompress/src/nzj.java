// 
// Decompiled by Procyon v0.6.0
// 

public final class nzj extends oky implements omk
{
    public static final nzj c;
    private static volatile omp d;
    public int a;
    public boolean b;
    
    static {
        oky.G(nzj.class, c = new nzj());
    }
    
    private nzj() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nzj.d) == null) {
                    synchronized (nzj.class) {
                        if (nzj.d == null) {
                            o = (nzj.d = new oku(nzj.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nzj.c;
            }
            case 4: {
                return new okt(nzj.c);
            }
            case 3: {
                return new nzj();
            }
            case 2: {
                return oky.F(nzj.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
