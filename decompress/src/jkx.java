// 
// Decompiled by Procyon v0.6.0
// 

public final class jkx extends oky implements omk
{
    public static final jkx b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(jkx.class, b = new jkx());
    }
    
    private jkx() {
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
                if ((c = jkx.c) == null) {
                    synchronized (jkx.class) {
                        if (jkx.c == null) {
                            o = (jkx.c = new oku(jkx.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return jkx.b;
            }
            case 4: {
                return new okt(jkx.b);
            }
            case 3: {
                return new jkx();
            }
            case 2: {
                return oky.F(jkx.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
