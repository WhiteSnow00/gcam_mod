// 
// Decompiled by Procyon v0.6.0
// 

public final class opf extends oky implements omk
{
    public static final opf a;
    private static volatile omp b;
    
    static {
        oky.G(opf.class, a = new opf());
    }
    
    private opf() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = opf.b) == null) {
                    synchronized (opf.class) {
                        if (opf.b == null) {
                            o = (opf.b = new oku(opf.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return opf.a;
            }
            case 4: {
                return new okt(opf.a);
            }
            case 3: {
                return new opf();
            }
            case 2: {
                return oky.F(opf.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
