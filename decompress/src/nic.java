// 
// Decompiled by Procyon v0.6.0
// 

public final class nic extends oky implements omk
{
    public static final nic h;
    private static volatile omp i;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public ole f;
    public float g;
    
    static {
        oky.G(nic.class, h = new nic());
    }
    
    private nic() {
        this.f = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = nic.i) == null) {
                    synchronized (nic.class) {
                        if (nic.i == null) {
                            o = (nic.i = new oku(nic.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return nic.h;
            }
            case 4: {
                return new okt(nic.h);
            }
            case 3: {
                return new nic();
            }
            case 2: {
                return oky.F(nic.h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u000f\u0002\u0007\u0003\u000b\u0004\f\u0005\u0007\u0006$\u0007\u0001", new Object[] { "a", "b", "c", "d", "e", "f", "g" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
