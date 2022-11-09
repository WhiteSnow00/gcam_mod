import android.hardware.camera2.CameraCharacteristics$Key;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import java.util.ArrayList;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyf implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public dyf(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii b, final pii a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public dyf(final pii a, final pii b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final char[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final float[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final int[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final short[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final boolean[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final byte[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final char[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final float[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final int[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final short[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final boolean[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final byte[][][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final char[][][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final int[][][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dyf(final pii a, final pii b, final int c, final short[][][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static dyf a(final pii pii, final pii pii2) {
        return new dyf(pii, pii2);
    }
    
    public static niz b(final pii pii, final cxl cxl) {
        niz niz;
        if (cxl.k(cxs.af)) {
            niz = ((emd)pii).a();
        }
        else {
            niz = nii.a;
        }
        return niz;
    }
    
    public static dyf c(final pii pii, final pii pii2) {
        return new dyf(pii, pii2, 1);
    }
    
    public static dyf d(final pii pii, final pii pii2) {
        return new dyf(pii, pii2, 2, (byte[])null);
    }
    
    public static dyf e(final pii pii, final pii pii2) {
        return new dyf(pii, pii2, 3, (char[])null);
    }
    
    public static dyf f(final pii pii, final pii pii2) {
        return new dyf(pii, pii2, 4, (short[])null);
    }
    
    public static dyf g(final pii pii, final pii pii2) {
        return new dyf(pii, pii2, 5, (int[])null);
    }
    
    public static dyf h(final pii pii, final pii pii2) {
        return new dyf(pii, pii2, 6, (boolean[])null);
    }
    
    public static dyf i(final pii pii, final pii pii2) {
        return new dyf(pii, pii2, 7);
    }
}
