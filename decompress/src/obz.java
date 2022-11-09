// 
// Decompiled by Procyon v0.6.0
// 

public final class obz extends oky implements omk
{
    public static final obz a;
    private static volatile omp g;
    private int b;
    private long c;
    private int d;
    private int e;
    private byte f;
    
    static {
        oky.G(obz.class, a = new obz());
    }
    
    private obz() {
        this.f = 2;
    }
    
    @Override
    protected final Object a(int n, Object o) {
        final int n2 = 1;
        switch (n - 1) {
            default: {
                n = n2;
                if (o == null) {
                    n = 0;
                }
                this.f = (byte)n;
                return null;
            }
            case 6: {
                final omp g;
                if ((g = obz.g) == null) {
                    synchronized (obz.class) {
                        if (obz.g == null) {
                            o = (obz.g = new oku(obz.a));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return obz.a;
            }
            case 4: {
                return new okt(obz.a);
            }
            case 3: {
                return new obz();
            }
            case 2: {
                return oky.F(obz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1502\u0000\u0002\u1506\u0001\u0003\u1506\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 0: {
                return this.f;
            }
        }
    }
}
