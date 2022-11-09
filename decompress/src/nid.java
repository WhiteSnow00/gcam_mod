// 
// Decompiled by Procyon v0.6.0
// 

public final class nid extends oky implements omk
{
    public static final nid k;
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
        oky.G(nid.class, k = new nid());
    }
    
    private nid() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp l;
                if ((l = nid.l) == null) {
                    synchronized (nid.class) {
                        if (nid.l == null) {
                            o = (nid.l = new oku(nid.k));
                        }
                    }
                }
                return l;
            }
            case 5: {
                return nid.k;
            }
            case 4: {
                return new okt(nid.k);
            }
            case 3: {
                return new nid();
            }
            case 2: {
                return oky.F(nid.k, "\u0000\n\u0000\u0000\u0002\r\n\u0000\u0000\u0000\u0002\u000b\u0004\u000b\u0005\u000b\u0006\u000f\b\u000f\t\u000f\n\u000b\u000b\u000b\f\u000b\r\u000b", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
