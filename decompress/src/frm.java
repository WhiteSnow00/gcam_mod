import android.os.HandlerThread;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frm
{
    public static Handler a(final String s) {
        final HandlerThread handlerThread = new HandlerThread(s);
        handlerThread.start();
        return kpo.d(handlerThread.getLooper());
    }
}
