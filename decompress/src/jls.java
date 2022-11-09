import android.util.Log;
import java.util.concurrent.FutureTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class jls extends FutureTask
{
    final /* synthetic */ jlt a;
    
    public jls(final jlt a, final Runnable runnable, final Object o) {
        this.a = a;
        super(runnable, o);
    }
    
    @Override
    protected final void setException(final Throwable exception) {
        final Thread.UncaughtExceptionHandler c = this.a.a.c;
        if (c != null) {
            c.uncaughtException(Thread.currentThread(), exception);
        }
        else if (Log.isLoggable("GAv4", 6)) {
            final String value = String.valueOf(exception);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(value);
            Log.e("GAv4", sb.toString());
        }
        super.setException(exception);
    }
}
