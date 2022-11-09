// 
// Decompiled by Procyon v0.6.0
// 

public final class nyr extends oky implements omk
{
    public static final nyr h;
    private static volatile omp i;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    
    static {
        oky.G(nyr.class, h = new nyr());
    }
    
    private nyr() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = nyr.i) == null) {
                    synchronized (nyr.class) {
                        if (nyr.i == null) {
                            o = (nyr.i = new oku(nyr.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return nyr.h;
            }
            case 4: {
                return new okt(nyr.h);
            }
            case 3: {
                return new nyr();
            }
            case 2: {
                return oky.F(nyr.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0003\u0004\u1001\u0004\u0005\u1001\u0002\u0006\u1001\u0005", new Object[] { "a", "b", "c", "e", "f", "d", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
