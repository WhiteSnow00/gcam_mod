import android.hardware.camera2.CaptureRequest$Key;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import android.util.Range;
import java.util.ArrayList;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;
import java.util.EnumMap;
import java.util.Map;
import com.google.android.apps.camera.stats.ViewfinderJankSession;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyj implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public fyj(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii b, final pii a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fyj(final pii a, final pii b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final char[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final float[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final int[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final short[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final boolean[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final byte[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final char[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final float[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final int[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final short[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final boolean[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fyj(final pii a, final pii b, final int c, final byte[][][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static fyj a(final pii pii, final pii pii2) {
        return new fyj(pii, pii2);
    }
    
    public static fyj b(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 1);
    }
    
    public static fyj c(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 2);
    }
    
    public static fyj d(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 3);
    }
    
    public static fyj e(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 4, (byte[])null);
    }
    
    public static fyj f(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 5);
    }
    
    public static fyj g(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 6, (char[])null);
    }
    
    public static fyj h(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 7);
    }
    
    public static fyj i(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 8, (short[])null);
    }
    
    public static fyj j(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 9, (int[])null);
    }
    
    public static fyj k(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 11, (float[])null);
    }
    
    public static fyj l(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 12);
    }
    
    public static fyj m(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 14, (char[][])null);
    }
    
    public static fyj n(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 15, (short[][])null);
    }
    
    public static fyj o(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 17, (boolean[][])null);
    }
    
    public static fyj p(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 18, (float[][])null);
    }
    
    public static fyj q(final pii pii, final pii pii2) {
        return new fyj(pii, pii2, 19, (byte[][][])null);
    }
}
