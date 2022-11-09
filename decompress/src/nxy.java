// 
// Decompiled by Procyon v0.6.0
// 

public final class nxy extends oky implements omk
{
    public static final nxy e;
    private static volatile omp f;
    public int a;
    public float b;
    public float c;
    public float d;
    
    static {
        oky.G(nxy.class, e = new nxy());
    }
    
    private nxy() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = nxy.f) == null) {
                    synchronized (nxy.class) {
                        if (nxy.f == null) {
                            o = (nxy.f = new oku(nxy.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return nxy.e;
            }
            case 4: {
                return new okt(nxy.e);
            }
            case 3: {
                return new nxy();
            }
            case 2: {
                return oky.F(nxy.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
