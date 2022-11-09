// 
// Decompiled by Procyon v0.6.0
// 

public final class ouh extends oky implements omk
{
    public static final ouh b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(ouh.class, b = new ouh());
    }
    
    private ouh() {
        this.a = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = ouh.c) == null) {
                    synchronized (ouh.class) {
                        if (ouh.c == null) {
                            o = (ouh.c = new oku(ouh.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ouh.b;
            }
            case 4: {
                return new okt(ouh.b);
            }
            case 3: {
                return new ouh();
            }
            case 2: {
                return oky.F(ouh.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", oug.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
