// 
// Decompiled by Procyon v0.6.0
// 

public final class nzm extends oky implements omk
{
    public static final nzm d;
    private static volatile omp e;
    public int a;
    public long b;
    public int c;
    
    static {
        oky.G(nzm.class, d = new nzm());
    }
    
    private nzm() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nzm.e) == null) {
                    synchronized (nzm.class) {
                        if (nzm.e == null) {
                            o = (nzm.e = new oku(nzm.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nzm.d;
            }
            case 4: {
                return new okt(nzm.d);
            }
            case 3: {
                return new nzm();
            }
            case 2: {
                return oky.F(nzm.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u100c\u0001", new Object[] { "a", "b", "c", nzh.f });
            }
            case 0: {
                return 1;
            }
        }
    }
}
