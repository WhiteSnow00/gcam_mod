// 
// Decompiled by Procyon v0.6.0
// 

public final class oug extends oky implements omk
{
    public static final oug f;
    private static volatile omp g;
    public int a;
    public int b;
    public String c;
    public long d;
    public long e;
    
    static {
        oky.G(oug.class, f = new oug());
    }
    
    private oug() {
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = oug.g) == null) {
                    synchronized (oug.class) {
                        if (oug.g == null) {
                            o = (oug.g = new oku(oug.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oug.f;
            }
            case 4: {
                return new okt(oug.f);
            }
            case 3: {
                return new oug();
            }
            case 2: {
                return oky.F(oug.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
