// 
// Decompiled by Procyon v0.6.0
// 

public final class jld extends okw implements omk
{
    public static final jld b;
    private static volatile omp e;
    public int a;
    private int c;
    private byte d;
    
    static {
        oky.G(jld.class, b = new jld());
    }
    
    private jld() {
        this.d = 2;
        this.a = 1;
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
                if ((e = jld.e) == null) {
                    synchronized (jld.class) {
                        if (jld.e == null) {
                            o = (jld.e = new oku(jld.b));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return jld.b;
            }
            case 4: {
                return new okv(jld.b);
            }
            case 3: {
                return new jld();
            }
            case 2: {
                return oky.F(jld.b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "a", lpx.b });
            }
            case 0: {
                return this.d;
            }
        }
    }
}
