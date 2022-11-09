// 
// Decompiled by Procyon v0.6.0
// 

public final class jky extends oky implements omk
{
    public static final jky c;
    private static volatile omp f;
    public int a;
    public jkx b;
    private jkv d;
    private jkw e;
    
    static {
        oky.G(jky.class, c = new jky());
    }
    
    private jky() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = jky.f) == null) {
                    synchronized (jky.class) {
                        if (jky.f == null) {
                            o = (jky.f = new oku(jky.c));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return jky.c;
            }
            case 4: {
                return new okt(jky.c);
            }
            case 3: {
                return new jky();
            }
            case 2: {
                return oky.F(jky.c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "a", "d", "b", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
