import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bji implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public bji(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bji(final pii a, final pii c, final pii b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public bji(final pii b, final pii c, final pii a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public bji(final pii c, final pii a, final pii b, final int d, final char[] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bji(final pii b, final pii c, final pii a, final int d, final float[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public bji(final pii a, final pii b, final pii c, final int d, final int[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bji(final pii a, final pii b, final pii c, final int d, final short[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bji(final pii c, final pii a, final pii b, final int d, final boolean[] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bji(final pii b, final pii c, final pii a, final int d, final byte[][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public bji(final pii b, final pii a, final pii c, final int d, final char[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public bji(final pii b, final pii c, final pii a, final int d, final float[][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public bji(final pii a, final pii b, final pii c, final int d, final int[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bji(final pii a, final pii b, final pii c, final int d, final short[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bji(final pii a, final pii b, final pii c, final int d, final boolean[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bji(final pii b, final pii a, final pii c, final int d, final byte[][][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public bji(final pii c, final pii b, final pii a, final int d, final char[][][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bji(final pii b, final pii c, final pii a, final int d, final int[][][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public bji(final pii c, final pii b, final pii a, final int d, final short[][][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bji(final pii b, final pii c, final pii a, final int d, final boolean[][][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public static bji a(final pii pii, final pii pii2, final pii pii3) {
        return new bji(pii, pii2, pii3);
    }
    
    public static bji b(final pii pii, final pii pii2, final pii pii3) {
        return new bji(pii, pii2, pii3, 12, (int[][])null);
    }
}
