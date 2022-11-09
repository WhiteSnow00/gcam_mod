import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class onu
{
    public static final pjv a;
    
    static {
        final boolean a2 = ons.a;
        a = new pjv();
    }
    
    static int a(final CharSequence charSequence, final byte[] array, int n, int i) {
        final int length = charSequence.length();
        final int n2 = i + n;
        int n3;
        char char1;
        for (i = 0; i < length; ++i) {
            n3 = i + n;
            if (n3 >= n2) {
                break;
            }
            char1 = charSequence.charAt(i);
            if (char1 >= '\u0080') {
                break;
            }
            array[n3] = (byte)char1;
        }
        if (i == length) {
            n += length;
        }
        else {
            n += i;
            while (i < length) {
                final char char2 = charSequence.charAt(i);
                Label_0401: {
                    if (char2 < '\u0080' && n < n2) {
                        array[n] = (byte)char2;
                        ++n;
                    }
                    else if (char2 < '\u0800' && n <= n2 - 2) {
                        final int n4 = n + 1;
                        array[n] = (byte)(char2 >>> 6 | 0x3C0);
                        n = n4 + 1;
                        array[n4] = (byte)((char2 & '?') | 0x80);
                    }
                    else if ((char2 < '\ud800' || char2 > '\udfff') && n <= n2 - 3) {
                        final int n5 = n + 1;
                        array[n] = (byte)(char2 >>> 12 | 0x1E0);
                        n = n5 + 1;
                        array[n5] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                        array[n] = (byte)((char2 & '?') | 0x80);
                        ++n;
                    }
                    else {
                        if (n <= n2 - 4) {
                            final int n6 = i + 1;
                            if (n6 != charSequence.length()) {
                                final char char3 = charSequence.charAt(n6);
                                if (Character.isSurrogatePair(char2, char3)) {
                                    i = Character.toCodePoint(char2, char3);
                                    final int n7 = n + 1;
                                    array[n] = (byte)(i >>> 18 | 0xF0);
                                    n = n7 + 1;
                                    array[n7] = (byte)((i >>> 12 & 0x3F) | 0x80);
                                    final int n8 = n + 1;
                                    array[n] = (byte)((i >>> 6 & 0x3F) | 0x80);
                                    n = n8 + 1;
                                    array[n8] = (byte)((i & 0x3F) | 0x80);
                                    i = n6;
                                    break Label_0401;
                                }
                                i = n6;
                            }
                            throw new ont(i - 1, length);
                        }
                        if (char2 >= '\ud800' && char2 <= '\udfff') {
                            final int n9 = i + 1;
                            if (n9 == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(n9))) {
                                throw new ont(i, length);
                            }
                        }
                        final StringBuilder sb = new StringBuilder(37);
                        sb.append("Failed writing ");
                        sb.append(char2);
                        sb.append(" at index ");
                        sb.append(n);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                }
                ++i;
            }
        }
        return n;
    }
    
    static int b(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        int i;
        for (i = 0; i < length && charSequence.charAt(i) < '\u0080'; ++i) {}
        int n2 = length;
        while (i < length) {
            final char char1 = charSequence.charAt(i);
            if (char1 >= '\u0800') {
                for (int length2 = charSequence.length(); i < length2; ++i) {
                    final char char2 = charSequence.charAt(i);
                    if (char2 < '\u0800') {
                        n += '\u007f' - char2 >>> 31;
                    }
                    else {
                        n += 2;
                        if (char2 >= '\ud800' && char2 <= '\udfff') {
                            if (Character.codePointAt(charSequence, i) < 65536) {
                                throw new ont(i, length2);
                            }
                            ++i;
                        }
                    }
                }
                n2 += n;
                break;
            }
            n2 += '\u007f' - char1 >>> 31;
            ++i;
        }
        if (n2 >= length) {
            return n2;
        }
        final StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(n2 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static int c(final int n, final int n2) {
        if (n <= -12 && n2 <= -65) {
            return n ^ n2 << 8;
        }
        return -1;
    }
    
    public static int d(final int n, final int n2, final int n3) {
        if (n <= -12 && n2 <= -65 && n3 <= -65) {
            return n ^ n2 << 8 ^ n3 << 16;
        }
        return -1;
    }
    
    public static int e(final byte[] array, final int n, final int n2) {
        final byte b = array[n - 1];
        switch (n2 - n) {
            default: {
                throw new AssertionError();
            }
            case 2: {
                return d(b, array[n], array[n + 1]);
            }
            case 1: {
                return c(b, array[n]);
            }
            case 0: {
                if (b > -12) {
                    return -1;
                }
                return b;
            }
        }
    }
    
    static String f(final ByteBuffer byteBuffer, final int n, final int n2) {
        String s;
        if (byteBuffer.hasArray()) {
            s = pjv.n(byteBuffer.array(), byteBuffer.arrayOffset() + n, n2);
        }
        else if (byteBuffer.isDirect()) {
            s = pjv.m(byteBuffer, n, n2);
        }
        else {
            s = pjv.m(byteBuffer, n, n2);
        }
        return s;
    }
    
    static String g(final byte[] array, final int n, final int n2) {
        return pjv.n(array, n, n2);
    }
    
    public static boolean h(final byte[] array, final int n, final int n2) {
        return pjv.p(array, n, n2);
    }
}
