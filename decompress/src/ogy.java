// 
// Decompiled by Procyon v0.6.0
// 

public final class ogy extends oky implements omk
{
    public static final ogy c;
    private static volatile omp e;
    public ogx a;
    public ogx b;
    private int d;
    
    static {
        oky.G(ogy.class, c = new ogy());
    }
    
    private ogy() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = ogy.e) == null) {
                    synchronized (ogy.class) {
                        if (ogy.e == null) {
                            o = (ogy.e = new oku(ogy.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ogy.c;
            }
            case 4: {
                return new okt(ogy.c);
            }
            case 3: {
                return new ogy();
            }
            case 2: {
                return oky.F(ogy.c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "d", "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
