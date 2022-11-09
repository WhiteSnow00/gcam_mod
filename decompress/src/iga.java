import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import java.text.NumberFormat;
import android.media.MediaRecorder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iga implements oun
{
    private final /* synthetic */ int a;
    
    public iga() {
    }
    
    public iga(final int a) {
        this.a = a;
    }
    
    public static jdv a() {
        return new jdv();
    }
    
    public static final kpw b() {
        return new kpw(new MediaRecorder());
    }
    
    public static leg c() {
        return new leg();
    }
}
