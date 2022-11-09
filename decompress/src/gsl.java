import java.util.Iterator;
import android.app.Activity;
import java.util.Set;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsl implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public gsl(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public gsl(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gsl(final pii b, final pii a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final char[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final float[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final int[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final short[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final boolean[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final byte[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final char[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final int[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final short[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gsl(final pii b, final pii a, final int c, final boolean[][] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static gsl a(final pii pii, final pii pii2) {
        return new gsl(pii, pii2);
    }
    
    public static gsl b(final pii pii, final pii pii2) {
        return new gsl(pii, pii2, 2, (byte[])null);
    }
    
    public static gsl c(final pii pii, final pii pii2) {
        return new gsl(pii, pii2, 4, (char[])null);
    }
    
    public static gsl d(final pii pii, final pii pii2) {
        return new gsl(pii, pii2, 5, (short[])null);
    }
    
    public static gsl e(final pii pii, final pii pii2) {
        return new gsl(pii, pii2, 6);
    }
    
    public static gsl f(final pii pii, final pii pii2) {
        return new gsl(pii, pii2, 7);
    }
    
    public static gsl g(final pii pii, final pii pii2) {
        return new gsl(pii, pii2, 15);
    }
}
