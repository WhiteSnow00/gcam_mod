// 
// Decompiled by Procyon v0.6.0
// 

public final class nzp extends oky implements omk
{
    public static final nzp d;
    private static volatile omp e;
    public int a;
    public int b;
    public int c;
    
    static {
        oky.G(nzp.class, d = new nzp());
    }
    
    private nzp() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nzp.e) == null) {
                    synchronized (nzp.class) {
                        if (nzp.e == null) {
                            o = (nzp.e = new oku(nzp.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nzp.d;
            }
            case 4: {
                return new okt(nzp.d);
            }
            case 3: {
                return new nzp();
            }
            case 2: {
                return oky.F(nzp.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
