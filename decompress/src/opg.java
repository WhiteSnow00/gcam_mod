// 
// Decompiled by Procyon v0.6.0
// 

public final class opg extends oky implements omk
{
    public static final opg b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(opg.class, b = new opg());
    }
    
    private opg() {
        this.a = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = opg.c) == null) {
                    synchronized (opg.class) {
                        if (opg.c == null) {
                            o = (opg.c = new oku(opg.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return opg.b;
            }
            case 4: {
                return new okt(opg.b);
            }
            case 3: {
                return new opg();
            }
            case 2: {
                return oky.F(opg.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", opj.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
