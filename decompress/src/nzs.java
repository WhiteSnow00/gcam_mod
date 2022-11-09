// 
// Decompiled by Procyon v0.6.0
// 

public final class nzs extends oky implements omk
{
    public static final nzs d;
    private static volatile omp e;
    public int a;
    public String b;
    public olj c;
    
    static {
        oky.G(nzs.class, d = new nzs());
    }
    
    private nzs() {
        this.b = "";
        this.c = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = nzs.e) == null) {
                    synchronized (nzs.class) {
                        if (nzs.e == null) {
                            o = (nzs.e = new oku(nzs.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return nzs.d;
            }
            case 4: {
                return new okt(nzs.d);
            }
            case 3: {
                return new nzs();
            }
            case 2: {
                return oky.F(nzs.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "a", "b", "c", nzt.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
