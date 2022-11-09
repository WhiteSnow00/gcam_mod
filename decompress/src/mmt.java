// 
// Decompiled by Procyon v0.6.0
// 

public final class mmt extends okw implements omk
{
    public static final mmt c;
    private static volatile omp e;
    public int a;
    public psp b;
    private byte d;
    
    static {
        oky.G(mmt.class, c = new mmt());
    }
    
    private mmt() {
        this.d = 2;
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
                this.d = (byte)n;
                return null;
            }
            case 6: {
                final omp e;
                if ((e = mmt.e) == null) {
                    synchronized (mmt.class) {
                        if (mmt.e == null) {
                            o = (mmt.e = new oku(mmt.c));
                        }
                    }
                }
                return e;
            }
            case 5: {
                return mmt.c;
            }
            case 4: {
                return new okv(mmt.c);
            }
            case 3: {
                return new mmt();
            }
            case 2: {
                return oky.F(mmt.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "a", "b" });
            }
            case 0: {
                return this.d;
            }
        }
    }
}
