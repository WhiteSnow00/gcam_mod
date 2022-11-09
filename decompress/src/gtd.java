import android.content.Context;
import com.google.android.apps.camera.rectiface.jni.RectifaceImpl;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtd implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final /* synthetic */ int g;
    
    public gtd(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public gtd(final pii f, final pii b, final pii a, final pii c, final pii e, final pii d, final int g) {
        this.g = g;
        this.f = f;
        this.b = b;
        this.a = a;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public gtd(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final int g, final byte[] array) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public gtd(final pii d, final pii a, final pii b, final pii c, final pii f, final pii e, final int g, final byte[] array, final byte[] array2) {
        this.g = g;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = e;
    }
    
    public gtd(final pii a, final pii f, final pii c, final pii b, final pii e, final pii d, final int g, final char[] array) {
        this.g = g;
        this.a = a;
        this.f = f;
        this.c = c;
        this.b = b;
        this.e = e;
        this.d = d;
    }
    
    public gtd(final pii b, final pii e, final pii a, final pii d, final pii c, final pii f, final int g, final float[] array) {
        this.g = g;
        this.b = b;
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.f = f;
    }
    
    public gtd(final pii c, final pii b, final pii e, final pii a, final pii f, final pii d, final int g, final int[] array) {
        this.g = g;
        this.c = c;
        this.b = b;
        this.e = e;
        this.a = a;
        this.f = f;
        this.d = d;
    }
    
    public gtd(final pii d, final pii c, final pii b, final pii e, final pii f, final pii a, final int g, final short[] array) {
        this.g = g;
        this.d = d;
        this.c = c;
        this.b = b;
        this.e = e;
        this.f = f;
        this.a = a;
    }
    
    public gtd(final pii a, final pii d, final pii c, final pii e, final pii f, final pii b, final int g, final boolean[] array) {
        this.g = g;
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    public gtd(final pii a, final pii c, final pii d, final pii e, final pii f, final pii b, final int g, final byte[][] array) {
        this.g = g;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    public gtd(final pii d, final pii a, final pii b, final pii c, final pii e, final pii f, final int g, final char[][] array) {
        this.g = g;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
    }
    
    public gtd(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final int g, final float[][] array) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public gtd(final pii f, final pii b, final pii c, final pii a, final pii d, final pii e, final int g, final int[][] array) {
        this.g = g;
        this.f = f;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    public gtd(final pii f, final pii b, final pii d, final pii a, final pii c, final pii e, final int g, final short[][] array) {
        this.g = g;
        this.f = f;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
        this.e = e;
    }
    
    public gtd(final pii d, final pii e, final pii a, final pii c, final pii b, final pii f, final int g, final boolean[][] array) {
        this.g = g;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.f = f;
    }
    
    public gtd(final pii f, final pii a, final pii c, final pii d, final pii b, final pii e, final int g, final byte[][][] array) {
        this.g = g;
        this.f = f;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public gtd(final pii a, final pii e, final pii d, final pii c, final pii f, final pii b, final int g, final char[][][] array) {
        this.g = g;
        this.a = a;
        this.e = e;
        this.d = d;
        this.c = c;
        this.f = f;
        this.b = b;
    }
    
    public gtd(final pii d, final pii a, final pii b, final pii c, final pii f, final pii e, final int g, final float[][][] array) {
        this.g = g;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = e;
    }
    
    public gtd(final pii d, final pii a, final pii f, final pii b, final pii c, final pii e, final int g, final int[][][] array) {
        this.g = g;
        this.d = d;
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public gtd(final pii a, final pii d, final pii b, final pii c, final pii f, final pii e, final int g, final short[][][] array) {
        this.g = g;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = e;
    }
    
    public gtd(final pii b, final pii e, final pii f, final pii d, final pii a, final pii c, final int g, final boolean[][][] array) {
        this.g = g;
        this.b = b;
        this.e = e;
        this.f = f;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public static gtd a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new gtd(pii, pii2, pii3, pii4, pii5, pii6);
    }
    
    public static gtd b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new gtd(pii, pii2, pii3, pii4, pii5, pii6, 1);
    }
    
    public static gtd c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new gtd(pii, pii2, pii3, pii4, pii5, pii6, 2, (byte[])null);
    }
    
    public static gtd d(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new gtd(pii, pii2, pii3, pii4, pii5, pii6, 3, (char[])null);
    }
    
    public static gtd e(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new gtd(pii, pii2, pii3, pii4, pii5, pii6, 4, (short[])null);
    }
    
    public static gtd f(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new gtd(pii, pii2, pii3, pii4, pii5, pii6, 12, (boolean[][])null);
    }
}
