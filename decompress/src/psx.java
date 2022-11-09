// 
// Decompiled by Procyon v0.6.0
// 

public final class psx extends oky implements omk
{
    public static final psx b;
    private static volatile omp c;
    public ome a;
    
    static {
        oky.G(psx.class, b = new psx());
    }
    
    private psx() {
        this.a = ome.a;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = psx.c) == null) {
                    synchronized (psx.class) {
                        if (psx.c == null) {
                            o = (psx.c = new oku(psx.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return psx.b;
            }
            case 4: {
                return new okt(psx.b);
            }
            case 3: {
                return new psx();
            }
            case 2: {
                return oky.F(psx.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "a", psw.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
