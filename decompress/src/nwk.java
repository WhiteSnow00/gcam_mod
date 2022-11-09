import java.util.Arrays;
import java.math.RoundingMode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nwk
{
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final boolean[] g;
    private final byte[] h;
    
    public nwk(String concat, final char[] array) {
        concat.getClass();
        this.a = concat;
        array.getClass();
        this.b = array;
        try {
            final int length = array.length;
            final int o = och.o(length, RoundingMode.UNNECESSARY);
            this.d = o;
            final int min = Math.min(8, Integer.lowestOneBit(o));
            try {
                this.e = 8 / min;
                this.f = o / min;
                this.c = length - 1;
                final byte[] h = new byte[128];
                Arrays.fill(h, (byte)(-1));
                final int n = 0;
                int n2 = 0;
                while (true) {
                    final int length2 = array.length;
                    final boolean b = true;
                    if (n2 >= length2) {
                        break;
                    }
                    final char c = array[n2];
                    njo.f(c < '\u0080', "Non-ASCII character: %s", c);
                    njo.f(h[c] == -1 && b, "Duplicate character: %s", c);
                    h[c] = (byte)n2;
                    ++n2;
                }
                this.h = h;
                final boolean[] g = new boolean[this.e];
                for (int i = n; i < this.f; ++i) {
                    g[och.n(i * 8, this.d, RoundingMode.CEILING)] = true;
                }
                this.g = g;
            }
            catch (final ArithmeticException ex) {
                concat = new String(array);
                if (concat.length() != 0) {
                    concat = "Illegal alphabet ".concat(concat);
                }
                else {
                    concat = new String("Illegal alphabet ");
                }
                throw new IllegalArgumentException(concat, ex);
            }
        }
        catch (final ArithmeticException ex2) {
            final int length3 = array.length;
            final StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length3);
            throw new IllegalArgumentException(sb.toString(), ex2);
        }
    }
    
    final char a(final int n) {
        return this.b[n];
    }
    
    final int b(final char c) {
        if (c > '\u007f') {
            final String value = String.valueOf(Integer.toHexString(c));
            String concat;
            if (value.length() != 0) {
                concat = "Unrecognized character: 0x".concat(value);
            }
            else {
                concat = new String("Unrecognized character: 0x");
            }
            throw new nwm(concat);
        }
        final byte b = this.h[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != '\u007f') {
            final StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c);
            throw new nwm(sb.toString());
        }
        final String value2 = String.valueOf(Integer.toHexString(c));
        String concat2;
        if (value2.length() != 0) {
            concat2 = "Unrecognized character: 0x".concat(value2);
        }
        else {
            concat2 = new String("Unrecognized character: 0x");
        }
        throw new nwm(concat2);
    }
    
    public final boolean c(final char c) {
        return c < '\u0080' && this.h[c] != -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof nwk && Arrays.equals(this.b, ((nwk)o).b);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
