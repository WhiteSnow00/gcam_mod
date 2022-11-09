import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ees
{
    public static final nsd a;
    public final eeo b;
    public final eel c;
    public final Looper d;
    public final eer e;
    public boolean f;
    public final AtomicInteger g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/video/VideoRecorder");
    }
    
    public ees(final eeo b, final eel c) {
        this.f = false;
        this.g = new AtomicInteger(0);
        this.b = b;
        this.c = c;
        final HandlerThread handlerThread = new HandlerThread("VideoRecorderThread");
        handlerThread.start();
        final Looper looper = handlerThread.getLooper();
        this.d = looper;
        this.e = new eer(this, looper);
    }
    
    public final int a() {
        return this.g.get();
    }
}
