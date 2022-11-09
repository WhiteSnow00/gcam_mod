// 
// Decompiled by Procyon v0.6.0
// 

public final class nxz extends oky implements omk
{
    public static final nxz d;
    private static volatile omp e;
    public int a;
    public boolean b;
    public boolean c;
    
    static {
        oky.G(nxz.class, d = new nxz());
    }
    
    private nxz() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nxz.e) == null) {
                    synchronized (nxz.class) {
                        if (nxz.e == null) {
                            o = (nxz.e = new oku(nxz.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nxz.d;
            }
            case 4: {
                return new okt(nxz.d);
            }
            case 3: {
                return new nxz();
            }
            case 2: {
                return oky.F(nxz.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
