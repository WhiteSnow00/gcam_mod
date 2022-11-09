import android.util.Log;
import java.util.concurrent.Executor;
import java.util.Random;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mei implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public mei(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public mei(final pii c, final pii a, final pii b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public mei(final pii b, final pii c, final pii a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public mei(final pii a, final pii b, final pii c, final int d, final char[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public mei(final pii a, final pii b, final pii c, final int d, final float[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public mei(final pii c, final pii b, final pii a, final int d, final int[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public mei(final pii b, final pii c, final pii a, final int d, final short[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public mei(final pii c, final pii b, final pii a, final int d, final boolean[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public mei(final pii a, final pii b, final pii c, final int d, final byte[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public mei(final pii a, final pii b, final pii c, final int d, final char[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public mei(final pii c, final pii b, final pii a, final int d, final float[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public mei(final pii b, final pii c, final pii a, final int d, final int[][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public mei(final pii a, final pii b, final pii c, final int d, final short[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public mei(final pii b, final pii c, final pii a, final int d, final boolean[][] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
}
