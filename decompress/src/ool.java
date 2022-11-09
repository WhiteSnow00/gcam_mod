// 
// Decompiled by Procyon v0.6.0
// 

public final class ool extends oky implements omk
{
    public static final ool r;
    private static volatile omp s;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public olj m;
    public ole n;
    public float o;
    public float p;
    public float q;
    
    static {
        oky.G(ool.class, r = new ool());
    }
    
    private ool() {
        this.m = oms.b;
        this.n = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp s;
                if ((s = ool.s) == null) {
                    synchronized (ool.class) {
                        if (ool.s == null) {
                            o = (ool.s = new oku(ool.r));
                        }
                    }
                }
                return s;
            }
            case 5: {
                return ool.r;
            }
            case 4: {
                return new okt(ool.r);
            }
            case 3: {
                return new ool();
            }
            case 2: {
                return oky.F(ool.r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1001\u0006\b\u1001\u0007\t\u1001\b\n\u1001\t\u000b\u1001\n\f\u001b\r$\u000e\u1001\u000b\u000f\u1001\f\u0010\u1001\r", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", oos.class, "n", "o", "p", "q" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
