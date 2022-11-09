// 
// Decompiled by Procyon v0.6.0
// 

public final class nzw extends oky implements omk
{
    public static final nzw h;
    private static volatile omp i;
    public int a;
    public nzx b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    
    static {
        oky.G(nzw.class, h = new nzw());
    }
    
    private nzw() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = nzw.i) == null) {
                    synchronized (nzw.class) {
                        if (nzw.i == null) {
                            o = (nzw.i = new oku(nzw.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return nzw.h;
            }
            case 4: {
                return new okt(nzw.h);
            }
            case 3: {
                return new nzw();
            }
            case 2: {
                return oky.F(nzw.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1003\u0005", new Object[] { "a", "b", "c", nzh.l, "d", nzh.k, "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
