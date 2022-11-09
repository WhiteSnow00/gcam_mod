import android.app.Activity;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.bottombar.R$dimen;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import com.google.android.apps.camera.stats.Instrumentation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guv implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public guv(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public guv(final pii b, final pii c, final pii a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public guv(final pii c, final pii b, final pii a, final int d, final byte[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public guv(final pii a, final pii c, final pii b, final int d, final char[] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public guv(final pii a, final pii b, final pii c, final int d, final float[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public guv(final pii c, final pii b, final pii a, final int d, final int[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public guv(final pii a, final pii b, final pii c, final int d, final short[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public guv(final pii c, final pii a, final pii b, final int d, final boolean[] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public guv(final pii b, final pii a, final pii c, final int d, final byte[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public guv(final pii c, final pii b, final pii a, final int d, final char[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public guv(final pii b, final pii a, final pii c, final int d, final float[][] array) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public guv(final pii c, final pii b, final pii a, final int d, final int[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public guv(final pii c, final pii b, final pii a, final int d, final short[][] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public guv(final pii a, final pii b, final pii c, final int d, final boolean[][] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static guv a(final pii pii, final pii pii2, final pii pii3) {
        return new guv(pii, pii2, pii3, 1);
    }
    
    public static guv b(final pii pii, final pii pii2, final pii pii3) {
        return new guv(pii, pii2, pii3, 13, (float[])null);
    }
}
