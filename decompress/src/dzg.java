import android.hardware.camera2.CaptureRequest;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import android.os.Looper;
import android.os.Handler;
import java.util.Timer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzg implements oun
{
    private final /* synthetic */ int a;
    
    public dzg() {
    }
    
    public dzg(final int a) {
        this.a = a;
    }
    
    public static final Timer a() {
        return new Timer();
    }
    
    public static Handler b() {
        return kpo.d(Looper.getMainLooper());
    }
    
    public static klv c() {
        final klv a = eup.a;
        pqf.k(a);
        return a;
    }
}
