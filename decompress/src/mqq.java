// 
// Decompiled by Procyon v0.6.0
// 

public final class mqq extends oky implements omk
{
    public static final mqq e;
    private static volatile omp f;
    public int a;
    public int b;
    public Object c;
    public String d;
    
    static {
        oky.G(mqq.class, e = new mqq());
    }
    
    private mqq() {
        this.b = 0;
        this.d = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = mqq.f) == null) {
                    synchronized (mqq.class) {
                        if (mqq.f == null) {
                            o = (mqq.f = new oku(mqq.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return mqq.e;
            }
            case 4: {
                return new okt(mqq.e);
            }
            case 3: {
                return new mqq();
            }
            case 2: {
                return oky.F(mqq.e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1035\u0000\u0003\u103a\u0000\u0004\u1033\u0000\u0005\u103b\u0000\u0006\u103d\u0000", new Object[] { "c", "b", "a", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
