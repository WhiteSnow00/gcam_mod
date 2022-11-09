// 
// Decompiled by Procyon v0.6.0
// 

final class ut
{
    private static final int[][] b;
    
    static {
        b = new int[][] { { 169, 169 }, { 8252, 8252 }, { 8265, 8265 }, { 8482, 8482 }, { 8505, 8505 }, { 8596, 8618 }, { 8986, 9000 }, { 9167, 9210 }, { 9410, 9410 }, { 9642, 10175 }, { 10548, 10549 }, { 11013, 11093 }, { 12336, 12336 }, { 12349, 12349 }, { 12951, 12953 }, { 126980, 126980 }, { 127183, 127183 }, { 127344, 127569 }, { 127744, 128758 }, { 129296, 129472 } };
    }
    
    static boolean a(final int n) {
        final int[][] b = ut.b;
        for (int i = 0; i < 20; ++i) {
            final int[] array = b[i];
            if (n >= array[0] && n <= array[1]) {
                return true;
            }
        }
        return false;
    }
}
