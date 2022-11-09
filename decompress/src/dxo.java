import android.content.Context;
import android.app.KeyguardManager;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxo implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final /* synthetic */ int g;
    
    public dxo(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public dxo(final pii a, final pii b, final pii e, final pii d, final pii f, final pii c, final int g) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = d;
        this.f = f;
        this.c = c;
    }
    
    public dxo(final pii a, final pii b, final pii c, final pii d, final pii f, final pii e, final int g, final byte[] array) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
    }
    
    public dxo(final pii b, final pii d, final pii f, final pii e, final pii a, final pii c, final int g, final char[] array) {
        this.g = g;
        this.b = b;
        this.d = d;
        this.f = f;
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    public dxo(final pii a, final pii f, final pii d, final pii e, final pii b, final pii c, final int g, final float[] array) {
        this.g = g;
        this.a = a;
        this.f = f;
        this.d = d;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public dxo(final pii f, final pii e, final pii a, final pii c, final pii d, final pii b, final int g, final int[] array) {
        this.g = g;
        this.f = f;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public dxo(final pii d, final pii f, final pii b, final pii a, final pii e, final pii c, final int g, final short[] array) {
        this.g = g;
        this.d = d;
        this.f = f;
        this.b = b;
        this.a = a;
        this.e = e;
        this.c = c;
    }
    
    public dxo(final pii c, final pii a, final pii d, final pii e, final pii f, final pii b, final int g, final boolean[] array) {
        this.g = g;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    public dxo(final pii d, final pii e, final pii c, final pii a, final pii b, final pii f, final int g, final byte[][] array) {
        this.g = g;
        this.d = d;
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
        this.f = f;
    }
    
    public dxo(final pii b, final pii c, final pii f, final pii d, final pii e, final pii a, final int g, final char[][] array) {
        this.g = g;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public dxo(final pii f, final pii e, final pii d, final pii a, final pii b, final pii c, final int g, final float[][] array) {
        this.g = g;
        this.f = f;
        this.e = e;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public dxo(final pii b, final pii a, final pii d, final pii f, final pii c, final pii e, final int g, final int[][] array) {
        this.g = g;
        this.b = b;
        this.a = a;
        this.d = d;
        this.f = f;
        this.c = c;
        this.e = e;
    }
    
    public dxo(final pii b, final pii d, final pii f, final pii c, final pii a, final pii e, final int g, final short[][] array) {
        this.g = g;
        this.b = b;
        this.d = d;
        this.f = f;
        this.c = c;
        this.a = a;
        this.e = e;
    }
    
    public dxo(final pii d, final pii a, final pii e, final pii b, final pii c, final pii f, final int g, final boolean[][] array) {
        this.g = g;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.f = f;
    }
    
    public dxo(final pii c, final pii d, final pii e, final pii a, final pii f, final pii b, final int g, final byte[][][] array) {
        this.g = g;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.b = b;
    }
    
    public dxo(final pii a, final pii c, final pii b, final pii e, final pii d, final pii f, final int g, final char[][][] array) {
        this.g = g;
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
        this.f = f;
    }
    
    public dxo(final pii b, final pii c, final pii d, final pii f, final pii e, final pii a, final int g, final int[][][] array) {
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
        this.a = a;
    }
    
    public dxo(final pii b, final pii f, final pii a, final pii d, final pii e, final pii c, final int g, final short[][][] array) {
        this.g = g;
        this.b = b;
        this.f = f;
        this.a = a;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    public static dxo a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6);
    }
    
    public static dxo b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 2, (byte[])null);
    }
    
    public static dxo c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 7, (float[])null);
    }
    
    public static dxo d(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 8, (byte[][])null);
    }
    
    public static dxo e(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 9, (char[][])null);
    }
    
    public static dxo f(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 12, (boolean[][])null);
    }
    
    public static dxo g(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 13, (float[][])null);
    }
    
    public static dxo h(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 14, (byte[][][])null);
    }
    
    public static dxo i(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 15, (char[][][])null);
    }
    
    public static dxo j(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new dxo(pii, pii2, pii3, pii4, pii5, pii6, 16, (short[][][])null);
    }
}
