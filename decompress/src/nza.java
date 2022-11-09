// 
// Decompiled by Procyon v0.6.0
// 

public final class nza extends oky implements omk
{
    public static final nza d;
    private static volatile omp e;
    public int a;
    public int b;
    public obo c;
    
    static {
        oky.G(nza.class, d = new nza());
    }
    
    private nza() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nza.e) == null) {
                    synchronized (nza.class) {
                        if (nza.e == null) {
                            o = (nza.e = new oku(nza.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nza.d;
            }
            case 4: {
                return new okt(nza.d);
            }
            case 3: {
                return new nza();
            }
            case 2: {
                return oky.F(nza.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "a", "b", nxw.q, "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
