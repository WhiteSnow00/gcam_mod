// 
// Decompiled by Procyon v0.6.0
// 

public final class prk extends okw implements omk
{
    public static final prk a;
    private static volatile omp c;
    private byte b;
    
    static {
        oky.G(prk.class, a = new prk());
    }
    
    private prk() {
        this.b = 2;
    }
    
    @Override
    protected final Object a(int n, Object o) {
        switch (n - 1) {
            default: {
                if (o == null) {
                    n = 0;
                }
                else {
                    n = 1;
                }
                this.b = (byte)n;
                return null;
            }
            case 6: {
                final omp c;
                if ((c = prk.c) == null) {
                    synchronized (prk.class) {
                        if (prk.c == null) {
                            o = (prk.c = new oku(prk.a));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return prk.a;
            }
            case 4: {
                return new okv(prk.a);
            }
            case 3: {
                return new prk();
            }
            case 2: {
                return oky.F(prk.a, "\u0001\u0000", null);
            }
            case 0: {
                return this.b;
            }
        }
    }
}
