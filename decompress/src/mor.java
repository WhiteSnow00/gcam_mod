// 
// Decompiled by Procyon v0.6.0
// 

public final class mor extends oky implements omk
{
    public static final mor d;
    private static volatile omp e;
    public int a;
    public olj b;
    public String c;
    
    static {
        oky.G(mor.class, d = new mor());
    }
    
    private mor() {
        this.b = oms.b;
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = mor.e) == null) {
                    synchronized (mor.class) {
                        if (mor.e == null) {
                            o = (mor.e = new oku(mor.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return mor.d;
            }
            case 4: {
                return new okt(mor.d);
            }
            case 3: {
                return new mor();
            }
            case 2: {
                return oky.F(mor.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\u1008\u0000", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
