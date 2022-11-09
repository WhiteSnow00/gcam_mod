// 
// Decompiled by Procyon v0.6.0
// 

public final class nxv extends oky implements omk
{
    public static final nxv d;
    private static volatile omp e;
    public int a;
    public nyz b;
    public nyt c;
    
    static {
        oky.G(nxv.class, d = new nxv());
    }
    
    private nxv() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nxv.e) == null) {
                    synchronized (nxv.class) {
                        if (nxv.e == null) {
                            o = (nxv.e = new oku(nxv.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nxv.d;
            }
            case 4: {
                return new okt(nxv.d);
            }
            case 3: {
                return new nxv();
            }
            case 2: {
                return oky.F(nxv.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
