import java.util.Set;
import android.hardware.camera2.CaptureRequest;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings$Global;
import android.os.HandlerThread;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyg implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public kyg(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public kyg(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public kyg(final pii b, final pii a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final char[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final float[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final int[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final short[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final boolean[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final byte[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final char[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final float[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final int[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final short[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public kyg(final pii b, final pii a, final int c, final boolean[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
}
