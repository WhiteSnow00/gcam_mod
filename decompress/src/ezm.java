import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezm implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public ezm(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii b, final pii a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ezm(final pii a, final pii b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii a, final pii b, final int c, final char[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii a, final pii b, final int c, final float[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii a, final pii b, final int c, final int[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii a, final pii b, final int c, final short[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii a, final pii b, final int c, final boolean[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii a, final pii b, final int c, final byte[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii a, final pii b, final int c, final char[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ezm(final pii a, final pii b, final int c, final short[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static ezm a(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 7, (char[])null);
    }
    
    public static ezm b(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 8, (short[])null);
    }
    
    public static ezm c(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 9, (int[])null);
    }
    
    public static ezm d(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 10);
    }
    
    public static ezm e(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 11, (boolean[])null);
    }
    
    public static ezm f(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 16, (char[][])null);
    }
    
    public static ezm g(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 17);
    }
    
    public static ezm h(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 18);
    }
    
    public static ezm i(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 19);
    }
    
    public static ezm j(final pii pii, final pii pii2) {
        return new ezm(pii, pii2, 20, (short[][])null);
    }
}
