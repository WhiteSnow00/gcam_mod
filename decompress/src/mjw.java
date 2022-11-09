import android.app.Activity;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import android.app.Application;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjw extends mnu implements mfl, mgx
{
    public final mgu a;
    public final oui b;
    private final ofb c;
    private final Object d;
    private final ArrayList e;
    private final AtomicInteger f;
    
    public mjw(final mgv mgv, final Context context, final mfp mfp, final ofb c, final oui oui, final oui b, final pii pii, final Executor executor) {
        this.d = new Object();
        this.e = new ArrayList(0);
        this.f = new AtomicInteger();
        this.a = mgv.a(executor, oui, pii);
        final Application application = (Application)context;
        this.c = c;
        this.b = b;
        mfp.a(this);
    }
    
    public final oey a() {
        if (this.f.get() > 0) {
            final mju mju = new mju(this);
            final TimeUnit seconds = TimeUnit.SECONDS;
            final ofb c = this.c;
            final ofv f = ofv.f(mju);
            f.d(new oeo(c.schedule(f, 1L, seconds)), odx.a);
            return f;
        }
        synchronized (this.d) {
            mjs[] array;
            if (!this.e.isEmpty()) {
                final ArrayList e = this.e;
                array = e.toArray(new mjs[e.size()]);
                this.e.clear();
            }
            else {
                array = null;
            }
            monitorexit(this.d);
            if (array == null) {
                return oev.a;
            }
            return ofi.r(new mjv(this, array), this.c);
        }
    }
    
    @Override
    public final void c(final Activity activity) {
        this.a();
    }
}
