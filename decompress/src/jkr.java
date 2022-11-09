// 
// Decompiled by Procyon v0.6.0
// 

public final class jkr extends okw implements omk
{
    public static final jkr c;
    private static volatile omp e;
    public int a;
    public int b;
    private byte d;
    
    static {
        oky.G(jkr.class, c = new jkr());
    }
    
    private jkr() {
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
                if ((e = jkr.e) == null) {
                    synchronized (jkr.class) {
                        if (jkr.e == null) {
                            o = (jkr.e = new oku(jkr.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return jkr.c;
            }
            case 4: {
                return new okv(jkr.c);
            }
            case 3: {
                return new jkr();
            }
            case 2: {
                return oky.F(jkr.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "a", "b", jkq.a });
            }
            case 0: {
                return this.d;
            }
        }
    }
}
