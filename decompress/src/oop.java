// 
// Decompiled by Procyon v0.6.0
// 

public final class oop extends oky implements omk
{
    public static final oop d;
    private static volatile omp e;
    public int a;
    public long b;
    public float c;
    
    static {
        oky.G(oop.class, d = new oop());
    }
    
    private oop() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = oop.e) == null) {
                    synchronized (oop.class) {
                        if (oop.e == null) {
                            o = (oop.e = new oku(oop.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return oop.d;
            }
            case 4: {
                return new okt(oop.d);
            }
            case 3: {
                return new oop();
            }
            case 2: {
                return oky.F(oop.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1001\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
