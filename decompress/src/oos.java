// 
// Decompiled by Procyon v0.6.0
// 

public final class oos extends oky implements omk
{
    public static final oos g;
    private static volatile omp h;
    public int a;
    public long b;
    public long c;
    public float d;
    public ole e;
    public ole f;
    
    static {
        oky.G(oos.class, g = new oos());
    }
    
    private oos() {
        this.e = okr.b;
        this.f = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = oos.h) == null) {
                    synchronized (oos.class) {
                        if (oos.h == null) {
                            o = (oos.h = new oku(oos.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return oos.g;
            }
            case 4: {
                return new okt(oos.g);
            }
            case 3: {
                return new oos();
            }
            case 2: {
                return oky.F(oos.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1001\u0002\u0004$\u0005$", new Object[] { "a", "b", "c", "d", "e", "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
