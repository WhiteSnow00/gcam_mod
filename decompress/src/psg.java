// 
// Decompiled by Procyon v0.6.0
// 

public final class psg extends oky implements omk
{
    public static final psg o;
    private static volatile omp p;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public psk i;
    public olj j;
    public int k;
    public int l;
    public int m;
    public psk n;
    
    static {
        oky.G(psg.class, o = new psg());
    }
    
    private psg() {
        this.j = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp p2;
                if ((p2 = psg.p) == null) {
                    synchronized (psg.class) {
                        if (psg.p == null) {
                            o = (psg.p = new oku(psg.o));
                        }
                    }
                }
                return p2;
            }
            case 5: {
                return psg.o;
            }
            case 4: {
                return new okt(psg.o);
            }
            case 3: {
                return new psg();
            }
            case 2: {
                return oky.F(psg.o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0006\u0005\u001b\u0006\u1004\b\u0007\u1004\u0002\b\u1004\u0004\t\u1004\u0005\n\u1009\u0007\u000b\u1004\t\f\u1004\n\r\u1009\u000b", new Object[] { "a", "b", "c", "e", "h", "j", psf.class, "k", "d", "f", "g", "i", "l", "m", "n" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
