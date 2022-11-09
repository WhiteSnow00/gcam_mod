// 
// Decompiled by Procyon v0.6.0
// 

public final class nia extends oky implements omk
{
    public static final nia a;
    private static volatile omp b;
    
    static {
        oky.G(nia.class, a = new nia());
    }
    
    private nia() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = nia.b) == null) {
                    synchronized (nia.class) {
                        if (nia.b == null) {
                            o = (nia.b = new oku(nia.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return nia.a;
            }
            case 4: {
                return new okt(nia.a);
            }
            case 3: {
                return new nia();
            }
            case 2: {
                return oky.F(nia.a, "\u0000\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
