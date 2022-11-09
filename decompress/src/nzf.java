// 
// Decompiled by Procyon v0.6.0
// 

public final class nzf extends oky implements omk
{
    public static final nzf j;
    private static volatile omp k;
    public int a;
    public int b;
    public long c;
    public long d;
    public oli e;
    public nxy f;
    public long g;
    public int h;
    public olf i;
    
    static {
        oky.G(nzf.class, j = new nzf());
    }
    
    private nzf() {
        this.e = oly.b;
        this.i = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp k;
                if ((k = nzf.k) == null) {
                    synchronized (nzf.class) {
                        if (nzf.k == null) {
                            o = (nzf.k = new oku(nzf.j));
                        }
                    }
                }
                return k;
            }
            case 5: {
                return nzf.j;
            }
            case 4: {
                return new okt(nzf.j);
            }
            case 3: {
                return new nzf();
            }
            case 2: {
                return oky.F(nzf.j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u0014\u0005\u1009\u0003\u0006\u1002\u0004\u0007\u100c\u0005\b\u001e", new Object[] { "a", "b", nzh.a, "c", "d", "e", "f", "g", "h", nxw.u, "i", nze.c() });
            }
            case 0: {
                return 1;
            }
        }
    }
}
