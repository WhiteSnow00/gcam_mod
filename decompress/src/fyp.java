import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyp implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public fyp(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fyp(final pii a, final pii c, final pii b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public fyp(final pii b, final pii c, final pii a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public fyp(final pii b, final pii c, final pii a, final int d, final char[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public fyp(final pii b, final pii c, final pii a, final int d, final float[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public fyp(final pii b, final pii c, final pii a, final int d, final int[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public fyp(final pii b, final pii a, final pii c, final int d, final short[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public fyp(final pii a, final pii b, final pii c, final int d, final boolean[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fyp(final pii a, final pii b, final pii c, final int d, final byte[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fyp(final pii c, final pii b, final pii a, final int d, final char[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fyp(final pii b, final pii c, final pii a, final int d, final float[][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public fyp(final pii b, final pii a, final pii c, final int d, final int[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public fyp(final pii a, final pii b, final pii c, final int d, final short[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fyp(final pii a, final pii b, final pii c, final int d, final boolean[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fyp(final pii b, final pii a, final pii c, final int d, final byte[][][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public fyp(final pii b, final pii a, final pii c, final int d, final char[][][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public fyp(final pii a, final pii b, final pii c, final int d, final int[][][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fyp(final pii b, final pii a, final pii c, final int d, final short[][][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public static fyp a(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3);
    }
    
    public static fyp b(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 2, (byte[])null);
    }
    
    public static fyp c(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 3, (char[])null);
    }
    
    public static fyp d(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 4, (short[])null);
    }
    
    public static fyp e(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 5);
    }
    
    public static fyp f(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 6, (int[])null);
    }
    
    public static fyp g(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 9);
    }
    
    public static fyp h(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 10, (float[])null);
    }
    
    public static fyp i(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 11, (byte[][])null);
    }
    
    public static fyp j(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 12, (char[][])null);
    }
    
    public static fyp k(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 13, (short[][])null);
    }
    
    public static fyp l(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 16, (float[][])null);
    }
    
    public static fyp m(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 17, (byte[][][])null);
    }
    
    public static fyp n(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 18, (char[][][])null);
    }
    
    public static fyp o(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 19, (short[][][])null);
    }
    
    public static fyp p(final pii pii, final pii pii2, final pii pii3) {
        return new fyp(pii, pii2, pii3, 20, (int[][][])null);
    }
}
