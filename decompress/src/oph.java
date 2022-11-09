// 
// Decompiled by Procyon v0.6.0
// 

public final class oph extends oky implements omk
{
    public static final oph f;
    private static volatile omp g;
    public int a;
    public String b;
    public String c;
    public ojw d;
    public boolean e;
    
    static {
        oky.G(oph.class, f = new oph());
    }
    
    private oph() {
        this.b = "";
        this.c = "";
        this.d = ojw.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = oph.g) == null) {
                    synchronized (oph.class) {
                        if (oph.g == null) {
                            o = (oph.g = new oku(oph.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return oph.f;
            }
            case 4: {
                return new okt(oph.f);
            }
            case 3: {
                return new oph();
            }
            case 2: {
                return oky.F(oph.f, "\u0001\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100a\u0002\u0010\u1007\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
