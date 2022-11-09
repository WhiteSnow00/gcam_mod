import java.util.Arrays;
import java.math.RoundingMode;

// 
// Decompiled by Procyon v0.6.0
// 

public class nwo extends nwp
{
    public final nwk b;
    public final Character c;
    public transient nwp d;
    
    public nwo(final String s, final String s2, final Character c) {
        this(new nwk(s, s2.toCharArray()), c);
    }
    
    public nwo(final nwk b, final Character c) {
        this.b = b;
        boolean b2 = true;
        if (c != null) {
            if (b.c(c)) {
                b2 = false;
            }
        }
        njo.i(b2, "Padding character %s was already in alphabet", c);
        this.c = c;
    }
    
    @Override
    public int a(final byte[] array, CharSequence e) {
        array.getClass();
        e = this.e(e);
        final nwk b = this.b;
        if (b.g[e.length() % b.e]) {
            int i = 0;
            int n = 0;
            while (i < e.length()) {
                long n2 = 0L;
                int n3 = 0;
                int n4 = 0;
                nwk b2;
                while (true) {
                    b2 = this.b;
                    if (n3 >= b2.e) {
                        break;
                    }
                    n2 <<= b2.d;
                    if (i + n3 < e.length()) {
                        n2 |= this.b.b(e.charAt(n4 + i));
                        ++n4;
                    }
                    ++n3;
                }
                for (int f = b2.f, d = b2.d, j = (f - 1) * 8; j >= f * 8 - n4 * d; j -= 8, ++n) {
                    array[n] = (byte)(n2 >>> j & 0xFFL);
                }
                i += this.b.e;
            }
            return n;
        }
        final int length = e.length();
        final StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new nwm(sb.toString());
    }
    
    @Override
    public void b(final Appendable appendable, final byte[] array, final int n) {
        appendable.getClass();
        njo.n(0, n, array.length);
        for (int i = 0; i < n; i += this.b.f) {
            final int min = Math.min(this.b.f, n - i);
            appendable.getClass();
            njo.n(i, i + min, array.length);
            njo.d(min <= this.b.f);
            long n2 = 0L;
            for (int j = 0; j < min; ++j) {
                n2 = (n2 | (long)(array[i + j] & 0xFF)) << 8;
            }
            final int d = this.b.d;
            int k;
            for (k = 0; k < min * 8; k += this.b.d) {
                final nwk b = this.b;
                appendable.append(b.a(b.c & (int)(n2 >>> (min + 1) * 8 - d - k)));
            }
            if (this.c != null) {
                while (k < this.b.f * 8) {
                    appendable.append(this.c);
                    k += this.b.d;
                }
            }
        }
    }
    
    @Override
    public final int c(final int n) {
        return (int)((this.b.d * (long)n + 7L) / 8L);
    }
    
    @Override
    public final int d(final int n) {
        final nwk b = this.b;
        return b.e * och.n(n, b.f, RoundingMode.CEILING);
    }
    
    @Override
    public final CharSequence e(final CharSequence charSequence) {
        charSequence.getClass();
        final Character c = this.c;
        if (c == null) {
            return charSequence;
        }
        char charValue;
        int n;
        for (charValue = c, n = charSequence.length() - 1; n >= 0 && charSequence.charAt(n) == charValue; --n) {}
        return charSequence.subSequence(0, n + 1);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nwo) {
            final nwo nwo = (nwo)o;
            if (this.b.equals(nwo.b) && nqb.E(this.c, nwo.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ Arrays.hashCode(new Object[] { this.c });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b.a);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            }
            else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }
}
