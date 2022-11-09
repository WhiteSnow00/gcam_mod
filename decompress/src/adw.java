import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class adw extends FutureTask
{
    final /* synthetic */ ady a;
    
    public adw(final ady a, final Callable callable) {
        this.a = a;
        super(callable);
    }
    
    @Override
    protected final void done() {
        try {
            this.a.e(this.get());
        }
        catch (final CancellationException ex) {
            this.a.e(null);
        }
        catch (final ExecutionException ex2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", ex2.getCause());
        }
        catch (final InterruptedException ex3) {
            Log.w("AsyncTask", (Throwable)ex3);
        }
        finally {
            final Throwable t;
            throw new RuntimeException("An error occurred while executing doInBackground()", t);
        }
    }
}
