// 
// Decompiled by Procyon v0.6.0
// 

public final class oga extends oky implements omk
{
    public static final oga i;
    private static volatile omp j;
    public int a;
    public ole b;
    public ole c;
    public oge d;
    public ogb e;
    public int f;
    public olj g;
    public ogg h;
    
    static {
        oky.G(oga.class, i = new oga());
    }
    
    private oga() {
        this.b = okr.b;
        this.c = okr.b;
        this.g = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = oga.j) == null) {
                    synchronized (oga.class) {
                        if (oga.j == null) {
                            o = (oga.j = new oku(oga.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return oga.i;
            }
            case 4: {
                return new okt(oga.i);
            }
            case 3: {
                return new oga();
            }
            case 2: {
                return oky.F(oga.i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0013\u0002\u0013\u0003\u1009\u0000\u0004\u1009\u0001\u0005\u1004\u0002\u0006\u001b\u0007\u1009\u0003", new Object[] { "a", "b", "c", "d", "e", "f", "g", ogc.class, "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
