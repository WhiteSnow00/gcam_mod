import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkb implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public hkb(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public hkb(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hkb(final pii b, final pii a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final char[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final float[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final int[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final short[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final boolean[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final byte[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final char[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final float[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final int[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final short[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hkb(final pii b, final pii a, final int c, final boolean[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static hkb a(final pii pii, final pii pii2) {
        return new hkb(pii, pii2, 14, (short[][])null);
    }
}
