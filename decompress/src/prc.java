// 
// Decompiled by Procyon v0.6.0
// 

public final class prc extends oky implements omk
{
    public static final prc d;
    private static volatile omp e;
    public int a;
    public int b;
    public prd c;
    
    static {
        oky.G(prc.class, d = new prc());
    }
    
    private prc() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = prc.e) == null) {
                    synchronized (prc.class) {
                        if (prc.e == null) {
                            o = (prc.e = new oku(prc.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return prc.d;
            }
            case 4: {
                return new okt(prc.d);
            }
            case 3: {
                return new prc();
            }
            case 2: {
                return oky.F(prc.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
