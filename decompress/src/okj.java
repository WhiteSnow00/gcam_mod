// 
// Decompiled by Procyon v0.6.0
// 

public final class okj extends oky implements omk
{
    public static final okj c;
    private static volatile omp d;
    public long a;
    public int b;
    
    static {
        oky.G(okj.class, c = new okj());
    }
    
    private okj() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = okj.d) == null) {
                    synchronized (okj.class) {
                        if (okj.d == null) {
                            o = (okj.d = new oku(okj.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return okj.c;
            }
            case 4: {
                return new okt(okj.c);
            }
            case 3: {
                return new okj();
            }
            case 2: {
                return oky.F(okj.c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
