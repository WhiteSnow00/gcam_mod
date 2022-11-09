// 
// Decompiled by Procyon v0.6.0
// 

public final class lqo extends okw implements omk
{
    public static final lqo e;
    private static volatile omp h;
    public int a;
    public lqn b;
    public lqm c;
    public lql d;
    private byte g;
    
    static {
        oky.G(lqo.class, e = new lqo());
    }
    
    private lqo() {
        this.g = 2;
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
                this.g = (byte)n;
                return null;
            }
            case 6: {
                final omp h;
                if ((h = lqo.h) == null) {
                    synchronized (lqo.class) {
                        if (lqo.h == null) {
                            o = (lqo.h = new oku(lqo.e));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return lqo.e;
            }
            case 4: {
                return new okv(lqo.e);
            }
            case 3: {
                return new lqo();
            }
            case 2: {
                return oky.F(lqo.e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1009\u0002", new Object[] { "a", "b", "c", "d" });
            }
            case 0: {
                return this.g;
            }
        }
    }
}
