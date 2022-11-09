import android.hardware.camera2.CameraManager;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import android.content.res.Resources;
import android.content.Context;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionControllerImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvv implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final /* synthetic */ int f;
    
    public bvv(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public bvv(final pii d, final pii c, final pii e, final pii b, final pii a, final int f) {
        this.f = f;
        this.d = d;
        this.c = c;
        this.e = e;
        this.b = b;
        this.a = a;
    }
    
    public bvv(final pii c, final pii d, final pii b, final pii a, final pii e, final int f, final byte[] array) {
        this.f = f;
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
        this.e = e;
    }
    
    public bvv(final pii b, final pii c, final pii d, final pii e, final pii a, final int f, final byte[] array, final byte[] array2) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public bvv(final pii b, final pii a, final pii d, final pii e, final pii c, final int f, final char[] array) {
        this.f = f;
        this.b = b;
        this.a = a;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    public bvv(final pii d, final pii b, final pii c, final pii e, final pii a, final int f, final float[] array) {
        this.f = f;
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = a;
    }
    
    public bvv(final pii e, final pii b, final pii c, final pii d, final pii a, final int f, final int[] array) {
        this.f = f;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public bvv(final pii d, final pii b, final pii e, final pii c, final pii a, final int f, final short[] array) {
        this.f = f;
        this.d = d;
        this.b = b;
        this.e = e;
        this.c = c;
        this.a = a;
    }
    
    public bvv(final pii e, final pii d, final pii a, final pii b, final pii c, final int f, final boolean[] array) {
        this.f = f;
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bvv(final pii b, final pii e, final pii c, final pii d, final pii a, final int f, final byte[][] array) {
        this.f = f;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public bvv(final pii b, final pii e, final pii a, final pii c, final pii d, final int f, final char[][] array) {
        this.f = f;
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public bvv(final pii d, final pii a, final pii e, final pii b, final pii c, final int f, final float[][] array) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public bvv(final pii a, final pii d, final pii b, final pii c, final pii e, final int f, final int[][] array) {
        this.f = f;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public bvv(final pii e, final pii d, final pii c, final pii a, final pii b, final int f, final short[][] array) {
        this.f = f;
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bvv(final pii a, final pii c, final pii d, final pii e, final pii b, final int f, final boolean[][] array) {
        this.f = f;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = b;
    }
    
    public bvv(final pii d, final pii a, final pii e, final pii b, final pii c, final int f, final byte[][][] array) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public bvv(final pii d, final pii a, final pii e, final pii b, final pii c, final int f, final char[][][] array) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public bvv(final pii e, final pii d, final pii b, final pii c, final pii a, final int f, final float[][][] array) {
        this.f = f;
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public bvv(final pii c, final pii e, final pii b, final pii a, final pii d, final int f, final int[][][] array) {
        this.f = f;
        this.c = c;
        this.e = e;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public bvv(final pii d, final pii a, final pii e, final pii b, final pii c, final int f, final short[][][] array) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public bvv(final pii b, final pii c, final pii d, final pii a, final pii e, final int f, final boolean[][][] array) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
    }
    
    public static bvv a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new bvv(pii, pii2, pii3, pii4, pii5, 1);
    }
    
    public static bvv b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new bvv(pii, pii2, pii3, pii4, pii5, 2, (byte[])null);
    }
    
    public static bvv c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new bvv(pii, pii2, pii3, pii4, pii5, 8, (byte[][])null);
    }
}
