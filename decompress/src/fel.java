import android.media.MediaFormat;
import java.util.concurrent.ExecutorService;
import java.util.HashSet;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.googlex.gcam.Gcam;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fel implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final /* synthetic */ int e;
    
    public fel(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public fel(final pii b, final pii c, final pii d, final pii a, final int e) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public fel(final pii d, final pii a, final pii b, final pii c, final int e, final byte[] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public fel(final pii b, final pii a, final pii c, final pii d, final int e, final byte[] array, final byte[] array2) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public fel(final pii c, final pii b, final pii d, final pii a, final int e, final char[] array) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public fel(final pii b, final pii d, final pii c, final pii a, final int e, final float[] array) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public fel(final pii c, final pii d, final pii a, final pii b, final int e, final int[] array) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public fel(final pii c, final pii b, final pii d, final pii a, final int e, final short[] array) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public fel(final pii a, final pii d, final pii c, final pii b, final int e, final boolean[] array) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public fel(final pii b, final pii c, final pii a, final pii d, final int e, final byte[][] array) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public fel(final pii c, final pii a, final pii d, final pii b, final int e, final char[][] array) {
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public fel(final pii a, final pii b, final pii d, final pii c, final int e, final float[][] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public fel(final pii b, final pii d, final pii a, final pii c, final int e, final int[][] array) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public fel(final pii d, final pii b, final pii a, final pii c, final int e, final short[][] array) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public fel(final pii d, final pii c, final pii a, final pii b, final int e, final boolean[][] array) {
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fel(final pii d, final pii a, final pii c, final pii b, final int e, final byte[][][] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public fel(final pii c, final pii b, final pii a, final pii d, final int e, final char[][][] array) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public fel(final pii b, final pii d, final pii a, final pii c, final int e, final float[][][] array) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public fel(final pii a, final pii c, final pii b, final pii d, final int e, final int[][][] array) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public fel(final pii b, final pii d, final pii a, final pii c, final int e, final short[][][] array) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public fel(final pii d, final pii a, final pii c, final pii b, final int e, final boolean[][][] array) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public static bsk a(final Executor executor, final Executor executor2, final pii pii, final pii pii2) {
        return new gdn(pii2, pii, executor2, executor);
    }
    
    public static fel b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 2, (byte[])null);
    }
    
    public static fel c(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 3, (char[])null);
    }
    
    public static fel d(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 4, (short[])null);
    }
    
    public static fel e(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 13, (float[][])null);
    }
    
    public static fel f(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 14, (byte[][][])null);
    }
    
    public static fel g(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 16, (short[][][])null);
    }
    
    public static fel h(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 17, (int[][][])null);
    }
    
    public static fel i(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 18, (boolean[][][])null);
    }
    
    public static fel j(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new fel(pii, pii2, pii3, pii4, 20, null, null);
    }
}
