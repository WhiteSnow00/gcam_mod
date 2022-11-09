// 
// Decompiled by Procyon v0.6.0
// 

public final class jlc extends oky implements omk
{
    public static final jlc c;
    private static volatile omp d;
    public int a;
    public boolean b;
    
    static {
        oky.G(jlc.class, c = new jlc());
    }
    
    private jlc() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = jlc.d) == null) {
                    synchronized (jlc.class) {
                        if (jlc.d == null) {
                            o = (jlc.d = new oku(jlc.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return jlc.c;
            }
            case 4: {
                return new okt(jlc.c);
            }
            case 3: {
                return new jlc();
            }
            case 2: {
                return oky.F(jlc.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
