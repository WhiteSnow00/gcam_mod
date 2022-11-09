// 
// Decompiled by Procyon v0.6.0
// 

public final class oak extends oky implements omk
{
    public static final oak h;
    private static volatile omp i;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public long f;
    public long g;
    
    static {
        oky.G(oak.class, h = new oak());
    }
    
    private oak() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = oak.i) == null) {
                    synchronized (oak.class) {
                        if (oak.i == null) {
                            o = (oak.i = new oku(oak.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return oak.h;
            }
            case 4: {
                return new okt(oak.h);
            }
            case 3: {
                return new oak();
            }
            case 2: {
                return oky.F(oak.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u1001\u0003\u0005\u1002\u0004\u0006\u1002\u0005", new Object[] { "a", "b", oah.d, "c", oah.d, "d", oah.c, "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
