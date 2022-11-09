import android.hardware.camera2.CaptureResult$Key;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

final class lep
{
    public static final Object a;
    public final CaptureResult b;
    public final CaptureResult$Key c;
    public volatile Object d;
    
    static {
        a = new Object();
    }
    
    public lep(final CaptureResult b, final CaptureResult$Key c) {
        this.d = lep.a;
        this.b = b;
        this.c = c;
    }
}
