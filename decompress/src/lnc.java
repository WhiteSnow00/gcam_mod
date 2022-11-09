// 
// Decompiled by Procyon v0.6.0
// 

public final class lnc
{
    private static final char[] a;
    
    static {
        a = "0123456789ABCDEF".toCharArray();
    }
    
    public static String a(final byte[] array) {
        final int length = array.length;
        final char[] array2 = new char[length + length];
        for (int i = 0; i < array.length; ++i) {
            final byte b = array[i];
            final char[] a = lnc.a;
            final char c = a[b >> 4 & 0xF];
            final char c2 = a[b & 0xF];
            final int n = i + i;
            array2[n] = c;
            array2[n + 1] = c2;
        }
        return new String(array2);
    }
}
