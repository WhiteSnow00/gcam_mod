// 
// Decompiled by Procyon v0.6.0
// 

public final class nzc extends oky implements omk
{
    public static final nzc l;
    private static volatile omp m;
    public int a;
    public int b;
    public int c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public int i;
    public nxj j;
    public long k;
    
    static {
        oky.G(nzc.class, l = new nzc());
    }
    
    private nzc() {
        this.d = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp m;
                if ((m = nzc.m) == null) {
                    synchronized (nzc.class) {
                        if (nzc.m == null) {
                            o = (nzc.m = new oku(nzc.l));
                        }
                    }
                }
                return m;
            }
            case 5: {
                return nzc.l;
            }
            case 4: {
                return new okt(nzc.l);
            }
            case 3: {
                return new nzc();
            }
            case 2: {
                return oky.F(nzc.l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0000\u0001\u100c\u0000\u0006\u100c\u0005\u0007\u1008\u0006\b\u1007\u0007\t\u1007\b\n\u1007\t\u000b\u1002\n\f\u100c\u000b\r\u1009\f\u000e\u1003\r", new Object[] { "a", "b", nxw.s, "c", oah.d, "d", "e", "f", "g", "h", "i", nxw.t, "j", "k" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
