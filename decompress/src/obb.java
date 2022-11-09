// 
// Decompiled by Procyon v0.6.0
// 

public final class obb extends oky implements omk
{
    public static final obb d;
    private static volatile omp e;
    public int a;
    public int b;
    public boolean c;
    
    static {
        oky.G(obb.class, d = new obb());
    }
    
    private obb() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = obb.e) == null) {
                    synchronized (obb.class) {
                        if (obb.e == null) {
                            o = (obb.e = new oku(obb.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return obb.d;
            }
            case 4: {
                return new okt(obb.d);
            }
            case 3: {
                return new obb();
            }
            case 2: {
                return oky.F(obb.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "a", "b", oah.p, "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
