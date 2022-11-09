// 
// Decompiled by Procyon v0.6.0
// 

public final class jhc extends oky implements omk
{
    public static final jhc b;
    private static volatile omp c;
    public float a;
    
    static {
        oky.G(jhc.class, b = new jhc());
    }
    
    private jhc() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = jhc.c) == null) {
                    synchronized (jhc.class) {
                        if (jhc.c == null) {
                            o = (jhc.c = new oku(jhc.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return jhc.b;
            }
            case 4: {
                return new okt(jhc.b);
            }
            case 3: {
                return new jhc();
            }
            case 2: {
                return oky.F(jhc.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
