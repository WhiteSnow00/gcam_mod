// 
// Decompiled by Procyon v0.6.0
// 

public final class byv extends oky implements omk
{
    public static final byv d;
    private static volatile omp e;
    public int a;
    public long b;
    public int c;
    
    static {
        oky.G(byv.class, d = new byv());
    }
    
    private byv() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = byv.e) == null) {
                    synchronized (byv.class) {
                        if (byv.e == null) {
                            o = (byv.e = new oku(byv.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return byv.d;
            }
            case 4: {
                return new okt(byv.d);
            }
            case 3: {
                return new byv();
            }
            case 2: {
                return oky.F(byv.d, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0002\u0003\u1004\u0000", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
