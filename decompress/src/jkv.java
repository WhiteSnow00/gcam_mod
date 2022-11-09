// 
// Decompiled by Procyon v0.6.0
// 

public final class jkv extends oky implements omk
{
    public static final jkv a;
    private static volatile omp b;
    
    static {
        oky.G(jkv.class, a = new jkv());
    }
    
    private jkv() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = jkv.b) == null) {
                    synchronized (jkv.class) {
                        if (jkv.b == null) {
                            o = (jkv.b = new oku(jkv.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return jkv.a;
            }
            case 4: {
                return new okt(jkv.a);
            }
            case 3: {
                return new jkv();
            }
            case 2: {
                return oky.F(jkv.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
