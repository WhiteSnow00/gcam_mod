import android.content.Context;
import java.util.concurrent.ExecutorService;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.TimeUnit;
import android.media.AudioFormat$Builder;
import android.media.AudioRecord$Builder;
import java.util.concurrent.ScheduledExecutorService;
import com.google.googlex.gcam.Gcam;
import android.os.Handler;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnf implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public dnf(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii b, final pii a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public dnf(final pii a, final pii b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final char[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final float[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final int[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final short[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final boolean[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final byte[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final char[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final int[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final short[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public dnf(final pii a, final pii b, final int c, final boolean[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static dnf a(final pii pii, final pii pii2) {
        return new dnf(pii, pii2);
    }
    
    public static Set b(final cxl cxl, final pii pii) {
        noi noi;
        if (!cxl.k(cxi.a)) {
            noi = nqr.a;
        }
        else {
            noi = noi.H(new dne(pii));
        }
        pqf.k(noi);
        return noi;
    }
    
    public static dnf c(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 1);
    }
    
    public static dnf d(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 6, (boolean[])null);
    }
    
    public static dnf e(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 7);
    }
    
    public static dnf f(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 9, (float[])null);
    }
    
    public static dnf g(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 10, (byte[][])null);
    }
    
    public static dnf h(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 11, (char[][])null);
    }
    
    public static dnf i(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 12);
    }
    
    public static dnf j(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 13);
    }
    
    public static dnf k(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 16, (int[][])null);
    }
    
    public static dnf l(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 17);
    }
    
    public static dnf m(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 18, (boolean[][])null);
    }
    
    public static dnf n(final pii pii, final pii pii2) {
        return new dnf(pii, pii2, 19);
    }
}
