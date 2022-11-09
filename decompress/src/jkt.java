// 
// Decompiled by Procyon v0.6.0
// 

public final class jkt extends oky implements omk
{
    public static final jkt c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(jkt.class, c = new jkt());
    }
    
    private jkt() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = jkt.d) == null) {
                    synchronized (jkt.class) {
                        if (jkt.d == null) {
                            o = (jkt.d = new oku(jkt.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jkt.c;
            }
            case 4: {
                return new okt(jkt.c);
            }
            case 3: {
                return new jkt();
            }
            case 2: {
                return oky.F(jkt.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
