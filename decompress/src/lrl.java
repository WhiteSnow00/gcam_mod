// 
// Decompiled by Procyon v0.6.0
// 

public final class lrl extends oky implements omk
{
    public static final lrl a;
    private static volatile omp b;
    
    static {
        oky.G(lrl.class, a = new lrl());
    }
    
    private lrl() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lrl.b) == null) {
                    synchronized (lrl.class) {
                        if (lrl.b == null) {
                            o = (lrl.b = new oku(lrl.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lrl.a;
            }
            case 4: {
                return new okt(lrl.a);
            }
            case 3: {
                return new lrl();
            }
            case 2: {
                return oky.F(lrl.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
