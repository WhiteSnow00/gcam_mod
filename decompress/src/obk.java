// 
// Decompiled by Procyon v0.6.0
// 

public final class obk extends oky implements omk
{
    public static final obk d;
    private static volatile omp e;
    public int a;
    public int b;
    public int c;
    
    static {
        oky.G(obk.class, d = new obk());
    }
    
    private obk() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = obk.e) == null) {
                    synchronized (obk.class) {
                        if (obk.e == null) {
                            o = (obk.e = new oku(obk.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return obk.d;
            }
            case 4: {
                return new okt(obk.d);
            }
            case 3: {
                return new obk();
            }
            case 2: {
                return oky.F(obk.d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "a", "b", obh.d, "c", obh.d });
            }
            case 0: {
                return 1;
            }
        }
    }
}
