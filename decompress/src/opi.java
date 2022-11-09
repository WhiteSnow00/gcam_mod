// 
// Decompiled by Procyon v0.6.0
// 

public final class opi extends oky implements omk
{
    public static final opi f;
    private static volatile omp g;
    public int a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    
    static {
        oky.G(opi.class, f = new opi());
    }
    
    private opi() {
        this.b = "";
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = opi.g) == null) {
                    synchronized (opi.class) {
                        if (opi.g == null) {
                            o = (opi.g = new oku(opi.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return opi.f;
            }
            case 4: {
                return new okt(opi.f);
            }
            case 3: {
                return new opi();
            }
            case 2: {
                return oky.F(opi.f, "\u0001\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0010\u1007\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
