import android.content.Context;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.view.View;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtm implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    private final pii i;
    private final pii j;
    private final /* synthetic */ int k;
    
    public gtm(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i, final pii j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public gtm(final pii h, final pii g, final pii c, final pii j, final pii d, final pii b, final pii i, final pii e, final pii f, final pii a, final int k) {
        this.k = k;
        this.h = h;
        this.g = g;
        this.c = c;
        this.j = j;
        this.d = d;
        this.b = b;
        this.i = i;
        this.e = e;
        this.f = f;
        this.a = a;
    }
    
    public gtm(final pii h, final pii e, final pii j, final pii a, final pii d, final pii f, final pii b, final pii i, final pii g, final pii c, final int k, final byte[] array) {
        this.k = k;
        this.h = h;
        this.e = e;
        this.j = j;
        this.a = a;
        this.d = d;
        this.f = f;
        this.b = b;
        this.i = i;
        this.g = g;
        this.c = c;
    }
    
    public gtm(final pii c, final pii d, final pii a, final pii g, final pii i, final pii j, final pii h, final pii b, final pii e, final pii f, final int k, final char[] array) {
        this.k = k;
        this.c = c;
        this.d = d;
        this.a = a;
        this.g = g;
        this.i = i;
        this.j = j;
        this.h = h;
        this.b = b;
        this.e = e;
        this.f = f;
    }
    
    public gtm(final pii f, final pii h, final pii g, final pii j, final pii b, final pii e, final pii d, final pii a, final pii c, final pii i, final int k, final float[] array) {
        this.k = k;
        this.f = f;
        this.h = h;
        this.g = g;
        this.j = j;
        this.b = b;
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.i = i;
    }
    
    public gtm(final pii d, final pii g, final pii a, final pii f, final pii c, final pii b, final pii h, final pii e, final pii j, final pii i, final int k, final int[] array) {
        this.k = k;
        this.d = d;
        this.g = g;
        this.a = a;
        this.f = f;
        this.c = c;
        this.b = b;
        this.h = h;
        this.e = e;
        this.j = j;
        this.i = i;
    }
    
    public gtm(final pii c, final pii e, final pii f, final pii g, final pii h, final pii b, final pii d, final pii a, final pii i, final pii j, final int k, final short[] array) {
        this.k = k;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = b;
        this.d = d;
        this.a = a;
        this.i = i;
        this.j = j;
    }
    
    public gtm(final pii a, final pii g, final pii b, final pii h, final pii c, final pii f, final pii e, final pii d, final pii j, final pii i, final int k, final boolean[] array) {
        this.k = k;
        this.a = a;
        this.g = g;
        this.b = b;
        this.h = h;
        this.c = c;
        this.f = f;
        this.e = e;
        this.d = d;
        this.j = j;
        this.i = i;
    }
    
    public gtm(final pii a, final pii g, final pii d, final pii i, final pii j, final pii b, final pii e, final pii f, final pii h, final pii c, final int k, final byte[][] array) {
        this.k = k;
        this.a = a;
        this.g = g;
        this.d = d;
        this.i = i;
        this.j = j;
        this.b = b;
        this.e = e;
        this.f = f;
        this.h = h;
        this.c = c;
    }
    
    public gtm(final pii g, final pii a, final pii h, final pii c, final pii f, final pii b, final pii e, final pii d, final pii i, final pii j, final int k, final char[][] array) {
        this.k = k;
        this.g = g;
        this.a = a;
        this.h = h;
        this.c = c;
        this.f = f;
        this.b = b;
        this.e = e;
        this.d = d;
        this.i = i;
        this.j = j;
    }
    
    public gtm(final pii h, final pii g, final pii d, final pii j, final pii f, final pii b, final pii e, final pii c, final pii i, final pii a, final int k, final int[][] array) {
        this.k = k;
        this.h = h;
        this.g = g;
        this.d = d;
        this.j = j;
        this.f = f;
        this.b = b;
        this.e = e;
        this.c = c;
        this.i = i;
        this.a = a;
    }
    
    public gtm(final pii a, final pii e, final pii b, final pii g, final pii d, final pii h, final pii c, final pii i, final pii j, final pii f, final int k, final short[][] array) {
        this.k = k;
        this.a = a;
        this.e = e;
        this.b = b;
        this.g = g;
        this.d = d;
        this.h = h;
        this.c = c;
        this.i = i;
        this.j = j;
        this.f = f;
    }
    
    public static gtm a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10) {
        return new gtm(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, 1);
    }
}
