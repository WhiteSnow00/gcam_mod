// 
// Decompiled by Procyon v0.6.0
// 

public final class nyk extends oky implements omk
{
    public static final nyk d;
    private static volatile omp e;
    public int a;
    public int b;
    public int c;
    
    static {
        oky.G(nyk.class, d = new nyk());
    }
    
    private nyk() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nyk.e) == null) {
                    synchronized (nyk.class) {
                        if (nyk.e == null) {
                            o = (nyk.e = new oku(nyk.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nyk.d;
            }
            case 4: {
                return new okt(nyk.d);
            }
            case 3: {
                return new nyk();
            }
            case 2: {
                return oky.F(nyk.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "a", "b", nxw.i, "c", nxw.i });
            }
            case 0: {
                return 1;
            }
        }
    }
}
