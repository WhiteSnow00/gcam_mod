// 
// Decompiled by Procyon v0.6.0
// 

public final class oby extends oky implements omk
{
    public static final oby d;
    private static volatile omp e;
    public int a;
    public int b;
    public int c;
    
    static {
        oky.G(oby.class, d = new oby());
    }
    
    private oby() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oby.e) == null) {
                    synchronized (oby.class) {
                        if (oby.e == null) {
                            o = (oby.e = new oku(oby.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oby.d;
            }
            case 4: {
                return new okt(oby.d);
            }
            case 3: {
                return new oby();
            }
            case 2: {
                return oky.F(oby.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
