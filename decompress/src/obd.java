// 
// Decompiled by Procyon v0.6.0
// 

public final class obd extends oky implements omk
{
    public static final obd d;
    private static volatile omp e;
    public int a;
    public long b;
    public olj c;
    
    static {
        oky.G(obd.class, d = new obd());
    }
    
    private obd() {
        this.c = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = obd.e) == null) {
                    synchronized (obd.class) {
                        if (obd.e == null) {
                            o = (obd.e = new oku(obd.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return obd.d;
            }
            case 4: {
                return new okt(obd.d);
            }
            case 3: {
                return new obd();
            }
            case 2: {
                return oky.F(obd.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u001b", new Object[] { "a", "b", "c", oba.class });
            }
            case 0: {
                return 1;
            }
        }
    }
}
