import android.util.Log;
import android.os.StrictMode;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

final class bap extends Thread
{
    final /* synthetic */ baq a;
    
    public bap(final baq a, final Runnable runnable, final String s) {
        this.a = a;
        super(runnable, s);
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(9);
        if (this.a.a) {
            StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        }
        finally {
            if (Log.isLoggable("GlideExecutor", 6)) {
                final Throwable t;
                Log.e("GlideExecutor", "Request threw uncaught throwable", t);
            }
        }
    }
}
