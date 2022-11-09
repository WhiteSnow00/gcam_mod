// 
// Decompiled by Procyon v0.6.0
// 

public final class oii extends oky implements omk
{
    public static final oii d;
    private static volatile omp e;
    public int a;
    public String b;
    public String c;
    
    static {
        oky.G(oii.class, d = new oii());
    }
    
    private oii() {
        this.b = "";
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
                if ((e = oii.e) == null) {
                    synchronized (oii.class) {
                        if (oii.e == null) {
                            o = (oii.e = new oku(oii.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oii.d;
            }
            case 4: {
                return new okt(oii.d);
            }
            case 3: {
                return new oii();
            }
            case 2: {
                return oky.F(oii.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
