// 
// Decompiled by Procyon v0.6.0
// 

public final class oie extends oky implements omk
{
    public static final oie c;
    private static volatile omp d;
    public int a;
    public Object b;
    
    static {
        oky.G(oie.class, c = new oie());
    }
    
    private oie() {
        this.a = 0;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oie.d) == null) {
                    synchronized (oie.class) {
                        if (oie.d == null) {
                            o = (oie.d = new oku(oie.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oie.c;
            }
            case 4: {
                return new okt(oie.c);
            }
            case 3: {
                return new oie();
            }
            case 2: {
                return oky.F(oie.c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[] { "b", "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
