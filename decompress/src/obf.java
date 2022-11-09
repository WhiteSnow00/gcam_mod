// 
// Decompiled by Procyon v0.6.0
// 

public final class obf extends oky implements omk
{
    public static final obf ad;
    private static volatile omp ae;
    public float A;
    public float B;
    public float C;
    public float D;
    public int E;
    public float F;
    public float G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public int M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public float X;
    public int Y;
    public int Z;
    public int a;
    public int aa;
    public int ab;
    public int ac;
    public int b;
    public int c;
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
        oky.G(obf.class, ad = new obf());
    }
    
    private obf() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp ae;
                if ((ae = obf.ae) == null) {
                    synchronized (obf.class) {
                        if (obf.ae == null) {
                            o = (obf.ae = new oku(obf.ad));
                        }
                    }
                }
                return ae;
            }
            case 5: {
                return obf.ad;
            }
            case 4: {
                return new okt(obf.ad);
            }
            case 3: {
                return new obf();
            }
            case 2: {
                return oky.F(obf.ad, "\u00015\u0000\u0002\u000165\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1001\u0006\b\u1001\u0007\t\u1001\b\n\u1001\t\u000b\u1001\n\f\u1001\u000b\r\u1001\f\u000e\u1001\r\u000f\u1001\u000e\u0010\u1001\u000f\u0011\u1001\u0010\u0012\u1001\u0011\u0013\u1001\u0012\u0014\u1001\u0013\u0015\u1001\u0014\u0016\u1001\u0015\u0017\u1001\u0016\u0018\u1001\u0017\u0019\u1001\u0018\u001a\u1001\u0019\u001b\u1001\u001a\u001c\u1001\u001b\u001d\u1001\u001c\u001e\u1004\u001d\u001f\u1001\u001e \u1001\u001f!\u1004 \"\u1001!#\u1001\"$\u1001#%\u1001$&\u1004%'\u1001&(\u1001')\u1001(*\u1001)+\u1001*,\u100c+-\u1004,.\u1004-/\u100c.0\u1001/1\u100102\u100413\u100424\u100435\u100446\u10045", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", oah.t, "T", "U", "V", oah.s, "W", "X", "Y", "Z", "aa", "ab", "ac" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
