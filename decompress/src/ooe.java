// 
// Decompiled by Procyon v0.6.0
// 

public final class ooe extends oky implements omk
{
    public static final olg b;
    public static final ooe d;
    private static volatile omp e;
    public olf a;
    public olj c;
    
    static {
        b = new oof(1);
        oky.G(ooe.class, d = new ooe());
    }
    
    private ooe() {
        this.a = okz.b;
        this.c = oms.b;
    }
    
    public static okt i() {
        return ooe.d.m();
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = ooe.e) == null) {
                    synchronized (ooe.class) {
                        if (ooe.e == null) {
                            o = (ooe.e = new oku(ooe.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ooe.d;
            }
            case 4: {
                return new okt(ooe.d);
            }
            case 3: {
                return new ooe();
            }
            case 2: {
                return oky.F(ooe.d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[] { "a", ood.c(), "c", oog.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
