// 
// Decompiled by Procyon v0.6.0
// 

public final class nzn extends oky implements omk
{
    public static final nzn d;
    private static volatile omp e;
    public int a;
    public float b;
    public float c;
    
    static {
        oky.G(nzn.class, d = new nzn());
    }
    
    private nzn() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nzn.e) == null) {
                    synchronized (nzn.class) {
                        if (nzn.e == null) {
                            o = (nzn.e = new oku(nzn.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nzn.d;
            }
            case 4: {
                return new okt(nzn.d);
            }
            case 3: {
                return new nzn();
            }
            case 2: {
                return oky.F(nzn.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
