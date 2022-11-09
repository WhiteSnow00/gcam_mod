// 
// Decompiled by Procyon v0.6.0
// 

public final class oas extends oky implements omk
{
    public static final oas A;
    private static volatile omp B;
    public int a;
    public oar b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;
    
    static {
        oky.G(oas.class, A = new oas());
    }
    
    private oas() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = oas.B) == null) {
                    synchronized (oas.class) {
                        if (oas.B == null) {
                            o = (oas.B = new oku(oas.A));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return oas.A;
            }
            case 4: {
                return new okt(oas.A);
            }
            case 3: {
                return new oas();
            }
            case 2: {
                return oky.F(oas.A, "\u0001\u0019\u0000\u0001\u0001 \u0019\u0000\u0000\u0000\u0001\u1009\u0000\b\u1001\u0001\t\u1001\u0002\n\u1001\u0003\u000b\u1001\u0004\f\u1001\u0005\r\u1001\u0006\u000e\u1001\u0007\u000f\u1001\b\u0010\u1001\t\u0011\u1001\n\u0012\u1001\u000b\u0013\u1001\f\u0014\u1001\r\u0015\u1001\u000e\u0017\u1001\u0010\u0018\u1001\u0011\u0019\u1001\u0012\u001a\u1001\u0013\u001b\u1001\u0014\u001c\u1001\u0015\u001d\u1001\u0016\u001e\u1001\u0018\u001f\u1001\u000f \u1001\u0017", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "w", "x", "z", "q", "y" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
