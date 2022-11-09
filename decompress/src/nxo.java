// 
// Decompiled by Procyon v0.6.0
// 

public final class nxo extends oky implements omk
{
    public static final nxo g;
    private static volatile omp h;
    public int a;
    public nzv b;
    public olj c;
    public float d;
    public olj e;
    public nxz f;
    
    static {
        oky.G(nxo.class, g = new nxo());
    }
    
    private nxo() {
        final oms b = oms.b;
        this.c = oms.b;
        this.e = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = nxo.h) == null) {
                    synchronized (nxo.class) {
                        if (nxo.h == null) {
                            o = (nxo.h = new oku(nxo.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return nxo.g;
            }
            case 4: {
                return new okt(nxo.g);
            }
            case 3: {
                return new nxo();
            }
            case 2: {
                return oky.F(nxo.g, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0002\u0000\u0002\u1009\u0001\u0004\u001b\u0005\u1001\u0002\u0007\u001b\b\u1009\u0003", new Object[] { "a", "b", "c", nyq.class, "d", "e", nzq.class, "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
