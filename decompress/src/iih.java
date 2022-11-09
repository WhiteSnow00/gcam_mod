import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import android.content.Context;
import android.os.Handler;
import j$.util.function.Consumer;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iih implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final /* synthetic */ int h;
    
    public iih(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public iih(final pii f, final pii g, final pii b, final pii e, final pii c, final pii d, final pii a, final int h) {
        this.h = h;
        this.f = f;
        this.g = g;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public iih(final pii b, final pii a, final pii c, final pii f, final pii e, final pii d, final pii g, final int h, final byte[] array) {
        this.h = h;
        this.b = b;
        this.a = a;
        this.c = c;
        this.f = f;
        this.e = e;
        this.d = d;
        this.g = g;
    }
    
    public iih(final pii d, final pii b, final pii f, final pii g, final pii c, final pii a, final pii e, final int h, final char[] array) {
        this.h = h;
        this.d = d;
        this.b = b;
        this.f = f;
        this.g = g;
        this.c = c;
        this.a = a;
        this.e = e;
    }
    
    public iih(final pii c, final pii a, final pii g, final pii d, final pii e, final pii b, final pii f, final int h, final float[] array) {
        this.h = h;
        this.c = c;
        this.a = a;
        this.g = g;
        this.d = d;
        this.e = e;
        this.b = b;
        this.f = f;
    }
    
    public iih(final pii c, final pii e, final pii a, final pii b, final pii d, final pii g, final pii f, final int h, final int[] array) {
        this.h = h;
        this.c = c;
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.g = g;
        this.f = f;
    }
    
    public iih(final pii d, final pii b, final pii a, final pii e, final pii g, final pii f, final pii c, final int h, final short[] array) {
        this.h = h;
        this.d = d;
        this.b = b;
        this.a = a;
        this.e = e;
        this.g = g;
        this.f = f;
        this.c = c;
    }
    
    public iih(final pii c, final pii d, final pii g, final pii e, final pii a, final pii f, final pii b, final int h, final boolean[] array) {
        this.h = h;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
        this.a = a;
        this.f = f;
        this.b = b;
    }
    
    public iih(final pii c, final pii b, final pii a, final pii g, final pii d, final pii e, final pii f, final int h, final byte[][] array) {
        this.h = h;
        this.c = c;
        this.b = b;
        this.a = a;
        this.g = g;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static iih a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new iih(pii, pii2, pii3, pii4, pii5, pii6, pii7, 2, (byte[])null);
    }
}
