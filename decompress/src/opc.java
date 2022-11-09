// 
// Decompiled by Procyon v0.6.0
// 

public final class opc extends okw implements omk
{
    public static final opc l;
    private static volatile omp n;
    public int a;
    public opa b;
    public olj c;
    public float d;
    public float e;
    public float g;
    public float h;
    public olj i;
    public long j;
    public long k;
    private byte m;
    
    static {
        oky.G(opc.class, l = new opc());
    }
    
    private opc() {
        this.m = 2;
        this.c = oms.b;
        this.i = oms.b;
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
                if ((n3 = opc.n) == null) {
                    synchronized (opc.class) {
                        if (opc.n == null) {
                            o = (opc.n = new oku(opc.l));
                        }
                    }
                }
                return n3;
            }
            case 5: {
                return opc.l;
            }
            case 4: {
                return new okv(opc.l);
            }
            case 3: {
                return new opc();
            }
            case 2: {
                return oky.F(opc.l, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u1001\u0001\u0004\u1001\u0002\u0005\u1001\u0003\u0006\u1001\u0004\b\u001b\t\u1003\u0007\f\u1003\u0006", new Object[] { "a", "b", "c", opb.class, "d", "e", "g", "h", "i", ooz.class, "k", "j" });
            }
            case 0: {
                return this.m;
            }
        }
    }
}
