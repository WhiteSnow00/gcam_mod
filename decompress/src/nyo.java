// 
// Decompiled by Procyon v0.6.0
// 

public final class nyo extends oky implements omk
{
    public static final nyo c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(nyo.class, c = new nyo());
    }
    
    private nyo() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nyo.d) == null) {
                    synchronized (nyo.class) {
                        if (nyo.d == null) {
                            o = (nyo.d = new oku(nyo.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nyo.c;
            }
            case 4: {
                return new okt(nyo.c);
            }
            case 3: {
                return new nyo();
            }
            case 2: {
                return oky.F(nyo.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "a", "b", nxw.m });
            }
            case 0: {
                return 1;
            }
        }
    }
}
