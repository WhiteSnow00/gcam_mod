// 
// Decompiled by Procyon v0.6.0
// 

public final class psd extends oky implements omk
{
    public static final psd d;
    private static volatile omp e;
    public oli a;
    public oli b;
    public olf c;
    
    static {
        oky.G(psd.class, d = new psd());
    }
    
    private psd() {
        this.a = oly.b;
        this.b = oly.b;
        this.c = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = psd.e) == null) {
                    synchronized (psd.class) {
                        if (psd.e == null) {
                            o = (psd.e = new oku(psd.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return psd.d;
            }
            case 4: {
                return new okt(psd.d);
            }
            case 3: {
                return new psd();
            }
            case 2: {
                return oky.F(psd.d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001%\u0002%\u0003'", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
