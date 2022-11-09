// 
// Decompiled by Procyon v0.6.0
// 

public final class nyl extends oky implements omk
{
    public static final nyl e;
    private static volatile omp f;
    public int a;
    public boolean b;
    public float c;
    public int d;
    
    static {
        oky.G(nyl.class, e = new nyl());
    }
    
    private nyl() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = nyl.f) == null) {
                    synchronized (nyl.class) {
                        if (nyl.f == null) {
                            o = (nyl.f = new oku(nyl.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return nyl.e;
            }
            case 4: {
                return new okt(nyl.e);
            }
            case 3: {
                return new nyl();
            }
            case 2: {
                return oky.F(nyl.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1001\u0001\u0003\u100c\u0002", new Object[] { "a", "b", "c", "d", oah.d });
            }
            case 0: {
                return 1;
            }
        }
    }
}
