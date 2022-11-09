// 
// Decompiled by Procyon v0.6.0
// 

public final class oim extends oky implements omk
{
    public static final oim a;
    private static volatile omp b;
    
    static {
        oky.G(oim.class, a = new oim());
    }
    
    private oim() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = oim.b) == null) {
                    synchronized (oim.class) {
                        if (oim.b == null) {
                            o = (oim.b = new oku(oim.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return oim.a;
            }
            case 4: {
                return new okt(oim.a);
            }
            case 3: {
                return new oim();
            }
            case 2: {
                return oky.F(oim.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
