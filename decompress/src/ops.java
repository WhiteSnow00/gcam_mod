// 
// Decompiled by Procyon v0.6.0
// 

public final class ops extends oky implements omk
{
    public static final ops a;
    private static volatile omp b;
    
    static {
        oky.G(ops.class, a = new ops());
    }
    
    private ops() {
        final okr b = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = ops.b) == null) {
                    synchronized (ops.class) {
                        if (ops.b == null) {
                            o = (ops.b = new oku(ops.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ops.a;
            }
            case 4: {
                return new okt(ops.a);
            }
            case 3: {
                return new ops();
            }
            case 2: {
                return oky.F(ops.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
