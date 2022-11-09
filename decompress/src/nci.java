// 
// Decompiled by Procyon v0.6.0
// 

public final class nci extends oky implements omk
{
    public static final nci b;
    private static volatile omp c;
    public ole a;
    
    static {
        oky.G(nci.class, b = new nci());
    }
    
    private nci() {
        this.a = okr.b;
        final ojw b = ojw.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = nci.c) == null) {
                    synchronized (nci.class) {
                        if (nci.c == null) {
                            o = (nci.c = new oku(nci.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return nci.b;
            }
            case 4: {
                return new okt(nci.b);
            }
            case 3: {
                return new nci();
            }
            case 2: {
                return oky.F(nci.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
