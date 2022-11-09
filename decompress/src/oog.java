// 
// Decompiled by Procyon v0.6.0
// 

public final class oog extends oky implements omk
{
    public static final olg b;
    public static final oog d;
    private static volatile omp e;
    public olf a;
    public olj c;
    
    static {
        b = new oof();
        oky.G(oog.class, d = new oog());
    }
    
    private oog() {
        this.a = okz.b;
        this.c = oms.b;
    }
    
    public static okt i() {
        return oog.d.m();
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oog.e) == null) {
                    synchronized (oog.class) {
                        if (oog.e == null) {
                            o = (oog.e = new oku(oog.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oog.d;
            }
            case 4: {
                return new okt(oog.d);
            }
            case 3: {
                return new oog();
            }
            case 2: {
                return oky.F(oog.d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[] { "a", ood.c(), "c", ooe.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
