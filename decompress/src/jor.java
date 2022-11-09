import android.os.Handler;
import java.util.Iterator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jor
{
    public static final jwk a;
    
    static {
        a = new jwk("GoogleSignInCommon");
    }
    
    public static void a(final Context context) {
        jot.c(context).d();
        final Iterator iterator = jqw.a().iterator();
        if (!iterator.hasNext()) {
            synchronized (jsq.c) {
                if (jsq.d != null) {
                    final jsq d = jsq.d;
                    d.k.incrementAndGet();
                    final Handler o = d.o;
                    o.sendMessageAtFrontOfQueue(o.obtainMessage(10));
                }
                return;
            }
        }
        final jqw jqw = (jqw)iterator.next();
        throw new UnsupportedOperationException();
    }
}
