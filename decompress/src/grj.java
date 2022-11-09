import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.List;
import com.google.android.apps.camera.logging.InstrumentationCameraEventLogger;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.camera.stats.Instrumentation;
import android.util.DisplayMetrics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grj implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final /* synthetic */ int e;
    
    public grj(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public grj(final pii a, final pii d, final pii b, final pii c, final int e) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public grj(final pii d, final pii b, final pii a, final pii c, final int e, final byte[] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public grj(final pii a, final pii b, final pii c, final pii d, final int e, final char[] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public grj(final pii d, final pii a, final pii c, final pii b, final int e, final float[] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public grj(final pii c, final pii d, final pii b, final pii a, final int e, final int[] array) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public grj(final pii c, final pii d, final pii b, final pii a, final int e, final short[] array) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public grj(final pii d, final pii b, final pii c, final pii a, final int e, final boolean[] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public grj(final pii d, final pii b, final pii a, final pii c, final int e, final byte[][] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public grj(final pii d, final pii c, final pii a, final pii b, final int e, final char[][] array) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public grj(final pii c, final pii a, final pii d, final pii b, final int e, final float[][] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public grj(final pii a, final pii c, final pii d, final pii b, final int e, final int[][] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public grj(final pii c, final pii d, final pii a, final pii b, final int e, final short[][] array) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public grj(final pii a, final pii b, final pii d, final pii c, final int e, final boolean[][] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public grj(final pii d, final pii b, final pii c, final pii a, final int e, final byte[][][] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public grj(final pii d, final pii a, final pii c, final pii b, final int e, final char[][][] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public grj(final pii d, final pii b, final pii a, final pii c, final int e, final float[][][] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public grj(final pii a, final pii b, final pii d, final pii c, final int e, final int[][][] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public grj(final pii c, final pii d, final pii b, final pii a, final int e, final short[][][] array) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public grj(final pii d, final pii a, final pii b, final pii c, final int e, final boolean[][][] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static grj a(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4);
    }
    
    public static grj b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 2, (byte[])null);
    }
    
    public static grj c(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 3, (char[])null);
    }
    
    public static grj d(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 4, (short[])null);
    }
    
    public static grj e(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 5, (int[])null);
    }
    
    public static grj f(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 6, (boolean[])null);
    }
    
    public static grj g(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 7, (float[])null);
    }
    
    public static grj h(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 8, (byte[][])null);
    }
    
    public static grj i(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 10, (char[][])null);
    }
    
    public static grj j(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new grj(pii, pii2, pii3, pii4, 20, (float[][][])null);
    }
}
