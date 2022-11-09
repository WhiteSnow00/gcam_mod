import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class diw implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final /* synthetic */ int e;
    
    public diw(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public diw(final pii d, final pii c, final pii a, final pii b, final int e) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public diw(final pii c, final pii b, final pii a, final pii d, final int e, final byte[] array) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public diw(final pii c, final pii a, final pii b, final pii d, final int e, final byte[] array, final byte[] array2) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public diw(final pii c, final pii a, final pii b, final pii d, final int e, final char[] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public diw(final pii a, final pii d, final pii b, final pii c, final int e, final float[] array) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public diw(final pii d, final pii a, final pii c, final pii b, final int e, final int[] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public diw(final pii c, final pii d, final pii a, final pii b, final int e, final short[] array) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public diw(final pii d, final pii b, final pii a, final pii c, final int e, final boolean[] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public diw(final pii a, final pii d, final pii b, final pii c, final int e, final byte[][] array) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public diw(final pii a, final pii b, final pii c, final pii d, final int e, final char[][] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public diw(final pii a, final pii b, final pii d, final pii c, final int e, final float[][] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public diw(final pii c, final pii d, final pii b, final pii a, final int e, final int[][] array) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public diw(final pii c, final pii a, final pii d, final pii b, final int e, final short[][] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public diw(final pii a, final pii c, final pii b, final pii d, final int e, final boolean[][] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public diw(final pii a, final pii c, final pii b, final pii d, final int e, final byte[][][] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public diw(final pii a, final pii c, final pii d, final pii b, final int e, final char[][][] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public diw(final pii b, final pii a, final pii c, final pii d, final int e, final float[][][] array) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public diw(final pii b, final pii a, final pii d, final pii c, final int e, final int[][][] array) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public diw(final pii c, final pii b, final pii a, final pii d, final int e, final short[][][] array) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public diw(final pii a, final pii d, final pii b, final pii c, final int e, final boolean[][][] array) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public static diw a(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new diw(pii, pii2, pii3, pii4, 4, (short[])null);
    }
    
    public static diw b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new diw(pii, pii2, pii3, pii4, 5, (int[])null);
    }
    
    public static diw c(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new diw(pii, pii2, pii3, pii4, 6, (boolean[])null);
    }
    
    public static diw d(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new diw(pii, pii2, pii3, pii4, 7, (float[])null);
    }
    
    public static diw e(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new diw(pii, pii2, pii3, pii4, 8, (byte[][])null);
    }
    
    public static diw f(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new diw(pii, pii2, pii3, pii4, 9, (char[][])null);
    }
    
    public static diw g(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new diw(pii, pii2, pii3, pii4, 11, (int[][])null);
    }
    
    public static diw h(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new diw(pii, pii2, pii3, pii4, 13, (float[][])null);
    }
}
