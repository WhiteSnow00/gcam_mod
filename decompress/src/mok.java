// 
// Decompiled by Procyon v0.6.0
// 

public final class mok extends oky implements omk
{
    public static final mok i;
    private static volatile omp j;
    public int a;
    public String b;
    public ojw c;
    public String d;
    public olj e;
    public olj f;
    public boolean g;
    public long h;
    
    static {
        oky.G(mok.class, i = new mok());
    }
    
    private mok() {
        this.b = "";
        this.c = ojw.b;
        this.d = "";
        this.e = oms.b;
        this.f = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = mok.j) == null) {
                    synchronized (mok.class) {
                        if (mok.j == null) {
                            o = (mok.j = new oku(mok.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return mok.i;
            }
            case 4: {
                return new okt(mok.i);
            }
            case 3: {
                return new mok();
            }
            case 2: {
                return oky.F(mok.i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001\u1008\u0002\u0002\u1008\u0000\u0003\u100a\u0001\u0004\u001b\u0005\u001a\b\u1007\u0003\t\u1002\u0004", new Object[] { "a", "d", "b", "c", "e", mol.class, "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
