// 
// Decompiled by Procyon v0.6.0
// 

public final class ogf extends oky implements omk
{
    public static final ogf c;
    private static volatile omp e;
    public float a;
    public int b;
    private int d;
    
    static {
        oky.G(ogf.class, c = new ogf());
    }
    
    private ogf() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = ogf.e) == null) {
                    synchronized (ogf.class) {
                        if (ogf.e == null) {
                            o = (ogf.e = new oku(ogf.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ogf.c;
            }
            case 4: {
                return new okt(ogf.c);
            }
            case 3: {
                return new ogf();
            }
            case 2: {
                return oky.F(ogf.c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u100c\u0001", new Object[] { "d", "a", "b", obh.n });
            }
            case 0: {
                return 1;
            }
        }
    }
}
