// 
// Decompiled by Procyon v0.6.0
// 

public final class prm extends oky implements omk
{
    public static final prm c;
    private static volatile omp d;
    public int a;
    public boolean b;
    
    static {
        oky.G(prm.class, c = new prm());
    }
    
    private prm() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = prm.d) == null) {
                    synchronized (prm.class) {
                        if (prm.d == null) {
                            o = (prm.d = new oku(prm.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return prm.c;
            }
            case 4: {
                return new okt(prm.c);
            }
            case 3: {
                return new prm();
            }
            case 2: {
                return oky.F(prm.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
