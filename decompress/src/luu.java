import java.util.Iterator;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class luu implements Runnable
{
    final /* synthetic */ luv a;
    
    public luu(final luv a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.a) {
            if (!this.a.b.isEmpty()) {
                Object a;
                try {
                    a = this.a.a();
                }
                catch (final Exception ex) {
                    Log.e(luv.a, "Having problems getting the latest device stats snapshot", (Throwable)ex);
                    a = null;
                }
                if (a != null) {
                    final Iterator iterator = this.a.b.iterator();
                    if (iterator.hasNext()) {
                        final lsp lsp = (lsp)iterator.next();
                        throw null;
                    }
                }
            }
        }
    }
}
