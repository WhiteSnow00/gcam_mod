// 
// Decompiled by Procyon v0.6.0
// 

public final class mov extends oky implements omk
{
    public static final mov b;
    private static volatile omp c;
    public ome a;
    
    static {
        oky.G(mov.class, b = new mov());
    }
    
    private mov() {
        this.a = ome.a;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = mov.c) == null) {
                    synchronized (mov.class) {
                        if (mov.c == null) {
                            o = (mov.c = new oku(mov.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return mov.b;
            }
            case 4: {
                return new okt(mov.b);
            }
            case 3: {
                return new mov();
            }
            case 2: {
                return oky.F(mov.b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[] { "a", mou.a });
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final ome b() {
        final ome a = this.a;
        if (!a.b) {
            this.a = a.a();
        }
        return this.a;
    }
}
