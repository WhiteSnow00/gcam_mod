// 
// Decompiled by Procyon v0.6.0
// 

public final class pqy extends oky implements omk
{
    public static final pqy b;
    private static volatile omp c;
    public olf a;
    
    static {
        oky.G(pqy.class, b = new pqy());
    }
    
    private pqy() {
        this.a = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = pqy.c) == null) {
                    synchronized (pqy.class) {
                        if (pqy.c == null) {
                            o = (pqy.c = new oku(pqy.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return pqy.b;
            }
            case 4: {
                return new okt(pqy.b);
            }
            case 3: {
                return new pqy();
            }
            case 2: {
                return oky.F(pqy.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "a", opp.f });
            }
            case 0: {
                return 1;
            }
        }
    }
}
