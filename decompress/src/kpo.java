import android.os.HandlerThread;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpo
{
    public static Handler c() {
        return new Handler();
    }
    
    public static Handler d(final Looper looper) {
        return new Handler(looper);
    }
    
    public static final Handler e(final kjk kjk, final String s) {
        final HandlerThread handlerThread = new HandlerThread(s);
        handlerThread.start();
        kjk.c(new kjj(handlerThread));
        return d(handlerThread.getLooper());
    }
}
