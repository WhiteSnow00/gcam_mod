// 
// Decompiled by Procyon v0.6.0
// 

public final class oau extends oky implements omk
{
    public static final oau h;
    private static volatile omp i;
    public int a;
    public String b;
    public int c;
    public int d;
    public long e;
    public int f;
    public long g;
    
    static {
        oky.G(oau.class, h = new oau());
    }
    
    private oau() {
        this.b = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = oau.i) == null) {
                    synchronized (oau.class) {
                        if (oau.i == null) {
                            o = (oau.i = new oku(oau.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return oau.h;
            }
            case 4: {
                return new okt(oau.h);
            }
            case 3: {
                return new oau();
            }
            case 2: {
                return oky.F(oau.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1004\u0004\u0006\u1002\u0005", new Object[] { "a", "b", "c", "d", oah.k, "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
