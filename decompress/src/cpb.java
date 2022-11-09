import android.os.Handler;
import android.media.MediaFormat;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpb implements oun
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
    private final /* synthetic */ int j;
    
    public cpb(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public cpb(final pii b, final pii a, final pii f, final pii d, final pii h, final pii c, final pii g, final pii i, final pii e, final int j) {
        this.j = j;
        this.b = b;
        this.a = a;
        this.f = f;
        this.d = d;
        this.h = h;
        this.c = c;
        this.g = g;
        this.i = i;
        this.e = e;
    }
    
    public cpb(final pii c, final pii i, final pii h, final pii f, final pii g, final pii a, final pii e, final pii b, final pii d, final int j, final byte[] array) {
        this.j = j;
        this.c = c;
        this.i = i;
        this.h = h;
        this.f = f;
        this.g = g;
        this.a = a;
        this.e = e;
        this.b = b;
        this.d = d;
    }
    
    public cpb(final pii b, final pii a, final pii e, final pii d, final pii h, final pii i, final pii f, final pii g, final pii c, final int j, final char[] array) {
        this.j = j;
        this.b = b;
        this.a = a;
        this.e = e;
        this.d = d;
        this.h = h;
        this.i = i;
        this.f = f;
        this.g = g;
        this.c = c;
    }
    
    public cpb(final pii e, final pii a, final pii g, final pii c, final pii f, final pii h, final pii i, final pii b, final pii d, final int j, final float[] array) {
        this.j = j;
        this.e = e;
        this.a = a;
        this.g = g;
        this.c = c;
        this.f = f;
        this.h = h;
        this.i = i;
        this.b = b;
        this.d = d;
    }
    
    public cpb(final pii g, final pii b, final pii i, final pii e, final pii a, final pii c, final pii d, final pii f, final pii h, final int j, final int[] array) {
        this.j = j;
        this.g = g;
        this.b = b;
        this.i = i;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.f = f;
        this.h = h;
    }
    
    public cpb(final pii g, final pii b, final pii i, final pii e, final pii a, final pii c, final pii d, final pii f, final pii h, final int j, final short[] array) {
        this.j = j;
        this.g = g;
        this.b = b;
        this.i = i;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
        this.f = f;
        this.h = h;
    }
    
    public cpb(final pii b, final pii a, final pii i, final pii f, final pii c, final pii h, final pii e, final pii d, final pii g, final int j, final boolean[] array) {
        this.j = j;
        this.b = b;
        this.a = a;
        this.i = i;
        this.f = f;
        this.c = c;
        this.h = h;
        this.e = e;
        this.d = d;
        this.g = g;
    }
    
    public cpb(final pii d, final pii a, final pii b, final pii i, final pii c, final pii h, final pii f, final pii g, final pii e, final int j, final byte[][] array) {
        this.j = j;
        this.d = d;
        this.a = a;
        this.b = b;
        this.i = i;
        this.c = c;
        this.h = h;
        this.f = f;
        this.g = g;
        this.e = e;
    }
    
    public cpb(final pii b, final pii e, final pii g, final pii h, final pii d, final pii i, final pii c, final pii a, final pii f, final int j, final char[][] array) {
        this.j = j;
        this.b = b;
        this.e = e;
        this.g = g;
        this.h = h;
        this.d = d;
        this.i = i;
        this.c = c;
        this.a = a;
        this.f = f;
    }
    
    public cpb(final pii e, final pii c, final pii b, final pii a, final pii d, final pii i, final pii f, final pii g, final pii h, final int j, final float[][] array) {
        this.j = j;
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public cpb(final pii c, final pii f, final pii i, final pii g, final pii a, final pii b, final pii h, final pii e, final pii d, final int j, final int[][] array) {
        this.j = j;
        this.c = c;
        this.f = f;
        this.i = i;
        this.g = g;
        this.a = a;
        this.b = b;
        this.h = h;
        this.e = e;
        this.d = d;
    }
    
    public cpb(final pii e, final pii i, final pii c, final pii a, final pii f, final pii b, final pii h, final pii g, final pii d, final int j, final short[][] array) {
        this.j = j;
        this.e = e;
        this.i = i;
        this.c = c;
        this.a = a;
        this.f = f;
        this.b = b;
        this.h = h;
        this.g = g;
        this.d = d;
    }
    
    public cpb(final pii c, final pii g, final pii d, final pii b, final pii a, final pii f, final pii i, final pii h, final pii e, final int j, final boolean[][] array) {
        this.j = j;
        this.c = c;
        this.g = g;
        this.d = d;
        this.b = b;
        this.a = a;
        this.f = f;
        this.i = i;
        this.h = h;
        this.e = e;
    }
    
    public static cpb a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 2, (byte[])null);
    }
    
    public static cpb b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 3, (char[])null);
    }
    
    public static cpb c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 4, (short[])null);
    }
    
    public static cpb d(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 5, (int[])null);
    }
    
    public static cpb e(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 7, (float[])null);
    }
    
    public static cpb f(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 8, (byte[][])null);
    }
    
    public static cpb g(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 9, (char[][])null);
    }
    
    public static cpb h(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 10, (short[][])null);
    }
    
    public static cpb i(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9) {
        return new cpb(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, 11, (int[][])null);
    }
}
