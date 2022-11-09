// 
// Decompiled by Procyon v0.6.0
// 

public final class nxn extends oky implements omk
{
    public static final nxn e;
    private static volatile omp f;
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    
    static {
        oky.G(nxn.class, e = new nxn());
    }
    
    private nxn() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = nxn.f) == null) {
                    synchronized (nxn.class) {
                        if (nxn.f == null) {
                            o = (nxn.f = new oku(nxn.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return nxn.e;
            }
            case 4: {
                return new okt(nxn.e);
            }
            case 3: {
                return new nxn();
            }
            case 2: {
                return oky.F(nxn.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1001\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
