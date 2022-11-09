import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class jso implements Runnable
{
    final /* synthetic */ jps a;
    final /* synthetic */ jsp b;
    
    public jso(final jsp b, final jps a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final jsp b = this.b;
        final jsm jsm = b.e.l.get(b.b);
        if (jsm == null) {
            return;
        }
        if (this.a.c()) {
            final jsp b2 = this.b;
            b2.d = true;
            if (b2.a.o()) {
                this.b.c();
                return;
            }
            try {
                final jqo a = this.b.a;
                a.s(null, a.h());
                return;
            }
            catch (final SecurityException ex) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", (Throwable)ex);
                this.b.a.k("Failed to get service from broker.");
                jsm.i(new jps(10));
                return;
            }
        }
        jsm.i(this.a);
    }
}
