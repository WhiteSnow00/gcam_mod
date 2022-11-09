// 
// Decompiled by Procyon v0.6.0
// 

public final class psj extends oky implements omk
{
    public static final psj k;
    private static volatile omp l;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public olj j;
    
    static {
        oky.G(psj.class, k = new psj());
    }
    
    private psj() {
        this.j = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp l;
                if ((l = psj.l) == null) {
                    synchronized (psj.class) {
                        if (psj.l == null) {
                            o = (psj.l = new oku(psj.k));
                        }
                    }
                }
                return l;
            }
            case 5: {
                return psj.k;
            }
            case 4: {
                return new okt(psj.k);
            }
            case 3: {
                return new psj();
            }
            case 2: {
                return oky.F(psj.k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1002\u0007\n\u001b", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", psi.class });
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final void i() {
        final olj j = this.j;
        if (!j.c()) {
            this.j = oky.C(j);
        }
    }
}
