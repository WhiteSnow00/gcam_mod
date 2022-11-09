import android.media.AudioManager;
import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkd implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final /* synthetic */ int e;
    
    public bkd(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public bkd(final pii d, final pii a, final pii c, final pii b, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public bkd(final pii d, final pii b, final pii a, final pii c, final int e, final byte[] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public bkd(final pii a, final pii c, final pii b, final pii d, final int e, final byte[] array, final byte[] array2) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public bkd(final pii d, final pii a, final pii b, final pii c, final int e, final char[] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bkd(final pii b, final pii d, final pii a, final pii c, final int e, final float[] array) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public bkd(final pii c, final pii b, final pii d, final pii a, final int e, final int[] array) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public bkd(final pii a, final pii d, final pii c, final pii b, final int e, final short[] array) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public bkd(final pii d, final pii c, final pii a, final pii b, final int e, final boolean[] array) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bkd(final pii c, final pii b, final pii a, final pii d, final int e, final byte[][] array) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public bkd(final pii d, final pii c, final pii a, final pii b, final int e, final char[][] array) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bkd(final pii c, final pii a, final pii d, final pii b, final int e, final float[][] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public bkd(final pii c, final pii d, final pii b, final pii a, final int e, final int[][] array) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public bkd(final pii b, final pii d, final pii a, final pii c, final int e, final short[][] array) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public bkd(final pii a, final pii b, final pii d, final pii c, final int e, final boolean[][] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public bkd(final pii a, final pii c, final pii b, final pii d, final int e, final byte[][][] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public bkd(final pii c, final pii b, final pii a, final pii d, final int e, final char[][][] array) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public bkd(final pii b, final pii d, final pii a, final pii c, final int e, final float[][][] array) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public bkd(final pii b, final pii a, final pii c, final pii d, final int e, final int[][][] array) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public bkd(final pii b, final pii a, final pii d, final pii c, final int e, final short[][][] array) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public bkd(final pii b, final pii a, final pii d, final pii c, final int e, final boolean[][][] array) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
}
