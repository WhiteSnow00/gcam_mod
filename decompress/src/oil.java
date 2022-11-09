// 
// Decompiled by Procyon v0.6.0
// 

public final class oil extends oky implements omk
{
    public static final oil e;
    private static volatile omp f;
    public int a;
    public boolean b;
    public oij c;
    public oik d;
    
    static {
        oky.G(oil.class, e = new oil());
    }
    
    private oil() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = oil.f) == null) {
                    synchronized (oil.class) {
                        if (oil.f == null) {
                            o = (oil.f = new oku(oil.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return oil.e;
            }
            case 4: {
                return new okt(oil.e);
            }
            case 3: {
                return new oil();
            }
            case 2: {
                return oky.F(oil.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
