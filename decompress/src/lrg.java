// 
// Decompiled by Procyon v0.6.0
// 

public final class lrg extends oky implements omk
{
    public static final lrg c;
    private static volatile omp d;
    public int a;
    public String b;
    
    static {
        oky.G(lrg.class, c = new lrg());
    }
    
    private lrg() {
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
                if ((d = lrg.d) == null) {
                    synchronized (lrg.class) {
                        if (lrg.d == null) {
                            o = (lrg.d = new oku(lrg.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return lrg.c;
            }
            case 4: {
                return new okt(lrg.c);
            }
            case 3: {
                return new lrg();
            }
            case 2: {
                return oky.F(lrg.c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
