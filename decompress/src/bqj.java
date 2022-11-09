import android.os.Handler;
import android.app.admin.DevicePolicyManager;
import java.util.concurrent.Semaphore;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.content.res.Resources;
import com.google.googlex.gcam.Gcam;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqj implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    private final /* synthetic */ int i;
    
    public bqj(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public bqj(final pii g, final pii c, final pii b, final pii a, final pii h, final pii d, final pii f, final pii e, final int i) {
        this.i = i;
        this.g = g;
        this.c = c;
        this.b = b;
        this.a = a;
        this.h = h;
        this.d = d;
        this.f = f;
        this.e = e;
    }
    
    public bqj(final pii h, final pii d, final pii a, final pii b, final pii c, final pii f, final pii g, final pii e, final int i, final byte[] array) {
        this.i = i;
        this.h = h;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
        this.e = e;
    }
    
    public bqj(final pii h, final pii e, final pii f, final pii a, final pii d, final pii c, final pii b, final pii g, final int i, final char[] array) {
        this.i = i;
        this.h = h;
        this.e = e;
        this.f = f;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
        this.g = g;
    }
    
    public bqj(final pii d, final pii b, final pii c, final pii f, final pii a, final pii h, final pii e, final pii g, final int i, final float[] array) {
        this.i = i;
        this.d = d;
        this.b = b;
        this.c = c;
        this.f = f;
        this.a = a;
        this.h = h;
        this.e = e;
        this.g = g;
    }
    
    public bqj(final pii h, final pii c, final pii f, final pii g, final pii b, final pii a, final pii e, final pii d, final int i, final int[] array) {
        this.i = i;
        this.h = h;
        this.c = c;
        this.f = f;
        this.g = g;
        this.b = b;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public bqj(final pii h, final pii f, final pii b, final pii d, final pii g, final pii e, final pii c, final pii a, final int i, final short[] array) {
        this.i = i;
        this.h = h;
        this.f = f;
        this.b = b;
        this.d = d;
        this.g = g;
        this.e = e;
        this.c = c;
        this.a = a;
    }
    
    public bqj(final pii g, final pii b, final pii f, final pii h, final pii e, final pii d, final pii c, final pii a, final int i, final boolean[] array) {
        this.i = i;
        this.g = g;
        this.b = b;
        this.f = f;
        this.h = h;
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public bqj(final pii e, final pii g, final pii a, final pii d, final pii b, final pii h, final pii f, final pii c, final int i, final byte[][] array) {
        this.i = i;
        this.e = e;
        this.g = g;
        this.a = a;
        this.d = d;
        this.b = b;
        this.h = h;
        this.f = f;
        this.c = c;
    }
    
    public bqj(final pii a, final pii g, final pii c, final pii b, final pii h, final pii e, final pii d, final pii f, final int i, final char[][] array) {
        this.i = i;
        this.a = a;
        this.g = g;
        this.c = c;
        this.b = b;
        this.h = h;
        this.e = e;
        this.d = d;
        this.f = f;
    }
    
    public bqj(final pii c, final pii b, final pii d, final pii h, final pii e, final pii g, final pii f, final pii a, final int i, final float[][] array) {
        this.i = i;
        this.c = c;
        this.b = b;
        this.d = d;
        this.h = h;
        this.e = e;
        this.g = g;
        this.f = f;
        this.a = a;
    }
    
    public bqj(final pii b, final pii a, final pii g, final pii h, final pii e, final pii c, final pii d, final pii f, final int i, final int[][] array) {
        this.i = i;
        this.b = b;
        this.a = a;
        this.g = g;
        this.h = h;
        this.e = e;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    
    public bqj(final pii h, final pii g, final pii f, final pii e, final pii b, final pii d, final pii a, final pii c, final int i, final short[][] array) {
        this.i = i;
        this.h = h;
        this.g = g;
        this.f = f;
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public bqj(final pii h, final pii c, final pii a, final pii d, final pii f, final pii b, final pii g, final pii e, final int i, final boolean[][] array) {
        this.i = i;
        this.h = h;
        this.c = c;
        this.a = a;
        this.d = d;
        this.f = f;
        this.b = b;
        this.g = g;
        this.e = e;
    }
    
    public bqj(final pii h, final pii d, final pii a, final pii e, final pii b, final pii f, final pii g, final pii c, final int i, final byte[][][] array) {
        this.i = i;
        this.h = h;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.f = f;
        this.g = g;
        this.c = c;
    }
    
    public bqj(final pii e, final pii h, final pii g, final pii b, final pii a, final pii d, final pii f, final pii c, final int i, final char[][][] array) {
        this.i = i;
        this.e = e;
        this.h = h;
        this.g = g;
        this.b = b;
        this.a = a;
        this.d = d;
        this.f = f;
        this.c = c;
    }
    
    public bqj(final pii h, final pii g, final pii c, final pii a, final pii d, final pii b, final pii f, final pii e, final int i, final int[][][] array) {
        this.i = i;
        this.h = h;
        this.g = g;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
        this.f = f;
        this.e = e;
    }
    
    public bqj(final pii b, final pii d, final pii h, final pii e, final pii g, final pii f, final pii c, final pii a, final int i, final short[][][] array) {
        this.i = i;
        this.b = b;
        this.d = d;
        this.h = h;
        this.e = e;
        this.g = g;
        this.f = f;
        this.c = c;
        this.a = a;
    }
    
    public bqj(final pii d, final pii h, final pii f, final pii e, final pii c, final pii a, final pii b, final pii g, final int i, final boolean[][][] array) {
        this.i = i;
        this.d = d;
        this.h = h;
        this.f = f;
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
        this.g = g;
    }
    
    public static bqj a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new bqj(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 4, (short[])null);
    }
    
    public static bqj b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new bqj(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 11, (int[][])null);
    }
    
    public static bqj c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new bqj(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 13, (float[][])null);
    }
    
    public static bqj d(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new bqj(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 14, (byte[][][])null);
    }
    
    public static bqj e(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new bqj(pii, pii2, pii4, pii5, pii6, pii7, pii8, pii9, 15, (char[][][])null);
    }
    
    public static bqj f(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new bqj(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 16, (short[][][])null);
    }
    
    public static bqj g(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new bqj(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 17, (int[][][])null);
    }
    
    public static bqj h(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new bqj(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 18, (boolean[][][])null);
    }
}
