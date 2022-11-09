// 
// Decompiled by Procyon v0.6.0
// 

public final class nxk extends oky implements omk
{
    public static final nxk d;
    private static volatile omp e;
    public int a;
    public boolean b;
    public long c;
    
    static {
        oky.G(nxk.class, d = new nxk());
    }
    
    private nxk() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nxk.e) == null) {
                    synchronized (nxk.class) {
                        if (nxk.e == null) {
                            o = (nxk.e = new oku(nxk.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nxk.d;
            }
            case 4: {
                return new okt(nxk.d);
            }
            case 3: {
                return new nxk();
            }
            case 2: {
                return oky.F(nxk.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
