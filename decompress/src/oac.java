// 
// Decompiled by Procyon v0.6.0
// 

public final class oac extends oky implements omk
{
    public static final oac d;
    private static volatile omp e;
    public int a;
    public int b;
    public olj c;
    
    static {
        oky.G(oac.class, d = new oac());
    }
    
    private oac() {
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
                if ((e = oac.e) == null) {
                    synchronized (oac.class) {
                        if (oac.e == null) {
                            o = (oac.e = new oku(oac.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oac.d;
            }
            case 4: {
                return new okt(oac.d);
            }
            case 3: {
                return new oac();
            }
            case 2: {
                return oky.F(oac.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b", new Object[] { "a", "b", nzh.q, "c", oab.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
