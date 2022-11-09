// 
// Decompiled by Procyon v0.6.0
// 

public final class pti extends oky implements omk
{
    public static final pti f;
    private static volatile omp g;
    public ome a;
    public ome b;
    public olj c;
    public olf d;
    public olj e;
    
    static {
        oky.G(pti.class, f = new pti());
    }
    
    private pti() {
        this.a = ome.a;
        this.b = ome.a;
        this.c = oms.b;
        this.d = okz.b;
        this.e = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = pti.g) == null) {
                    synchronized (pti.class) {
                        if (pti.g == null) {
                            o = (pti.g = new oku(pti.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return pti.f;
            }
            case 4: {
                return new okt(pti.f);
            }
            case 3: {
                return new pti();
            }
            case 2: {
                return oky.F(pti.f, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u00012\u00022\u0003\u001b\u0004'\u0005\u001b", new Object[] { "a", ptg.a, "b", pth.a, "c", ptf.class, "d", "e", ptc.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
