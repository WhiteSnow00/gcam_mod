// 
// Decompiled by Procyon v0.6.0
// 

public final class ota extends oky implements omk
{
    public static final ota d;
    private static volatile omp e;
    public int a;
    public String b;
    public nxg c;
    
    static {
        oky.G(ota.class, d = new ota());
    }
    
    private ota() {
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
                if ((e = ota.e) == null) {
                    synchronized (ota.class) {
                        if (ota.e == null) {
                            o = (ota.e = new oku(ota.d));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ota.d;
            }
            case 4: {
                return new okt(ota.d);
            }
            case 3: {
                return new ota();
            }
            case 2: {
                return oky.F(ota.d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "a", "b", "c" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
