// 
// Decompiled by Procyon v0.6.0
// 

public final class prs extends oky implements omk
{
    public static final prs f;
    private static volatile omp h;
    public int a;
    public long b;
    public int c;
    public olj d;
    public prw e;
    private byte g;
    
    static {
        oky.G(prs.class, f = new prs());
    }
    
    private prs() {
        this.g = 2;
        this.d = oms.b;
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
                if ((h = prs.h) == null) {
                    synchronized (prs.class) {
                        if (prs.h == null) {
                            o = (prs.h = new oku(prs.f));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return prs.f;
            }
            case 4: {
                return new okt(prs.f);
            }
            case 3: {
                return new prs();
            }
            case 2: {
                return oky.F(prs.f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001\u1005\u0000\u0002\u041b\u0003\u100c\u0001\u0006\u1009\u0004", new Object[] { "a", "b", "d", prt.class, "c", opp.j, "e" });
            }
            case 0: {
                return this.g;
            }
        }
    }
}
