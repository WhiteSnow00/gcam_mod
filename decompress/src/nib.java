// 
// Decompiled by Procyon v0.6.0
// 

public final class nib extends oky implements omk
{
    public static final nib a;
    private static volatile omp b;
    
    static {
        oky.G(nib.class, a = new nib());
    }
    
    private nib() {
        final okz b = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = nib.b) == null) {
                    synchronized (nib.class) {
                        if (nib.b == null) {
                            o = (nib.b = new oku(nib.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return nib.a;
            }
            case 4: {
                return new okt(nib.a);
            }
            case 3: {
                return new nib();
            }
            case 2: {
                return oky.F(nib.a, "\u0000\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
