// 
// Decompiled by Procyon v0.6.0
// 

public final class oaw extends oky implements omk
{
    public static final oaw a;
    private static volatile omp b;
    
    static {
        oky.G(oaw.class, a = new oaw());
    }
    
    private oaw() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = oaw.b) == null) {
                    synchronized (oaw.class) {
                        if (oaw.b == null) {
                            o = (oaw.b = new oku(oaw.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return oaw.a;
            }
            case 4: {
                return new okt(oaw.a);
            }
            case 3: {
                return new oaw();
            }
            case 2: {
                return oky.F(oaw.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
