// 
// Decompiled by Procyon v0.6.0
// 

public final class obg extends oky implements omk
{
    public static final obg e;
    private static volatile omp f;
    public int a;
    public int b;
    public int c;
    public obf d;
    
    static {
        oky.G(obg.class, e = new obg());
    }
    
    private obg() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = obg.f) == null) {
                    synchronized (obg.class) {
                        if (obg.f == null) {
                            o = (obg.f = new oku(obg.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return obg.e;
            }
            case 4: {
                return new okt(obg.e);
            }
            case 3: {
                return new obg();
            }
            case 2: {
                return oky.F(obg.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1009\u0002", new Object[] { "a", "b", oah.u, "c", obh.b, "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
