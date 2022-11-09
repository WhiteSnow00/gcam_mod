// 
// Decompiled by Procyon v0.6.0
// 

public final class jhb extends oky implements omk
{
    public static final jhb c;
    private static volatile omp d;
    public float a;
    public float b;
    
    static {
        oky.G(jhb.class, c = new jhb());
    }
    
    private jhb() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = jhb.d) == null) {
                    synchronized (jhb.class) {
                        if (jhb.d == null) {
                            o = (jhb.d = new oku(jhb.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jhb.c;
            }
            case 4: {
                return new okt(jhb.c);
            }
            case 3: {
                return new jhb();
            }
            case 2: {
                return oky.F(jhb.c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
