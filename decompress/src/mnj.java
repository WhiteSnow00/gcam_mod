// 
// Decompiled by Procyon v0.6.0
// 

public final class mnj extends oky implements omk
{
    public static final mnj j;
    private static volatile omp l;
    public int a;
    public prj b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public String h;
    public prk i;
    private byte k;
    
    static {
        oky.G(mnj.class, j = new mnj());
    }
    
    private mnj() {
        this.k = 2;
        this.h = "";
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
                this.k = (byte)n;
                return null;
            }
            case 6: {
                final omp l;
                if ((l = mnj.l) == null) {
                    synchronized (mnj.class) {
                        if (mnj.l == null) {
                            o = (mnj.l = new oku(mnj.j));
                        }
                    }
                }
                return l;
            }
            case 5: {
                return mnj.j;
            }
            case 4: {
                return new okt(mnj.j);
            }
            case 3: {
                return new mnj();
            }
            case 2: {
                return oky.F(mnj.j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1005\u0004\u0006\u1004\u0005\u0007\u1008\u0006\t\u1409\b", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 0: {
                return this.k;
            }
        }
    }
}
