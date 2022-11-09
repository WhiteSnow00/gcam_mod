import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ied implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public ied(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ied(final pii a, final pii c, final pii b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ied(final pii b, final pii c, final pii a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public ied(final pii b, final pii a, final pii c, final int d, final char[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ied(final pii a, final pii b, final pii c, final int d, final float[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ied(final pii b, final pii a, final pii c, final int d, final int[] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ied(final pii a, final pii b, final pii c, final int d, final short[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ied(final pii a, final pii b, final pii c, final int d, final boolean[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ied(final pii c, final pii b, final pii a, final int d, final byte[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ied(final pii a, final pii b, final pii c, final int d, final char[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ied(final pii b, final pii a, final pii c, final int d, final float[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ied(final pii a, final pii b, final pii c, final int d, final int[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ied(final pii b, final pii a, final pii c, final int d, final short[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ied(final pii c, final pii a, final pii b, final int d, final boolean[][] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ied(final pii c, final pii b, final pii a, final int d, final byte[][][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ied(final pii b, final pii c, final pii a, final int d, final char[][][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public ied(final pii c, final pii b, final pii a, final int d, final int[][][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ied(final pii a, final pii b, final pii c, final int d, final short[][][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ied(final pii c, final pii a, final pii b, final int d, final boolean[][][] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static ied a(final pii pii, final pii pii2, final pii pii3) {
        return new ied(pii, pii2, pii3, 3, (char[])null);
    }
    
    public static ied b(final pii pii, final pii pii2, final pii pii3) {
        return new ied(pii, pii2, pii3, 4);
    }
    
    public static ied c(final pii pii, final pii pii2, final pii pii3) {
        return new ied(pii, pii2, pii3, 15, (float[][])null);
    }
}
