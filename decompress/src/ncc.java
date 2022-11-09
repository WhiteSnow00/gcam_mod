// 
// Decompiled by Procyon v0.6.0
// 

public final class ncc extends oky implements omk
{
    public static final ncc e;
    private static volatile omp f;
    public int a;
    public int b;
    public Object c;
    public long d;
    
    static {
        oky.G(ncc.class, e = new ncc());
    }
    
    private ncc() {
        this.b = 0;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ncc.f) == null) {
                    synchronized (ncc.class) {
                        if (ncc.f == null) {
                            o = (ncc.f = new oku(ncc.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ncc.e;
            }
            case 4: {
                return new okt(ncc.e);
            }
            case 3: {
                return new ncc();
            }
            case 2: {
                return oky.F(ncc.e, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1034\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u1034\u0000\u000b\u1034\u0000\f\u1034\u0000\r\u1034\u0000", new Object[] { "c", "b", "a", "d", ncd.class, ncd.class, ncd.class, ncd.class, ncd.class, ncb.class, ncb.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
