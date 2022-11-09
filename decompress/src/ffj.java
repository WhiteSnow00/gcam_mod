import android.media.MediaFormat;
import android.content.Context;
import android.util.DisplayMetrics;
import android.app.ActivityManager;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffj implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final /* synthetic */ int f;
    
    public ffj(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public ffj(final pii d, final pii b, final pii a, final pii e, final pii c, final int f) {
        this.f = f;
        this.d = d;
        this.b = b;
        this.a = a;
        this.e = e;
        this.c = c;
    }
    
    public ffj(final pii b, final pii a, final pii d, final pii c, final pii e, final int f, final byte[] array) {
        this.f = f;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    public ffj(final pii a, final pii d, final pii c, final pii b, final pii e, final int f, final byte[] array, final byte[] array2) {
        this.f = f;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
        this.e = e;
    }
    
    public ffj(final pii b, final pii e, final pii a, final pii c, final pii d, final int f, final char[] array) {
        this.f = f;
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public ffj(final pii c, final pii e, final pii b, final pii a, final pii d, final int f, final float[] array) {
        this.f = f;
        this.c = c;
        this.e = e;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public ffj(final pii d, final pii e, final pii a, final pii c, final pii b, final int f, final int[] array) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ffj(final pii a, final pii d, final pii c, final pii b, final pii e, final int f, final short[] array) {
        this.f = f;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
        this.e = e;
    }
    
    public ffj(final pii c, final pii b, final pii a, final pii e, final pii d, final int f, final boolean[] array) {
        this.f = f;
        this.c = c;
        this.b = b;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public ffj(final pii b, final pii a, final pii d, final pii c, final pii e, final int f, final byte[][] array) {
        this.f = f;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    public ffj(final pii e, final pii a, final pii b, final pii d, final pii c, final int f, final char[][] array) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public ffj(final pii b, final pii a, final pii d, final pii c, final pii e, final int f, final float[][] array) {
        this.f = f;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    public ffj(final pii c, final pii a, final pii d, final pii b, final pii e, final int f, final int[][] array) {
        this.f = f;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public ffj(final pii b, final pii d, final pii a, final pii e, final pii c, final int f, final short[][] array) {
        this.f = f;
        this.b = b;
        this.d = d;
        this.a = a;
        this.e = e;
        this.c = c;
    }
    
    public ffj(final pii c, final pii d, final pii b, final pii e, final pii a, final int f, final boolean[][] array) {
        this.f = f;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.a = a;
    }
    
    public ffj(final pii c, final pii b, final pii d, final pii e, final pii a, final int f, final byte[][][] array) {
        this.f = f;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public ffj(final pii a, final pii c, final pii b, final pii d, final pii e, final int f, final char[][][] array) {
        this.f = f;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public ffj(final pii d, final pii a, final pii e, final pii c, final pii b, final int f, final float[][][] array) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
        this.c = c;
        this.b = b;
    }
    
    public ffj(final pii a, final pii e, final pii b, final pii d, final pii c, final int f, final int[][][] array) {
        this.f = f;
        this.a = a;
        this.e = e;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public ffj(final pii e, final pii a, final pii d, final pii b, final pii c, final int f, final short[][][] array) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public ffj(final pii d, final pii b, final pii a, final pii c, final pii e, final int f, final boolean[][][] array) {
        this.f = f;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
        this.e = e;
    }
    
    public static ffj a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5);
    }
    
    public static ffj b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5, 2, (byte[])null);
    }
    
    public static ffj c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5, 5, (int[])null);
    }
    
    public static ffj d(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new ffj(pii, pii2, pii4, pii5, pii6, 6, (boolean[])null);
    }
    
    public static ffj e(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5, 7, (float[])null);
    }
    
    public static ffj f(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5, 9, (char[][])null);
    }
    
    public static ffj g(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5, 10, (short[][])null);
    }
    
    public static ffj h(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5, 12, (boolean[][])null);
    }
    
    public static ffj i(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5, 15, (char[][][])null);
    }
    
    public static ffj j(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new ffj(pii, pii2, pii3, pii4, pii5, 16, (short[][][])null);
    }
}
