// 
// Decompiled by Procyon v0.6.0
// 

public final class lrp extends oky implements omk
{
    public static final lrp d;
    private static volatile omp e;
    public int a;
    public String b;
    public float c;
    
    static {
        oky.G(lrp.class, d = new lrp());
    }
    
    private lrp() {
        this.b = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = lrp.e) == null) {
                    synchronized (lrp.class) {
                        if (lrp.e == null) {
                            o = (lrp.e = new oku(lrp.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return lrp.d;
            }
            case 4: {
                return new okt(lrp.d);
            }
            case 3: {
                return new lrp();
            }
            case 2: {
                return oky.F(lrp.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
