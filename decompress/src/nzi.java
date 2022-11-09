// 
// Decompiled by Procyon v0.6.0
// 

public final class nzi extends oky implements omk
{
    public static final nzi d;
    private static volatile omp e;
    public int a;
    public boolean b;
    public boolean c;
    
    static {
        oky.G(nzi.class, d = new nzi());
    }
    
    private nzi() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nzi.e) == null) {
                    synchronized (nzi.class) {
                        if (nzi.e == null) {
                            o = (nzi.e = new oku(nzi.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nzi.d;
            }
            case 4: {
                return new okt(nzi.d);
            }
            case 3: {
                return new nzi();
            }
            case 2: {
                return oky.F(nzi.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
