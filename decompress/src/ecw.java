import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecw implements oun
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
    private final /* synthetic */ int m;
    
    public ecw(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i, final pii j, final pii k, final pii l) {
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
    }
    
    public ecw(final pii b, final pii a, final pii j, final pii h, final pii g, final pii i, final pii d, final pii c, final pii l, final pii e, final pii f, final pii k, final int m) {
        this.m = m;
        this.b = b;
        this.a = a;
        this.j = j;
        this.h = h;
        this.g = g;
        this.i = i;
        this.d = d;
        this.c = c;
        this.l = l;
        this.e = e;
        this.f = f;
        this.k = k;
    }
    
    public ecw(final pii c, final pii d, final pii a, final pii g, final pii f, final pii j, final pii l, final pii b, final pii k, final pii i, final pii h, final pii e, final int m, final byte[] array) {
        this.m = m;
        this.c = c;
        this.d = d;
        this.a = a;
        this.g = g;
        this.f = f;
        this.j = j;
        this.l = l;
        this.b = b;
        this.k = k;
        this.i = i;
        this.h = h;
        this.e = e;
    }
    
    public ecw(final pii g, final pii j, final pii f, final pii l, final pii a, final pii c, final pii h, final pii e, final pii b, final pii d, final pii i, final pii k, final int m, final char[] array) {
        this.m = m;
        this.g = g;
        this.j = j;
        this.f = f;
        this.l = l;
        this.a = a;
        this.c = c;
        this.h = h;
        this.e = e;
        this.b = b;
        this.d = d;
        this.i = i;
        this.k = k;
    }
    
    public static ecw a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10, final pii pii11, final pii pii12) {
        return new ecw(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, pii11, pii12, 2, (byte[])null);
    }
    
    public static ecw b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10, final pii pii11, final pii pii12) {
        return new ecw(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, pii11, pii12, 3, (char[])null);
    }
}
