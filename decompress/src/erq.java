import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import android.os.Build;
import android.os.Build$VERSION;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class erq implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public erq(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public erq(final pii a, final pii b, final pii c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public erq(final pii b, final pii a, final pii c, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public erq(final pii c, final pii b, final pii a, final int d, final char[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public erq(final pii c, final pii b, final pii a, final int d, final float[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public erq(final pii c, final pii b, final pii a, final int d, final int[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public erq(final pii b, final pii c, final pii a, final int d, final short[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public erq(final pii c, final pii b, final pii a, final int d, final boolean[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public erq(final pii b, final pii c, final pii a, final int d, final byte[][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public erq(final pii c, final pii b, final pii a, final int d, final char[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public erq(final pii a, final pii c, final pii b, final int d, final float[][] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public erq(final pii c, final pii b, final pii a, final int d, final int[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public erq(final pii b, final pii a, final pii c, final int d, final short[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public erq(final pii a, final pii c, final pii b, final int d, final boolean[][] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public erq(final pii c, final pii b, final pii a, final int d, final byte[][][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public erq(final pii a, final pii c, final pii b, final int d, final char[][][] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public static erq a(final pii pii, final pii pii2, final pii pii3) {
        return new erq(pii, pii2, pii3, 5, (int[])null);
    }
    
    public static erq b(final pii pii, final pii pii2, final pii pii3) {
        return new erq(pii, pii2, pii3, 8);
    }
    
    public static erq c(final pii pii, final pii pii2, final pii pii3) {
        return new erq(pii, pii2, pii3, 9, (byte[][])null);
    }
    
    public static erq d(final pii pii, final pii pii2, final pii pii3) {
        return new erq(pii, pii2, pii3, 10);
    }
    
    public static erq e(final pii pii, final pii pii2, final pii pii3) {
        return new erq(pii, pii2, pii3, 11, (char[][])null);
    }
    
    public static erq f(final pii pii, final pii pii2, final pii pii3) {
        return new erq(pii, pii2, pii3, 17, (boolean[][])null);
    }
    
    public static erq g(final pii pii, final pii pii2, final pii pii3) {
        return new erq(pii, pii2, pii3, 18, (float[][])null);
    }
    
    public static erq h(final pii pii, final pii pii2, final pii pii3) {
        return new erq(pii, pii2, pii3, 19, (byte[][][])null);
    }
}
