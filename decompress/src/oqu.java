// 
// Decompiled by Procyon v0.6.0
// 

public final class oqu extends oky implements omk
{
    public static final oqu e;
    private static volatile omp i;
    public opl a;
    public float b;
    public oqv c;
    public opw d;
    private int f;
    private opw g;
    private byte h;
    
    static {
        oky.G(oqu.class, e = new oqu());
    }
    
    private oqu() {
        this.h = 2;
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
                this.h = (byte)n;
                return null;
            }
            case 6: {
                final omp i;
                if ((i = oqu.i) == null) {
                    synchronized (oqu.class) {
                        if (oqu.i == null) {
                            o = (oqu.i = new oku(oqu.e));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return oqu.e;
            }
            case 4: {
                return new okt(oqu.e);
            }
            case 3: {
                return new oqu();
            }
            case 2: {
                return oky.F(oqu.e, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u1001\u0001\u0004\u1009\u0002\u0006\u1409\u0004\u0007\u1409\u0005", new Object[] { "f", "a", "b", "c", "d", "g" });
            }
            case 0: {
                return this.h;
            }
        }
    }
}
