// 
// Decompiled by Procyon v0.6.0
// 

public final class oax extends oky implements omk
{
    public static final oax i;
    private static volatile omp j;
    public int a;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    
    static {
        oky.G(oax.class, i = new oax());
    }
    
    private oax() {
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = oax.j) == null) {
                    synchronized (oax.class) {
                        if (oax.j == null) {
                            o = (oax.j = new oku(oax.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return oax.i;
            }
            case 4: {
                return new okt(oax.i);
            }
            case 3: {
                return new oax();
            }
            case 2: {
                return oky.F(oax.i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006", new Object[] { "a", "b", oah.l, "c", "d", "e", "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
