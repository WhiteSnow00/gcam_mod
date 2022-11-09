// 
// Decompiled by Procyon v0.6.0
// 

public final class obx extends oky implements omk
{
    public static final obx d;
    private static volatile omp e;
    public int a;
    public int b;
    public long c;
    
    static {
        oky.G(obx.class, d = new obx());
    }
    
    private obx() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp e;
                if ((e = obx.e) == null) {
                    synchronized (obx.class) {
                        if (obx.e == null) {
                            o = (obx.e = new oku(obx.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return obx.d;
            }
            case 4: {
                return new okt(obx.d);
            }
            case 3: {
                return new obx();
            }
            case 2: {
                return oky.F(obx.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "a", "b", obh.l, "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
