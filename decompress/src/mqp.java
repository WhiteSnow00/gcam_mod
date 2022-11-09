// 
// Decompiled by Procyon v0.6.0
// 

public final class mqp extends oky implements omk
{
    public static final mqp h;
    private static volatile omp i;
    public int a;
    public String b;
    public ojw c;
    public String d;
    public long e;
    public long f;
    public olj g;
    
    static {
        oky.G(mqp.class, h = new mqp());
    }
    
    private mqp() {
        this.b = "";
        this.c = ojw.b;
        this.d = "";
        this.g = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp i;
                if ((i = mqp.i) == null) {
                    synchronized (mqp.class) {
                        if (mqp.i == null) {
                            o = (mqp.i = new oku(mqp.h));
                        }
                    }
                }
                return i;
            }
            case 5: {
                return mqp.h;
            }
            case 4: {
                return new okt(mqp.h);
            }
            case 3: {
                return new mqp();
            }
            case 2: {
                return oky.F(mqp.h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u001b\u0006\u1002\u0004", new Object[] { "a", "b", "c", "d", "e", "g", mqq.class, "f" });
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final void b() {
        final olj g = this.g;
        if (!g.c()) {
            this.g = oky.C(g);
        }
    }
}
