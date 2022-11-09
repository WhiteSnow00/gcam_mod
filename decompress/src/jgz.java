// 
// Decompiled by Procyon v0.6.0
// 

public final class jgz extends oky implements omk
{
    public static final jgz b;
    private static volatile omp c;
    public int a;
    
    static {
        oky.G(jgz.class, b = new jgz());
    }
    
    private jgz() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = jgz.c) == null) {
                    synchronized (jgz.class) {
                        if (jgz.c == null) {
                            o = (jgz.c = new oku(jgz.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return jgz.b;
            }
            case 4: {
                return new okt(jgz.b);
            }
            case 3: {
                return new jgz();
            }
            case 2: {
                return oky.F(jgz.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
