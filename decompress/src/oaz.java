// 
// Decompiled by Procyon v0.6.0
// 

public final class oaz extends oky implements omk
{
    public static final oaz d;
    private static volatile omp e;
    public int a;
    public int b;
    public int c;
    
    static {
        oky.G(oaz.class, d = new oaz());
    }
    
    private oaz() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oaz.e) == null) {
                    synchronized (oaz.class) {
                        if (oaz.e == null) {
                            o = (oaz.e = new oku(oaz.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oaz.d;
            }
            case 4: {
                return new okt(oaz.d);
            }
            case 3: {
                return new oaz();
            }
            case 2: {
                return oky.F(oaz.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "a", "b", oah.o, "c", oah.n });
            }
            case 0: {
                return 1;
            }
        }
    }
}
