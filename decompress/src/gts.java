import java.util.Iterator;
import java.util.Set;
import java.util.EnumMap;
import java.util.Map;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gts implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    private final /* synthetic */ int i;
    
    public gts(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public gts(final pii a, final pii b, final pii f, final pii h, final pii c, final pii d, final pii g, final pii e, final int i) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.f = f;
        this.h = h;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
    }
    
    public gts(final pii d, final pii b, final pii h, final pii c, final pii g, final pii f, final pii a, final pii e, final int i, final byte[] array) {
        this.i = i;
        this.d = d;
        this.b = b;
        this.h = h;
        this.c = c;
        this.g = g;
        this.f = f;
        this.a = a;
        this.e = e;
    }
    
    public gts(final pii b, final pii f, final pii a, final pii g, final pii h, final pii c, final pii d, final pii e, final int i, final char[] array) {
        this.i = i;
        this.b = b;
        this.f = f;
        this.a = a;
        this.g = g;
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public gts(final pii d, final pii e, final pii a, final pii g, final pii f, final pii b, final pii c, final pii h, final int i, final float[] array) {
        this.i = i;
        this.d = d;
        this.e = e;
        this.a = a;
        this.g = g;
        this.f = f;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    
    public gts(final pii e, final pii g, final pii f, final pii b, final pii a, final pii c, final pii h, final pii d, final int i, final int[] array) {
        this.i = i;
        this.e = e;
        this.g = g;
        this.f = f;
        this.b = b;
        this.a = a;
        this.c = c;
        this.h = h;
        this.d = d;
    }
    
    public gts(final pii g, final pii c, final pii b, final pii a, final pii e, final pii f, final pii h, final pii d, final int i, final short[] array) {
        this.i = i;
        this.g = g;
        this.c = c;
        this.b = b;
        this.a = a;
        this.e = e;
        this.f = f;
        this.h = h;
        this.d = d;
    }
    
    public gts(final pii f, final pii g, final pii b, final pii c, final pii a, final pii e, final pii h, final pii d, final int i, final boolean[] array) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.b = b;
        this.c = c;
        this.a = a;
        this.e = e;
        this.h = h;
        this.d = d;
    }
    
    public gts(final pii e, final pii g, final pii d, final pii c, final pii h, final pii b, final pii f, final pii a, final int i, final byte[][] array) {
        this.i = i;
        this.e = e;
        this.g = g;
        this.d = d;
        this.c = c;
        this.h = h;
        this.b = b;
        this.f = f;
        this.a = a;
    }
    
    public gts(final pii g, final pii h, final pii a, final pii d, final pii e, final pii f, final pii b, final pii c, final int i, final char[][] array) {
        this.i = i;
        this.g = g;
        this.h = h;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = b;
        this.c = c;
    }
    
    public gts(final pii b, final pii a, final pii e, final pii c, final pii g, final pii h, final pii f, final pii d, final int i, final short[][] array) {
        this.i = i;
        this.b = b;
        this.a = a;
        this.e = e;
        this.c = c;
        this.g = g;
        this.h = h;
        this.f = f;
        this.d = d;
    }
    
    public static gts a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new gts(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8);
    }
    
    public static hyc b(final klv klv, final klv klv2, final klv klv3, final klv klv4, final hko hko, final hkn hkn, final hkc hkc, final hkd hkd) {
        return new hyc(klv, klv2, klv3, klv4, hko, hkn, hkc, hkd);
    }
    
    public static gts c(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new gts(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 1);
    }
    
    public static gts d(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new gts(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, 2, (byte[])null);
    }
}
