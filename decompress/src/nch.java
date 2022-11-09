// 
// Decompiled by Procyon v0.6.0
// 

public final class nch extends oky implements omk
{
    public static final nch b;
    private static volatile omp c;
    public olj a;
    
    static {
        oky.G(nch.class, b = new nch());
    }
    
    private nch() {
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
                if ((c = nch.c) == null) {
                    synchronized (nch.class) {
                        if (nch.c == null) {
                            o = (nch.c = new oku(nch.b));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return nch.b;
            }
            case 4: {
                return new okt(nch.b);
            }
            case 3: {
                return new nch();
            }
            case 2: {
                return oky.F(nch.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "a", ncg.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
