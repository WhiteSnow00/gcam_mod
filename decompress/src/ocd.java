// 
// Decompiled by Procyon v0.6.0
// 

public final class ocd extends oky implements omk
{
    public static final ocd d;
    private static volatile omp f;
    public int a;
    public occ b;
    public olj c;
    private byte e;
    
    static {
        oky.G(ocd.class, d = new ocd());
    }
    
    private ocd() {
        this.e = 2;
        this.c = oms.b;
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
                this.e = (byte)n;
                return null;
            }
            case 6: {
                final omp f;
                if ((f = ocd.f) == null) {
                    synchronized (ocd.class) {
                        if (ocd.f == null) {
                            o = (ocd.f = new oku(ocd.d));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ocd.d;
            }
            case 4: {
                return new okt(ocd.d);
            }
            case 3: {
                return new ocd();
            }
            case 2: {
                return oky.F(ocd.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u1509\u0000\u0002\u041b", new Object[] { "a", "b", "c", occ.class });
            }
            case 0: {
                return this.e;
            }
        }
    }
    
    public final void b() {
        final olj c = this.c;
        if (!c.c()) {
            this.c = oky.C(c);
        }
    }
}
