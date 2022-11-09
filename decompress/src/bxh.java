import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import android.content.SharedPreferences;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxh implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final /* synthetic */ int h;
    
    public bxh(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public bxh(final pii f, final pii c, final pii a, final pii e, final pii g, final pii b, final pii d, final int h) {
        this.h = h;
        this.f = f;
        this.c = c;
        this.a = a;
        this.e = e;
        this.g = g;
        this.b = b;
        this.d = d;
    }
    
    public bxh(final pii g, final pii b, final pii c, final pii e, final pii d, final pii a, final pii f, final int h, final byte[] array) {
        this.h = h;
        this.g = g;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.a = a;
        this.f = f;
    }
    
    public bxh(final pii b, final pii f, final pii d, final pii g, final pii c, final pii a, final pii e, final int h, final byte[] array, final byte[] array2) {
        this.h = h;
        this.b = b;
        this.f = f;
        this.d = d;
        this.g = g;
        this.c = c;
        this.a = a;
        this.e = e;
    }
    
    public bxh(final pii b, final pii f, final pii c, final pii g, final pii d, final pii a, final pii e, final int h, final char[] array) {
        this.h = h;
        this.b = b;
        this.f = f;
        this.c = c;
        this.g = g;
        this.d = d;
        this.a = a;
        this.e = e;
    }
    
    public bxh(final pii c, final pii d, final pii f, final pii e, final pii b, final pii g, final pii a, final int h, final float[] array) {
        this.h = h;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
        this.b = b;
        this.g = g;
        this.a = a;
    }
    
    public bxh(final pii e, final pii c, final pii a, final pii d, final pii b, final pii f, final pii g, final int h, final int[] array) {
        this.h = h;
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
        this.f = f;
        this.g = g;
    }
    
    public bxh(final pii e, final pii f, final pii d, final pii g, final pii b, final pii c, final pii a, final int h, final short[] array) {
        this.h = h;
        this.e = e;
        this.f = f;
        this.d = d;
        this.g = g;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public bxh(final pii g, final pii d, final pii c, final pii a, final pii b, final pii f, final pii e, final int h, final boolean[] array) {
        this.h = h;
        this.g = g;
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
        this.f = f;
        this.e = e;
    }
    
    public bxh(final pii e, final pii d, final pii f, final pii g, final pii a, final pii b, final pii c, final int h, final byte[][] array) {
        this.h = h;
        this.e = e;
        this.d = d;
        this.f = f;
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public bxh(final pii g, final pii f, final pii d, final pii e, final pii a, final pii c, final pii b, final int h, final char[][] array) {
        this.h = h;
        this.g = g;
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public bxh(final pii f, final pii b, final pii e, final pii a, final pii c, final pii d, final pii g, final int h, final float[][] array) {
        this.h = h;
        this.f = f;
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.g = g;
    }
    
    public bxh(final pii c, final pii e, final pii b, final pii f, final pii a, final pii g, final pii d, final int h, final int[][] array) {
        this.h = h;
        this.c = c;
        this.e = e;
        this.b = b;
        this.f = f;
        this.a = a;
        this.g = g;
        this.d = d;
    }
    
    public bxh(final pii c, final pii f, final pii b, final pii e, final pii d, final pii a, final pii g, final int h, final short[][] array) {
        this.h = h;
        this.c = c;
        this.f = f;
        this.b = b;
        this.e = e;
        this.d = d;
        this.a = a;
        this.g = g;
    }
    
    public bxh(final pii b, final pii c, final pii f, final pii d, final pii e, final pii g, final pii a, final int h, final boolean[][] array) {
        this.h = h;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
        this.g = g;
        this.a = a;
    }
    
    public bxh(final pii c, final pii e, final pii a, final pii d, final pii f, final pii g, final pii b, final int h, final byte[][][] array) {
        this.h = h;
        this.c = c;
        this.e = e;
        this.a = a;
        this.d = d;
        this.f = f;
        this.g = g;
        this.b = b;
    }
    
    public bxh(final pii d, final pii a, final pii g, final pii e, final pii c, final pii f, final pii b, final int h, final char[][][] array) {
        this.h = h;
        this.d = d;
        this.a = a;
        this.g = g;
        this.e = e;
        this.c = c;
        this.f = f;
        this.b = b;
    }
    
    public bxh(final pii c, final pii a, final pii f, final pii d, final pii g, final pii b, final pii e, final int h, final float[][][] array) {
        this.h = h;
        this.c = c;
        this.a = a;
        this.f = f;
        this.d = d;
        this.g = g;
        this.b = b;
        this.e = e;
    }
    
    public bxh(final pii e, final pii f, final pii b, final pii a, final pii g, final pii d, final pii c, final int h, final int[][][] array) {
        this.h = h;
        this.e = e;
        this.f = f;
        this.b = b;
        this.a = a;
        this.g = g;
        this.d = d;
        this.c = c;
    }
    
    public bxh(final pii e, final pii d, final pii c, final pii a, final pii f, final pii b, final pii g, final int h, final short[][][] array) {
        this.h = h;
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
        this.f = f;
        this.b = b;
        this.g = g;
    }
    
    public bxh(final pii d, final pii e, final pii a, final pii c, final pii g, final pii b, final pii f, final int h, final boolean[][][] array) {
        this.h = h;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
        this.g = g;
        this.b = b;
        this.f = f;
    }
    
    public static bxh a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 5, (int[])null);
    }
    
    public static bxh b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 9, (char[][])null);
    }
    
    public static bxh c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 12, (boolean[][])null);
    }
    
    public static bxh d(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 13, (float[][])null);
    }
    
    public static bxh e(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 14, (byte[][][])null);
    }
    
    public static bxh f(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 15, (char[][][])null);
    }
    
    public static bxh g(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 16, (short[][][])null);
    }
    
    public static bxh h(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 17, (int[][][])null);
    }
    
    public static bxh i(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 18, (boolean[][][])null);
    }
    
    public static bxh j(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new bxh(pii, pii2, pii3, pii4, pii5, pii6, pii7, 20, null, null);
    }
}
