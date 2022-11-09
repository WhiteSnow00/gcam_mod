// 
// Decompiled by Procyon v0.6.0
// 

public final class miv extends oky implements omk
{
    public static final miv c;
    private static volatile omp e;
    public String a;
    public olj b;
    private int d;
    
    static {
        oky.G(miv.class, c = new miv());
    }
    
    private miv() {
        this.a = "";
        this.b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = miv.e) == null) {
                    synchronized (miv.class) {
                        if (miv.e == null) {
                            o = (miv.e = new oku(miv.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return miv.c;
            }
            case 4: {
                return new okt(miv.c);
            }
            case 3: {
                return new miv();
            }
            case 2: {
                return oky.F(miv.c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "d", "a", "b", miu.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
