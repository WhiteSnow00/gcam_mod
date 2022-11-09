// 
// Decompiled by Procyon v0.6.0
// 

public final class nyc extends oky implements omk
{
    public static final nyc g;
    private static volatile omp h;
    public int a;
    public int b;
    public oaq c;
    public oat d;
    public long e;
    public obe f;
    
    static {
        oky.G(nyc.class, g = new nyc());
    }
    
    private nyc() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = nyc.h) == null) {
                    synchronized (nyc.class) {
                        if (nyc.h == null) {
                            o = (nyc.h = new oku(nyc.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return nyc.g;
            }
            case 4: {
                return new okt(nyc.g);
            }
            case 3: {
                return new nyc();
            }
            case 2: {
                return oky.F(nyc.g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u1009\u0002\u0005\u1009\u0004\u0006\u1002\u0005\u0007\u1009\u0006", new Object[] { "a", "b", oah.d, "c", "d", "e", "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
