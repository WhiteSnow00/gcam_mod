// 
// Decompiled by Procyon v0.6.0
// 

public final class pre extends oky implements omk
{
    public static final pre e;
    private static volatile omp f;
    public int a;
    public olj b;
    public olj c;
    public prd d;
    
    static {
        oky.G(pre.class, e = new pre());
    }
    
    private pre() {
        this.b = oms.b;
        this.c = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = pre.f) == null) {
                    synchronized (pre.class) {
                        if (pre.f == null) {
                            o = (pre.f = new oku(pre.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return pre.e;
            }
            case 4: {
                return new okt(pre.e);
            }
            case 3: {
                return new pre();
            }
            case 2: {
                return oky.F(pre.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1009\u0000", new Object[] { "a", "b", prh.class, "c", prc.class, "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
