import java.util.List;
import android.content.res.Resources;
import j$.util.function.Supplier;
import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cik implements oun
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
    
    public cik(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i, final pii j) {
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
    
    public cik(final pii b, final pii a, final pii i, final pii d, final pii e, final pii c, final pii h, final pii j, final pii g, final pii f, final int k) {
        this.k = k;
        this.b = b;
        this.a = a;
        this.i = i;
        this.d = d;
        this.e = e;
        this.c = c;
        this.h = h;
        this.j = j;
        this.g = g;
        this.f = f;
    }
    
    public cik(final pii h, final pii i, final pii f, final pii g, final pii e, final pii b, final pii c, final pii j, final pii d, final pii a, final int k, final byte[] array) {
        this.k = k;
        this.h = h;
        this.i = i;
        this.f = f;
        this.g = g;
        this.e = e;
        this.b = b;
        this.c = c;
        this.j = j;
        this.d = d;
        this.a = a;
    }
    
    public cik(final pii d, final pii g, final pii i, final pii h, final pii b, final pii a, final pii e, final pii j, final pii f, final pii c, final int k, final char[] array) {
        this.k = k;
        this.d = d;
        this.g = g;
        this.i = i;
        this.h = h;
        this.b = b;
        this.a = a;
        this.e = e;
        this.j = j;
        this.f = f;
        this.c = c;
    }
    
    public cik(final pii d, final pii j, final pii e, final pii f, final pii a, final pii c, final pii h, final pii b, final pii g, final pii i, final int k, final float[] array) {
        this.k = k;
        this.d = d;
        this.j = j;
        this.e = e;
        this.f = f;
        this.a = a;
        this.c = c;
        this.h = h;
        this.b = b;
        this.g = g;
        this.i = i;
    }
    
    public cik(final pii b, final pii g, final pii j, final pii c, final pii f, final pii d, final pii h, final pii i, final pii a, final pii e, final int k, final int[] array) {
        this.k = k;
        this.b = b;
        this.g = g;
        this.j = j;
        this.c = c;
        this.f = f;
        this.d = d;
        this.h = h;
        this.i = i;
        this.a = a;
        this.e = e;
    }
    
    public cik(final pii b, final pii j, final pii e, final pii c, final pii g, final pii i, final pii f, final pii d, final pii h, final pii a, final int k, final short[] array) {
        this.k = k;
        this.b = b;
        this.j = j;
        this.e = e;
        this.c = c;
        this.g = g;
        this.i = i;
        this.f = f;
        this.d = d;
        this.h = h;
        this.a = a;
    }
    
    public cik(final pii c, final pii g, final pii f, final pii a, final pii i, final pii h, final pii b, final pii e, final pii j, final pii d, final int k, final boolean[] array) {
        this.k = k;
        this.c = c;
        this.g = g;
        this.f = f;
        this.a = a;
        this.i = i;
        this.h = h;
        this.b = b;
        this.e = e;
        this.j = j;
        this.d = d;
    }
    
    public cik(final pii a, final pii h, final pii d, final pii f, final pii j, final pii c, final pii e, final pii b, final pii i, final pii g, final int k, final byte[][] array) {
        this.k = k;
        this.a = a;
        this.h = h;
        this.d = d;
        this.f = f;
        this.j = j;
        this.c = c;
        this.e = e;
        this.b = b;
        this.i = i;
        this.g = g;
    }
    
    public cik(final pii b, final pii d, final pii g, final pii j, final pii e, final pii f, final pii h, final pii i, final pii a, final pii c, final int k, final char[][] array) {
        this.k = k;
        this.b = b;
        this.d = d;
        this.g = g;
        this.j = j;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
        this.a = a;
        this.c = c;
    }
    
    public cik(final pii f, final pii c, final pii g, final pii j, final pii h, final pii b, final pii d, final pii i, final pii a, final pii e, final int k, final short[][] array) {
        this.k = k;
        this.f = f;
        this.c = c;
        this.g = g;
        this.j = j;
        this.h = h;
        this.b = b;
        this.d = d;
        this.i = i;
        this.a = a;
        this.e = e;
    }
    
    public static cik a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10, final pii pii11) {
        return new cik(pii, pii2, pii3, pii4, pii6, pii7, pii8, pii9, pii10, pii11, 8, (byte[][])null);
    }
    
    public static cik b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10) {
        return new cik(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, 9, (char[][])null);
    }
    
    public static cik c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10) {
        return new cik(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, 10, (short[][])null);
    }
}
