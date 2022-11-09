// 
// Decompiled by Procyon v0.6.0
// 

public final class ojk extends oky implements omk
{
    public static final ojk c;
    private static volatile omp d;
    public String a;
    public ojw b;
    
    static {
        oky.G(ojk.class, c = new ojk());
    }
    
    private ojk() {
        this.a = "";
        this.b = ojw.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = ojk.d) == null) {
                    synchronized (ojk.class) {
                        if (ojk.d == null) {
                            o = (ojk.d = new oku(ojk.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ojk.c;
            }
            case 4: {
                return new okt(ojk.c);
            }
            case 3: {
                return new ojk();
            }
            case 2: {
                return oky.F(ojk.c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\n", new Object[] { "a", "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
