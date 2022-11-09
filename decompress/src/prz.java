// 
// Decompiled by Procyon v0.6.0
// 

public final class prz extends oky implements omk
{
    public static final prz c;
    private static volatile omp d;
    public int a;
    public String b;
    
    static {
        oky.G(prz.class, c = new prz());
    }
    
    private prz() {
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
                if ((d = prz.d) == null) {
                    synchronized (prz.class) {
                        if (prz.d == null) {
                            o = (prz.d = new oku(prz.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return prz.c;
            }
            case 4: {
                return new okt(prz.c);
            }
            case 3: {
                return new prz();
            }
            case 2: {
                return oky.F(prz.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
