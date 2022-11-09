// 
// Decompiled by Procyon v0.6.0
// 

public final class mpk extends oky implements omk
{
    public static final mpk g;
    private static volatile omp i;
    public String a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;
    
    static {
        oky.G(mpk.class, g = new mpk());
    }
    
    private mpk() {
        this.a = "";
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = mpk.i) == null) {
                    synchronized (mpk.class) {
                        if (mpk.i == null) {
                            o = (mpk.i = new oku(mpk.g));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return mpk.g;
            }
            case 4: {
                return new okt(mpk.g);
            }
            case 3: {
                return new mpk();
            }
            case 2: {
                return oky.F(mpk.g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0004\u100c\u0002\u0005\u1007\u0003\u0006\u1007\u0005\u0007\u1007\u0004", new Object[] { "h", "a", "b", "c", obh.m, "d", "f", "e" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
