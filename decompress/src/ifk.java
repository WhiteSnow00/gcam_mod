import android.content.Context;
import android.app.NotificationManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifk implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final /* synthetic */ int f;
    
    public ifk(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public ifk(final pii c, final pii b, final pii a, final pii e, final pii d, final int f) {
        this.f = f;
        this.c = c;
        this.b = b;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public ifk(final pii c, final pii d, final pii b, final pii e, final pii a, final int f, final byte[] array) {
        this.f = f;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.a = a;
    }
    
    public ifk(final pii c, final pii e, final pii a, final pii d, final pii b, final int f, final char[] array) {
        this.f = f;
        this.c = c;
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public ifk(final pii e, final pii a, final pii c, final pii b, final pii d, final int f, final float[] array) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public ifk(final pii b, final pii d, final pii e, final pii a, final pii c, final int f, final int[] array) {
        this.f = f;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    public ifk(final pii d, final pii c, final pii e, final pii a, final pii b, final int f, final short[] array) {
        this.f = f;
        this.d = d;
        this.c = c;
        this.e = e;
        this.a = a;
        this.b = b;
    }
    
    public ifk(final pii c, final pii e, final pii a, final pii b, final pii d, final int f, final boolean[] array) {
        this.f = f;
        this.c = c;
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public ifk(final pii b, final pii c, final pii a, final pii e, final pii d, final int f, final byte[][] array) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.a = a;
        this.e = e;
        this.d = d;
    }
    
    public ifk(final pii b, final pii a, final pii d, final pii c, final pii e, final int f, final char[][] array) {
        this.f = f;
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    public ifk(final pii d, final pii b, final pii a, final pii e, final pii c, final int f, final int[][] array) {
        this.f = f;
        this.d = d;
        this.b = b;
        this.a = a;
        this.e = e;
        this.c = c;
    }
    
    public ifk(final pii c, final pii a, final pii d, final pii b, final pii e, final int f, final short[][] array) {
        this.f = f;
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
        this.e = e;
    }
    
    public ifk(final pii a, final pii b, final pii e, final pii d, final pii c, final int f, final boolean[][] array) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = c;
    }
}
