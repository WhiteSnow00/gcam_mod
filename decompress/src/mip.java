import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mip
{
    public static final int[] a;
    public static final int[] b;
    public static final int c;
    public final lmy d;
    public final long e;
    public final int[] f;
    public final int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    
    static {
        a = new int[] { 0, 4, 8, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 150, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
        final int[] array;
        final int[] b2 = array = new int[51];
        array[0] = -200;
        array[1] = -150;
        array[2] = -100;
        array[3] = -90;
        array[4] = -80;
        array[5] = -70;
        array[6] = -60;
        array[7] = -50;
        array[8] = -40;
        array[9] = -30;
        array[10] = -25;
        array[11] = -20;
        array[12] = -18;
        array[13] = -16;
        array[14] = -14;
        array[15] = -12;
        array[16] = -10;
        array[17] = -8;
        array[18] = -6;
        array[19] = -4;
        array[20] = -2;
        array[21] = 0;
        array[22] = 2;
        array[23] = 4;
        array[24] = 6;
        array[25] = 8;
        array[26] = 10;
        array[27] = 12;
        array[28] = 14;
        array[29] = 16;
        array[30] = 18;
        array[31] = 20;
        array[32] = 25;
        array[33] = 30;
        array[34] = 40;
        array[35] = 50;
        array[36] = 60;
        array[37] = 70;
        array[38] = 80;
        array[39] = 90;
        array[40] = 100;
        array[41] = 150;
        array[42] = 200;
        array[43] = 300;
        array[44] = 400;
        array[45] = 500;
        array[46] = 600;
        array[47] = 700;
        array[48] = 800;
        array[49] = 900;
        array[50] = 1000;
        b = b2;
        c = Arrays.binarySearch(b2, 0);
    }
    
    public mip(final lmy d) {
        this.f = new int[28];
        this.g = new int[51];
        this.p = Integer.MIN_VALUE;
        this.d = d;
        this.e = d.b();
    }
}
