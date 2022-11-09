// 
// Decompiled by Procyon v0.6.0
// 

public final class lrn extends oky implements omk
{
    public static final lrn c;
    private static volatile omp d;
    public int a;
    public boolean b;
    
    static {
        oky.G(lrn.class, c = new lrn());
    }
    
    private lrn() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = lrn.d) == null) {
                    synchronized (lrn.class) {
                        if (lrn.d == null) {
                            o = (lrn.d = new oku(lrn.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return lrn.c;
            }
            case 4: {
                return new okt(lrn.c);
            }
            case 3: {
                return new lrn();
            }
            case 2: {
                return oky.F(lrn.c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0001", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
