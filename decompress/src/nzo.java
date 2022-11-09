// 
// Decompiled by Procyon v0.6.0
// 

public final class nzo extends oky implements omk
{
    public static final nzo g;
    private static volatile omp h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        oky.G(nzo.class, g = new nzo());
    }
    
    private nzo() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = nzo.h) == null) {
                    synchronized (nzo.class) {
                        if (nzo.h == null) {
                            o = (nzo.h = new oku(nzo.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return nzo.g;
            }
            case 4: {
                return new okt(nzo.g);
            }
            case 3: {
                return new nzo();
            }
            case 2: {
                return oky.F(nzo.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004", new Object[] { "a", "b", "c", "d", "e", "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
