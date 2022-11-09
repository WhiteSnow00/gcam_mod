// 
// Decompiled by Procyon v0.6.0
// 

public final class nym extends oky implements omk
{
    public static final nym h;
    private static volatile omp i;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    
    static {
        oky.G(nym.class, h = new nym());
    }
    
    private nym() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = nym.i) == null) {
                    synchronized (nym.class) {
                        if (nym.i == null) {
                            o = (nym.i = new oku(nym.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return nym.h;
            }
            case 4: {
                return new okt(nym.h);
            }
            case 3: {
                return new nym();
            }
            case 2: {
                return oky.F(nym.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u100c\u0004\u0006\u1007\u0005", new Object[] { "a", "b", nxw.j, "c", nxw.j, "d", "e", "f", nxw.k, "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
