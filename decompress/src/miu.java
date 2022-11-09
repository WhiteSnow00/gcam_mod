// 
// Decompiled by Procyon v0.6.0
// 

public final class miu extends oky implements omk
{
    public static final miu c;
    private static volatile omp e;
    public int a;
    public String b;
    private int d;
    
    static {
        oky.G(miu.class, c = new miu());
    }
    
    private miu() {
        this.b = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = miu.e) == null) {
                    synchronized (miu.class) {
                        if (miu.e == null) {
                            o = (miu.e = new oku(miu.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return miu.c;
            }
            case 4: {
                return new okt(miu.c);
            }
            case 3: {
                return new miu();
            }
            case 2: {
                return oky.F(miu.c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "d", "a", lpx.g, "b" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
