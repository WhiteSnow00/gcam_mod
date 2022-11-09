// 
// Decompiled by Procyon v0.6.0
// 

public final class mqx extends oky implements omk
{
    public static final mqx p;
    private static volatile omp s;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public olj f;
    public ola g;
    public String h;
    public String i;
    public String j;
    public olj k;
    public String l;
    public String m;
    public String n;
    public int o;
    private int q;
    private byte r;
    
    static {
        oky.G(mqx.class, p = new mqx());
    }
    
    private mqx() {
        this.r = 2;
        this.a = "";
        this.b = "";
        this.c = "";
        this.e = "";
        this.f = oms.b;
        this.g = ojo.b;
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = oms.b;
        this.l = "";
        this.m = "";
        this.n = "";
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
                this.r = (byte)n;
                return null;
            }
            case 6: {
                final omp s;
                if ((s = mqx.s) == null) {
                    synchronized (mqx.class) {
                        if (mqx.s == null) {
                            o = (mqx.s = new oku(mqx.p));
                        }
                    }
                }
                return s;
            }
            case 5: {
                return mqx.p;
            }
            case 4: {
                return new okt(mqx.p);
            }
            case 3: {
                return new mqx();
            }
            case 2: {
                return oky.F(mqx.p, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0003\b\u0001\u1508\u0000\u0002\u1508\u0001\u0003\u1508\u0002\u0004\u1507\u0003\u0005\u1508\u0004\u0006\u001a\u0007\u0019\b\u1508\u0005\t\u1508\u0006\n\u1508\u0007\u000b\u001a\f\u1008\b\r\u1008\t\u000e\u1008\n\u000f\u100c\u000b", new Object[] { "q", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", lpx.h });
            }
            case 0: {
                return this.r;
            }
        }
    }
}
