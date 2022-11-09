// 
// Decompiled by Procyon v0.6.0
// 

public final class api
{
    private static byte[] a;
    private static byte[] b;
    
    static {
        api.a = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        api.b = new byte[255];
        final int n = 0;
        for (int i = 0; i < 255; ++i) {
            api.b[i] = -1;
        }
        int n2 = n;
        while (true) {
            final byte[] a = api.a;
            final int length = a.length;
            if (n2 >= 64) {
                break;
            }
            api.b[a[n2]] = (byte)n2;
            ++n2;
        }
        final byte[] b = api.b;
        b[9] = -2;
        b[10] = -2;
        b[13] = -2;
        b[32] = -2;
        b[61] = -3;
    }
    
    public static final byte[] a(byte[] array) {
        final byte[] array2 = new byte[(array.length + 2) / 3 * 4];
        int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n + 3 > length) {
                break;
            }
            final int n3 = n + 1;
            final int n4 = n3 + 1;
            final int n5 = (array[n] & 0xFF) << 16 | (array[n3] & 0xFF) << 8 | (array[n4] & 0xFF);
            final int n6 = n2 + 1;
            final byte[] a = api.a;
            array2[n2] = a[n5 >> 18];
            final int n7 = n6 + 1;
            array2[n6] = a[n5 >> 12 & 0x3F];
            final int n8 = n7 + 1;
            array2[n7] = a[(n5 & 0xFC0) >> 6];
            n2 = n8 + 1;
            array2[n8] = a[n5 & 0x3F];
            n = n4 + 1;
        }
        final int n9 = length - n;
        if (n9 == 2) {
            final int n10 = (array[n + 1] & 0xFF) << 8 | (array[n] & 0xFF) << 16;
            final int n11 = n2 + 1;
            array = api.a;
            array2[n2] = array[n10 >> 18];
            final int n12 = n11 + 1;
            array2[n11] = array[n10 >> 12 & 0x3F];
            array2[n12] = array[(n10 & 0xFC0) >> 6];
            array2[n12 + 1] = 61;
        }
        else if (n9 == 1) {
            final int n13 = (array[n] & 0xFF) << 16;
            final int n14 = n2 + 1;
            array = api.a;
            array2[n2] = array[n13 >> 18];
            final int n15 = n14 + 1;
            array2[n14] = array[n13 >> 12 & 0x3F];
            array2[n15] = 61;
            array2[n15 + 1] = 61;
        }
        return array2;
    }
}
