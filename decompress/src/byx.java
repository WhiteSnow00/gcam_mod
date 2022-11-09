// 
// Decompiled by Procyon v0.6.0
// 

public final class byx extends oky implements omk
{
    public static final byx c;
    private static volatile omp d;
    public int a;
    public Object b;
    
    static {
        oky.G(byx.class, c = new byx());
    }
    
    private byx() {
        this.a = 0;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = byx.d) == null) {
                    synchronized (byx.class) {
                        if (byx.d == null) {
                            o = (byx.d = new oku(byx.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return byx.c;
            }
            case 4: {
                return new okt(byx.c);
            }
            case 3: {
                return new byx();
            }
            case 2: {
                return oky.F(byx.c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[] { "b", "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
