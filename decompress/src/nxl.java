// 
// Decompiled by Procyon v0.6.0
// 

public final class nxl extends oky implements omk
{
    public static final nxl c;
    private static volatile omp d;
    public int a;
    public long b;
    
    static {
        oky.G(nxl.class, c = new nxl());
    }
    
    private nxl() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nxl.d) == null) {
                    synchronized (nxl.class) {
                        if (nxl.d == null) {
                            o = (nxl.d = new oku(nxl.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nxl.c;
            }
            case 4: {
                return new okt(nxl.c);
            }
            case 3: {
                return new nxl();
            }
            case 2: {
                return oky.F(nxl.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
