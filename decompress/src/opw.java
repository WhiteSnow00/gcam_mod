// 
// Decompiled by Procyon v0.6.0
// 

public final class opw extends oky implements omk
{
    public static final opw l;
    private static volatile omp n;
    public int a;
    public long b;
    public long c;
    public opq d;
    public opd e;
    public boolean f;
    public boolean g;
    public opx h;
    public opv i;
    public float j;
    public oqe k;
    private byte m;
    
    static {
        oky.G(opw.class, l = new opw());
    }
    
    private opw() {
        this.m = 2;
        this.g = true;
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(int n, Object o) {
        final int n2 = 1;
        switch (n - 1) {
            default: {
                n = n2;
                if (o == null) {
                    n = 0;
                }
                this.m = (byte)n;
                return null;
            }
            case 6: {
                final omp n3;
                if ((n3 = opw.n) == null) {
                    synchronized (opw.class) {
                        if (opw.n == null) {
                            o = (opw.n = new oku(opw.l));
                        }
                    }
                }
                return n3;
            }
            case 5: {
                return opw.l;
            }
            case 4: {
                return new okt(opw.l);
            }
            case 3: {
                return new opw();
            }
            case 2: {
                return oky.F(opw.l, "\u0001\n\u0000\u0001\u0001\u0016\n\u0000\u0000\u0001\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1009\u0005\u0004\u1409\u0006\u0005\u1001\u0010\u0006\u1009\u000e\u0007\u1009\u000f\u000b\u1007\t\u0015\u1009\u0015\u0016\u1007\u000b", new Object[] { "a", "b", "c", "d", "e", "j", "h", "i", "f", "k", "g" });
            }
            case 0: {
                return this.m;
            }
        }
    }
}
