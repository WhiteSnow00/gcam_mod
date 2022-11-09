// 
// Decompiled by Procyon v0.6.0
// 

public final class oom extends oky implements omk
{
    public static final oom m;
    private static volatile omp n;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    
    static {
        oky.G(oom.class, m = new oom());
    }
    
    private oom() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp n2;
                if ((n2 = oom.n) == null) {
                    synchronized (oom.class) {
                        if (oom.n == null) {
                            o = (oom.n = new oku(oom.m));
                        }
                    }
                }
                return n2;
            }
            case 5: {
                return oom.m;
            }
            case 4: {
                return new okt(oom.m);
            }
            case 3: {
                return new oom();
            }
            case 2: {
                return oky.F(oom.m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1001\u0006\b\u1001\u0007\t\u1001\b\n\u1001\t\u000b\u1001\n", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
