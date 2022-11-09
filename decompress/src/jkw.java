// 
// Decompiled by Procyon v0.6.0
// 

public final class jkw extends oky implements omk
{
    public static final jkw a;
    private static volatile omp b;
    
    static {
        oky.G(jkw.class, a = new jkw());
    }
    
    private jkw() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = jkw.b) == null) {
                    synchronized (jkw.class) {
                        if (jkw.b == null) {
                            o = (jkw.b = new oku(jkw.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return jkw.a;
            }
            case 4: {
                return new okt(jkw.a);
            }
            case 3: {
                return new jkw();
            }
            case 2: {
                return oky.F(jkw.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
