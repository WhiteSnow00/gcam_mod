// 
// Decompiled by Procyon v0.6.0
// 

public final class oqs extends oky implements omk
{
    public static final oqs c;
    private static volatile omp d;
    public int a;
    public String b;
    
    static {
        oky.G(oqs.class, c = new oqs());
    }
    
    private oqs() {
        this.b = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oqs.d) == null) {
                    synchronized (oqs.class) {
                        if (oqs.d == null) {
                            o = (oqs.d = new oku(oqs.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oqs.c;
            }
            case 4: {
                return new okt(oqs.c);
            }
            case 3: {
                return new oqs();
            }
            case 2: {
                return oky.F(oqs.c, "\u0001\u0001\u0000\u0001\u0016\u0016\u0001\u0000\u0000\u0000\u0016\u1008\u0002", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
