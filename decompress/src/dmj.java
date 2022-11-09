import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.app.Activity;
import java.util.regex.Pattern;
import java.util.ArrayList;
import android.hardware.SensorEventListener;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmj implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public dmj(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public dmj(final pii c, final pii a, final pii b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dmj(final pii b, final pii c, final pii a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public dmj(final pii b, final pii c, final pii a, final int d, final char[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public dmj(final pii b, final pii c, final pii a, final int d, final float[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public dmj(final pii b, final pii c, final pii a, final int d, final int[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public dmj(final pii b, final pii c, final pii a, final int d, final short[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public dmj(final pii a, final pii c, final pii b, final int d, final boolean[] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public dmj(final pii a, final pii c, final pii b, final int d, final byte[][] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public dmj(final pii a, final pii c, final pii b, final int d, final char[][] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public dmj(final pii c, final pii b, final pii a, final int d, final float[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public dmj(final pii c, final pii b, final pii a, final int d, final int[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public dmj(final pii b, final pii a, final pii c, final int d, final short[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public dmj(final pii b, final pii a, final pii c, final int d, final boolean[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public static dmj a(final pii pii, final pii pii2, final pii pii3) {
        return new dmj(pii, pii2, pii3, 6, (boolean[])null);
    }
    
    public static dmj b(final pii pii, final pii pii2, final pii pii3) {
        return new dmj(pii, pii2, pii3, 7);
    }
    
    public static dmj c(final pii pii, final pii pii2, final pii pii3) {
        return new dmj(pii, pii2, pii3, 8, (float[])null);
    }
    
    public static dmj d(final pii pii, final pii pii2, final pii pii3) {
        return new dmj(pii, pii2, pii3, 9, (byte[][])null);
    }
    
    public static dmj e(final pii pii, final pii pii2, final pii pii3) {
        return new dmj(pii, pii2, pii3, 15, (float[][])null);
    }
}
