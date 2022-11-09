// 
// Decompiled by Procyon v0.6.0
// 

public final class pro extends okw implements omk
{
    public static final pro h;
    private static volatile omp j;
    public int a;
    public prn b;
    public pry c;
    public int d;
    public prm e;
    public String g;
    private byte i;
    
    static {
        oky.G(pro.class, h = new pro());
    }
    
    private pro() {
        this.i = 2;
        this.g = "";
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
                this.i = (byte)n;
                return null;
            }
            case 6: {
                final omp j;
                if ((j = pro.j) == null) {
                    synchronized (pro.class) {
                        if (pro.j == null) {
                            o = (pro.j = new oku(pro.h));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return pro.h;
            }
            case 4: {
                return new okv(pro.h);
            }
            case 3: {
                return new pro();
            }
            case 2: {
                return oky.F(pro.h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1009\u0003\u0005\u1008\u0004", new Object[] { "a", "b", "c", "d", opp.h, "e", "g" });
            }
            case 0: {
                return this.i;
            }
        }
    }
}
