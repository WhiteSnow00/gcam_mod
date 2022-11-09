// 
// Decompiled by Procyon v0.6.0
// 

public final class psl extends oky implements omk
{
    public static final psl a;
    private static volatile omp e;
    private int b;
    private psc c;
    private byte d;
    
    static {
        oky.G(psl.class, a = new psl());
    }
    
    private psl() {
        this.d = 2;
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
                this.d = (byte)n;
                return null;
            }
            case 6: {
                final omp e;
                if ((e = psl.e) == null) {
                    synchronized (psl.class) {
                        if (psl.e == null) {
                            o = (psl.e = new oku(psl.a));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return psl.a;
            }
            case 4: {
                return new okt(psl.a);
            }
            case 3: {
                return new psl();
            }
            case 2: {
                return oky.F(psl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 0: {
                return this.d;
            }
        }
    }
}
