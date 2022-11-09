// 
// Decompiled by Procyon v0.6.0
// 

public final class lpq extends oky implements omk
{
    public static final lpq c;
    private static volatile omp d;
    public int a;
    public oim b;
    
    static {
        oky.G(lpq.class, c = new lpq());
    }
    
    private lpq() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = lpq.d) == null) {
                    synchronized (lpq.class) {
                        if (lpq.d == null) {
                            o = (lpq.d = new oku(lpq.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return lpq.c;
            }
            case 4: {
                return new okt(lpq.c);
            }
            case 3: {
                return new lpq();
            }
            case 2: {
                return oky.F(lpq.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
