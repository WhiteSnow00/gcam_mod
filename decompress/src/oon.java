// 
// Decompiled by Procyon v0.6.0
// 

public final class oon extends oky implements omk
{
    public static final oon g;
    private static volatile omp h;
    public int a;
    public long b;
    public long c;
    public boolean d;
    public oot e;
    public ooq f;
    
    static {
        oky.G(oon.class, g = new oon());
    }
    
    private oon() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = oon.h) == null) {
                    synchronized (oon.class) {
                        if (oon.h == null) {
                            o = (oon.h = new oku(oon.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return oon.g;
            }
            case 4: {
                return new okt(oon.g);
            }
            case 3: {
                return new oon();
            }
            case 2: {
                return oky.F(oon.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1007\u0002\u0004\u1009\u0003\u0005\u1009\u0004", new Object[] { "a", "b", "c", "d", "e", "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
