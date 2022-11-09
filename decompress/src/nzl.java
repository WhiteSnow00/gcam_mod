// 
// Decompiled by Procyon v0.6.0
// 

public final class nzl extends oky implements omk
{
    public static final nzl h;
    private static volatile omp i;
    public int a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public long f;
    public long g;
    
    static {
        oky.G(nzl.class, h = new nzl());
    }
    
    private nzl() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = nzl.i) == null) {
                    synchronized (nzl.class) {
                        if (nzl.i == null) {
                            o = (nzl.i = new oku(nzl.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return nzl.h;
            }
            case 4: {
                return new okt(nzl.h);
            }
            case 3: {
                return new nzl();
            }
            case 2: {
                return oky.F(nzl.h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0006\u1001\u0005\u0007\u1007\u0006\b\u100c\u0007\t\u1002\b\n\u1002\t", new Object[] { "a", "b", nzh.d, "c", "d", "e", nzh.e, "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
