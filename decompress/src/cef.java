import android.content.Context;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cef implements oun
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
    private final pii k;
    private final pii l;
    private final pii m;
    private final /* synthetic */ int n;
    
    public cef(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i, final pii j, final pii k, final pii l, final pii m) {
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
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public cef(final pii a, final pii l, final pii g, final pii i, final pii c, final pii b, final pii j, final pii f, final pii k, final pii m, final pii d, final pii e, final pii h, final int n) {
        this.n = n;
        this.a = a;
        this.l = l;
        this.g = g;
        this.i = i;
        this.c = c;
        this.b = b;
        this.j = j;
        this.f = f;
        this.k = k;
        this.m = m;
        this.d = d;
        this.e = e;
        this.h = h;
    }
    
    public cef(final pii f, final pii i, final pii k, final pii m, final pii l, final pii g, final pii a, final pii e, final pii b, final pii j, final pii d, final pii c, final pii h, final int n, final byte[] array) {
        this.n = n;
        this.f = f;
        this.i = i;
        this.k = k;
        this.m = m;
        this.l = l;
        this.g = g;
        this.a = a;
        this.e = e;
        this.b = b;
        this.j = j;
        this.d = d;
        this.c = c;
        this.h = h;
    }
    
    public cef(final pii f, final pii c, final pii k, final pii m, final pii l, final pii g, final pii a, final pii e, final pii b, final pii j, final pii d, final pii i, final pii h, final int n, final char[] array) {
        this.n = n;
        this.f = f;
        this.c = c;
        this.k = k;
        this.m = m;
        this.l = l;
        this.g = g;
        this.a = a;
        this.e = e;
        this.b = b;
        this.j = j;
        this.d = d;
        this.i = i;
        this.h = h;
    }
    
    public cef(final pii m, final pii k, final pii b, final pii d, final pii l, final pii g, final pii h, final pii a, final pii f, final pii i, final pii j, final pii e, final pii c, final int n, final float[] array) {
        this.n = n;
        this.m = m;
        this.k = k;
        this.b = b;
        this.d = d;
        this.l = l;
        this.g = g;
        this.h = h;
        this.a = a;
        this.f = f;
        this.i = i;
        this.j = j;
        this.e = e;
        this.c = c;
    }
    
    public cef(final pii i, final pii c, final pii g, final pii h, final pii e, final pii k, final pii d, final pii l, final pii m, final pii j, final pii a, final pii f, final pii b, final int n, final int[] array) {
        this.n = n;
        this.i = i;
        this.c = c;
        this.g = g;
        this.h = h;
        this.e = e;
        this.k = k;
        this.d = d;
        this.l = l;
        this.m = m;
        this.j = j;
        this.a = a;
        this.f = f;
        this.b = b;
    }
    
    public cef(final pii c, final pii i, final pii e, final pii j, final pii f, final pii g, final pii d, final pii l, final pii m, final pii b, final pii h, final pii a, final pii k, final int n, final short[] array) {
        this.n = n;
        this.c = c;
        this.i = i;
        this.e = e;
        this.j = j;
        this.f = f;
        this.g = g;
        this.d = d;
        this.l = l;
        this.m = m;
        this.b = b;
        this.h = h;
        this.a = a;
        this.k = k;
    }
    
    public cef(final pii h, final pii l, final pii d, final pii j, final pii m, final pii f, final pii g, final pii i, final pii c, final pii k, final pii a, final pii b, final pii e, final int n, final boolean[] array) {
        this.n = n;
        this.h = h;
        this.l = l;
        this.d = d;
        this.j = j;
        this.m = m;
        this.f = f;
        this.g = g;
        this.i = i;
        this.c = c;
        this.k = k;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public static cef a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10, final pii pii11, final pii pii12, final pii pii13) {
        return new cef(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, pii11, pii12, pii13, 4, (short[])null);
    }
    
    public static cef b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10, final pii pii11, final pii pii12, final pii pii13) {
        return new cef(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, pii11, pii12, pii13, 6, (boolean[])null);
    }
    
    public static cef c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10, final pii pii11, final pii pii12, final pii pii13) {
        return new cef(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, pii11, pii12, pii13, 7, (float[])null);
    }
}
