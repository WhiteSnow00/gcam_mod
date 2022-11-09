// 
// Decompiled by Procyon v0.6.0
// 

public final class psz extends oky implements omk
{
    public static final psz b;
    private static volatile omp c;
    public oli a;
    
    static {
        oky.G(psz.class, b = new psz());
    }
    
    private psz() {
        this.a = oly.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = psz.c) == null) {
                    synchronized (psz.class) {
                        if (psz.c == null) {
                            o = (psz.c = new oku(psz.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return psz.b;
            }
            case 4: {
                return new okt(psz.b);
            }
            case 3: {
                return new psz();
            }
            case 2: {
                return oky.F(psz.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
