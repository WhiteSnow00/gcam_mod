// 
// Decompiled by Procyon v0.6.0
// 

public final class psy extends oky implements omk
{
    public static final psy b;
    private static volatile omp c;
    public ole a;
    
    static {
        oky.G(psy.class, b = new psy());
    }
    
    private psy() {
        this.a = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = psy.c) == null) {
                    synchronized (psy.class) {
                        if (psy.c == null) {
                            o = (psy.c = new oku(psy.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return psy.b;
            }
            case 4: {
                return new okt(psy.b);
            }
            case 3: {
                return new psy();
            }
            case 2: {
                return oky.F(psy.b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[] { "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final void i() {
        final ole a = this.a;
        if (!a.c()) {
            this.a = oky.w(a);
        }
    }
}
