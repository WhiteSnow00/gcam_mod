// 
// Decompiled by Procyon v0.6.0
// 

public final class ooq extends oky implements omk
{
    public static final ooq f;
    private static volatile omp g;
    public int a;
    public olj b;
    public float c;
    public int d;
    public oor e;
    
    static {
        oky.G(ooq.class, f = new ooq());
    }
    
    private ooq() {
        this.b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp g;
                if ((g = ooq.g) == null) {
                    synchronized (ooq.class) {
                        if (ooq.g == null) {
                            o = (ooq.g = new oku(ooq.f));
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ooq.f;
            }
            case 4: {
                return new okt(ooq.f);
            }
            case 3: {
                return new ooq();
            }
            case 2: {
                return oky.F(ooq.f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u1001\u0000\u0003\u1004\u0001\u0005\u1009\u0002", new Object[] { "a", "b", oop.class, "c", "d", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
