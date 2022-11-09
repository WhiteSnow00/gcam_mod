// 
// Decompiled by Procyon v0.6.0
// 

public final class occ extends oky implements omk
{
    public static final occ f;
    private static volatile omp h;
    public int a;
    public String b;
    public String c;
    public long d;
    public olj e;
    private byte g;
    
    static {
        oky.G(occ.class, f = new occ());
    }
    
    private occ() {
        this.g = 2;
        this.b = "";
        this.c = "";
        this.e = oms.b;
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
                if ((h = occ.h) == null) {
                    synchronized (occ.class) {
                        if (occ.h == null) {
                            o = (occ.h = new oku(occ.f));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return occ.f;
            }
            case 4: {
                return new okt(occ.f);
            }
            case 3: {
                return new occ();
            }
            case 2: {
                return oky.F(occ.f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u1508\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u0431", new Object[] { "a", "b", "c", "d", "e", ocb.class });
            }
            case 0: {
                return this.g;
            }
        }
    }
}
