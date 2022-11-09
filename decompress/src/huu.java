import android.content.Context;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huu implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public huu(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public huu(final pii b, final pii a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public huu(final pii a, final pii b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public huu(final pii a, final pii b, final int c, final char[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public huu(final pii a, final pii b, final int c, final float[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public huu(final pii a, final pii b, final int c, final int[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public huu(final pii a, final pii b, final int c, final short[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public huu(final pii a, final pii b, final int c, final boolean[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public huu(final pii a, final pii b, final int c, final byte[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static huu a(final pii pii, final pii pii2) {
        return new huu(pii, pii2, 15);
    }
}
