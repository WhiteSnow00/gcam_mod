// 
// Decompiled by Procyon v0.6.0
// 

public final class lpw extends oky implements omk
{
    public static final lpw c;
    private static volatile omp d;
    public int a;
    public Object b;
    
    static {
        oky.G(lpw.class, c = new lpw());
    }
    
    private lpw() {
        this.a = 0;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = lpw.d) == null) {
                    synchronized (lpw.class) {
                        if (lpw.d == null) {
                            o = (lpw.d = new oku(lpw.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return lpw.c;
            }
            case 4: {
                return new okt(lpw.c);
            }
            case 3: {
                return new lpw();
            }
            case 2: {
                return oky.F(lpw.c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000", new Object[] { "b", "a", lpq.class, lpv.class, lpu.class, lpp.class, lpt.class, lps.class, lpr.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
