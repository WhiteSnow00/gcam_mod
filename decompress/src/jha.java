// 
// Decompiled by Procyon v0.6.0
// 

public final class jha extends oky implements omk
{
    public static final jha b;
    private static volatile omp c;
    public float a;
    
    static {
        oky.G(jha.class, b = new jha());
    }
    
    private jha() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = jha.c) == null) {
                    synchronized (jha.class) {
                        if (jha.c == null) {
                            o = (jha.c = new oku(jha.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return jha.b;
            }
            case 4: {
                return new okt(jha.b);
            }
            case 3: {
                return new jha();
            }
            case 2: {
                return oky.F(jha.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
