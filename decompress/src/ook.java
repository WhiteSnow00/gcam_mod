// 
// Decompiled by Procyon v0.6.0
// 

public final class ook extends oky implements omk
{
    public static final ook h;
    private static volatile omp i;
    public int a;
    public ole b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    
    static {
        oky.G(ook.class, h = new ook());
    }
    
    private ook() {
        this.b = okr.b;
        final okz b = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = ook.i) == null) {
                    synchronized (ook.class) {
                        if (ook.i == null) {
                            o = (ook.i = new oku(ook.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ook.h;
            }
            case 4: {
                return new okt(ook.h);
            }
            case 3: {
                return new ook();
            }
            case 2: {
                return oky.F(ook.h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001$\u0003\u1004\u0000\u0004\u1004\u0001\u0005\u1002\u0002\u0006\u100c\u0003\t\u100c\u0006", new Object[] { "a", "b", "c", "d", "e", "f", obh.s, "g", obh.t });
            }
            case 0: {
                return 1;
            }
        }
    }
}
