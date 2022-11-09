// 
// Decompiled by Procyon v0.6.0
// 

public final class bza extends oky implements omk
{
    public static final bza i;
    private static volatile omp k;
    public int a;
    public int b;
    public int c;
    public int d;
    public oni e;
    public oni f;
    public int g;
    public olj h;
    private ome j;
    
    static {
        oky.G(bza.class, i = new bza());
    }
    
    private bza() {
        this.j = ome.a;
        this.h = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp k;
                if ((k = bza.k) == null) {
                    synchronized (bza.class) {
                        if (bza.k == null) {
                            o = (bza.k = new oku(bza.i));
                        }
                    }
                }
                return k;
            }
            case 5: {
                return bza.i;
            }
            case 4: {
                return new okt(bza.i);
            }
            case 3: {
                return new bza();
            }
            case 2: {
                return oky.F(bza.i, "\u0000\t\u0000\u0000\u0001\t\t\u0001\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005\t\u0006\t\u0007\u0004\b2\t\u001b", new Object[] { "a", "b", "c", "d", "e", "f", "g", "j", byy.a, "h", bzc.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
