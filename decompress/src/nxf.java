// 
// Decompiled by Procyon v0.6.0
// 

public final class nxf extends oky implements omk
{
    public static final nxf a;
    private static volatile omp b;
    
    static {
        oky.G(nxf.class, a = new nxf());
    }
    
    private nxf() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = nxf.b) == null) {
                    synchronized (nxf.class) {
                        if (nxf.b == null) {
                            o = (nxf.b = new oku(nxf.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return nxf.a;
            }
            case 4: {
                return new okt(nxf.a);
            }
            case 3: {
                return new nxf();
            }
            case 2: {
                return oky.F(nxf.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
