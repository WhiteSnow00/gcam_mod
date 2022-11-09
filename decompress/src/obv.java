// 
// Decompiled by Procyon v0.6.0
// 

public final class obv extends oky implements omk
{
    public static final obv g;
    private static volatile omp i;
    public int a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    private byte h;
    
    static {
        oky.G(obv.class, g = new obv());
    }
    
    private obv() {
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
                if ((i = obv.i) == null) {
                    synchronized (obv.class) {
                        if (obv.i == null) {
                            o = (obv.i = new oku(obv.g));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return obv.g;
            }
            case 4: {
                return new okt(obv.g);
            }
            case 3: {
                return new obv();
            }
            case 2: {
                return oky.F(obv.g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0002\u0001\u1502\u0000\u0002\u1502\u0001\u0003\u1004\u0002\u0007\u1004\u0006\b\u100c\u0007", new Object[] { "a", "b", "c", "d", "e", "f", obh.k });
            }
            case 0: {
                return this.h;
            }
        }
    }
}
