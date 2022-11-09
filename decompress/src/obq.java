// 
// Decompiled by Procyon v0.6.0
// 

public final class obq extends oky implements omk
{
    public static final obq h;
    private static volatile omp i;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    
    static {
        oky.G(obq.class, h = new obq());
    }
    
    private obq() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = obq.i) == null) {
                    synchronized (obq.class) {
                        if (obq.i == null) {
                            o = (obq.i = new oku(obq.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return obq.h;
            }
            case 4: {
                return new okt(obq.h);
            }
            case 3: {
                return new obq();
            }
            case 2: {
                return oky.F(obq.h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1007\u0003\u0006\u100c\u0004\u0007\u100c\u0005", new Object[] { "a", "b", "c", "d", "e", "f", obh.h, "g", obh.g });
            }
            case 0: {
                return 1;
            }
        }
    }
}
