// 
// Decompiled by Procyon v0.6.0
// 

public final class jgw extends oky implements omk
{
    public static final jgw b;
    private static volatile omp c;
    public int a;
    
    static {
        oky.G(jgw.class, b = new jgw());
    }
    
    private jgw() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = jgw.c) == null) {
                    synchronized (jgw.class) {
                        if (jgw.c == null) {
                            o = (jgw.c = new oku(jgw.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return jgw.b;
            }
            case 4: {
                return new okt(jgw.b);
            }
            case 3: {
                return new jgw();
            }
            case 2: {
                return oky.F(jgw.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
