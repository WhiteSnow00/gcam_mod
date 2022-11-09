// 
// Decompiled by Procyon v0.6.0
// 

public final class opq extends oky implements omk
{
    public static final opq k;
    private static volatile omp l;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    
    static {
        oky.G(opq.class, k = new opq());
    }
    
    private opq() {
        final okr b = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp l;
                if ((l = opq.l) == null) {
                    synchronized (opq.class) {
                        if (opq.l == null) {
                            o = (opq.l = new oku(opq.k));
                        }
                    }
                }
                return l;
            }
            case 5: {
                return opq.k;
            }
            case 4: {
                return new okt(opq.k);
            }
            case 3: {
                return new opq();
            }
            case 2: {
                return oky.F(opq.k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001\u100c\u0000\u0004\u1002\u0004\u0005\u1002\u0005\u0006\u1002\u0006\u0007\u1002\u0007\b\u1002\b\t\u1002\t\n\u1002\n\u0010\u1004\u0002", new Object[] { "a", "b", opp.a, "d", "e", "f", "g", "h", "i", "j", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
