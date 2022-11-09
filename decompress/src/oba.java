// 
// Decompiled by Procyon v0.6.0
// 

public final class oba extends oky implements omk
{
    public static final oba e;
    private static volatile omp f;
    public int a;
    public long b;
    public String c;
    public boolean d;
    
    static {
        oky.G(oba.class, e = new oba());
    }
    
    private oba() {
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = oba.f) == null) {
                    synchronized (oba.class) {
                        if (oba.f == null) {
                            o = (oba.f = new oku(oba.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return oba.e;
            }
            case 4: {
                return new okt(oba.e);
            }
            case 3: {
                return new oba();
            }
            case 2: {
                return oky.F(oba.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1007\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
