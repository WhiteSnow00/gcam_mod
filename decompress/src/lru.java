// 
// Decompiled by Procyon v0.6.0
// 

public final class lru extends oky implements omk
{
    public static final lru a;
    private static volatile omp b;
    
    static {
        oky.G(lru.class, a = new lru());
    }
    
    private lru() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lru.b) == null) {
                    synchronized (lru.class) {
                        if (lru.b == null) {
                            o = (lru.b = new oku(lru.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lru.a;
            }
            case 4: {
                return new okt(lru.a);
            }
            case 3: {
                return new lru();
            }
            case 2: {
                return oky.F(lru.a, "\u0000\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
