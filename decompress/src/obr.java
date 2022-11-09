// 
// Decompiled by Procyon v0.6.0
// 

public final class obr extends oky implements omk
{
    public static final obr k;
    private static volatile omp l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    
    static {
        oky.G(obr.class, k = new obr());
    }
    
    private obr() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp l;
                if ((l = obr.l) == null) {
                    synchronized (obr.class) {
                        if (obr.l == null) {
                            o = (obr.l = new oku(obr.k));
                        }
                    }
                }
                return l;
            }
            case 5: {
                return obr.k;
            }
            case 4: {
                return new okt(obr.k);
            }
            case 3: {
                return new obr();
            }
            case 2: {
                return oky.F(obr.k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1004\b", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
