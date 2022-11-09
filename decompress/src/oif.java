// 
// Decompiled by Procyon v0.6.0
// 

public final class oif extends oky implements omk
{
    public static final oif h;
    private static volatile omp i;
    public int a;
    public int b;
    public int c;
    public int d;
    public oni e;
    public oni f;
    public int g;
    
    static {
        oky.G(oif.class, h = new oif());
    }
    
    private oif() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = oif.i) == null) {
                    synchronized (oif.class) {
                        if (oif.i == null) {
                            o = (oif.i = new oku(oif.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return oif.h;
            }
            case 4: {
                return new okt(oif.h);
            }
            case 3: {
                return new oif();
            }
            case 2: {
                return oky.F(oif.h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005\t\u0006\t\u0007\u0004", new Object[] { "a", "b", "c", "d", "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
