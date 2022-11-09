// 
// Decompiled by Procyon v0.6.0
// 

public final class osx extends oky implements omk
{
    public static final osx a;
    private static volatile omp b;
    
    static {
        oky.G(osx.class, a = new osx());
    }
    
    private osx() {
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
                if ((b = osx.b) == null) {
                    synchronized (osx.class) {
                        if (osx.b == null) {
                            o = (osx.b = new oku(osx.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return osx.a;
            }
            case 4: {
                return new okt(osx.a);
            }
            case 3: {
                return new osx();
            }
            case 2: {
                return oky.F(osx.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
