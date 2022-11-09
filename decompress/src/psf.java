// 
// Decompiled by Procyon v0.6.0
// 

public final class psf extends oky implements omk
{
    public static final psf e;
    private static volatile omp f;
    public int a;
    public int b;
    public int c;
    public int d;
    
    static {
        oky.G(psf.class, e = new psf());
    }
    
    private psf() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = psf.f) == null) {
                    synchronized (psf.class) {
                        if (psf.f == null) {
                            o = (psf.f = new oku(psf.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return psf.e;
            }
            case 4: {
                return new okt(psf.e);
            }
            case 3: {
                return new psf();
            }
            case 2: {
                return oky.F(psf.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
