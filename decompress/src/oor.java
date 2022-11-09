// 
// Decompiled by Procyon v0.6.0
// 

public final class oor extends oky implements omk
{
    public static final oor i;
    private static volatile omp j;
    public int a;
    public int b;
    public int c;
    public int d;
    public ojw e;
    public ojw f;
    public String g;
    public olf h;
    
    static {
        oky.G(oor.class, i = new oor());
    }
    
    private oor() {
        this.e = ojw.b;
        this.f = ojw.b;
        this.g = "";
        this.h = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = oor.j) == null) {
                    synchronized (oor.class) {
                        if (oor.j == null) {
                            o = (oor.j = new oku(oor.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return oor.i;
            }
            case 4: {
                return new okt(oor.i);
            }
            case 3: {
                return new oor();
            }
            case 2: {
                return oky.F(oor.i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u100a\u0003\u0005\u100a\u0004\u0006\u1008\u0005\u0007'", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
