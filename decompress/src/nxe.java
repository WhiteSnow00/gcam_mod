// 
// Decompiled by Procyon v0.6.0
// 

public final class nxe extends oky implements omk
{
    public static final nxe a;
    private static volatile omp b;
    
    static {
        oky.G(nxe.class, a = new nxe());
    }
    
    private nxe() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = nxe.b) == null) {
                    synchronized (nxe.class) {
                        if (nxe.b == null) {
                            o = (nxe.b = new oku(nxe.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return nxe.a;
            }
            case 4: {
                return new okt(nxe.a);
            }
            case 3: {
                return new nxe();
            }
            case 2: {
                return oky.F(nxe.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
