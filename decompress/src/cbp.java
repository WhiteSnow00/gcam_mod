import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbp implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public cbp(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public cbp(final pii c, final pii b, final pii a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public cbp(final pii b, final pii a, final pii c, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public cbp(final pii b, final pii a, final pii c, final int d, final char[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public cbp(final pii c, final pii a, final pii b, final int d, final float[] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cbp(final pii b, final pii a, final pii c, final int d, final int[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public cbp(final pii a, final pii c, final pii b, final int d, final short[] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public cbp(final pii b, final pii c, final pii a, final int d, final boolean[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public cbp(final pii b, final pii a, final pii c, final int d, final byte[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public cbp(final pii b, final pii c, final pii a, final int d, final char[][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public cbp(final pii c, final pii a, final pii b, final int d, final float[][] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cbp(final pii a, final pii c, final pii b, final int d, final int[][] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public cbp(final pii c, final pii a, final pii b, final int d, final short[][] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cbp(final pii c, final pii a, final pii b, final int d, final boolean[][] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cbp(final pii b, final pii c, final pii a, final int d, final byte[][][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public cbp(final pii a, final pii b, final pii c, final int d, final char[][][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public cbp(final pii b, final pii c, final pii a, final int d, final int[][][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public cbp(final pii c, final pii a, final pii b, final int d, final short[][][] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public cbp(final pii b, final pii a, final pii c, final int d, final boolean[][][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public static cbp a(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 4, (short[])null);
    }
    
    public static cbp b(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 5, (int[])null);
    }
    
    public static cbp c(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 13, (boolean[][])null);
    }
    
    public static cbp d(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 14, (float[][])null);
    }
    
    public static cbp e(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 15);
    }
    
    public static cbp f(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 16, (byte[][][])null);
    }
    
    public static cbp g(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 18, (short[][][])null);
    }
    
    public static cbp h(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 19, (int[][][])null);
    }
    
    public static cbp i(final pii pii, final pii pii2, final pii pii3) {
        return new cbp(pii, pii2, pii3, 20, (boolean[][][])null);
    }
}
