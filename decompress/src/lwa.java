import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lwa implements Executor
{
    public final ArrayBlockingQueue a;
    public boolean b;
    
    public lwa() {
        this.a = new ArrayBlockingQueue(16);
    }
    
    public final void a() {
        this.execute(new lvz(this));
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        try {
            this.a.put(runnable);
        }
        catch (final InterruptedException ex) {
            Log.w("BlockingEventLoop", "Interrupted while attempting to post event: Dropping event.");
        }
    }
}
