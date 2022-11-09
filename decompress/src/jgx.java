// 
// Decompiled by Procyon v0.6.0
// 

public final class jgx extends oky implements omk
{
    public static final jgx b;
    private static volatile omp c;
    public long a;
    
    static {
        oky.G(jgx.class, b = new jgx());
    }
    
    private jgx() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = jgx.c) == null) {
                    synchronized (jgx.class) {
                        if (jgx.c == null) {
                            o = (jgx.c = new oku(jgx.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return jgx.b;
            }
            case 4: {
                return new okt(jgx.b);
            }
            case 3: {
                return new jgx();
            }
            case 2: {
                return oky.F(jgx.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
