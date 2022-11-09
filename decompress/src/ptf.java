// 
// Decompiled by Procyon v0.6.0
// 

public final class ptf extends oky implements omk
{
    public static final ptf h;
    private static volatile omp i;
    public ome a;
    public ome b;
    public olj c;
    public oli d;
    public olf e;
    public olf f;
    public oli g;
    
    static {
        oky.G(ptf.class, h = new ptf());
    }
    
    private ptf() {
        this.a = ome.a;
        this.b = ome.a;
        this.c = oms.b;
        this.d = oly.b;
        this.e = okz.b;
        this.f = okz.b;
        this.g = oly.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = ptf.i) == null) {
                    synchronized (ptf.class) {
                        if (ptf.i == null) {
                            o = (ptf.i = new oku(ptf.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ptf.h;
            }
            case 4: {
                return new okt(ptf.h);
            }
            case 3: {
                return new ptf();
            }
            case 2: {
                return oky.F(ptf.h, "\u0001\u0007\u0000\u0000\u0002\n\u0007\u0002\u0005\u0000\u00022\u00032\u0006\u001b\u0007%\b'\t'\n%", new Object[] { "a", ptd.a, "b", pte.a, "c", ptb.class, "d", "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
