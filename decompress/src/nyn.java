// 
// Decompiled by Procyon v0.6.0
// 

public final class nyn extends oky implements omk
{
    public static final nyn h;
    private static volatile omp i;
    public int a;
    public int b;
    public int c;
    public obj d;
    public obb e;
    public nxm f;
    public obw g;
    
    static {
        oky.G(nyn.class, h = new nyn());
    }
    
    private nyn() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = nyn.i) == null) {
                    synchronized (nyn.class) {
                        if (nyn.i == null) {
                            o = (nyn.i = new oku(nyn.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return nyn.h;
            }
            case 4: {
                return new okt(nyn.h);
            }
            case 3: {
                return new nyn();
            }
            case 2: {
                return oky.F(nyn.h, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\n\u1009\u0003\u000b\u1009\u0004\f\u1009\u0005\r\u1009\u0006", new Object[] { "a", "b", nxw.l, "c", oah.d, "d", "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
