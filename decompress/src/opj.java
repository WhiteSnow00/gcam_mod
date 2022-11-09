// 
// Decompiled by Procyon v0.6.0
// 

public final class opj extends oky implements omk
{
    public static final opj a;
    private static volatile omp b;
    
    static {
        oky.G(opj.class, a = new opj());
    }
    
    private opj() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = opj.b) == null) {
                    synchronized (opj.class) {
                        if (opj.b == null) {
                            o = (opj.b = new oku(opj.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return opj.a;
            }
            case 4: {
                return new okt(opj.a);
            }
            case 3: {
                return new opj();
            }
            case 2: {
                return oky.F(opj.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
