// 
// Decompiled by Procyon v0.6.0
// 

public final class oai extends oky implements omk
{
    public static final oai g;
    private static volatile omp h;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    
    static {
        oky.G(oai.class, g = new oai());
    }
    
    private oai() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = oai.h) == null) {
                    synchronized (oai.class) {
                        if (oai.h == null) {
                            o = (oai.h = new oku(oai.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return oai.g;
            }
            case 4: {
                return new okt(oai.g);
            }
            case 3: {
                return new oai();
            }
            case 2: {
                return oky.F(oai.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u100c\u0004", new Object[] { "a", "b", oah.d, "c", oah.d, "d", "e", "f", oah.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
