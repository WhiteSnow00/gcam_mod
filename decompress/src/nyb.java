// 
// Decompiled by Procyon v0.6.0
// 

public final class nyb extends oky implements omk
{
    public static final nyb d;
    private static volatile omp e;
    public int a;
    public int b;
    public String c;
    
    static {
        oky.G(nyb.class, d = new nyb());
    }
    
    private nyb() {
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nyb.e) == null) {
                    synchronized (nyb.class) {
                        if (nyb.e == null) {
                            o = (nyb.e = new oku(nyb.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nyb.d;
            }
            case 4: {
                return new okt(nyb.d);
            }
            case 3: {
                return new nyb();
            }
            case 2: {
                return oky.F(nyb.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "a", "b", nxw.e, "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
