// 
// Decompiled by Procyon v0.6.0
// 

public final class nie extends oky implements omk
{
    public static final nie o;
    private static volatile omp p;
    public float a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    
    static {
        oky.G(nie.class, o = new nie());
    }
    
    private nie() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp p2;
                if ((p2 = nie.p) == null) {
                    synchronized (nie.class) {
                        if (nie.p == null) {
                            o = (nie.p = new oku(nie.o));
                        }
                    }
                }
                return p2;
            }
            case 5: {
                return nie.o;
            }
            case 4: {
                return new okt(nie.o);
            }
            case 3: {
                return new nie();
            }
            case 2: {
                return oky.F(nie.o, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0001\u0002\u000b\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0007\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u0001", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
