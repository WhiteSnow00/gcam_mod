// 
// Decompiled by Procyon v0.6.0
// 

public final class ocb extends oky implements omk
{
    public static final ocb f;
    private static volatile omp h;
    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    private byte g;
    
    static {
        oky.G(ocb.class, f = new ocb());
    }
    
    private ocb() {
        this.g = 2;
        this.b = "";
        this.c = "";
        this.d = "";
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
                this.g = (byte)n;
                return null;
            }
            case 6: {
                final omp h;
                if ((h = ocb.h) == null) {
                    synchronized (ocb.class) {
                        if (ocb.h == null) {
                            o = (ocb.h = new oku(ocb.f));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ocb.f;
            }
            case 4: {
                return new okt(ocb.f);
            }
            case 3: {
                return new ocb();
            }
            case 2: {
                return oky.F(ocb.f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005\u1508\u0000\u0006\u1508\u0001\u0007\u1008\u0002\b\u1504\u0003", new Object[] { "a", "b", "c", "d", "e" });
            }
            case 0: {
                return this.g;
            }
        }
    }
}
