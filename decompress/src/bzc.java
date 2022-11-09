// 
// Decompiled by Procyon v0.6.0
// 

public final class bzc extends oky implements omk
{
    public static final bzc c;
    private static volatile omp e;
    public String a;
    public ome b;
    private int d;
    
    static {
        oky.G(bzc.class, c = new bzc());
    }
    
    private bzc() {
        this.b = ome.a;
        this.a = "";
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = bzc.e) == null) {
                    synchronized (bzc.class) {
                        if (bzc.e == null) {
                            o = (bzc.e = new oku(bzc.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return bzc.c;
            }
            case 4: {
                return new okt(bzc.c);
            }
            case 3: {
                return new bzc();
            }
            case 2: {
                return oky.F(bzc.c, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1208\u0000\u00022", new Object[] { "d", "a", "b", bzb.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
