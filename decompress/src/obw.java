// 
// Decompiled by Procyon v0.6.0
// 

public final class obw extends oky implements omk
{
    public static final obw e;
    private static volatile omp f;
    public int a;
    public float b;
    public float c;
    public int d;
    
    static {
        oky.G(obw.class, e = new obw());
    }
    
    private obw() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = obw.f) == null) {
                    synchronized (obw.class) {
                        if (obw.f == null) {
                            o = (obw.f = new oku(obw.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return obw.e;
            }
            case 4: {
                return new okt(obw.e);
            }
            case 3: {
                return new obw();
            }
            case 2: {
                return oky.F(obw.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u100c\u0002", new Object[] { "a", "b", "c", "d", nxr.c() });
            }
            case 0: {
                return 1;
            }
        }
    }
}
