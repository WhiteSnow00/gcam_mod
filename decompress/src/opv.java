// 
// Decompiled by Procyon v0.6.0
// 

public final class opv extends oky implements omk
{
    public static final opv i;
    private static volatile omp k;
    public int a;
    public float b;
    public ome c;
    public opo d;
    public float e;
    public float f;
    public float g;
    public float h;
    private ome j;
    
    static {
        oky.G(opv.class, i = new opv());
    }
    
    private opv() {
        this.c = ome.a;
        this.j = ome.a;
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp k;
                if ((k = opv.k) == null) {
                    synchronized (opv.class) {
                        if (opv.k == null) {
                            o = (opv.k = new oku(opv.i));
                        }
                    }
                }
                return k;
            }
            case 5: {
                return opv.i;
            }
            case 4: {
                return new okt(opv.i);
            }
            case 3: {
                return new opv();
            }
            case 2: {
                return oky.F(opv.i, "\u0001\b\u0000\u0001\u0002\u000f\b\u0002\u0000\u0000\u0002\u1001\u0002\b2\t\u1009\u0007\n2\f\u1001\b\r\u1001\t\u000e\u1001\n\u000f\u1001\u000b", new Object[] { "a", "b", "c", opr.a, "d", "j", opt.a, "e", "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final boolean i(final String s) {
        return this.c.containsKey(s);
    }
}
