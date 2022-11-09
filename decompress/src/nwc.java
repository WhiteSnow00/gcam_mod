// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nwc
{
    private static final char[] a;
    
    static {
        a = "0123456789abcdef".toCharArray();
    }
    
    public static nwc e(final byte[] array) {
        return new nwb(array);
    }
    
    public static nwc f(final String s) {
        final int length = s.length();
        final boolean b = true;
        int i = 0;
        njo.i(length >= 2, "input string (%s) must have at least 2 characters", s);
        njo.i(s.length() % 2 == 0 && b, "input string (%s) must have an even number of characters", s);
        final byte[] array = new byte[s.length() / 2];
        while (i < s.length()) {
            array[i / 2] = (byte)((g(s.charAt(i)) << 4) + g(s.charAt(i + 1)));
            i += 2;
        }
        return e(array);
    }
    
    private static int g(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        final StringBuilder sb = new StringBuilder(32);
        sb.append("Illegal hexadecimal character: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public abstract int a();
    
    public abstract int b();
    
    public abstract boolean c(final nwc p0);
    
    public byte[] d() {
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nwc) {
            final nwc nwc = (nwc)o;
            if (this.b() == nwc.b() && this.c(nwc)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.b() >= 32) {
            return this.a();
        }
        final byte[] d = this.d();
        int n = d[0] & 0xFF;
        for (int i = 1; i < d.length; ++i) {
            n |= (d[i] & 0xFF) << i * 8;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final byte[] d = this.d();
        final int length = d.length;
        final StringBuilder sb = new StringBuilder(length + length);
        for (final byte b : d) {
            final char[] a = nwc.a;
            sb.append(a[b >> 4 & 0xF]);
            sb.append(a[b & 0xF]);
        }
        return sb.toString();
    }
}
