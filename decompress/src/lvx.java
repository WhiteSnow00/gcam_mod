import java.util.Collection;
import java.util.ArrayList;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class lvx implements Runnable
{
    final /* synthetic */ lvy a;
    final /* synthetic */ lwa b;
    
    public lvx(final lvy a, final lwa b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final lxh a = this.a.a;
        final lwa b = this.b;
        b.b = true;
        while (b.b) {
            try {
                final Runnable runnable = b.a.take();
                if (runnable != null) {
                    runnable.run();
                    continue;
                }
                continue;
            }
            catch (final InterruptedException ex) {
                final String value = String.valueOf(Thread.currentThread());
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 27);
                sb.append("Event loop on ");
                sb.append(value);
                sb.append(" interrupted.");
                Log.w("BlockingEventLoop", sb.toString());
            }
            break;
        }
        final ArrayList list = new ArrayList(b.a.size());
        b.a.drainTo(list);
        a.k(list);
    }
}
