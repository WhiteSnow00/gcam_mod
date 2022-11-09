// 
// Decompiled by Procyon v0.6.0
// 

public final class jgy extends oky implements omk
{
    public static final jgy c;
    private static volatile omp d;
    public ojw a;
    public long b;
    
    static {
        oky.G(jgy.class, c = new jgy());
    }
    
    private jgy() {
        this.a = ojw.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = jgy.d) == null) {
                    synchronized (jgy.class) {
                        if (jgy.d == null) {
                            o = (jgy.d = new oku(jgy.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jgy.c;
            }
            case 4: {
                return new okt(jgy.c);
            }
            case 3: {
                return new jgy();
            }
            case 2: {
                return oky.F(jgy.c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
