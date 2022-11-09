// 
// Decompiled by Procyon v0.6.0
// 

public final class ncd extends oky implements omk
{
    public static final ncd e;
    private static volatile omp f;
    public int a;
    public float b;
    public float c;
    public float d;
    
    static {
        oky.G(ncd.class, e = new ncd());
    }
    
    private ncd() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ncd.f) == null) {
                    synchronized (ncd.class) {
                        if (ncd.f == null) {
                            o = (ncd.f = new oku(ncd.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ncd.e;
            }
            case 4: {
                return new okt(ncd.e);
            }
            case 3: {
                return new ncd();
            }
            case 2: {
                return oky.F(ncd.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
