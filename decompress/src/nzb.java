// 
// Decompiled by Procyon v0.6.0
// 

public final class nzb extends oky implements omk
{
    public static final nzb g;
    private static volatile omp h;
    public int a;
    public int b;
    public obo c;
    public long d;
    public int e;
    public int f;
    
    static {
        oky.G(nzb.class, g = new nzb());
    }
    
    private nzb() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = nzb.h) == null) {
                    synchronized (nzb.class) {
                        if (nzb.h == null) {
                            o = (nzb.h = new oku(nzb.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return nzb.g;
            }
            case 4: {
                return new okt(nzb.g);
            }
            case 3: {
                return new nzb();
            }
            case 2: {
                return oky.F(nzb.g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0004\u1002\u0002\u0006\u100c\u0004\u0007\u100b\u0005", new Object[] { "a", "b", nxw.q, "c", "d", "e", nxw.r, "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
