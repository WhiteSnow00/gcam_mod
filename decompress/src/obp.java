// 
// Decompiled by Procyon v0.6.0
// 

public final class obp extends oky implements omk
{
    public static final obp c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(obp.class, c = new obp());
    }
    
    private obp() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = obp.d) == null) {
                    synchronized (obp.class) {
                        if (obp.d == null) {
                            o = (obp.d = new oku(obp.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return obp.c;
            }
            case 4: {
                return new okt(obp.c);
            }
            case 3: {
                return new obp();
            }
            case 2: {
                return oky.F(obp.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "a", "b", obh.f });
            }
            case 0: {
                return 1;
            }
        }
    }
}
