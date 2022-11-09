// 
// Decompiled by Procyon v0.6.0
// 

public final class oij extends oky implements omk
{
    public static final oij d;
    private static volatile omp e;
    public int a;
    public okj b;
    public oni c;
    
    static {
        oky.G(oij.class, d = new oij());
    }
    
    private oij() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oij.e) == null) {
                    synchronized (oij.class) {
                        if (oij.e == null) {
                            o = (oij.e = new oku(oij.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oij.d;
            }
            case 4: {
                return new okt(oij.d);
            }
            case 3: {
                return new oij();
            }
            case 2: {
                return oky.F(oij.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
