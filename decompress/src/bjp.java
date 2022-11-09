import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.autotimer.analysis.jni.Curator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjp implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public bjp(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public bjp(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bjp(final pii b, final pii a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final char[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final float[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final int[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final short[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final boolean[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final byte[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final char[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final float[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final int[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final short[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public bjp(final pii b, final pii a, final int c, final boolean[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static bjp a(final pii pii, final pii pii2) {
        return new bjp(pii, pii2, 1);
    }
    
    public static bjp b(final pii pii, final pii pii2) {
        return new bjp(pii, pii2, 5, (short[])null);
    }
    
    public static bjp c(final pii pii, final pii pii2) {
        return new bjp(pii, pii2, 9, (boolean[])null);
    }
    
    public static bjp d(final pii pii, final pii pii2) {
        return new bjp(pii, pii2, 10, (float[])null);
    }
    
    public static bjp e(final pii pii, final pii pii2) {
        return new bjp(pii, pii2, 17);
    }
    
    public static bjp f(final pii pii, final pii pii2) {
        return new bjp(pii, pii2, 18, (float[][])null);
    }
    
    public static bjp g(final pii pii, final pii pii2) {
        return new bjp(pii, pii2, 19);
    }
}
