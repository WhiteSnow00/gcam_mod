// 
// Decompiled by Procyon v0.6.0
// 

public final class lqi extends oky implements omk
{
    public static final lqi c;
    private static volatile omp e;
    public String a;
    public float b;
    private int d;
    
    static {
        oky.G(lqi.class, c = new lqi());
    }
    
    private lqi() {
        this.a = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = lqi.e) == null) {
                    synchronized (lqi.class) {
                        if (lqi.e == null) {
                            o = (lqi.e = new oku(lqi.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return lqi.c;
            }
            case 4: {
                return new okt(lqi.c);
            }
            case 3: {
                return new lqi();
            }
            case 2: {
                return oky.F(lqi.c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001", new Object[] { "d", "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
