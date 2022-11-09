import java.util.Iterator;
import android.hardware.camera2.CaptureRequest$Key;
import java.util.HashSet;
import android.hardware.camera2.CaptureRequest;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glj implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public glj(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public glj(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public glj(final pii b, final pii a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public glj(final pii b, final pii a, final int c, final char[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public glj(final pii b, final pii a, final int c, final short[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static glj a(final pii pii, final pii pii2) {
        return new glj(pii, pii2);
    }
    
    public static glj b(final pii pii, final pii pii2) {
        return new glj(pii, pii2, 1);
    }
    
    public static glj c(final pii pii, final pii pii2) {
        return new glj(pii, pii2, 2, (byte[])null);
    }
}
